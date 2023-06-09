package TeamWorkProject03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class getPopulation {

    /*
        Method name is populationOfCountry

        This method will get 1 String array(countryNames) 1 int array (countryPopulations) and 1 String (str)

        countryNames is Country names

        countryPopulations is Country population

        if str is contained in the countryNames return the population


        For example:

        countryNames = {"USA" ,"Mexico" ,"Canada"}

        countryPopulations = {100000 , 120000 , 130000}

        str = "Mexico"

        return should be 120000

        NOTE : if str is not in the countryNames array return -1
     */


    /*
    TASK ->

    Method name :  populationOfCountry
    Bu method 1 String array(countryNames) , 1 int array (countryPopulations) ve  1 String (str) parametre almalı.

     countryNames -> Ülke isimleri

     countryPopulations -> Ülke nüfusları

     method eğer str Ülke isimlerinden bir eleman  içeriyorsa o ülke nüfusunu return etmeli

      example;

        countryNames = {"USA" ,"Mexico" ,"Canada"}

        countryPopulations = {100000 , 120000 , 130000}

        str = "Mexico" için  return :  120000 olmali

        NOT : eger str icin verilen ulke countryNames icinde yoksa return -1 olmali


     */
    public static void main(String[] args) {

        String countryNames[] = {"USA" ,"Mexico" ,"Canada"};
        int countryPopulations[] = {100000 , 120000 , 130000};


        Scanner scan  = new Scanner(System.in);
        System.out.print("Ulke ismi giriniz : ");
        String country = scan.nextLine();


        System.out.println("Population of "+country + " = " + populationOfCountry(countryNames, countryPopulations, country));

    }

    private static int populationOfCountry(String[] countryNames, int[] countryPopulations, String country) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList(countryNames));

        if (list.contains(country)) {
            int index = list.indexOf(country);
            return countryPopulations[index];
        } return -1;

    }
}
