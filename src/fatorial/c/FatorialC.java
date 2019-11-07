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
        Random Seed = new Random();
        long s=1;
        int f[] = new int[1000000];
        for(int j= 0;j<1000000;j++){
            f[j] = Seed.nextInt(26);   
            System.out.println("fatorial "+f[j]);
            for(long i=1;i<=f[j];i++){
                s=s*i;
            }
            System.out.println(s);
            s=1;
        }
        
        
    }
    
}
