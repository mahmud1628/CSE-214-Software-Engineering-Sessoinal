package Customer_package;

import Account.Account;
import Loan.Loan;

public interface Customer { // Abstract Factory
    Account get_account();
    Loan get_loan();
}
