package TeamWorkProject01;

import java.util.Scanner;

public class countE {
/*
    Determine and print the number of times
      the character ‘b’ appears in the input entered by the user.

     input: Test output
            b: 0
        output should be 0

     input: bucket
            b:1
        output should be 1


        hint: .charAt, length(), for, index, counter,
 */

    /* girilen inputda kac tane 'b' karakteri olduğunu  print eden code create ediniz.

     input: Test
            b: 0
        output 0

     input: bucket
            b:1
        output 1

        hint: .charAt, length(), for, index, counter,
*/

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Plz write something down here: ");


        // code start here
        //  bu satırdan önceki kodlari değiştirmeyiniz

        //The Answer:
        String text = input.nextLine();
        int count = 0;
        for (String x : text.split("")) {
            if (x.equalsIgnoreCase("b")) {
                count++;
            }
        }
        System.out.println(count);


//        //Second way:
//        int count2 = 0;
//        for (int i = 0; i < text.length(); i++) {
//            if (text.toLowerCase().charAt(i) == 'b') {
//                text.replace("b", ":)");
//                count2++;
//            }
//        }
//        System.out.println(count2);
//
//        //Third way:
//        int count3 = text.length() - text.toLowerCase().replaceAll("b", "").length();
//        System.out.println(count3);
//
//        //OR
//
//        int count4 = text.length() - text.replaceAll("[bB]", "").length();
//        System.out.println(count4);
    }
}
