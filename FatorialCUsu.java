/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorialcusu;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Luiz Arthur
 */
public class FatorialCUsu {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o numero de fatoriais que deseja fazer");
        int n = ler.nextInt();
        
        System.out.println("Digite o numero de Threads que realizaram o serviço");
        int m = ler.nextInt();
        
        for(int i = 0;i<m;i++){
        ThreadFaUsu tr = new ThreadFaUsu("Thread #", n/m, i);
        }
        // testar se fatorial está funcionando perfeitamente

    }
}