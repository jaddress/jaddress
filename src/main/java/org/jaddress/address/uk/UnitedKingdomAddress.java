package org.jaddress.address.uk;

import org.jaddress.address.Address;
import org.jaddress.address.Country;
import org.jaddress.address.usa.UnitedStatesOfAmerica;

/**
 * User: Mathieu
 * Date: 30/06/12
 * Time: 10:07 PM
 */
public class UnitedKingdomAddress implements Address {
    private final UnitedKingdom country = UnitedKingdom.getInstance();


    public UnitedKingdomAddress() {}

    public Country getCountry() {
        return country;
    }
}
