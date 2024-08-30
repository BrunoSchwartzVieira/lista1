
package exercicio1lista2;

import java.util.Scanner;

public class Exercicio1lista2 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        
        String palavra = scanner.nextLine();
        int numeroDeLetras = palavra.length();

        System.out.println("A palavra '" + palavra + "' possui " + numeroDeLetras + " letras.");
        scanner.close();
        
        
    }
    
}
