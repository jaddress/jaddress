package org.jaddress.address;

/**
 * Created by mpoitras on 11/04/15.
 *
 * @author mpoitras
 */
public interface AddressFactory {
    Address buildFrom(String addressAsText);
}
