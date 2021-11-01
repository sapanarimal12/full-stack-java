package com.sapana.day9.FactoryMethod;

public class DivCommand extends MathCommand{


    @Override
    public Double calculate(Double x, Double y) {

        return x/y;
    }
}
