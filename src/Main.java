
/*reads a word from user and writes bookname,
line number of line in which this word exists
,and line itself to the consle
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//to read input from user


        String k;
        while (true) {

            System.out.print("TS01:>");
            k = sc.next();
            if (sc.hasNext() && k.equals("exit")) {
                sc.close();
                System.exit(0);
            }
            if (k.equals("search") && sc.hasNext())
                /*calling a method and passing word ,and array of lines to search word occurances
                output apropriate  lines*/
                search_word(sc.next());

        }
    }

    private static void search_word(String word) {

        String[] local = new String[50];//local string array to store words in a line temporarily
        String line;
        int found = 0;

        long k = System.nanoTime();

        /*count gives current size of array, static data member of
        class Copy_Array class*/
        for (int i = 0; i < Txt_to_WordIndex.WordIndex.size(); i++) {
            if((Txt_to_WordIndex.WordIndex.get(i).word.equals(word))){
            Txt_to_WordIndex.WordIndex.get(i).display();
            found=1;
                }
        }
        if (found == 0) System.out.println("word not found");
        System.out.printf("\nTime taken for search is %d nano seconds\s",(System.nanoTime()-k));



    }





}

