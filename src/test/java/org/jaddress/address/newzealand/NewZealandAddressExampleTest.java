package org.jaddress.address.newzealand;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * User: Mathieu
 * Date: 1/07/12
 * Time: 10:37 AM
 */
public class NewZealandAddressExampleTest {
    @Test
    public void whenLoadingAnAucklandAddressThenItCanBeReadBack() {
        String organisation = "Mollies Hotel";
        String streetNumber = "6";
        String street = "Tweed Street";
        String suburb = "St Mary's Bay";
        String city = "Auckland";
        String postCode = "1010";

        NewZealandAddress address = NewZealandAddress.Builder.init()
                                                     .setOrganisation(organisation)
                                                     .setStreetNumber(streetNumber)
                                                     .setStreet(street)
                                                     .setSuburb(suburb)
                                                     .setCity(city)
                                                     .setPostCode(postCode)
                                                     .create();

        assertThat(organisation, is(address.getOrganisation()));
        assertThat(streetNumber, is(address.getStreetNumber()));
        assertThat(street, is(address.getStreet()));
        assertThat(suburb, is(address.getSuburb()));
        assertThat(city, is(address.getCity()));
        assertThat(postCode, is(address.getPostCode()));
        assertThat(NewZealandAddress.COUNTRY_NAME, is(address.getCountry()));
    }

    @Test
    public void whenLoadingAnWellingtonAddressThenItCanBeReadBack() {
        String organisation = "Abel Tasman Hotel";
        String streetNumber = "169";
        String street = "Willis Street";
        String city = "Wellington";

        NewZealandAddress address = NewZealandAddress.Builder.init()
                                                     .setOrganisation(organisation)
                                                     .setStreetNumber(streetNumber)
                                                     .setStreet(street)
                                                     .setCity(city)
                                                     .create();

        assertThat(organisation, is(address.getOrganisation()));
        assertThat(streetNumber, is(address.getStreetNumber()));
        assertThat(street, is(address.getStreet()));
        assertThat(city, is(address.getCity()));
        assertThat(NewZealandAddress.COUNTRY_NAME, is(address.getCountry()));
    }

    @Test
    public void whenLoadingAWellingtonPostalAddressThenItCanBeReadBack() {
        String organisation = "Abel Tasman Hotel";
        String deliveryServiceIdentifier = "11-173";
        String city = "Wellington";

        NewZealandAddress address = NewZealandAddress.Builder.init()
                                                     .setOrganisation(organisation)
                                                     .setDeliveryServiceIdentifier(deliveryServiceIdentifier)
                                                     .setCity(city)
                                                     .create();

        assertThat(organisation, is(address.getOrganisation()));
        assertThat(deliveryServiceIdentifier, is(address.getDeliveryServiceIdentifier()));
        assertThat(city, is(address.getCity()));
        assertThat(NewZealandAddress.COUNTRY_NAME, is(address.getCountry()));
    }

}
