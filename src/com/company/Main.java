package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here


        for ( int a = 1; a<101; a++) {

            if (a % 5 ==0 && a% 3==0){
                System.out.println("FizzBuzz" );
            }

            else if (a %5 ==0){
                System.out.println("Buzz");
            }

            else if (a % 3 ==0){
                System.out.println("Fizz");
            }

            else{
                System.out.println(a);
            }

        }
    }
}