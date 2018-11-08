package PolyHotel;

import java.util.Scanner;

public class GoldCustomer extends Customer{
    private final double discount = 0.8;
    private String customerAddress;

    public GoldCustomer() {
        customerName = this.getName();
        customerEmail = this.getEmail();
        customerAddress = this.getAddress();
    }

    public void display() {
        System.out.println("Details are " + customerName + " " + customerEmail+" "+customerAddress); // also displays address
    }


    public String getName() {// these functions get values from user input
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please enter your name");
        customerName = kboard.nextLine();
        return customerName;
    }

    public String getEmail() {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please enter your contact details");
        customerEmail = kboard.nextLine();
        return customerEmail;
    }

    public String getAddress() {
        Scanner kboard = new Scanner(System.in);
        System.out.println("Please enter your address");
        customerAddress = kboard.nextLine();
        return customerAddress;
    }

    public void calcCost(double cost) {
        cost = cost * discount; // will take 20% off price
        System.out.println("Your total cost is "+cost);
    }
}

