import java.util.Scanner;
public class MenuDrivenProgram{
    
    
    public static void main (String args[]){
        
        Scanner scanObj = new Scanner (System.in);
        System.out.println("Menu: \n1. Greet User \n2. Check Even/Odd \n3. Exit");
        
       System.out.print("Enter your choice (1-3): ");
        int choice = scanObj.nextInt();
        
        switch (choice){
            case 1:
                greetUser();
                break;
            case 2: 
                numCheck();
                break;
            case 3:
                exitMssg();
                break;
            default:
                System.out.println("Input not valid. Try again.");
                break;
        }
    }
    
    static void greetUser(){
        System.out.println("Hello! Welcome!");
    }
    
    static void numCheck(){
        Scanner input = new Scanner (System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();
        
        if(n%2 == 0){
            System.out.println(n + " is an Even number.");
        } else {
            System.out.println(n + " is an Odd number.");
        }
        input.close();
    }
    
    static void exitMssg(){
        System.out.println("Exiting program. Goodbye!");
    }
    
}