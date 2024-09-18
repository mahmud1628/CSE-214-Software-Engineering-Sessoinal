package Account;

public abstract class Account {
    abstract public double get_interest_rate();
    public double calculate_interest(Integer amount,Integer year) {
        return (amount * year * this.get_interest_rate()) / 100;
    }
}
