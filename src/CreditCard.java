import java.util.Scanner;

public class CreditCard {
    private String accountNumber;
    private double totalAmount;

    public CreditCard(){
    }

    public double addMoneyToAccount(double temp)
    {
        totalAmount = totalAmount + temp;
        return totalAmount;

    }

    public double withdrawMoneyToAccount(double temp)
    {
        if (totalAmount < temp) {
            double amountToWithdraw = totalAmount;
            totalAmount = 0;
            return amountToWithdraw;
        } else {
            totalAmount = totalAmount - temp;
            return temp;
        }
    }

    public void setAccountNumber() {

        this.accountNumber = new Scanner(System.in).nextLine();
    }

    public void setTotalAmount() {
        double temp = new Scanner(System.in).nextDouble();
        if (temp < 0){
            System.out.println("ЧИсло должно быть больше 0");
        }
        this.totalAmount = temp;
    }



    public String getAccountNumber() {
        return accountNumber;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public String toString() {
        return
                "Account Number: " + getAccountNumber() + '\n' +
                        "Total Amount: " + getTotalAmount() + " скреп";
    }

}
