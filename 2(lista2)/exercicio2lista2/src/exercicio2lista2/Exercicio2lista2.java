
package exercicio2lista2;

import java.util.Scanner;

public class Exercicio2lista2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = scanner.nextLine();

        String fraseModificada = frase.replace('a', '*');

        System.out.println("Frase modificada: " + fraseModificada);

        scanner.close();
        
    }
    
}
