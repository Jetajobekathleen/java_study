import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // Year which divisible by 4
//        int year = 0;
//        System.out.println("Enter year:");
//        int year = sc.nextInt();
//
//        if(year % 4 == 0){
//            System.out.println("Divisible by 4");
//        }else{
//            System.out.println("Failed, not divisible by 4");
//        }
//
//        sc.close();

//        int i = 0;
//        do{
//            System.out.println(i +" ");
//            i++;
//        }while (i <= 10);

        final int pin = 8080;
        int enteredPin;
        int attempt = 0;
        boolean isAuthenticated = false;

        do{
            System.out.println("Enter your pin: ");
            enteredPin = sc.nextInt();
            attempt++;

            if(enteredPin == pin){
                System.out.println("Log in Successfully");
                isAuthenticated = true;
                break;
            }else{
                System.out.println("Incorrect Pin" + (3-attempt));
            }
        }while(attempt < 3);

        sc.close();
    }
}