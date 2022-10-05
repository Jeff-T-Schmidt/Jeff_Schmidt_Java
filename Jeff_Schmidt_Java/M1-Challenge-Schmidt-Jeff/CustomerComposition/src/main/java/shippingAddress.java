public class shippingAddress {
    private String shippingStreetOne;
    private String shippingStreetTwo;
    private String shippingCity;
    private String shippingState;
    private String shippingZipCode;

    public shippingAddress(){}

    public shippingAddress(String shippingStreetOne, String shippingStreetTwo, String shippingCity, String shippingState, String shippingZipCode) {
        this.shippingStreetOne = shippingStreetOne;
        this.shippingStreetTwo = shippingStreetTwo;
        this.shippingCity = shippingCity;
        this.shippingState = shippingState;
        this.shippingZipCode = shippingZipCode;
    }

    public String getShippingStreetOne() {
        return shippingStreetOne;
    }

    public void setShippingStreetOne(String shippingStreetOne) {
        this.shippingStreetOne = shippingStreetOne;
    }

    public String getShippingStreetTwo() {
        return shippingStreetTwo;
    }

    public void setShippingStreetTwo(String shippingStreetTwo) {
        this.shippingStreetTwo = shippingStreetTwo;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingState() {
        return shippingState;
    }

    public void setShippingState(String shippingState) {
        this.shippingState = shippingState;
    }

    public String getShippingZipCode() {
        return shippingZipCode;
    }

    public void setShippingZipCode(String shippingZipCode) {
        this.shippingZipCode = shippingZipCode;
    }

    @Override
    public String toString() {
        return "shippingAddress{" +
                "shippingStreetOne='" + shippingStreetOne + '\'' +
                ", shippingStreetTwo='" + shippingStreetTwo + '\'' +
                ", shippingCity='" + shippingCity + '\'' +
                ", shippingState='" + shippingState + '\'' +
                ", shippingZipCode='" + shippingZipCode + '\'' +
                '}';
    }
}
