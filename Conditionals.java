public class Conditionals {
    static void main(String[] args) {

//        int age = 78;
//        if(age >=18){
//            System.out.println("You can vote");
//        }
//        else{
//            System.out.println("You can't Vote");
//        }

//        int day = 1;
//        if(day == 7){
//            System.out.println("Go To Home.");
//        }
//        else if(day == 6){
//            System.out.println("Go To Vilage.");
//        }
//        else if(day == 5){
//            System.out.println("Go To Head-Quaters.");
//        }
//
//        else{
//            System.out.println("Go To Office.");
//        }


        // Nested if-else

        //You're given 3 numbers , find the largest number:

        int a = 14;
        int b = 8;
        int c = 16;
        int max = 0;
//
//        if(a>b) {
//            System.out.println("A is bigger than B");
//            if (a > c) {
//                System.out.println("A is bigger than C");
//                System.out.println("A is largest " + a);
//            }
//            else{
//                System.out.println("C is bigger than A");
//                System.out.println("C is largest "+ c);
//            }
//        }
//        else{
//            System.out.println("B is biiger than a");
//            if(b>c){
//                System.out.println("b is bigger than c.");
//                System.out.println("B is largest" +b);
//            }
//            else{
//                System.out.println("C is largest " +c);
//            }
//        }


//        nested ternary:

        max = a>b?a>c?a:c:b>c?b : c;
        System.out.println(max);


//        int a = 12;
//        int b = 15;
//        int max = 0;

//        if(a>b){
//            max=a;
//        }else{
//            max=b;
//        }
//        System.out.println(max);


        // By Ternary operator:

//        max = (a>b)? a:b;
//        System.out.println(max);
    }
}
