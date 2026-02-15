import java.util.Scanner;

public class User_input {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //this is an object
//        System.out.println("You are Age:");
//        int age = sc.nextInt();
//        System.out.println("Your age is: "+age);

        float a = sc.nextFloat();
//        int b = sc.nextInt();
        long b = sc.nextLong();
        float c = (a+b); // typcasting data loss in int.
        System.out.println(c);

        sc.close();
    }

}
