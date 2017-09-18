package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int pos = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter word one");
        String word1 = input.next();
        System.out.println("Please enter word two");
        String word2 = input.next();

        if (word1.length() != word2.length()){

            System.out.println("Not anagrams");

        }else{

            for (int c = 0; c<word1.length(); c++){

                if(word1.substring(c, c+1).equals(word2.substring(0, 1))){

                    System.out.println(word1.substring(c, c+1));

                }else {

                    System.out.println("miss");
                    pos++;

                }

            }

        }

    }
}
