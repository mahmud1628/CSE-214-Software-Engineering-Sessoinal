package Customer_package;

import Account.Account;
import Account.VIPAccount;
import Loan.Loan;
import Loan.VIPLoan;

public class VIP_customer implements Customer{ // VIP Factory
    @Override
    public Loan get_loan() {
        return new VIPLoan();
    }

    @Override
    public Account get_account() {
        return new VIPAccount();
    }
}
