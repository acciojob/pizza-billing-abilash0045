package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean cheese = false;
    boolean topings = false;
    boolean takeaway = false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if (isVeg){
            price = 300;
            bill = "300";
        }else{
            price = 400;
            bill = "400";
        }
        System.out.println("Base Price Of The Pizza: " + price);
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (cheese == false){
            System.out.println("Extra Cheese Added: 80");
            bill = String.valueOf(Integer.parseInt(bill) + 80);
            cheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (topings == false && isVeg){
            System.out.println("Extra Toppings Added: 70");
            bill = String.valueOf(Integer.parseInt(bill) + 70);
            topings = true;
        }
        else if (topings == false && !isVeg){
            System.out.println("Extra Toppings Added: 120");
            bill = String.valueOf(Integer.parseInt(bill) + 120);
            topings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (takeaway == false) {
            System.out.println("Paperbag Added: 20");
            bill = String.valueOf(Integer.parseInt(bill) + 20);
            takeaway = true;
        }
    }

    public String getBill(){
        // your code goes here
        return this.bill;
    }
}
