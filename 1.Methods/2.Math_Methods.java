package Methods;

public class MathClassMethod {
    static void main(String[] args) {
        int a = 4;
        int b = 7;
        System.out.println(Math.min(a, b));  //it is an inbuilt function.
        System.out.println(Math.sqrt(16));//square root
        System.out.println(Math.pow(2,3));//power
        System.out.println(Math.abs(-3));// absolute gives positive value
        System.out.println(Math.random());// returns random value btwn 0 and 1.
//        System.out.println(getRandom());
        System.out.println(getRandom(10,20)); // 10 se 20 k beech k value milegi ab.
        System.out.println(Math.floor(5.9)); // gives GIF , just smallest integer for a double
        System.out.println(Math.ceil(5.9)); // just greatest integer for a double
        System.out.println(Math.round(5.9)); // gives roundoff value
        System.out.println(Math.round(5.3)); // gives roundoff value

    }

    public static int getRandom(int a , int b ) {
//        return (int) (Math.random()*6)+1;
        return (int) (Math.random()*(b-a+1)+a);
    }

//    static int minimum(int a , int b ) { : it was traditional way to find min value but now we can use Math.min() function directly.
//        return a<b ? a:b;
//    }
}
