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
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz enter a few numbers in:");
        String str = sc.nextLine();
        System.out.println("Plz enter ur first number in:");
        int numb1 = sc.nextInt();
        System.out.println("Plz enter ur first number in:");
        int numb2 = sc.nextInt();
        int[] arr = Arrays.stream(str.split(",")).mapToInt(Integer::parseInt).toArray();

        System.out.println(Arrays.toString(uRange(arr, numb1, numb2)));
    }

    public static int[] uRange(int[] arr, int numb1, int numb2) {
        int max = Math.max(numb1, numb2);
        int min = Math.min(numb1, numb2);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max && arr[i] > min) {
                arr[i] = -1;
            }
        }
        return arr;
    }

}
