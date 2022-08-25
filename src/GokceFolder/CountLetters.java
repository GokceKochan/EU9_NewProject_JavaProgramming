package GokceFolder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CountLetters {
    public static void main(String[] args) {

        String [][] a= new String[5][];
        String [][] b = {{"D", "E", "Y", "H", "A", "D"},
                         {"C", "B", "Z", "Y", "J", "K"},
                         {"D", "B", "C", "A", "M", "N"},
                         {"F", "G", "G", "R", "S", "R"},
                         {"V", "X", "H", "A", "S", "S"}};

        String myLetters = "D";

        letterCounter(b,myLetters);
    }

     public static int letterCounter(String[][] b,String myLetters){
     int dummy=0;

        for(int i =0;i<b.length;i++){
         for (int j = 0; j < b[i].length; j++) {

             if(b[i][j].equals(myLetters)){
                 dummy++;
             }
         }

     }
         System.out.println(dummy);

        return dummy;

        }







    }



/*

Count Letters in a Word Search
Create a function that counts the number of times a particular letter shows up in the word search.

Examples
letterCounter([
  ["D", "E", "Y", "H", "A", "D"],
  ["C", "B", "Z", "Y", "J", "K"],
  ["D", "B", "C", "A", "M", "N"],
  ["F", "G", "G", "R", "S", "R"],
  ["V", "X", "H", "A", "S", "S"]
], "D") ➞ 3

// "D" shows up 3 times: twice in the first row, once in the third row.

letterCounter([
  ["D", "E", "Y", "H", "A", "D"],
  ["C", "B", "Z", "Y", "J", "K"],
  ["D", "B", "C", "A", "M", "N"],
  ["F", "G", "G", "R", "S", "R"],
  ["V", "X", "H", "A", "S", "S"]
], "H") ➞ 2
Notes
You will always be given an array with five sub-arrays.
 */