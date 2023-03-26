package TeamWorkProject01;

import java.util.Scanner;

public class age {


     /*
        Given a int ,
            if the age less then and equal 10
                print  too young to create a facebook account

             if the age less then and equal 16
                print  too young to get a driver's license

             if the age less then and equal 18
                print  too young to get a tattoo

            if the age less then and equal 21
                print  too young to drink alcohol

            if the age bigger or equal to 21
                print  do what ever you want to do

        Note: use if else statement.
     */

    /*


               Eğer age 10 dan küçük veya eşit ise
               facebook hesabi acmak icin cok gencsin print edin.

               Eğer age 16 dan küçük veya eşit ise
               ehliyet almak icin cok gencsin print edin.

               Eğer age 18 den küçük veya eşit ise
               dovme yaptirmak icin cok gencsin print edin.

               Eğer age 21 den küçük veya eşit ise
               alkol icmek icin cok gencsin print edin.

               Eğer age 21 den büyük ise
               istedigini yapabilirsin print edin.
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Plz enter ur age down:");    //SRYY I ADD A REALLY SMALL SOUT
        int myAge = scanner.nextInt();

        //  code Start here don't change before this line

        //  bu satirdan onceki kodlari degistirmeyiniz


        // The Answer:
    /*/        if(myAge<=10) System.out.println("too young for facbook");
          else if (myAge<=16) System.out.println("too young for driving licenses");
          else if (myAge<=18) System.out.println("too young for tatto");
          else if (myAge<=21) System.out.println("too young for alchol");
          else System.out.println("U do whatever you want to do");
    */
        if (myAge <= 10) System.out.println("facebook hesabi acmak icin cok gencsin");
        else if (myAge <= 16) System.out.println("ehliyet almak icin cok gencsin");
        else if (myAge <= 18) System.out.println("dovme yaptirmak icin cok gencsin");
        else if (myAge <= 21) System.out.println("alkol icmek icin cok gencsin");
        else System.out.println("istedigini yapabilirsin");

    /*        //Second way:
       switch (myAge) {
           case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> System.out.println("U re too young to create a Facebook account");
           case 11, 12, 13, 14, 15, 16 -> System.out.println("U re too young to get a driver's license");
           case 17, 18 -> System.out.println("U re too young to get a tattoo");
           case 19, 20 -> System.out.println("U re too young to drink alcohol");
           default -> System.out.println("U do whatever you want to do");
       }


       //Third way:
       String[] messages = new String[]{
               "U re too young to create a Facebook account",//0
               "U re too young to get a driver's license",//1
               "U re too young to get a tattoo",//2
               "U re too young to drink alcohol",//3
               "U do whatever you want to do"//4
       };

       int index = (myAge <= 10) ? 0 : (myAge <= 16) ? 1 : (myAge <= 18) ? 2 : (myAge <= 21) ? 3 : 4;
       System.out.println(messages[index]);
*/
    }
}


