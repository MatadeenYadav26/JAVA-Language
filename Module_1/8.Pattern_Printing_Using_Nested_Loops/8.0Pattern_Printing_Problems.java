package Loops_Pattern;

public class Pattern_Printing {
    static void main(String[] args) {

        // Question - 1:
        // int n = 15;  best for squared pattrn

//        for (int col = 1; col <= 7; col++) {
//            for (int row = 1; row <= 7; row++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // Question 2:

//        for (int i = 1; i <= 7; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // Question - 3 :

//        for (int i = 1 ; i <= 7;i++){
//            for (int j = 1 ; j < i; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }



        // Question-4 :

//        int n = 7;
//
//        for (int i =1;i<=7;i++){
//            for (int j =1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j =1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }


        // Question-5 :

//        int n = 7;
//
//        for (int i =1;i<=7;i++){
//            for (int j =1;j<=n-i;j++){
//                System.out.print(" ");
//            }
//            for (int j =1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        //Question-6:

        int n = 5;

        for (int i =0;i<n;i++){
            for (int j =1;j<n-i;j++){
                System.out.print("_");
            }
            System.out.print("*");
            for (int j =0;j<=2*i-1 ;j++){
                if(j == 2*i-1){
                    System.out.print("*");
                }
                else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }
        for(int i = n-2; i>=0;i--){
            for (int j =1;j<n-i;j++){
                System.out.print("_");
            }
            System.out.print("*");
            for (int j =0;j<=2*i-1 ;j++){
                if(j == 2*i-1){
                    System.out.print("*");
                }
                else {
                    System.out.print("_");
                }
            }
            System.out.println();
        }


    }
}
