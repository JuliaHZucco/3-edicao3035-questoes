import java.util.Scanner;

public class questao_8 {
    public static void main(String[] args) {

        float numero1, numero2;
        int opt;

        Scanner scan = new Scanner (System.in);

        System.out.println("Digite 2 números");

        System.out.print("Numero 1: ");
        numero1 = scan.nextFloat();

        System.out.print("Numero 2: ");
        numero2 = scan.nextFloat();

        boolean loop = true;

        while(loop) {
            System.out.println();
            System.out.println("Escolha uma opção:");
            System.out.println("(1) Soma dos dois números");
            System.out.println("(2) Subtração dos dois números");
            System.out.println("(3) Multiplicação dos dois números");
            System.out.println("(4) Divisão dos dois números\n");
            System.out.println("Qualquer outro número para encerrar a aplicação");
            System.out.println("Digite o número da opção");

            opt = scan.nextInt();

            switch(opt) {
                case 1: System.out.printf("Soma entre %.2f e %.2f: %.2f\n", numero1, numero2, numero1+numero2); break;
                case 2: System.out.printf("Subtração entre %.2f e %.2f: %.2f\n", numero1, numero2, numero1-numero2); break;
                case 3: System.out.printf("Multiplicação entre %.2f e %.2f: %.2f\n", numero1, numero2, numero1*numero2); break;
                case 4: System.out.printf("Divisão entre %.2f e %.2f: %.2f\n", numero1, numero2, numero1/numero2); break;
                default: loop = false; break;
            }
        }

        System.out.println("Encerrando o programa");

        scan.close();

    }
}
