package org.example;

public class CustomerTest {
    public static void main(String[] args) {
        Customer first = new Customer(
                "Paul L", "1 High Street", "0851234567", 1001, true);
        Customer second = new Customer();
        second.setName("Bob Jones");
        second.setAddress("2 Low Street");
        second.setPhoneNumber("0867654321");
        second.setCustomerNumber(1002);
        second.setMailingList(false);
        System.out.println(first);
        System.out.println(second);
    }
}