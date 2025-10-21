import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0.0;
        double itemTotal = 0.0;
        boolean contResp = false;

        do{
            itemPrice = SafeInput.getRangedDouble(in, "Your item price is", 0.50, 10.00);
            itemTotal = itemTotal + itemPrice;

            contResp = SafeInput.getYNConfirm(in, "Would you like to continue");

        }while(contResp);

        System.out.printf("Your total is: $%.2f%n", itemTotal);

    }
}
