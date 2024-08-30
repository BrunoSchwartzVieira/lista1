
package exercicio4lista2;

import java.util.Scanner;

public class Exercicio4lista2 {

    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        if (ehPalindromo(palavra)) {
            System.out.println("A palavra '" + palavra + "' é um palíndromo.");
        } else {
            System.out.println("A palavra '" + palavra + "' não é um palíndromo.");
        }

        scanner.close();
    }

    
    public static boolean ehPalindromo(String s) {
        
        String palavraLimpa = s.replaceAll("\\s+", "").toLowerCase();
        
        String palavraInvertida = new StringBuilder(palavraLimpa).reverse().toString();
 
        return palavraLimpa.equals(palavraInvertida);
        
    }
    
}
