public class Main {
    private static void print(){
        System.out.println("Enter number of account");
        System.out.println("Enter amount");
    }

    public static void main(String[] args) {


        print();
        CreditCard creditCardOne = new CreditCard();
        creditCardOne.setAccountNumber();
        creditCardOne.setTotalAmount();

        print();
        CreditCard creditCardTwo = new CreditCard();
        creditCardTwo.setAccountNumber();
        creditCardTwo.setTotalAmount();

        print();
        CreditCard creditCardThree = new CreditCard();
        creditCardThree.setAccountNumber();
        creditCardThree.setTotalAmount();

        creditCardOne.addMoneyToAccount(25.0);
        creditCardTwo.addMoneyToAccount(42.000);
        creditCardThree.withdrawMoneyToAccount(50);

        System.out.println(creditCardOne);
        System.out.println(creditCardTwo);
        System.out.println(creditCardThree);

    }

}
