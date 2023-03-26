package TeamWorkProject01;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberBetweenTwoNumbers {


    /*
    Given two positive integer numbers

     integer 1 is min
     integer 2 is max

    create a random number between min and max

    output should be int

     */

    /*
  Girilen iki tamsayı arasinda random sayi elde eden code create ediniz.

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz enter two different numb at once:  ");
        String s1 = scanner.nextLine();

        String[] elements = s1.split(" ");

        int min = Integer.parseInt(elements[0]);
        int max = Integer.parseInt(elements[1]);

        //code Start here don't change before this line
        // bu satırdan önceki kodlari değiştirmeyiniz.

        //The Answer:
        int randNumb2 =(int)(Math.random()*((max-min)+1)+min);//(max-min)+1 ile araliktaki toplam sayi adedini buluyoruz
        //min ile de toplayip min degerin ustunde sayilar elde ediyoruz
        System.out.println(randNumb2);

//        //Second way:
//        int random3 = ThreadLocalRandom.current().nextInt(min,max+1);// Random class a gore daha iyi performans sergiler
//        System.out.println(random3);

////        Third way: //Version farkindan dolayi min ve max eklemede problem cikariyor ama normalde asagidaki gibi bir method var
//        Random rand = new Random();
//        int randNumb = rand.nextInt(min,(max+1));//min de max da dahil
//        System.out.println(randNumb);
    }
}
