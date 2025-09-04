import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
//        Scanner input = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
//         Int while loop
//                while(i <= 10){
//                    System.out.println(i + " ");
//                    i++;
//                }


//         String while loop iteration
//        String message = "I lowe you";
//        int i = 0;
//        while (i < 10){
//            System.out.println(i + " "+ message);
//            i++;
//        }

//         String while loop iteration count start to 1-10
//        String message = "I lowe you";
//        int i = 1;
//        while (i <= 10){
//            System.out.println(i + " "+ message);
//            i++;
//        }
//         String while loop iteration count start to 10-1
//        String message = "I lowe you";
//        int i = 10;
//        while (i >= 1){
//            System.out.println(i + " "+ message);
//            i--;
//        }

        /*
        * Situational based while loop
        * Used Boolean true or false
        *
        * Is employed ?
        *
        * */

//        System.out.println(" Are you currently employed ?");
//        String answer = input.nextLine();
//        boolean isEmployed = (answer.equalsIgnoreCase("Yes")? true:false);
//        while(true){
//            if (answer.equals("Yes")){
//                isEmployed = true;
//                System.out.println("Employed");
//                break;
//            }else if (answer.equals("No")){
//                isEmployed = false;
//                System.out.println("Unemployed");
//                break;
//            }else{
//                break;
//            }
//        }
//        input.close();

        /*
         * Situational based while loop
         * Used Boolean true or false
         *
         * Iterate over characters in a string using while
         *
         * */
//        String message = "Hello World";
//        int i = 0;
//
//        while(i < message.length()){
//            System.out.println(i + " " +message.charAt(i));
//            i++;
//        }

        /**
         * Situational based While loop
         *
         * Bank Withdraw
         * login Pin
         * input pin(landing page)
         * verify if pin is true/false
         * Choose withdraw? Yes/No
         * Amount Withdraw?
         * input amount
         * if amount is >= int balance -> Withdraw input amount -> Close Process
         * if amount is =< int balance -> Error Unsufficient Balance -> close? or landing page
         *
         * */

        int pin = 2111173;
        int balance = 2500;
        int attempt = 0;
        int input = 0;


        while(true){
            System.out.println("Enter Pin:");
            input = sc.nextInt();
            sc.nextLine();
            attempt++;
            if (input == pin && attempt <= 3) {
                System.out.println("Welcome to PNB ATM !");

                System.out.println("Choose Transaction?");
                String transaction = sc.nextLine();

                if (transaction.equalsIgnoreCase("withdraw")) {
                    System.out.println("Enter the amount");
                    int amount = sc.nextInt();


                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("***********************************************************************");
                        System.out.println("Withdraw Successfully" + " " + "Remaining balance : " + balance);

                    } else {
                        System.out.println("Unsufficient Balance");
                    }
                    break;
                } else if (transaction.equalsIgnoreCase("savings")) {
                    System.out.println("Enter the amount");
                    int amount = sc.nextInt();
                    sc.nextLine();
                    balance += amount;
                    System.out.println("***********************************************************************");
                    System.out.println("Savings Amount Successfully Added" + " " +  "Remaining balance : " + balance);
                    break;
                } else if (transaction.equalsIgnoreCase("exit")) {
                    System.out.println("Thank you for using PNB ATM!");
                    break; // end session
                } else {
                    System.out.println("Invalid transaction type.");
                }


            } else{
                System.out.println("Incorrect Pin, try again.. ");
                if (input != pin && attempt >= 3){
                    break;
                }


            }
        }
        sc.close();

    }
}
