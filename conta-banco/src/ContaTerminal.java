import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Starting the program and getting the data of the new client
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
        System.out.print("*Account balance: ");
        double newAccountBalance = sc.nextDouble();
        System.out.println();

        //TODO: Creating the client object for future methods
        Client client = new Client(newAccountNumber, newAgencyNumber, newAccountFullName, newAccountBalance);
        System.out.println(client.toString());
        sc.close();
    }
}
