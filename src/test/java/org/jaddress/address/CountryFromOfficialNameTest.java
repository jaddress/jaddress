package org.jaddress.address;

import java.util.Arrays;
import java.util.Collection;
import org.jaddress.address.canada.Canada;
import org.jaddress.address.uk.UnitedKingdom;
import org.jaddress.address.usa.UnitedStatesOfAmerica;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by mpoitras on 10/04/15.
 *
 * @author mpoitras
 */
@RunWith(Parameterized.class)
public class CountryFromOfficialNameTest {

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(new Object[][]{
                {"Canada", Canada.getInstance()},
                {"United States of America", UnitedStatesOfAmerica.getInstance()},
                {"United Kingdom", UnitedKingdom.getInstance()},
        });
    }

    private final String addressText;
    private final Country expectedCountry;

    public CountryFromOfficialNameTest(String addressText, Country expectedCountry) {
        this.addressText = addressText;
        this.expectedCountry = expectedCountry;
    }

    @Test
    public void whenBuildingAnAddressFromAnAddressTextThenCountryIsAsExpected(){
        Address address = AddressFactoryFromText.getInstance().buildFrom(addressText);

        assertThat(address.getCountry(), is(expectedCountry));
    }
}
