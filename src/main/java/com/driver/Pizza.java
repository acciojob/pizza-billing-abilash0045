package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    boolean cheese = false;
    boolean topings = false;
    boolean takeaway = false;
    boolean getbill = false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if (isVeg){
            price = 300;
            bill = "Base Price Of The Pizza: 300\r\n";
        }else{
            price = 400;
            bill = "Base Price Of The Pizza: 400\r\n";
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (cheese == false){
            price += 80;
            bill += "Extra Cheese Added: 80\r\n";
            cheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (topings == false && isVeg){
            price += 70;
            bill += "Extra Toppings Added: 70\r\n";
            topings = true;
        }
        else if (topings == false && !isVeg){
            price += 120;
            bill += "Extra Toppings Added: 120\r\n";
            topings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (takeaway == false) {
            price += 20;
            bill += "Paperbag Added: 20\r\n";
            takeaway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if (getbill == false){
            bill += "Total Price: " + price;
            getbill = true;
        }
        return this.bill;
    }
}
