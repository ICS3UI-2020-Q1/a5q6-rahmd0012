import java.util.Scanner;
/**
 * a program that creates a box with the length and width using a user generated number in *
 * @author Daniel Rahmani
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a scanner for user input
    Scanner input = new Scanner(System.in);

    // ask the user for a number between 1 and 10
    System.out.println("Please enter a number between 1 and 10");
    int n = input.nextInt();

    // create a for loop
    for(int count = 0; count <= n; count++){
      System.out.println("*");
      for(int count2 = 0; count2 <=n; count2++){
        System.out.print("*");
      }
    } 
    
  }
}
