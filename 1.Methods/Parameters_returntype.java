package Methods;

public class LearnMethods {
    static void main(String[] args) {
//        System.out.println(1);
//        System.out.println(2);
//        greet();
//        System.out.println(3);
//        System.out.println(4);


//        average(5,6,false);// not 5.5 as : it uses GIF for output.
        int averagefromfunction = average(5,23,false);
        int doubleOfAverage = average(5,23,false)*2;
        System.out.println("Hello");
        System.out.println(doubleOfAverage);
    }


    // Note : access modifier is optional in general.

//    static public void greet(){
//        System.out.println(5);
//        System.out.println("Hello World!");
//        System.out.println(6);
//    }

    public static int average(int a , int b , boolean shouldAverage){
        if(shouldAverage == false){
            return -1;
        }
        int avg = (a+b)/2;
//        System.out.println("The Avg is: "+avg);
        return avg;
      //  System.out.println(avg);  //this will give error since its unreachable , as its written after return value of output.

    }

}
