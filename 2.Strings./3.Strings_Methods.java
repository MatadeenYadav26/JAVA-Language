package Strings;

import java.util.Scanner;

public class Learn_String {
    static void main(String[] args) {
        // input your 1st and last name and output will be a combined vlaue.

//        Scanner sc =new Scanner(System.in);
//
//        System.out.println("Enter Your First Name: ");
//        String Firstname = sc.nextLine();
//
//        System.out.println("Enter Your Last Name: ");
//        String Lastname = sc.next();
//
//        System.out.println("Your full name is: "+ Firstname +" "+ Lastname);

//    String name = "       aMAn26   ";
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        System.out.println(name.trim());
//
//        System.out.println("Carpet".startsWith("Carp"));
//        System.out.println("Carpet".endsWith("et"));
//        System.out.println("Carpet".equals("Carpet"));
//        System.out.println("Carpet".charAt(3));

//        int age =  123;
//        String stringAge = String.valueOf(age);
//        System.out.println(age*2); //here you can apply multiply operations
//        System.out.println(stringAge); // here you cant apply multiply or any arithmetic operation as its a string , ony oncatenation will happen.
        

        String sentence = "I Love Java, Java is a good language";

        String newSentence = sentence.replace("Java","Python");

        System.out.println(sentence);
        System.out.println(newSentence);

        System.out.println(sentence.contains("Python"));
        System.out.println(newSentence.contains("Python"));

        String substring = sentence.substring(2,11); //(index number start , index number end + 1) , if end not mentioned , it will store until end of value.
        System.out.println(substring);

        String words[] = sentence.split(" "); // splitting on basis of space , comma , some character , string value , etc.
        for (String word : words){
            System.out.println(word);
        }

        // conversion of string to character arrayy: a character of array works same as a string in java.
        String color = "Brown is my fav colour !";
        char letters[] =  color.toCharArray();

        for(char letter : letters){
            System.out.println(letter);
        }


        // isEmpty() tells is your string empty or not!

        String animal = "        ";
        if(animal.isEmpty()){
            System.out.println("Animal is Empty");
        }else {
            System.out.println("Animal is not empty and isequal to : "+animal);
        }

        if(animal.isBlank()){
            System.out.println("Animal is Blank");
        }



    }
}
