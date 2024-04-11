import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    int numero;
    String agencia;
    String nomeCliente = "";
    double saldo;
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public void numero() {  
        System.out.println("Por favor, digite o número da conta:");
        numero = scanner.nextInt();
    }

    public void agencia(){    
        System.out.println("Por favor, digite o número da agência:");
        agencia = scanner.next();
        scanner.nextLine();
    }

    public void nomeCliente(){
        System.out.println("Por favor, insira o nome do cliente:");
        nomeCliente = scanner.nextLine();
    }

    public void saldo(){
        System.out.println("Por favor, insira o saldo:");
        saldo = scanner.nextDouble();
    }

    public void mensagem(){
    System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");
    }
}

