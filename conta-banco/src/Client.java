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

    public String toString(){
        return "Hello " + this.clientName + ", thank you for creating an account at our bank, your branch is " + this.accountAgency + ", account " + this.accountNumber + " and your balance $" + this.accountBalance + " is now available for withdrawal!";
    }
}
