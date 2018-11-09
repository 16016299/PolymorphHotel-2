package Abstraction2;

import java.util.Scanner;

public class OrdinaryCustomer extends Customer {
    private final double discount = 1;

    public OrdinaryCustomer() {
        customerName = this.getName();
        customerEmail = this.getEmail();
    }

    public void display() {
        System.out.println("Details are " + customerName + " " + customerEmail);
    }

    public String getName() {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please enter your name");
        customerName = kboard.nextLine();
        closeKeyboard(kboard);
        return customerName;
    }

    public String getEmail() {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please enter your contact details");
        customerEmail = kboard.nextLine();
        closeKeyboard(kboard);
        return customerEmail;
    }
    
    public String getAddress(){ // this is just here to stop the compiler at getting angry with me
        String address = null;
        return address;
    }

    public void calcCost(double cost) {
    	cost = cost * discount;
        System.out.println("Your total cost is "+cost);
    }
}
