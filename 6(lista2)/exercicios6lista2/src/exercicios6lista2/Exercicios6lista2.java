
package exercicios6lista2;

import java.util.Scanner;

public class Exercicios6lista2 {

    
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nomeCompleto = scanner.nextLine();

        String nomeFormatado = formatarNome(nomeCompleto);

        System.out.println("Nome formatado: " + nomeFormatado);

        scanner.close();
    }

    public static String formatarNome(String nome) {
       
        String[] palavras = nome.split("\\s+");

        StringBuilder nomeFormatado = new StringBuilder();

        for (String palavra : palavras) {
            if (!palavra.isEmpty()) {
               
                String primeiraLetra = palavra.substring(0, 1).toUpperCase();
                String restoPalavra = palavra.substring(1).toLowerCase();
  
                nomeFormatado.append(primeiraLetra).append(restoPalavra).append(" ");
            }
        }

        return nomeFormatado.toString().trim();
    }
    
}
