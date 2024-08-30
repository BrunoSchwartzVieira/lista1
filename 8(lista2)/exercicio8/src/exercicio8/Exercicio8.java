
package exercicio8;

import java.util.Scanner;

public class Exercicio8 {

   
    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do cartão de crédito: ");
        String numeroCartao = scanner.nextLine();

        scanner.close();

        if (numeroCartao != null && numeroCartao.length() >= 4) {
            
            String mascara = new String(new char[numeroCartao.length() - 4]).replace("\0", "*");

            String ultimos4Digitos = numeroCartao.substring(numeroCartao.length() - 4);

            String resultado = mascara + ultimos4Digitos;

            System.out.println("Número do cartão mascarado: " + resultado);
        } else {
            System.out.println("O número do cartão deve ter pelo menos 4 dígitos.");
    }
    
}
}
