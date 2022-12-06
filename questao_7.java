import java.util.Scanner;

public class questao_7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite um número");
        float numero = scan.nextFloat();

        scan.close();

        percentagem(numero);
    }

    public static void percentagem(float numero) {
        System.out.printf("5%% de %.2f: %.1f\n", numero, numero*0.05f);
        System.out.printf("50%% de %.2f: %.2f\n", numero, numero*0.50f);
        System.out.printf("150%% de %.2f: %.3f\n", numero, numero*1.50f);
    }
}
