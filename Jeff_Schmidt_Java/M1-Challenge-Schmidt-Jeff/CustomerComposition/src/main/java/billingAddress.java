public class billingAddress {
    private String billingStreetOne;
    private String billingStreetTwo;
    private String billingCity;
    private String billingState;
    private String billingZipCode;

    public billingAddress(){}

    public billingAddress(String billingStreetOne, String billingStreetTwo, String billingCity, String billingState, String billingZipCode) {
        this.billingStreetOne = billingStreetOne;
        this.billingStreetTwo = billingStreetTwo;
        this.billingCity = billingCity;
        this.billingState = billingState;
        this.billingZipCode = billingZipCode;
    }

    public String getBillingStreetOne() {
        return billingStreetOne;
    }

    public void setBillingStreetOne(String billingStreetOne) {
        this.billingStreetOne = billingStreetOne;
    }

    public String getBillingStreetTwo() {
        return billingStreetTwo;
    }

    public void setBillingStreetTwo(String billingStreetTwo) {
        this.billingStreetTwo = billingStreetTwo;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingState() {
        return billingState;
    }

    public void setBillingState(String billingState) {
        this.billingState = billingState;
    }

    public String getBillingZipCode() {
        return billingZipCode;
    }

    public void setBillingZipCode(String billingZipCode) {
        this.billingZipCode = billingZipCode;
    }

    @Override
    public String toString() {
        return "billingAddress{" +
                "billingStreetOne='" + billingStreetOne + '\'' +
                ", billingStreetTwo='" + billingStreetTwo + '\'' +
                ", billingCity='" + billingCity + '\'' +
                ", billingState='" + billingState + '\'' +
                ", billingZipCode='" + billingZipCode + '\'' +
                '}';
    }
}
