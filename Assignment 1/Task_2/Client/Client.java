package Client;

import Account.Account;
import Customer_package.Customer;
import Customer_package.Customer_producer;
import Loan.Loan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Client_helper {

    Client_helper() {
        customer_types.add("regular");
        customer_types.add("premium");
        customer_types.add("vip");
    }

    protected List<String> customer_types = new ArrayList<>();
    protected void print_customer_types() {
        System.out.println("Welcome to our bank.\nOur customer types are the following: ");
        System.out.println("1. Regular\n2. Premium\n3. VIP");
        System.out.print("Please select a number between 1 and 3 to select your desired customer type: ");
    }
    protected void print_services() {
        System.out.println("We offer the following services:\n1. Account\n2. Loan");
        System.out.print("Please select a number between 1 and 2 to select a service: ");
    }
}

public class Client {
    public static void main(String[] args) {
        Client_helper clientHelper = new Client_helper();
        Customer_producer customerProducer = new Customer_producer();
        Scanner scanner  = new Scanner(System.in);
        clientHelper.print_customer_types();
        int c = scanner.nextInt();
        while(c < 0 || c > clientHelper.customer_types.size()) {
            System.out.print("Please select a number between 1 and 3 to select your desired customer type: ");
            c = scanner.nextInt();
        }
        Customer customer = customerProducer.get_customer(clientHelper.customer_types.get(c-1));
        clientHelper.print_services();
        int s = scanner.nextInt();
        while(s < 0 || s >2) {
            System.out.print("Please select a number between 1 and 2 to select a service: ");
            s = scanner.nextInt();
        }
        if(s == 1) {
            Account account = customer.get_account();
            System.out.println("Interest rate of your account: " + account.get_interest_rate() + "%");
            System.out.print("Enter a amount to calculate interest: ");
            int amount = scanner.nextInt();
            System.out.print("Enter year: ");
            int year = scanner.nextInt();
            System.out.println("Total interest: " + account.calculate_interest(amount,year));
        }
        else if(s==2) {
            Loan loan = customer.get_loan();
            System.out.println("Interest rate of your loan: " + loan.get_interest_rate() + "%");
            System.out.print("Enter a amount to calculate interest: ");
            int amount = scanner.nextInt();
            System.out.print("Enter year: ");
            int year = scanner.nextInt();
            System.out.println("Total interest: " + loan.calculate_interest(amount,year));
        }
    }
}
