package org.wecancodeit.fizzbuzz;


public class FizzBuzz {

    public String say(Integer numberToTranslate) {
        if (numberToTranslate %3==0) {
            return "Fizz";
        }
        if (numberToTranslate %5 ==0) {
            return "Buzz";
        }
        return numberToTranslate.toString();
    }
}

//    public static void main(String[] args) {
//        fizzBuzz(12);
//
//    }
//
//    public static void fizzBuzz(int numberRange) {
//
//        for (int i = 1; i < numberRange; i++) {
//            if (((i % 3) == 0) && ((i % 5) == 0)) {
//                System.out.println("Fizzbuzz");
//            } else if (((i % 3)) == 0) {
//                System.out.println("Fizz");
//            } else if (((i % 5)) == 0) {
//                System.out.println("Buzz");
//            } else System.out.println(i);
//        }
//    }
//}