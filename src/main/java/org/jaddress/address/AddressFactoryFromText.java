package org.jaddress.address;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.jaddress.address.canada.Canada;
import org.jaddress.address.canada.CanadaAddressFactory;
import org.jaddress.address.uk.UnitedKingdom;
import org.jaddress.address.uk.UnitedKingdomAddressFactory;
import org.jaddress.address.usa.UnitedStatesOfAmerica;
import org.jaddress.address.usa.UnitedStatesOfAmericaAddressFactory;
import org.jaddress.matcher.RegexMatchers;

/**
 * Created by mpoitras on 10/04/15.
 *
 * @author mpoitras
 */
public class AddressFactoryFromText implements AddressFactory {
    private static AddressFactoryFromText instance;
    private AddressFactoryFromText(){}
    public static synchronized AddressFactoryFromText getInstance() {
        if(instance == null) {
            instance = new AddressFactoryFromText();
        }
        return instance;
    }

    private static final Map<Country, AddressFactory> COUNTRY_TO_FACTORY = ImmutableMap.of(
            Canada.getInstance(), CanadaAddressFactory.getInstance(),
            UnitedStatesOfAmerica.getInstance(), UnitedStatesOfAmericaAddressFactory.getInstance(),
            UnitedKingdom.getInstance(), UnitedKingdomAddressFactory.getInstance());

    public Address buildFrom(String addressAsText) {
        Optional<Address> matchedAddress = matchesCountry(addressAsText, COUNTRY_TO_FACTORY.keySet());
        if(matchedAddress.isPresent()){
            return matchedAddress.get();
        }

        throw new UnsupportedOperationException("Could not match a country for: " + addressAsText);
    }

    private Optional<Address> matchesCountry(String addressAsText, Collection<Country> countries) {
        final String addressAsUpperCaseText = addressAsText.toUpperCase();
        for (Country country : countries) {
            final Set<String> recognizedNames = country.getRecognizedNames();
            for (String recognizedName : recognizedNames) {
                if(addressAsUpperCaseText.matches("("+ RegexMatchers.whitespace() + ")*" + recognizedName.toUpperCase() + "(" + RegexMatchers.whitespace() + ")*")){
                    return Optional.fromNullable(COUNTRY_TO_FACTORY.get(country).buildFrom(addressAsText));
                }
            }
            final Set<String> recognizedAbbreviations = country.getRecognizedAbbreviations();
            for (String recognizedAbbreviation : recognizedAbbreviations) {
                if(addressAsUpperCaseText.matches("("+RegexMatchers.whitespace() + ")*" + recognizedAbbreviation.toUpperCase() + "(" + RegexMatchers.whitespace() + ")*")){
                    return Optional.fromNullable(COUNTRY_TO_FACTORY.get(country).buildFrom(addressAsText));
                }
            }
        }
        return Optional.absent();
    }
}

