package org.jaddress.address.uk;

import com.google.common.base.Optional;
import org.jaddress.address.AddressFactory;

/**
 * Created by mpoitras on 10/04/15.
 *
 * @author mpoitras
 */
public class UnitedKingdomAddressFactory implements AddressFactory {
    private static UnitedKingdomAddressFactory instance;
    private UnitedKingdomAddressFactory(){}
    public static synchronized UnitedKingdomAddressFactory getInstance() {
        if(instance == null) {
            instance = new UnitedKingdomAddressFactory();
        }
        return instance;
    }

    public UnitedKingdomAddress buildFrom(String addressAsText) {
        final String addressAsUpperCaseText = addressAsText.toUpperCase();

        Optional<UnitedKingdomAddress> matchedAddress = Optional.absent();

        return matchedAddress.or(new UnitedKingdomAddress());
    }
}
