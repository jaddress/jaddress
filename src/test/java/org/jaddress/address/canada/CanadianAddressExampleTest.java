package org.jaddress.address.canada;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * User: Mathieu
 * Date: 30/06/12
 * Time: 10:23 PM
 */
public class CanadianAddressExampleTest {

    @Test
    public void whenLoadingAMontrealAddressThenItCanBeReadBack() {
        String addressee = "The Ritz-Carlton";
        String civicNumber = "1228";
        String street = "Sherbrooke Street West";
        String municipality = "Montreal";
        String province = "Quebec";
        String postalCode = "H3G 1H6";

        CanadianAddress address = CanadianAddress.Builder.init()
                                                         .setAddressee(addressee)
                                                         .setCivicNumber(civicNumber)
                                                         .setStreet(street)
                                                         .setMunicipality(municipality)
                                                         .setProvince(province)
                                                         .setPostalCode(postalCode)
                                                         .create();


        assertThat(addressee, is(address.getAddressee()));
        assertThat(civicNumber, is(address.getCivicNumber()));
        assertThat(street, is(address.getStreet()));
        assertThat(municipality, is(address.getMunicipality()));
        assertThat(province, is(address.getProvince()));
        assertThat(postalCode, is(address.getPostalCode()));
        assertThat(CanadianAddress.COUNTRY_NAME, is(address.getCountry()));
    }

    @Test
    public void whenLoadingATorontoAddressThenItCanBeReadBack() {
        String addressee = "Metropolitan Hotel Toronto";
        String civicNumber = "108";
        String street = "Chestnut Street";
        String municipality = "Toronto";
        String province = "Ontario";
        String postalCode = "M5G 1R3";

        CanadianAddress address = CanadianAddress.Builder.init()
                                                         .setAddressee(addressee)
                                                         .setCivicNumber(civicNumber)
                                                         .setStreet(street)
                                                         .setMunicipality(municipality)
                                                         .setProvince(province)
                                                         .setPostalCode(postalCode)
                                                         .create();


        assertThat(addressee, is(address.getAddressee()));
        assertThat(civicNumber, is(address.getCivicNumber()));
        assertThat(street, is(address.getStreet()));
        assertThat(municipality, is(address.getMunicipality()));
        assertThat(province, is(address.getProvince()));
        assertThat(postalCode, is(address.getPostalCode()));
        assertThat(CanadianAddress.COUNTRY_NAME, is(address.getCountry()));
    }

    @Test
    public void whenLoadingAVancouverAddressThenItCanBeReadBack() {
        String addressee = "Fairmont Hotel Vancouver";
        String civicNumber = "900";
        String street = "West Georgia Street";
        String municipality = "Vancouver";
        String province = "British Columbia";
        String postalCode = "V6C 2W6";

        CanadianAddress address = CanadianAddress.Builder.init()
                                                         .setAddressee(addressee)
                                                         .setCivicNumber(civicNumber)
                                                         .setStreet(street)
                                                         .setMunicipality(municipality)
                                                         .setProvince(province)
                                                         .setPostalCode(postalCode)
                                                         .create();


        assertThat(addressee, is(address.getAddressee()));
        assertThat(civicNumber, is(address.getCivicNumber()));
        assertThat(street, is(address.getStreet()));
        assertThat(municipality, is(address.getMunicipality()));
        assertThat(province, is(address.getProvince()));
        assertThat(postalCode, is(address.getPostalCode()));
        assertThat(CanadianAddress.COUNTRY_NAME, is(address.getCountry()));
    }

    @Test
    public void whenLoadingAnAddressWithAdditionalDeliveryInformationThenItCanBeReadBack() {
        String addressee = "Petro-Canada";
        String additionalDeliveryInformation = "Marketing & Sales Division";
        String civicNumber = "3380";
        String street = "Roblin Blvd";
        String municipality = "Winnipeg";
        String province = "Manitoba";
        String postalCode = "R3R 0C5";

        CanadianAddress address = CanadianAddress.Builder.init()
                                                         .setAddressee(addressee)
                                                         .setAdditionalDeliveryInformation(additionalDeliveryInformation)
                                                         .setCivicNumber(civicNumber)
                                                         .setStreet(street)
                                                         .setMunicipality(municipality)
                                                         .setProvince(province)
                                                         .setPostalCode(postalCode)
                                                         .create();


        assertThat(addressee, is(address.getAddressee()));
        assertThat(additionalDeliveryInformation, is(address.getAdditionalDeliveryInformation()));
        assertThat(civicNumber, is(address.getCivicNumber()));
        assertThat(street, is(address.getStreet()));
        assertThat(municipality, is(address.getMunicipality()));
        assertThat(province, is(address.getProvince()));
        assertThat(postalCode, is(address.getPostalCode()));
        assertThat(CanadianAddress.COUNTRY_NAME, is(address.getCountry()));
    }

    @Test
    public void whenLoadingARuralRouteAddressWithCivicAddressThenItCanBeReadBack() {
        String addressee = "CLAUDE M UNTEL";
        String civicNumber = "2364";
        String street = "7TH CONCESSION";
        String ruralRoute = "8";
        String retailPostalOutlet = "A";
        String municipality = "Millarville";
        String province = "Alberta";
        String postalCode = "RT0L 1K0";

        CanadianAddress address = CanadianAddress.Builder.init()
                                                         .setAddressee(addressee)
                                                         .setCivicNumber(civicNumber)
                                                         .setStreet(street)
                                                         .setRuralRoute(ruralRoute)
                                                         .setRetailPostalOutlet(retailPostalOutlet)
                                                         .setMunicipality(municipality)
                                                         .setProvince(province)
                                                         .setPostalCode(postalCode)
                                                         .create();


        assertThat(addressee, is(address.getAddressee()));
        assertThat(civicNumber, is(address.getCivicNumber()));
        assertThat(street, is(address.getStreet()));
        assertThat(ruralRoute, is(address.getRuralRoute()));
        assertThat(retailPostalOutlet, is(address.getRetailPostalOutlet()));
        assertThat(municipality, is(address.getMunicipality()));
        assertThat(province, is(address.getProvince()));
        assertThat(postalCode, is(address.getPostalCode()));
        assertThat(CanadianAddress.COUNTRY_NAME, is(address.getCountry()));
    }

    @Test
    public void whenLoadingARuralRouteAddressWithAdditionalDeliveryInformationThenItCanBeReadBack() {
        String addressee = "CLAUDE M UNTEL";
        String site = "6";
        String compartment = "10";
        String ruralRoute = "8";
        String retailPostalOutlet = "MAIN";
        String municipality = "Millarville";
        String province = "Alberta";
        String postalCode = "RT0L 1K0";

        CanadianAddress address = CanadianAddress.Builder.init()
                                                         .setAddressee(addressee)
                                                         .setSite(site)
                                                         .setCompartment(compartment)
                                                         .setRuralRoute(ruralRoute)
                                                         .setRetailPostalOutlet(retailPostalOutlet)
                                                         .setMunicipality(municipality)
                                                         .setProvince(province)
                                                         .setPostalCode(postalCode)
                                                         .create();


        assertThat(addressee, is(address.getAddressee()));
        assertThat(site, is(address.getSite()));
        assertThat(compartment, is(address.getCompartment()));
        assertThat(ruralRoute, is(address.getRuralRoute()));
        assertThat(retailPostalOutlet, is(address.getRetailPostalOutlet()));
        assertThat(municipality, is(address.getMunicipality()));
        assertThat(province, is(address.getProvince()));
        assertThat(postalCode, is(address.getPostalCode()));
        assertThat(CanadianAddress.COUNTRY_NAME, is(address.getCountry()));
    }

    @Test
    public void whenLoadingAWhitehorseAddressThenItCanBeReadBack() {
        String addressee = "SKKY Hotel";
        String civicNumber = "91622";
        String street = "Alaska Highway";
        String municipality = "Whitehorse";
        String territory = "Yukon";
        String postalCode = "Y1A 3E4";

        CanadianAddress address = CanadianAddress.Builder.init()
                                                         .setAddressee(addressee)
                                                         .setCivicNumber(civicNumber)
                                                         .setStreet(street)
                                                         .setMunicipality(municipality)
                                                         .setTerritory(territory)
                                                         .setPostalCode(postalCode)
                                                         .create();


        assertThat(addressee, is(address.getAddressee()));
        assertThat(civicNumber, is(address.getCivicNumber()));
        assertThat(street, is(address.getStreet()));
        assertThat(municipality, is(address.getMunicipality()));
        assertThat(territory, is(address.getProvinceOrTerritory()));
        assertThat(postalCode, is(address.getPostalCode()));
        assertThat(CanadianAddress.COUNTRY_NAME, is(address.getCountry()));
    }

    @Test
    public void whenLoadingAGeneralDeliveryAddressThenItCanBeReadBack() {
        String addressee = "Ian Verchere";
        String retailPostalOutlet = "A";
        String municipality = "Whistler";
        String territory = "British Columbia";
        String postalCode = "V0N 1B0";

        CanadianAddress address = CanadianAddress.Builder.init()
                                                         .setAddressee(addressee)
                                                         .setRetailPostalOutlet(retailPostalOutlet)
                                                         .setMunicipality(municipality)
                                                         .setTerritory(territory)
                                                         .setPostalCode(postalCode)
                                                         .create();


        assertThat(addressee, is(address.getAddressee()));
        assertThat(retailPostalOutlet, is(address.getRetailPostalOutlet()));
        assertThat(municipality, is(address.getMunicipality()));
        assertThat(territory, is(address.getProvinceOrTerritory()));
        assertThat(postalCode, is(address.getPostalCode()));
        assertThat(CanadianAddress.COUNTRY_NAME, is(address.getCountry()));
    }
}
