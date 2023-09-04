import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        int numero;
        String agencia, nomeCliente;
        double saldo;

        Scanner leia = new Scanner(System.in);
        System.out.println("Qual o seu nome?.");
        nomeCliente = leia.next();
        System.out.println("Digite o número da agencia.");
        agencia = leia.next();
        System.out.println("Digite o número da conta.");
        numero = leia.nextInt();
        System.out.println("Qual o saldo da conta?.");
        saldo = leia.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", " +
                "conta "+numero+" e seu saldo R$"+saldo+" já está disponivel para saque.");

    }
}
