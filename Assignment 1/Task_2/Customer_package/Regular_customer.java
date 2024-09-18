package Customer_package;

import Account.Account;
import Account.RegularAccount;
import Loan.Loan;
import Loan.RegularLoan;

public class Regular_customer implements Customer{ // Regular Factory
    @Override
    public Account get_account() {
        return new RegularAccount();
    }

    @Override
    public Loan get_loan() {
        return new RegularLoan();
    }
}
