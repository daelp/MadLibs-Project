import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Write a MadLib: type these words");
        
        
        //Name
        System.out.println("Name: ");
        String word1 = sc.nextLine();
        if (word1.length() < 1 || word1.length() > 15){
            System.out.println("Invalid Length");
        }
        //Verb
        System.out.println("Verb: ");
        String word2 = sc.nextLine();
        if (word2.length() < 1 || word2.length() > 15){
            System.out.println("Invalid Length");
        }
        //School Subject
        System.out.println("School Subject: ");
        String word3 = sc.nextLine();
        if (word3.length() < 1 || word3.length() > 15){
            System.out.println("Invalid Length");
        }
        //Noun
        System.out.println("Noun: ");
        String word4 = sc.nextLine();
        if (word4.length() < 1 || word4.length() > 15){
            System.out.println("Invalid Length");
        }
        //Adjective
        System.out.println("Adjective: ");
        String word5 = sc.nextLine();
        if (word5.length() < 1 || word5.length() > 15){
            System.out.println("Invalid Length");
        }
        //Color
        System.out.println("Color: ");
        String word6 = sc.nextLine();
        if (word6.length() < 1 || word6.length() > 15){
            System.out.println("Invalid Length");
        }
        //Facial Feature
        System.out.println("Body Part: ");
        String word7 = sc.nextLine();
        if (word7.length() < 1 || word7.length() > 15){
            System.out.println("Invalid Length");
        }
        //Holiday
        System.out.println("Holiday: ");
        String word8 = sc.nextLine();
        if (word8.length() < 1 || word8.length() > 15){
            System.out.println("Invalid Length");
        }
        
        System.out.println("Pick a number for the theme");
        
        //Themes
        
        System.out.println("1= Secret Admirer");
        System.out.println("2= Soccer");
        System.out.println("3= grumpy Person");
        
        if(sc.hasNextInt()) {
            int theme = sc.nextInt();
            if (theme < 1 || theme > 3){
                System.out.println("Invalid Number");
            }
            if (theme == 1){
                System.out.println("Dear " + word1 + ", i still remember the first time I " + word2 + " eyes on you. It was during " + word3 + " class, and you came in to give our teacher a " + word4 + ". The very first thing I noticed was your " + word5 + " face, and your large " + word6 + " " + word7 + ". Since that day, I admit I have had a " + word5 + " " + word4 + " on you! I will reveal my secret identity on " + word8);
            }
            if (theme == 2){
                System.out.println("My name is " + word1 + ". It is a " + word5 + " day, so I will attend my soccer competition. Thousands of " + word4 + " will attend the game. Using my " + word7 + " i'm able to score goals.");
            }
            if (theme == 3){
                System.out.println("I don't get what the " + word5 + " deal is... to me, " + word8 + " is just another day. I really don't understand why every " + word4 + " in the world loves this day so much.");
            }
        } else {
            System.out.print("Invalid Number");
        }
    }
}