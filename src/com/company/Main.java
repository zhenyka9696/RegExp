package com.company;

import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
boolean b = Pattern.matches(".","1");
        System.out.println(b);
        boolean b2 = Pattern.matches(".s","1");
        System.out.println(b2);
        b= Pattern.matches("a*","");
        System.out.println(b);
        //начинается на а
        b= Pattern.matches("a.*","acb");
        System.out.println(b);
        //заканчивается на b
        b= Pattern.matches(".*b","cb");
        System.out.println(b);
        //содержит ab
        b= Pattern.matches(".*ab.*","wfafaabgewgg");
        System.out.println(b);
        //не содержит а
        b= Pattern.matches("[^a]*]","eghhh");
        System.out.println(b);
        //состоит из букв латиницы и включает а
        b= Pattern.matches("[a-zA-Z]*a[a-zA-Z]*","gkgmrmgrkamrgm");
        System.out.println(b);
        //состоит только из цифр
        b= Pattern.matches("\\d*","0");
        System.out.println(b);
        //не начинается на буквы a , b
        b= Pattern.matches("[^ab].*","cccssab");
        System.out.println(b);
//c трока является вещественным числом 1.23
        b= Pattern.matches("[-+]?\\d+.?\\d+","-7.9");
        System.out.println(b);

        //+375 29 1234567
        b= Pattern.matches("[+]375 \\d{2} \\d{7}","+375 29 3334954");
        System.out.println(b);
    }
}
