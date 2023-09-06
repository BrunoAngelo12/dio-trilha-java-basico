public class Client {
    private int accountNumber;
    private String accountAgency;
    private String clientName;
    private double accountBalance;

    public Client(){
    }

    public Client(int accountNumber, String accountAgency, String clientName, double accountBalance){
        this.accountNumber = accountNumber;
        this.accountAgency = accountAgency;
        this.clientName = clientName;
        this.accountBalance = accountBalance;
    }
}
