package org.jaddress.address.australia;

import org.jaddress.address.Address;

/**
 * User: Mathieu
 * Date: 1/07/12
 * Time: 11:26 AM
 */
public class AustralianAddress implements Address {
    public static final String COUNTRY_NAME = "Australia";
    private String organisation;
    private String propertyNumber;
    private String street;
    private String placename;
    private String state;
    private String postCode;
    private String country = COUNTRY_NAME;

    public String getCountry() {
        return country;
    }

    public String getOrganisation() {
        return organisation;
    }

    public String getPropertyNumber() {
        return propertyNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getPlacename() {
        return placename;
    }

    public String getState() {
        return state;
    }

    public String getPostCode() {
        return postCode;
    }

    public static class Builder {
        private AustralianAddress addressInstance;

        public Builder() {
            addressInstance = new AustralianAddress();
        }

        public static Builder init() {
            return new Builder();
        }

        public AustralianAddress create() {
            return addressInstance;
        }

        public Builder setOrganisation(String organisation) {
            addressInstance.organisation = organisation;
            return this;
        }

        public Builder setPropertyNumber(String propertyNumber) {
            addressInstance.propertyNumber = propertyNumber;
            return this;
        }

        public Builder setStreet(String street) {
            addressInstance.street = street;
            return this;
        }

        public Builder setPlacename(String placename) {
            addressInstance.placename = placename;
            return this;
        }

        public Builder setState(String state) {
            addressInstance.state = state;
            return this;
        }

        public Builder setPostCode(String postCode) {
            addressInstance.postCode = postCode;
            return this;
        }
    }
}
