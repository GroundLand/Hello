package importJAVASE.algorithms_lintcode.codewars;

/**
 * @description: https://www.codewars.com/kata/52fb87703c1351ebd200081f/train/java
 * @author: cl
 * @date: 2022/01/10 下午8:34
 */
public class WhatCentury {


    public static void main(String[] args) {
        System.out.print(whatCentury(2111));
    }

    public static String whatCentury(int year) {
        // coding here
        int result = (year + 99) / 100;

        System.out.println(result);

        String centuries = result + getSuffix(result);

        return centuries;
    }

    public static String getSuffix(int century) {
        String suffix = "th";
        if (century < 14 && century > 10) {

            return suffix;
        }

        int remainder = century % 10;
        switch (remainder) {
            case 1:
                suffix = "st";
                break;
            case 2:
                suffix = "nd";
                break;
            case 3:
                suffix = "rd";
                break;
            default:
                suffix = "th";
        }
        return suffix;
    }

}
