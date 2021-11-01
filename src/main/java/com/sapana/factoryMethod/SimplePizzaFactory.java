package com.sapana.factoryMethod;

public class SimplePizzaFactory {

    public Pizza createPizza(String  type){
        Pizza pizza=null;

        if(type.equals("CheesePizza")){
            pizza =new CheesePizza();

        }
        else if (type.equals("CalmPizza")){
            pizza =new CheesePizza();
        }
        else if (type.equals("PepperoniPizza")){
            pizza = new PepperoniPizza();

        }
        else if (type.equals("VeggiePizza")){
            pizza = new VeggiePizza();
        }
        return pizza;


    }

}




