package org.jaddress.address.usa;

import org.jaddress.address.Address;
import org.jaddress.address.Country;
import org.jaddress.address.canada.Canada;
import org.jaddress.address.canada.province.CanadianProvince;

/**
 * User: Mathieu
 * Date: 30/06/12
 * Time: 10:07 PM
 */
public class UnitedStatesOfAmericaAddress implements Address {
    private final UnitedStatesOfAmerica country = UnitedStatesOfAmerica.getInstance();


    public UnitedStatesOfAmericaAddress() {}

    public Country getCountry() {
        return country;
    }
}
