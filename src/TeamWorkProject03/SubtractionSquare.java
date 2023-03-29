package TeamWorkProject03;

import java.util.Scanner;

public class SubtractionSquare {



     /*

    Given one method name is substSquare

    This method get two ints as parameter

    return type is int

    Get  square of the sum of the numbers using getSumOfSquares method ,

    Parameter 1 square of the sum + Parameter 2 square of the sum  = your result

    for example:
    int 1 = 10

    int 2 = 5;

    3025 + 225 = 3250

    return 3250

     */

    /* TASK ->
    Girilen iki tamsayı değerine kadar olan sayıların topamının karalerinin toplamını return eden substSquare
    method create ediniz.

   Örnek:

    int 1 = 10; -> (1+2+3+...+10)^2=3025

    int 2 = 5;  -> (1+2+3+...+5)^2=225

    3025 + 225 = 3250
    return 3250
    */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        int sayi=scan.nextInt();
        System.out.println("2. sayıyı giriniz");
        int sayi2=scan.nextInt();

        System.out.println("substSquare(sayi, sayi2) = " + substSquare(sayi, sayi2));


    }

    private static int substSquare(int sayi,int sayi2) {
        int toplam=0;
        for(int i=0;i<=sayi;i++){
            toplam+=i;
        }
        int toplam2=0;
        for(int j=0; j<=sayi2;j++){
            toplam2+=j;
        }

        return toplam*toplam +toplam2*toplam2;
        }



}
