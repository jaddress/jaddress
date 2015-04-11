package org.jaddress.address.canada;

import com.google.common.base.Optional;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.jaddress.address.AddressFactory;
import org.jaddress.address.canada.province.Alberta;
import org.jaddress.address.canada.province.BritishColumbia;
import org.jaddress.address.canada.province.CanadianProvince;
import org.jaddress.address.canada.province.Manitoba;
import org.jaddress.address.canada.province.NewBrunswick;
import org.jaddress.address.canada.province.Newfoundland;
import org.jaddress.address.canada.province.NovaScotia;
import org.jaddress.address.canada.province.Ontario;
import org.jaddress.address.canada.province.PrinceEdwardIsland;
import org.jaddress.address.canada.province.Quebec;
import org.jaddress.address.canada.province.Saskatchewan;
import org.jaddress.matcher.RegexMatchers;

import static java.util.Arrays.asList;

/**
 * Created by mpoitras on 10/04/15.
 *
 * @author mpoitras
 */
public class CanadaAddressFactory implements AddressFactory {
    private static CanadaAddressFactory instance;
    private CanadaAddressFactory(){}
    public static synchronized CanadaAddressFactory getInstance() {
        if(instance == null) {
            instance = new CanadaAddressFactory();
        }
        return instance;
    }

    private static final List<CanadianProvince> PROVINCES = asList(Alberta.getInstance(),
                                                                   BritishColumbia.getInstance(),
                                                                   Manitoba.getInstance(),
                                                                   NewBrunswick.getInstance(),
                                                                   Newfoundland.getInstance(),
                                                                   NovaScotia.getInstance(),
                                                                   Ontario.getInstance(),
                                                                   PrinceEdwardIsland.getInstance(),
                                                                   Quebec.getInstance(),
                                                                   Saskatchewan.getInstance());

    public CanadaAddress buildFrom(String addressAsText) {
        final String addressAsUpperCaseText = addressAsText.toUpperCase();

        Optional<CanadaAddress> matchedAddress = matchesProvince(addressAsUpperCaseText, PROVINCES);

        return matchedAddress.or(new CanadaAddress());
    }

    private Optional<CanadaAddress> matchesProvince(String addressAsUpperCaseText, Collection<CanadianProvince> canadianProvinces) {
        for (CanadianProvince canadianProvince : canadianProvinces) {
            final Set<String> recognizedNames = canadianProvince.getRecognizedNames();
            for (String recognizedName : recognizedNames) {
                if(addressAsUpperCaseText.matches("("+RegexMatchers.whitespace() + ")*" + recognizedName.toUpperCase() + "(" + RegexMatchers.whitespace() + ")*")){
                    return Optional.fromNullable(new CanadaAddress(canadianProvince));
                }
            }
            final Set<String> recognizedAbbreviations = canadianProvince.getRecognizedAbbreviations();
            for (String recognizedAbbreviation : recognizedAbbreviations) {
                if(addressAsUpperCaseText.matches("(" + RegexMatchers.whitespace() + ")*" + recognizedAbbreviation.toUpperCase() + "(" + RegexMatchers.whitespace() + ")*")){
                    return Optional.fromNullable(new CanadaAddress(canadianProvince));
                }
            }
        }
        return Optional.absent();
    }

}
