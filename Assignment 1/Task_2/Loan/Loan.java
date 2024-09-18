package Loan;

abstract public class Loan {
    abstract public double get_interest_rate();
    public double calculate_interest(Integer amount,Integer year) {
        return (amount * year * this.get_interest_rate()) / 100;
    }
}
