package org.jaddress.address.canada;

import org.hamcrest.CoreMatchers;
import org.jaddress.address.AddressFactoryFromText;
import org.jaddress.address.Country;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by mpoitras on 10/04/15.
 *
 * @author mpoitras
 */
public class AddressAsTextForCanadaTest {

    @Test
    public void whenBuildingAnAddressFromATextThatContainsCanadaThenCountryIsCanada(){
        String addressAsText = "Canada";

        CanadaAddress canadaAddress = (CanadaAddress) AddressFactoryFromText.getInstance().buildFrom(addressAsText);

        assertThat(canadaAddress.getCountry(), CoreMatchers.<Country>is(Canada.getInstance()));
    }

    @Test
    public void whenBuildingAnAddressFromATextThatContainscanadaThenCountryIsCanada(){
        String addressAsText = "canada";

        CanadaAddress canadaAddress = (CanadaAddress) AddressFactoryFromText.getInstance().buildFrom(addressAsText);

        assertThat(canadaAddress.getCountry(), CoreMatchers.<Country>is(Canada.getInstance()));
    }

    @Test
    public void whenBuildingAnAddressFromATextThatContainsCANADAThenCountryIsCanada(){
        String addressAsText = "CANADA";

        CanadaAddress canadaAddress = (CanadaAddress) AddressFactoryFromText.getInstance().buildFrom(addressAsText);

        assertThat(canadaAddress.getCountry(), CoreMatchers.<Country>is(Canada.getInstance()));
    }

    @Test
    public void whenBuildingAnAddressFromATextThatContainsIso2CaThenCountryIsCanada(){
        String addressAsText = "ca";

        CanadaAddress canadaAddress = (CanadaAddress) AddressFactoryFromText.getInstance().buildFrom(addressAsText);

        assertThat(canadaAddress.getCountry(), CoreMatchers.<Country>is(Canada.getInstance()));
    }

    @Test
    public void whenBuildingAnAddressFromATextThatContainsIso3CanThenCountryIsCanada(){
        String addressAsText = "can";

        CanadaAddress canadaAddress = (CanadaAddress) AddressFactoryFromText.getInstance().buildFrom(addressAsText);

        assertThat(canadaAddress.getCountry(), CoreMatchers.<Country>is(Canada.getInstance()));
    }
}
