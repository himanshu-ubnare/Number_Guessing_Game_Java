import java.util.Scanner;
public class NumberGuessingGame {
     public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int sysNumber= (int)(Math.random()*100);
        int userNumber=0;
        do{
            System.out.println("Guess My Number : ");
            userNumber = scan.nextInt();

            if(sysNumber==userNumber){
                System.out.println("You Got The Correct Number !!!");
                break;
            }

            else if(userNumber>sysNumber){
                System.out.println("Your Number is greater than mine");
            }
            else{
                System.out.println("Your Number is smaller than mine");
            }
        }while(userNumber>=0);
        scan.close();
    }
}
