/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorial.c;
import java.util.Random;
/**
 *
 * @author Luiz Arthur
 */
public class FatorialC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ThreadFa tr = new ThreadFa("Thread #1", 250000);
        
        ThreadFa tr2 = new ThreadFa("Thread #2", 250000);
        
        ThreadFa tr3 = new ThreadFa("Thread #3", 250000);
        
        ThreadFa tr4 = new ThreadFa("Thread #4", 250000);
        
    }
    
}
