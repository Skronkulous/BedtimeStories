package com.pluralsight;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {
        printStories();
    }
    public static void printStories() {
        try {
            Scanner kbScanner = new Scanner(System.in);
            String storyOut;
            System.out.print("Please enter a story title to read: \t\n1) goldilocks\t\n2) hansel_and_gretel\t\n3) mary_had_a_little_lamb\nUser Input: ");
            String fileChoice = kbScanner.nextLine();
            if(fileChoice.equalsIgnoreCase("goldilocks") || fileChoice.equalsIgnoreCase("1")){
                FileInputStream fis = new FileInputStream("src/main/resources/goldilocks.txt");
                Scanner txtReader = new Scanner(fis);
                while(txtReader.hasNextLine()){
                    storyOut = txtReader.nextLine();
                    System.out.println(storyOut);
                }
                txtReader.close();
                anotherStory();
            }else if(fileChoice.equalsIgnoreCase("hansel_and_gretel") || fileChoice.equalsIgnoreCase("2")){
                FileInputStream fis = new FileInputStream("src/main/resources/hansel_and_gretel.txt");
                Scanner txtReader = new Scanner(fis);
                while(txtReader.hasNextLine()){
                    storyOut = txtReader.nextLine();
                    System.out.println(storyOut);
                }
                txtReader.close();
                anotherStory();
            }else if(fileChoice.equalsIgnoreCase("mary_had_a_little_lamb") || fileChoice.equalsIgnoreCase("3")){
                FileInputStream fis = new FileInputStream("src/main/resources/mary_had_a_little_lamb.txt");
                Scanner txtReader = new Scanner(fis);
                while(txtReader.hasNextLine()){
                    storyOut = txtReader.nextLine();
                    System.out.println(storyOut);
                }
                txtReader.close();
                anotherStory();
            }
            else{
                System.out.println("Please enter a valid file/story name. ");
                printStories();
            }
        }
        catch(IOException e){
            System.out.println("Please enter a valid file/story name. ");
            printStories();
        }
    }

    public static void anotherStory() {
        Scanner kbScanner = new Scanner(System.in);
        System.out.print("Would you like to read another story? (1 or 2)\n\t1) Yes\n\t2) No\nUser Input: ");
        String choice = kbScanner.nextLine();
        switch(choice){
            case "1":
                printStories();
            case "2":
                System.out.println("Thank you for reading!");
                break;
            default:
                System.out.println("Please enter a valid choice (1 or 2).");
                anotherStory();
        }
        kbScanner.close();
    }

}
