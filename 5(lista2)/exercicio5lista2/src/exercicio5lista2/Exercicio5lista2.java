
package exercicio5lista2;

import java.util.Scanner;

public class Exercicio5lista2 {

    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        int numeroDePalavras = contaPalavras(frase);

        System.out.println("Número de palavras na frase: " + numeroDePalavras);

        scanner.close();
    }

    public static int contaPalavras(String frase) {
        
        String[] palavras = frase.trim().split("\\s+");
        
        return palavras.length;
        
    }
    
}
