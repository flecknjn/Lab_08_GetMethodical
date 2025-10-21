import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ssnNum = "";
        String ucMNum = "";
        String menuChoice = "";

        ssnNum = SafeInput.getRegExString(in, "\nEnter your SSN", "\\d{3}-\\d{2}-\\d{4}");
        ucMNum = SafeInput.getRegExString(in, "\nEnter your M-Number", "(M|m)\\d{5}$");
        menuChoice = SafeInput.getRegExString(in, "\nEnter your menu choice", "[OoSsVvQq]$");

        System.out.println("Your SSN is: " + ssnNum);
        System.out.println("Your M-Number is: " + ucMNum);
        System.out.println("Your menu choice is: " + menuChoice);


    }
}
