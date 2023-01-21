package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private int addExtraToppings;

    boolean extraCheese;
    boolean extraToppings;
    boolean takeAway;
    boolean isBill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if (isVeg){
            price = 300;
            addExtraToppings = 70;
        }
        else{
            price = 400;
            addExtraToppings = 120;
        }
        bill = "Base Price Of The Pizza: " + price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!extraCheese){
            price += 80;
            extraCheese = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!extraToppings){
            price += addExtraToppings;
            extraToppings = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!takeAway){
            price += 20;
            takeAway = true;
        }
    }

    public String getBill(){
        // your code goes here
        if (!isBill) {
            if (extraCheese) {
                bill += "Extra Cheese Added: " + 80 + "\n";
            }
            if (extraToppings) {
                bill += "Extra Toppings Added: " + addExtraToppings + "\n";
            }
            if (takeAway) {
                bill += "Paperbag Added: " + 20 + "\n";
            }
            bill += "Total Price: " + price + "\n";
            isBill = true;
        }
        return this.bill;
    }
}
