package com.sapana.day9.FactoryMethod;

public class MathCommandfactory {

    public static MathCommand get(String operator) {
        MathCommand mathCommand = null;
        switch (operator) {
            case "add":
                mathCommand= new AddCommand();
                break;
            case "sub":
                mathCommand= new SubCommand();
                break;
            case "multi":
                mathCommand= new MultiCommand();
                break;
            default:
                mathCommand=new NullCommand();


        }
        return mathCommand;
    }

}
