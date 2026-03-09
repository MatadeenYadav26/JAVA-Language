package arrays;

public class BasicsOfArray {

    static void main(String[] args) {
//        int age[]; // declaration

//        age = new int[5]; //allocation

//        int age[] = new int[5]; // declaration and allocation together.
//
//        age[0] = 5;
//        age[1] = 72;
//        age[3] = 76;
//
//
//        System.out.println(age[0]);
//        System.out.println(age[1]);
//        System.out.println(age[2]); // outut for this will be 0 as , by-default value stored in an array will be a  zero.
//
//        System.out.println(age.length);


//        int marks[] = {98,92,77,86,75};
//
//
//        System.out.println(marks[2]);
//        System.out.println(marks[1]);]


                // ittreration through an array by for loop:

        String names[] =  {"aman","am","an","matadeen"};
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(i);
//            System.out.println(names[i]);
//
//        }

        for(String name : names){
            System.out.println(name);
//            System.out.println(names); // gives location address of array stored
        }


    }

}
