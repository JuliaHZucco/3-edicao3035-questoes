import java.util.Scanner;

public class questao_6 {

    public static void main(String[] args) {
        float numero1, numero2, numero3;

        Scanner scan = new Scanner (System.in);

        System.out.println("Digite 3 números reais");

        System.out.print("Numero 1: ");
        numero1 = scan.nextFloat();

        System.out.print("Numero 2: ");
        numero2 = scan.nextFloat();

        System.out.print("Numero 3: ");
        numero3 = scan.nextFloat();

        scan.close();
        
        float[] numeros = new float[]{numero1, numero2, numero3};
        estatistica(numeros);
    }

    public static void estatistica(float[] numeros) {
        float soma = 0, media;
        for (float numero : numeros) {
            soma += numero;
        }
        media = soma/numeros.length;
        System.out.printf("Soma dos números: %.2f\n", soma);
        System.out.printf("Média dos números: %.2f\n", media);
    }
}
