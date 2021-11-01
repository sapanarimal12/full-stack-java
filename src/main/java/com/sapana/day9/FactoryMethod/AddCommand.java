package com.sapana.day9.FactoryMethod;

public class AddCommand  extends MathCommand{


    @Override
    public Double calculate(Double x, Double y) {
        return x+y;
    }
}
