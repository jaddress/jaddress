package org.jaddress.address;

/**
 * User: Mathieu
 * Date: 30/06/12
 * Time: 10:07 PM
 */
public class CanadianAddress implements Address {
    //TODO (MP) consider bilingual addresses
    public static final String COUNTRY_NAME = "Canada";
    public static final String RURAL_ROUTE_PREFIX = "RR";

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
    private String country = COUNTRY_NAME;

    public String getCivicNumber() {
        return civicNumber;
    }

    public String getMunicipality() {
        return municipality;
    }

    public String getProvince() {
        return provinceOrTerritory;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCountry() {
        return country;
    }

    public String getAddressee() {
        return addressee;
    }

    public String getStreet() {
        return street;
    }

    public String getAdditionalDeliveryInformation() {
        return additionalDeliveryInformation;
    }

    public String getRuralRoute() {
        return ruralRoute;
    }

    public String getRetailPostalOutlet() {
        return retailPostalOutlet;
    }

    public String getProvinceOrTerritory() {
        return provinceOrTerritory;
    }

    public String getCompartment() {
        return compartment;
    }

    public String getSite() {
        return site;
    }

    public static class Builder{
        private CanadianAddress addressBuilt;

        public Builder() {
            this.addressBuilt = new CanadianAddress();
        }

        public static Builder init(){
            return new Builder();
        }

        public CanadianAddress create() {
            return addressBuilt;
        }

        public Builder setCivicNumber(String civicNumber) {
            addressBuilt.civicNumber = civicNumber;
            return this;
        }

        public Builder setMunicipality(String municipality) {
            addressBuilt.municipality = municipality;
            return this;
        }

        public Builder setProvince(String province) {
            addressBuilt.provinceOrTerritory = province;
            return this;
        }

        public Builder setPostalCode(String postalCode) {
            addressBuilt.postalCode = postalCode;
            return this;
        }

        public Builder setAddressee(String addressee) {
            addressBuilt.addressee = addressee;
            return this;
        }

        public Builder setStreet(String street) {
            addressBuilt.street = street;
            return this;
        }

        public Builder setAdditionalDeliveryInformation(String additionalDeliveryInformation) {
            addressBuilt.additionalDeliveryInformation = additionalDeliveryInformation;
            return this;
        }

        public Builder setRuralRoute(String ruralRoute) {
            addressBuilt.ruralRoute = ruralRoute;
            return this;
        }

        public Builder setRetailPostalOutlet(String retailPostalOutlet) {
            addressBuilt.retailPostalOutlet = retailPostalOutlet;
            return this;
        }

        public Builder setTerritory(String territory) {
            addressBuilt.provinceOrTerritory = territory;
            return this;
        }

        public Builder setSite(String site) {
            addressBuilt.site = site;
            return this;
        }

        public Builder setCompartment(String compartment) {
            addressBuilt.compartment = compartment;
            return this;
        }
    }
}
