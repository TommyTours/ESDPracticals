/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week1Exercise1;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author tom
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        System.out.println("hello wrlod");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the first side: ");
        int first = scanner.nextInt();
        System.out.println("And the second;");
        int second = scanner.nextInt();
        System.out.println("Finally, the third:");
        int third = scanner.nextInt();
        try {
            Triangle myTriangle = new Triangle(first, second, third);
            System.out.println("This is a " + myTriangle.getType() + " triangle.");
        } catch(IOException e) {
            System.out.println("One or more of your sides in invalid");
        }
    }
    
}