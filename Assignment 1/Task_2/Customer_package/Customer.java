package Customer_package;

import Account.Account;
import Loan.Loan;

public interface Customer { // Abstract Factory
    public Account get_account();
    public Loan get_loan();
}
