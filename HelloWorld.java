/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author John Word
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kboard = new Scanner(System.in);
        String name = "John Word";
        int age = 29;
        double weight = 172.5;
        boolean likeReggae = true;
        
        
        System.out.print("Hello!");
        String question1 = kboard.nextLine();
        if (question1.equals("What is your name?") ) {
            System.out.print("My name is "+name);
        }
        else if (question1.equals("What is your age?")) {
            System.out.print("I am "+age+" years old.");
        }
        else if (question1.equals("What is your weight?")) {
            System.out.print("I weigh "+weight+" pounds.");
        }
        else if (question1.equals("Do you like reggae?")) {
            if (likeReggae) {
                System.out.print("I like reggae.");
            }
            else {
                System.out.print("I don't like reggae.");
            }
            
        }
        else {
            System.out.print("I didn't understand your question.");
        }
    }
    
    
    
}
