package TeamWorkProject02;

import java.util.Arrays;
import java.util.Scanner;

public class changeArray {

      /*
        Given one arrays of Strings
        If string contains Orange change all Orange to Apple

        For Example:
        Array : Peach , Berry , Orange , WaterMelon , Orange

        Result should be Peach , Berry , Apple , WaterMelon , Apple

        Print the Array

     */


    /*
       String bir array verildiğinde

       Eger String Orange içeriyorsa bütün  Orange leri Apple  çevirip arrayı print eden code create ediniz.

       Örnek:

       Array : Peach , Berry , Orange , WaterMelon , Orange

       Result  : Peach , Berry , Apple , WaterMelon , Apple

     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] UseThisArray = myStr.split(" ");

            /*  bu satirdan onceki kodlari degistirmeyiniz
                kullanman gereken -> UseThisArray     */

        String[] arr = {"Peach", "Berry", "Orange", "WaterMelon", "Orange"};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Orange")) { // Eğer eleman "Orange" ise
                arr[i] = "Apple"; // "Apple" ile değiştir
            }
        }

        // Değiştirilmiş array'ı yazdır

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
    }
}