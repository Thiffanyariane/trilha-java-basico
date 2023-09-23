import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da conta! ");
        int Numero = scanner.nextInt();

        System.out.println("Digite o número da agência! ");
        String Agencia = scanner.next();

        System.out.println("Digite seu nome! ");
        String NomeCliente = scanner.next().concat(" " ).concat(scanner.next());

        System.out.println("Digite o saldo! ");
        double Saldo = scanner.nextDouble();

        System.out.println("Olá ".concat(NomeCliente).concat(
                ", obrigado por criar uma conta em nosso banco, sua agência é ").concat(Agencia).concat(
                        ", conta " ).concat(Integer.toString(Numero)).concat(" e seu saldo " ).concat(
                                Double.toString(Saldo)).concat(" já está disponível para saque."));

    }
}