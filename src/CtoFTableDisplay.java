
public class CtoFTableDisplay {

    public static void main(String[] args) {
        System.out.println("Celsius\t\tFahrenheit");
        System.out.println("-------------------------");

        for(int cel = -100; cel <= 100; cel++){
            double fahr = CtoF(cel);
            System.out.printf("%-8d\t%10.2f%n", cel, fahr);
        }
    }

    public static double CtoF(double Celsius){
        double fahr = 0;
        fahr = (Celsius * (9.0/5.0)) + 32.0;

        return fahr;
    }
}
