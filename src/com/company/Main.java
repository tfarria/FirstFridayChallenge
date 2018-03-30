package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //Modify your program to allow you to change the ending number. Now your program shall print the numbers from 1 to the number.
        //Once the last number has displayed then print the number of multiples of 7, 17 and 23.

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = keyboard.nextInt();
        keyboard.nextLine();

        for ( int a = 1; a<number; a++) {

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


        for (int b = 1; b<number; b++){
            if (b % 7==0){
                System.out.println(b + " is a multiple of 7. ");
            }
            else if (b % 17==0){
                System.out.println(b + " is a multiple of 17. ");
            }
            else if (b % 23==0){
                System.out.println(b + " is a multiple of 23. ");
            }
        }
    }
}