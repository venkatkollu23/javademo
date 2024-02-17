package inheritance;

public class RetailAccount extends InsuranceAccount {


    private int minimumBalance=100;
    private int limit=20;


    public RetailAccount(String accountNumber, int balance, boolean status) {
        super(accountNumber, balance, status);
    }

    public int getMinimumBalance() {
        return minimumBalance;
    }

    public int getLimit() {
        return limit;
    }
}
