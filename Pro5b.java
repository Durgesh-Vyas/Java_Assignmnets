import java.util.Scanner;

class Account
{
    String customer_name;
    int acc_no;

    Account(String a, int b)
    {
        customer_name=a;
        acc_no=b;
    }

    void display()
    {
        System.out.println ("Customer Name: "+customer_name);
        System.out.println ("Account No: "+acc_no);
    }
}


class Saving_Acc extends Account
{
    int min_bal, saving_bal;

    Saving_Acc(String a, int b, int c, int d)
    {
        super(a, b);
        min_bal = c;
        saving_bal = d;
    }

    void display()
    {
        super.display();

        System.out.println ("Minimum Balance: "+min_bal);
        System.out.println ("Saving Balance: "+saving_bal);
    }
}

class Acct_Details extends Saving_Acc
{
    int deposits, withdrawals;

    Acct_Details(String a, int b, int c, int d, int e, int f)
    {
        super(a, b, c, d);
        deposits = e;
        withdrawals = f;
    }

    void display()
    {
        super.display();

        System.out.println ("Deposit: "+deposits);
        System.out.println ("Withdrawals: "+withdrawals);
    }
}


class Pro5b
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String[] array = new String[1];
        int[] array1 = new int[5];

        System.out.print("Enter customer name : ");
        array[0] = scanner.next();

        System.out.print("Enter account number : ");
        array1[0] = scanner.nextInt();

        System.out.print("Enter minimum balance : ");
        array1[1] = scanner.nextInt();

        System.out.print("Enter saving balance : ");
        array1[2] = scanner.nextInt();

        System.out.print("Enter deposits : ");
        array1[3] = scanner.nextInt();

        System.out.print("Enter withdrawals : ");
        array1[4] = scanner.nextInt();

        System.out.println("\n=========================================");

        Acct_Details A = new Acct_Details(array[0], array1[0],array1[1],array1[2],array1[3],array1[4]);
        A.display();

        System.out.print("=========================================\n");
    }

}