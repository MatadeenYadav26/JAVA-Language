package arrays;

public class multidimensional_array {
     // suppose a 2d array for 4 students and 3 subjects.
    // rows tells : students roll number
    // column tells : subject's position
    static void main(String[] args) {

        //Method-1: size of array is pre-defined:
//        int marks[][] = new int [4][3] ;

//        marks[0][0] = 85;
//        marks[0][1] = 80;
//        marks[0][2] = 82;
//
//        marks[1][0] = 81;
//        marks[1][1] = 83;
//        marks[1][2] = 82;
//
//        marks[2][0] = 45;
//        marks[2][1] = 84;
//        marks[2][2] = 52;
//
//        marks[3][0] = 35;
//        marks[3][1] = 84;
//        marks[3][2] = 83;


        //Method-2: Size of array isn't pre-defined:

        int marks[][] = {
                {45,34,67},
                {55,43,44},
                {75,47,45},
                {85,97,75}
        };
        //accessing marks:
        System.out.println(marks[0][0]);
        System.out.println(marks[1][1]);
        System.out.println(marks[2][2]);
        System.out.println(marks[3][1]);

    }
}
