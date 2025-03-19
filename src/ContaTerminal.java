import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o numero da Agencia!");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o numero da conta!");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente!");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta!");
        saldo = scanner.nextDouble();

        scanner.close();


        System.out.println("Ola " + nomeCliente + ", Obrigado por criar uma conta em nosso Banco, sua agencia e " + agencia + ", conta " +
                numero + " e seu saldo " + saldo + "ja esta disponivel para saque...");
    }
}
