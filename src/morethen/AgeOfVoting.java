package morethen;

import java.util.Scanner;

public class AgeOfVoting {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18 && age <= 74) {
            System.out.println("Hello, " + name + "! You are eligible to vote.");
        } else  if(age <=18){
            System.out.println("Hello, " + name + "! You are baby becose go to school.");
        }
        else if (age >=75){
            System.out.println("Hello" + name + ", you are considered a senior citizen.");
        }
        else {
        	System.out.println("enter valid number");
        }
    }
}
