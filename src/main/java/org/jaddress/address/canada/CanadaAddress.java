package org.jaddress.address.canada;

import org.jaddress.address.Address;
import org.jaddress.address.Country;
import org.jaddress.address.canada.province.CanadianProvince;

/**
 * User: Mathieu
 * Date: 30/06/12
 * Time: 10:07 PM
 */
public class CanadaAddress implements Address {
    private String addressee;
    private String additionalDeliveryInformation;
    private String civicNumber;
    private String street;
    private String site;
    private String compartment;
    private String ruralRoute;
    private String retailPostalOutlet;
    private String municipality;
    private String provinceOrTerritory;
    private String postalCode;
    private CanadianProvince province;
    private final Canada country = Canada.getInstance();


    public CanadaAddress() {}

    public CanadaAddress(CanadianProvince province) {
        this.province = province;
    }

    public Country getCountry() {
        return country;
    }

    public CanadianProvince getProvince() {
        return province;
    }
}
