public class Customer  {
    private String firstName;
    private String lastName;
    private String email;
    private int phoneNumber;

    private boolean isRewardsMember;

    private shippingAddress shippingAddress;
    private billingAddress billingAddress;

    public Customer(){}

    public Customer(String firstName, String lastName, String email, int phoneNumber, boolean isRewardsMember,
                    shippingAddress shippingAddress, billingAddress billingAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isRewardsMember = isRewardsMember;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isRewardsMember() {
        return isRewardsMember;
    }

    public void setRewardsMember(boolean rewardsMember) {
        isRewardsMember = rewardsMember;
    }

    public shippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(shippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public billingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(billingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", isRewardsMember=" + isRewardsMember +
                ", shippingAddress=" + shippingAddress +
                ", billingAddress=" + billingAddress +
                '}';
    }
}
