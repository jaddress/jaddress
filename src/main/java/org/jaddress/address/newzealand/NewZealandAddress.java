package org.jaddress.address.newzealand;

import org.jaddress.address.Address;

/**
 * User: Mathieu
 * Date: 1/07/12
 * Time: 10:35 AM
 */
public class NewZealandAddress implements Address {
    public static final String COUNTRY_NAME = "New Zealand";
    private String country = COUNTRY_NAME;
    private String organisation;
    private String deliveryServiceIdentifier;
    private String streetNumber;
    private String street;
    private String suburb;
    private String city;
    private String postCode;

    public String getCountry() {
        return country;
    }

    public String getOrganisation() {
        return organisation;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getStreet() {
        return street;
    }

    public String getSuburb() {
        return suburb;
    }

    public String getCity() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }

    public String getDeliveryServiceIdentifier() {
        return deliveryServiceIdentifier;
    }

    public static class Builder {
        private NewZealandAddress addressInstance;

        private Builder() {
            this.addressInstance = new NewZealandAddress();
        }

        public static Builder init() {
            return new Builder();
        }

        public NewZealandAddress create() {
            return addressInstance;
        }

        public Builder setOrganisation(String organisation) {
            addressInstance.organisation = organisation;
            return this;
        }

        public Builder setStreetNumber(String streetNumber) {
            addressInstance.streetNumber = streetNumber;
            return this;
        }

        public Builder setStreet(String street) {
            addressInstance.street = street;
            return this;
        }

        public Builder setSuburb(String suburb) {
            addressInstance.suburb = suburb;
            return this;
        }

        public Builder setCity(String city) {
            addressInstance.city = city;
            return this;
        }

        public Builder setPostCode(String postCode) {
            addressInstance.postCode = postCode;
            return this;
        }

        public Builder setDeliveryServiceIdentifier(String deliveryServiceIdentifier) {
            addressInstance.deliveryServiceIdentifier = deliveryServiceIdentifier;
            return this;
        }
    }
}
