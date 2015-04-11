package org.jaddress.address.usa;

import com.google.common.base.Optional;
import org.jaddress.address.AddressFactory;

/**
 * Created by mpoitras on 10/04/15.
 *
 * @author mpoitras
 */
public class UnitedStatesOfAmericaAddressFactory implements AddressFactory {
    private static UnitedStatesOfAmericaAddressFactory instance;
    private UnitedStatesOfAmericaAddressFactory(){}
    public static synchronized UnitedStatesOfAmericaAddressFactory getInstance() {
        if(instance == null) {
            instance = new UnitedStatesOfAmericaAddressFactory();
        }
        return instance;
    }

    public UnitedStatesOfAmericaAddress buildFrom(String addressAsText) {
        final String addressAsUpperCaseText = addressAsText.toUpperCase();

        Optional<UnitedStatesOfAmericaAddress> matchedAddress = Optional.absent();

        return matchedAddress.or(new UnitedStatesOfAmericaAddress());
    }
}
