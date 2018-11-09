package Abstraction2;

import java.util.Scanner;

public class Room extends ClassWithAKeyboard {

    private int roomNos;
    private Customer occupier;
    private boolean status;
    private boolean gold = false;
    private String input;
    int cost = 100;

    public Room(int rnos)
    {
        roomNos = rnos;
        status = true; //free
    }

    public void display()
    {
        System.out.println("Room number: "+roomNos);
        if (status==true)
            System.out.println("Room is free");
        else
            occupier.display();
    }


    public void bookRoom()
    {
        System.out.println("Room "+roomNos);
        if (status==true)
        {
            gold = getMembership();
            Customer newperson;
           if(gold == true){
                newperson = new GoldCustomer();
                System.out.println("this is your second reminder that you are a gold customer");
            }
            else{
                newperson = new OrdinaryCustomer();
                System.out.println("this is your second reminder that you are a standard customer");
            }
            newperson.calcCost(cost);
            status = false;
            occupier = newperson;
        }
        else{
            System.out.println("Sorry room booked");
        }
    }

    public boolean getMembership(){
        Scanner kboard = new Scanner(System.in);
        System.out.println("press 1 if you would like to book as with a standard membership, press 2 to book with a gold membership");
        input = kboard.next();
        if(input.equals("1")){
            gold = false;
        }
        else if(input.equals("2")){
            gold = true;
        }
        closeKeyboard(kboard);
        return gold;
    }

    public void cancelRoom()
    {
        status = true;
        occupier = null;
        System.out.println("Room cancelled");
    }

    public int returnRoomNos()
    {
        return(roomNos);
    }
}