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


//        Scanner sc = new Scanner(System.in);
//        boolean haslearnt = false;
//            while (!haslearnt){
//                System.out.println("Went to school tried to learn");
//                System.out.println("Did You Learn?");
//                haslearnt = sc.nextBoolean() ;
//            }
//                System.out.println("Passed Learned Successfully.");


        //do while loop:-

        int i =9;

        do{
            System.out.println(i);
            i++;
        } while(i<=7);  // see even if i <=7 , the condition is false but , as its a do-while loop , it runs atleast once , then checks condtion for while loop.
        // do while loop still body me jata hai , atleast 1 baar.

        System.out.println("Done : Out of the Loop");

    }

}
