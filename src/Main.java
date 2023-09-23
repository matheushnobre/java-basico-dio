
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        System.out.println("----- Criando sua conta -----");
        System.out.println("Digite o número da agência");
        int numero = Integer.parseInt(leitor.nextLine());
        System.out.println("Digite a agência (ex: 067-8): ");
        String agencia = leitor.nextLine();
        System.out.println("Digite o seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Digite o saldo: ");
        double saldo = Double.parseDouble(leitor.nextLine());
        leitor.close();
        System.out.println("Olá, " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
