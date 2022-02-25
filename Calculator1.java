/**
 *
 * This is an easy JAVA calculator
 * 
 *
 * @version 1.0 from 25.02.2022
 * @author: Tanuki 
 */
import java.util.Scanner; //importing scanner class from java.util package
public class Calculator1 {
  
  public static void main(String[] args) {
  
    //creating variables
    double result = 0;
    double num1;
    double num2;
    String operator;
    String answer;
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Hello! Welcome to my own-made JAVA calculator. Have fun!!");
    System.out.println("_________________________________________________________");
    System.out.println("  ");
    
    //creating user input
    System.out.print("Enter first number: ");
    num1 = sc.nextDouble();
    
    System.out.print("Enter second number: ");
    num2 = sc.nextDouble();
    
    System.out.print("Enter operator: ");
    operator = sc.next();
    
    System.out.println("  ");
    
    //if-else statements
    if (operator.equals("+")) {
      result = num1 + num2;
      
    }
    
    else if (operator.equals("-")) {
      result = num1 - num2;
        
    }
     
    else if (operator.equals("/")) {
        result = num1 / num2;
      
    }
     
    else if (operator.equals("*")) {
          result = num1 * num2;
      
    }      
    
    //output
    System.out.println("Result: " + result);
    
    System.out.print("Do you want to continue? (yes/no) ");
    answer = sc.next();   
    
    
    if (answer.equals("no")) {
      System.out.println("Thanks for using my calculator!");
    } 
    
    else if (answer.equals("yes")) {
        System.out.println("Okay. As you wish!");
        System.out.println("_________________________________________________________");
        System.out.println("  ");
        
        
    }
    //while-loop  
    while (answer.equals("yes")) { 
      
      System.out.print("Enter first number: ");
      num1 = sc.nextDouble();
    
      System.out.print("Enter second number: ");
      num2 = sc.nextDouble();
    
      System.out.print("Enter operator: ");
      operator = sc.next();
    
      System.out.println("  ");
    
      if (operator.equals("+")) {
        result = num1 + num2;
      
      }
    
      else if (operator.equals("-")) {
        result = num1 - num2;
        
      }
     
      else if (operator.equals("/")) {
          result = num1 / num2;
      
      }
     
      else if (operator.equals("*")) {
            result = num1 * num2;
      
      }      
    
      System.out.println("Result: " + result);
    
      System.out.print("Do you want to continue? (yes/no) ");
      answer = sc.next();
      
      if (answer.equals("no")) {
        System.out.println("Thanks for using my calculator!");
        break;
        
      }
      
      else if (answer.equals("yes")) {
        System.out.println("Okay. As you wish!");
        System.out.println("_________________________________________________________");
        System.out.println("  ");
        
        
      }
      
    }     
    
    sc.close();
 
 
 
 
 
  } 

 
}
