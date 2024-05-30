import java.util.Scanner;
import java.util.Random;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String cliente;
        String agencia;
        int conta;
        double saldo;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome completo");
        cliente = scanner.nextLine();

        System.out.println("Digite o número da Agência");
        agencia = scanner.nextLine();

        Random random = new Random();
        conta = random.nextInt(10000, 50000);

        System.out.println("Informe o valor que você deseja depositar na sua nova conta");
        saldo = scanner.nextDouble();

        scanner.close();

       System.out.println("Olá " + cliente + ", obrigado por criar um conta em nosso banco, sua agência é " + agencia + " conta " + conta + " e seu saldo de R$" + saldo + " já está disponível para uso.");
    }
}
