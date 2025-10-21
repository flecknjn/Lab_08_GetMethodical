import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int faveInt = 0;
        double faveDoub = 0;

        faveInt = SafeInput.getInt(in, "Your favorite integer is");
        faveDoub = SafeInput.getDouble(in, "Your fave double is");

        System.out.println("Your favorite integer is " + faveInt + " and your favorite double is " + faveDoub);
    }
}
