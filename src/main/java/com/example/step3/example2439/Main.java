package com.example.step3.example2439;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();


        for(int i=1; i <= count; i++) {
            int blankCount = count -i;
            String row = "";
            for( int t =0; t < blankCount; t++){
                row += " ";
            }

            for(int j=0; j < count-blankCount; j++){
                row += "*";
            }

            System.out.println(row);

        }
    }
}
