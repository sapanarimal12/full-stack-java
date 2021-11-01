package com.sapana.factoryMethod;

public abstract class Pizza {

    Pizza createPizza(String type){
        Pizza pizza;


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


        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;


    }

    }



