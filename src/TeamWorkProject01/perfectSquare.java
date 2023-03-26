package TeamWorkProject01;

import java.util.Scanner;

public class perfectSquare {


    /*
    Given a positive integer num, write a function which returns true if num is a perfect square else false.

        Note: Do not use any built-in library function such as sqrt.

        Example 1:
        Input: 16
        Output: true
        Note: this number is perfect square because 4*4 is 16

        Example 2:
        Input: 25
        Output: true
        Note: this number is perfect square because 5*5 is 25


        Example 3:
        Input: 14
        Output: false

     */

    /*
    girilen pozitif tamsayının tam kare olmasını kontrol eden method create ediniz.

Not: sqrt gibi method   kullanmayınız.

        Example 1:
        Input: 16
        Output: true
        Not: bu sayı tamkare çünkü 4*4 = 16

        Example 2:
        Input: 25
        Output: true
        Note: bu sayı tamkare çünkü 5*5=25


        Example 3:
        Input: 14
        Output: false



     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a positive number: ");
        int input = scanner.nextInt();

        //  code Start here don't change before this line
        // bu satırdan önceki kodları değiştirmeyiniz.

        boolean isPerfectSquare=false;
        int half = (input + 2 - 1)/2;
        int square = 0;


        for( int i = half; i > 0 ; i-- ){

            square = i*i;

            if( square > input )
                continue;

            if( square == input ){
                isPerfectSquare = true;
                break;
            }

        }

        System.out.println(isPerfectSquare);

    }
}




