
package exercicio9lista2;

import java.util.Scanner;

public class Exercicio9lista2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma frase com espaços extras: ");
        String frase = scanner.nextLine();

        scanner.close();

        String fraseFormatada = frase.trim().replaceAll("\\s+", " ");

        System.out.println("Frase formatada: " + fraseFormatada);
    }
    
}
