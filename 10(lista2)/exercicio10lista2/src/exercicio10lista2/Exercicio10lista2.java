
package exercicio10lista2;

import java.util.Scanner;


public class Exercicio10lista2 {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        scanner.close();

        int contagemVogais = 0;
        int contagemConsoantes = 0;
        palavra = palavra.toLowerCase();
        for (char caractere : palavra.toCharArray()) {
            
            if (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') {
                contagemVogais++;
            } 
            
            else if (Character.isLetter(caractere) && !Character.isWhitespace(caractere)) {
                contagemConsoantes++;
            }
        }

        System.out.println("Número de vogais: " + contagemVogais);
        System.out.println("Número de consoantes: " + contagemConsoantes);
    }
    
}
