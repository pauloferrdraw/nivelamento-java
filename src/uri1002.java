/* Minha versão deste exercício utilizando a biblioteca
 * Math com a constante PI e o método pow().
 * Código dos meus estudos em Java.
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); // instancia para receber input

        double pi = Math.PI; // PI constante
        double radius = sc.nextDouble(); // armazena o valor do raio
        
        double circleArea = pi * Math.pow(radius, 2); // calcula área do círculo

        System.out.printf("A área do círculo é: %.4f%n", circleArea);

        sc.close();
    }
}
