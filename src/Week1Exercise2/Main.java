/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week1Exercise2;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author tom
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        InputStream stream = Main.class.getResourceAsStream("grades.txt");
        Scanner scanner = new Scanner(stream);
        int[] counts = new int[10];
        int number = 0;
        while (scanner.hasNext()) {
            number = scanner.nextInt();
            if(number >= 1 && number < 10){
                counts[0]++;
            } else if (number >= 11 && number <= 20) {
                counts[1]++;
            } else if (number >= 21 && number <= 30) {
                counts[2]++;
            } else if (number >= 31 && number <= 40) {
                counts[3]++;
            } else if (number >= 41 && number <= 50) {
                counts[4]++;
            } else if (number >= 51 && number <= 60) {
                counts[5]++;
            } else if (number >= 61 && number <= 70) {
                counts[6]++;
            } else if (number >= 71 && number <= 80) {
                counts[7]++;
            } else if (number >= 81 && number <= 90) {
                counts[8]++;
            } else if (number >= 91 && number <= 100) {
                counts[9]++;
            }
        }
        
        System.out.print(" 1 - 10  | ");
        for (int i = 0; i < counts[0]; i++) {
            System.out.print("*");            
        }
        System.out.println("");
        System.out.print("11 - 20  | ");
        for (int i = 0; i < counts[1]; i++) {
            System.out.print("*");            
        }
        System.out.println("");
        System.out.print("21 - 30  | ");
        for (int i = 0; i < counts[2]; i++) {
            System.out.print("*");            
        }
        System.out.println("");
        System.out.print("31 - 40  | ");
        for (int i = 0; i < counts[3]; i++) {
            System.out.print("*");            
        }
        System.out.println("");
        System.out.print("41 - 50  | ");
        for (int i = 0; i < counts[4]; i++) {
            System.out.print("*");            
        }
        System.out.println("");
        System.out.print("51 - 60  | ");
        for (int i = 0; i < counts[5]; i++) {
            System.out.print("*");            
        }
        System.out.println("");
        System.out.print("61 - 70  | ");
        for (int i = 0; i < counts[6]; i++) {
            System.out.print("*");            
        }
        System.out.println("");
        System.out.print("71 - 80  | ");
        for (int i = 0; i < counts[7]; i++) {
            System.out.print("*");            
        }
        System.out.println("");
        System.out.print("81 - 90  | ");
        for (int i = 0; i < counts[8]; i++) {
            System.out.print("*");            
        }
        System.out.println("");
        System.out.print("91 - 100 | ");
        for (int i = 0; i < counts[9]; i++) {
            System.out.print("*");            
        }
    }
}
