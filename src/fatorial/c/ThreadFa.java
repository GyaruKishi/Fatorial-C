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
public class ThreadFa extends Thread{
        
    private String nome;
    private int num;
    
    public ThreadFa(String nome, int num) {
        this.nome = nome;
        this.num = num;
        start();
    }
    
    @Override
    public void run() {
        
        Random Seed = new Random();
        long s=1;
        int f[] = new int[this.num];
        for(int j= 0;j<this.num;j++){
            System.out.println("Posição"+j);
            f[j] = Seed.nextInt(26);   
            System.out.println(nome+" com fatorial de "+f[j]);
            for(long i=1;i<=f[j];i++){
                s=s*i;
            }
            System.out.println(s);
            s=1;
        }
    }
    
}
