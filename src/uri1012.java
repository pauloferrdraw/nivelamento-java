/* Minha versão deste exercício utilizando a biblioteca
 * Math com a constante PI e o método pow().
 * Código dos meus estudos em Java.
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();

        // Area Triangulo
        double areaTri = (n1 * n3)/2;

        // Area Circulo
        double areaCirculo = Math.PI * Math.pow(n3, 2);

        // Area Trapezio
        double areaTrapezio = (n1 + n2) * n3 / 2;

        // Area Quadrado
        double areaQuadrado = n2 * n2;

        // Area Retangulo
        double areaRetangulo = n1 * n2;

        System.out.printf("TRIANGULO: %.3f%n", areaTri);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaRetangulo);

        sc.close();
    }
}
