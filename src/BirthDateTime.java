import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int birthYear = 0;
        int birthMonth = 0;
        int birthDay = 0;
        int birthHour = 0;
        int birthMinute = 0;

        birthYear = SafeInput.getRangedInt(in, "Birth year", 1950, 2015);
        birthMonth = SafeInput.getRangedInt(in, "Birth month", 1, 12);

        switch(birthMonth){

            case 1, 3, 5, 7, 8, 10, 12:
                birthDay = SafeInput.getRangedInt(in, "Day of birth", 1, 31);
            break;

            case 4, 6, 9, 11:
                birthDay = SafeInput.getRangedInt(in, "Day of birth", 1, 30);
            break;

            case 2:
                birthDay = SafeInput.getRangedInt(in, "Day of birth", 1, 28);
            break;
        }

        birthHour = SafeInput.getRangedInt(in, "Hour of birth", 1, 24);
        birthMinute = SafeInput.getRangedInt(in, "Minute of birth", 1, 59);

        System.out.println("Your birthday is " + birthMonth + "/" + birthDay + "/" + birthYear + " at " + birthHour + " hours and " + birthMinute + " minutes.");

    }
}
