
package exercicio7lista2;

import java.util.Scanner;

public class Exercicio7lista2 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu endereço de e-mail: ");
        String email = scanner.nextLine();

        scanner.close();

        if (email.contains("@")) {
            
            int index = email.indexOf('@');
        
            String dominio = email.substring(index + 1);

            System.out.println("O domínio do e-mail é: " + dominio);
        } else {
            
            System.out.println("O endereço de e-mail fornecido não é válido.");
    }   
}
}
