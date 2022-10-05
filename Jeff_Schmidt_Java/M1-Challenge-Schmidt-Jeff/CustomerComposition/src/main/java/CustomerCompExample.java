public class CustomerCompExample {
    public static void main(String[] args) {
        Customer firstCustomer = new Customer();

        firstCustomer.setFirstName("Jeff");
        firstCustomer.setLastName("Schmidt");
        firstCustomer.setEmail("email@email.com");
        firstCustomer.setPhoneNumber(1234567890);
        firstCustomer.setRewardsMember(true); //or false

        shippingAddress jeffShippingAddress = new shippingAddress();
        jeffShippingAddress.setShippingCity("Bothell");
        jeffShippingAddress.setShippingState("Wa");
        jeffShippingAddress.setShippingStreetOne("123");
        jeffShippingAddress.setShippingStreetTwo("456");
        jeffShippingAddress.setShippingZipCode("98012");

        firstCustomer.setShippingAddress(jeffShippingAddress);

        billingAddress jeffBillingAddress = new billingAddress();
        jeffBillingAddress.setBillingCity("Boise");
        jeffBillingAddress.setBillingState("Id");
        jeffBillingAddress.setBillingStreetOne("789");
        jeffBillingAddress.setBillingStreetTwo("135");
        jeffBillingAddress.setBillingZipCode("99337");

        firstCustomer.setBillingAddress(jeffBillingAddress);

        System.out.println(firstCustomer);
    }
}
