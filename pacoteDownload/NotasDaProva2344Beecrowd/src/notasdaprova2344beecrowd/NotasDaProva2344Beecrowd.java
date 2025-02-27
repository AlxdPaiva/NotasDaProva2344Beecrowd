/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notasdaprova2344beecrowd;

import java.util.Scanner;

/**
 *
 * @author alxdr
 */
public class NotasDaProva2344Beecrowd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner teclado = new Scanner(System.in);
        int N = teclado.nextInt();
        
        if (N >= 86 && N <=100){
            System.out.println("A");
        } else if ( N>=61 && N <=85){
            System.out.println("B");
        } else if (N>=36 && N<=60) {
            System.out.println("C");
        } else if (N>=1 && N<=35) {
            System.out.println("D");
        } else {
            System.out.println("E");
        }
        
    }
    
}
