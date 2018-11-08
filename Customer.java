package PolyHotel;

import java.util.Scanner;

public abstract class Customer
{
    protected String customerName;
    protected String customerEmail;

    abstract public void display();
    abstract public String getName();
    abstract public String getEmail();
    abstract public String getAddress();
    abstract public void calcCost(double cost);
}


