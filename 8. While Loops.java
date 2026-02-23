package Loops;

import java.util.Scanner;

public class While_Loops {
    static void main(String[] args) {
//        int i = 1;
//
//        while (i <= 5){
//            System.out.println(i);
//            i++;
//        }


        Scanner sc = new Scanner(System.in);
        boolean haslearnt = false;
            while (!haslearnt){
                System.out.println("Went to school tried to learn");
                System.out.println("Did You Learn?");
                haslearnt = sc.nextBoolean() ;
            }
                System.out.println("Passed Learned Successfully.");



    }

}
