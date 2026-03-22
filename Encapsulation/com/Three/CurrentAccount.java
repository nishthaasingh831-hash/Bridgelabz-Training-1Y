package Three;

class CurrentAccount extends BankAccount implements Loanable {
    private final double interestRate = 0.02; // 2%

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan approved for Current Account: " + amount);
        } else {
            System.out.println("Loan not eligible for Current Account.");
        }
    }

    public boolean calculateLoanEligibility() {
        return balance > 10000;
    }
}