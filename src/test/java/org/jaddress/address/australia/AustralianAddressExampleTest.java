package org.jaddress.address.australia;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * User: Mathieu
 * Date: 1/07/12
 * Time: 11:27 AM
 */
public class AustralianAddressExampleTest {
    @Test
    public void whenLoadingAnAucklandAddressThenItCanBeReadBack() {
        String organisation = "The Grace Sydney";
        String propertyNumber = "77";
        String street = "York Street";
        String placename = "Sydney";
        String state = "NSW";
        String postCode = "2000";

        AustralianAddress address = AustralianAddress.Builder.init()
                                                     .setOrganisation(organisation)
                                                     .setPropertyNumber(propertyNumber)
                                                     .setStreet(street)
                                                     .setPlacename(placename)
                                                     .setState(state)
                                                     .setPostCode(postCode)
                                                     .create();
        assertThat(organisation, is(address.getOrganisation()));
        assertThat(propertyNumber, is(address.getPropertyNumber()));
        assertThat(street, is(address.getStreet()));
        assertThat(placename, is(address.getPlacename()));
        assertThat(state, is(address.getState()));
        assertThat(postCode, is(address.getPostCode()));
        assertThat(AustralianAddress.COUNTRY_NAME, is(address.getCountry()));
    }
}
