package Loops;

public class Break_and_Continue {

    static void main(String[] args) {
//        for (int k = 0; k <= 20; k+= 2) {
//            System.out.println(k);
//            if (k>=10) break;
//        }

//        int i =0;
//        while(i<=5){
//
//            System.out.println(i);
//            i++;
//            if(i == 3) break;
//
//        }

//        for (int i = 0; i <=20 ; i+=2) {
//            if(i==2 || i==8) continue;
//            if (i>= 15) break;
//            System.out.println("You gave toffe to"+i);
//        }


        // Nested Loops:

//        for (int count = 0; count <10 ; count++) {
//            for (int i = 1; i <= 5; i++) {
//                System.out.println(i);
//            }
//        }

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <i ; j++) {
//                System.out.print(j+"");
//            }
//            System.out.println();
//        }


//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j <=i ; j++) {
//                System.out.print("*");  // nested loops =  pattern printing
//            }
//            System.out.println();
//        }


//        for (int i = 0; i < 10; i++) {
//            int j = 0;
//            while(j<=5){
//                System.out.print(j +" ");
//                j++;
//            }
//            System.out.println();
//        }

        outerLoop:
        for (int i = 0; i < 10; i++) {
            int j = 0;
            while(j<=5){
                if(j==3) break outerLoop; // by using this you can use, multi level nesting : break and continue.
                System.out.print(j +" ");
                j++;
            }
            System.out.println();
        }


    }
}
