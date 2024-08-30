
package exercicio3lista2;

import java.util.Scanner;

class Exercicio3lista2 {

    
    public static void main(String[] args) {
  
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

       
        String palavraInvertida = inverteString(palavra);

       
        System.out.println("Palavra invertida: " + palavraInvertida);

        
        scanner.close();
    }

    
    public static String inverteString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
        
    }
    
}
