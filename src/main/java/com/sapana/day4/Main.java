package com.sapana.day4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names= new ArrayList<>();
        names.add("Sapana");
        names.add("Puja");

        names=CandleFacts.reverseString(names);
        System.out.println(names);
    }

    private static class CandleFacts {
        public static List<String> reverseString(List<String> names) {
     return names;

        }
    }
}
