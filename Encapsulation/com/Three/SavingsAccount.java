package Three;

class SavingsAccount extends BankAccount implements Loanable {
    private final double interestRate = 0.04; // 4%

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public void applyForLoan(double amount) {
        if (calculateLoanEligibility()) {
            System.out.println("Loan approved for Savings Account: " + amount);
        } else {
            System.out.println("Loan not eligible for Savings Account.");
        }
    }

    public boolean calculateLoanEligibility() {
        return balance > 5000; // simple rule
    }
}