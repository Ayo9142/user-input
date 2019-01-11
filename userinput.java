import java.util.Scanner;
public class UserInput {
   public static void main(String [] args){
       Scanner user_input= new Scanner(System.in);
       String first_name;
       System.out.print("Enter your first name: ");
       first_name = user_input.next( );

       String family_name;
       System.out.print("Enter your family name: ");
       family_name = user_input.next( );

       String middle_name;
       System.out.print("Enter Your Middle Name: ");
       middle_name = user_input.next( );

       String age;
       System.out.print("Enter Your Age");
       age = user_input.next();

       String full_name;
       full_name = first_name + " " + family_name + " " + middle_name ;
       System.out.println("You are " + full_name +" " + age +" "+ "Year Old.");


   }
}
