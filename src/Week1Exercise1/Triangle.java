/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week1Exercise1;

import java.io.IOException;

/**
 *
 * @author tom
 */
public class Triangle {
    private int first;
    private int second;
    private int third;
    private String type;

    public Triangle(int first, int second, int third) throws IOException {
        this.first = first;
        this.second = second;
        this.third = third;
        if (first < 1 || second < 1 || third < 1){
            throw new IOException();
        }
        if (first == second && second == third) {
            type = "equilateral";
        }
        else if (first == second || first == third || second == third) {
            type = "isoceles";
        }
        else{
            type = "scalene";
        }
    }
    
    public String getType(){
        return this.type;
    }
    
}


