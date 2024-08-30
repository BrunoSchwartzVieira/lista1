
package exercicio4lista1;

import java.util.Scanner;

public class Exercicio4lista1 {

    
    public static void main(String[] args) {
      
        String frase = "Esta é uma frase de exemplo para exercício.";
        int tamanho = frase.length();
        System.out.println("o tamanho da frase é:" + tamanho);
        
        String maiusculas = frase.toUpperCase();
        System.out.println("Frase em maiusculas:" + maiusculas);
        
        String minusculas = frase.toLowerCase();
        System.out.println("Frase em minusculas:" + minusculas);
        
        String substring = frase.substring (11, 29);
        System.out.println("Substring extraída:" + substring);
        
    }
    
}
