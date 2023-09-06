import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("                Welcome to the DIO bank :)   ");
        System.out.println("- Join us and experience the banking revolution of the future!");
        System.out.println("                               --");
        System.out.println("Fill in your details and open your new account:");
        System.out.print("*Account number: ");
        int newAccountNumber = sc.nextInt();
        System.out.print("*Agency number: ");
        sc.nextLine();
        String newAgencyNumber = sc.nextLine();
        System.out.print("*Full name: ");
        String newAccountFullName = sc.nextLine();
        System.out.print("*Saldo: ");
        double newAccountBalance = sc.nextDouble();
        /*Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque */
    }
}
