package Customer_package;

import Account.Account;
import Account.PremiumAccount;
import Loan.Loan;
import Loan.PremiumLoan;

public class Premium_customer implements Customer{ // Premium factory
    @Override
    public Account get_account() {
        return new PremiumAccount();
    }

    @Override
    public Loan get_loan() {
        return new PremiumLoan();
    }
}
