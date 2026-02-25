package DSA.Arrays;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Hello world");
       // Initilization
        int [] marks = new int [5];
        //Taking value from User:-
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sc.nextInt();
        }

        //Print
        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
        }

    }
}
