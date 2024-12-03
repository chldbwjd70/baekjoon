package com.example.step1.example10172;

import java.util.stream.IntStream;

public class Main {
    /*
    *
    *
    * 출력
    * |\_/|
    * |q p|   /}
    * ( 0 )"""\
    * |"^"`    |
    * ||_/=\\__|
    */

    public static void main(String[] args) {

        //new StringBuilder("|\\_/|");
        //new StringBuilder("|q p|   /}");
        //new StringBuilder("( 0 )\"\"\"\\");
        //new StringBuilder("| \"^\"`    |");
        //new StringBuilder("||_/=\\\\__|");
        String line1= "|\\_/|";
        String line2= "|q p|   /}";
        String line3= "( 0 )\"\"\"\\";
        String line4= "|\"^\"`    |";
        String line5= "||_/=\\\\__|";
        IntStream.range(0, 5).forEach(i -> {
            if (i == 0) System.out.println(line1);
            if (i == 1) System.out.println(line2);
            if (i == 2) System.out.println(line3);
            if (i == 3) System.out.println(line4);
            if (i == 4) System.out.println(line5);
        });
    }
}
