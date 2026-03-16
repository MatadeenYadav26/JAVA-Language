package Strings;

public class strings_basic {
    public static void main(String[] args) {
//        String name = "Aman";
        String name = "Aman Yadav";
        String sameName = "Aman";
        String newName = new String("Aman");

        System.out.println(name);
        System.out.println(sameName);
        System.out.println(newName);

//        System.out.println("Aman kumar"); // here also a string is made but the data isn't stored into the variable so , therefore : it runs and vanishes of from system after printing.
//
//        if(name == sameName) {
//            System.out.println("Both are Same.");
//        }
//
//        if(name == newName){
//            System.out.println("Both are Same names.");
//        }
//        else{
//            System.out.println("Both are not same names.");
//        }

        if(name.equals(newName)){
            System.out.println("Both name and newName have same values");
        }else{
            System.out.println("not same");
        }




    }
}
