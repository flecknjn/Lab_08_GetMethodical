import java.util.Scanner;

public class SafeInput {

    public static String getNonZeroLenString(Scanner pipe, String prompt){

        String retString = "";

        do{
            System.out.print("\n" + prompt + ": ");

            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;
    }

    public static int getInt(Scanner pipe, String prompt){

        int result = 0;
        boolean done = false;
        String trash = "";

        do{
            System.out.print(prompt + ": ");
            if(pipe.hasNextInt()){
                result = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else{
                trash = pipe.nextLine();
                System.out.print("Please enter an integer. " + trash + " is not an integer.");
            }
        }while(!done);
        return result;
    }

    public static double getDouble(Scanner pipe, String prompt){

        double result = 0;
        boolean done = false;
        String trash = "";

        do{
            System.out.print(prompt + ": ");

            if(pipe.hasNextDouble()){
                result = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else{
                trash = pipe.nextLine();
                System.out.print("Please enter a double. " + trash + " is not a double.");
            }
        }while(!done);

        return result;
    }

    public static int getRangedInt(Scanner pipe, String prompt, int low, int high){

        int result = 0;
        boolean done = false;
        String trash = "";

        do{
            System.out.print(prompt + ": ");

            if(pipe.hasNextInt()){
                result = pipe.nextInt();
                pipe.nextLine();

                if(result >= low && result <= high){
                    done = true;
                }
                else{
                    System.out.println("You must enter a value between " + low + " and " + high + ". Not " + result);
                }
            }
            else{
                trash = pipe.nextLine();
                System.out.print("You must enter a value between " + low + " and " + high + ". Not " + trash);
            }
        }while(!done);

        return result;
    }

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high){

        double result = 0;
        boolean done = false;
        String trash = "";

        do{
            System.out.print(prompt + ": ");

            if(pipe.hasNextDouble()){
                result = pipe.nextDouble();
                pipe.nextLine();

                if(result >= low && result <= high){
                    done = true;
                }
                else{
                    System.out.println("You must enter a value between " + low + " and " + high + ". Not " + result);
                }
            }
            else{
                trash = pipe.nextLine();
                System.out.print("You must enter a value between " + low + " and " + high + ". Not " + trash);
            }
        }while(!done);

        return result;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt){

        boolean result = false;
        boolean done = false;
        String trash = "";

        do{
            System.out.print(prompt + ": ");

            if(pipe.hasNext("Y")){
                result = true;
                pipe.nextLine();
                done = true;
            }
            else if(pipe.hasNext("y")) {
                result = true;
                pipe.nextLine();
                done = true;
            }
            else if(pipe.hasNext("N")) {
                result = false;
                pipe.nextLine();
                done = true;
            }
            else if(pipe.hasNext("n")) {
                result = false;
                pipe.nextLine();
                done = true;
            }
            else{
                trash = pipe.nextLine();
                System.out.print("Please enter Y or N. " + trash + " is not Y or N.");
            }
        }while(!done);

        return result;
    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx){

        boolean done = false;
        String trash = "";

        do{
            System.out.print(prompt + ": ");

            if(pipe.hasNext(regEx)){
                pipe.nextLine();
                done = true;
            }
            else{
                trash = pipe.nextLine();
                System.out.print("Please enter the RegEx Pattern. " + trash + " is not the pattern.");
            }
        }while(!done);

        return regEx;
    }
}
