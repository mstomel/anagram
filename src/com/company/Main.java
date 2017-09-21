package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int ana = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter word one");
        String word1 = input.next();
        System.out.println("Please enter word two");
        String word2 = input.next();

        if (word1.length() != word2.length()) {

            System.out.println("Not anagrams");

        } else {

            int l = word1.length();
            for (int pos = 0; pos<l; pos++) {
                for (int a = 0; a < word1.length(); a++) {

                    if (word1.substring(a, a + 1).equals(word2.substring(pos, pos + 1))) {

                        System.out.println(word1.substring(a, a + 1));
                        ana++;
                        break;

                    } else {



                    }

                }

            }if (ana == l){

                System.out.println("anagrams");

            }else{

                System.out.println("not anagrams");

            }

        }
    }
}
