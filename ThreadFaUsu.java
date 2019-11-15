/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorialcusu;

import java.util.Random;

/**
 *
 * @author Luiz Arthur
 */
public class ThreadFaUsu extends Thread{
            
    private String nome;
    private int numt;
    private int num;
    
    public ThreadFaUsu(String nome, int num, int numt) {
        this.numt = numt;
        this.nome = nome;
        this.num = num;
        start();
    }
    
    @Override
    public void run() {
        
        //Gera números aleatórios
        Random Seed = new Random();
        long s=1;
        
        //cria um vetor com posições equivalentes a num
        int f[] = new int[this.num];
        
        //calcula os fatoriais dos numeros no vetor f
        for(int j= 0;j<this.num;j++){
            System.out.println(" ");
            //alterei para 24 pois 26 dava erro neste modelo
            f[j] = Seed.nextInt(24);   
            System.out.println(nome+ numt +" ----- com fatorial de "+f[j]);
            for(long i=1;i<=f[j];i++){
                s=s*i;
            }
            System.out.println(s);
            s=1;
        }
    }
    
}
