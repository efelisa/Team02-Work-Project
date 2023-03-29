package TeamWorkProject03;

import java.util.Arrays;
import java.util.Scanner;

public class UpdateRange {


    /*

    Update a method uRange

    parameters are int array and two ints

    if the int array has a number between the two int change it to -1

    for Example
    int array = 1,6,12,15,22,18,30,16

    int 1 = 10

    int 2 = 20

    result should be 1,6,-1,-1,22,-1,30,-1

     */


   /*
    TASK->  UpdateRange
   URange isminde bir metod yazınız,
   Bu metod parametre olarak int Array ve 2 adet int almalı.
   Metod kendisine gönderilen Array ın içindeki elemanlardan, yine kendisine gönderilen
   sayılar  arasında olanlarına -1 değerini atayıp int array return eden  uRange method create ediniz.

   Örnek:

    int array = 1,6,12,15,22,18,30,16

    int 1 = 10

    int 2 = 20

    sonuc  1,6,-1,-1,22,-1,30,-1  olmalı.
         */

    public static void main(String[] args) {

        int[] arr = {1, 6, 12, 15, 22, 18, 30, 16};
        int[] result = uRange(arr, 10, 20);
        System.out.println(Arrays.toString(result));

        uRange(arr,10,20);

    }

    public static int[] uRange(int[] arr, int num1, int num2) {

        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= num1 && arr[i] <= num2) {
                result[i] = -1;
            } else {
                result[i] = arr[i];
            }
        }
        return result;

    }


}
