import java.util.Scanner;
public class Conta {
    public static void main(String[] args) throws Exception {

        // Declarando objeto scanner
        var scanner = new Scanner(System.in);


        System.out.println("Digite o seu Nome");
        var nomeCliente = scanner.next();
        System.out.println("Digite o Numero da sua conta bancaria ");
        var conta = scanner.nextInt();
        System.out.println("Digite o Agencia da sua conta bancaria ");
        var agencia = scanner.next();
        System.out.println("Digite o seu Saldo da sua conta bancaria ");
        var saldo = scanner.nextDouble();

        System.out.println("Digite o seu Nome");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " +conta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
