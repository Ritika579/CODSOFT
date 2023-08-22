import java.util.*;

public class NumberGuess{
    public static void main(String args[]){


      int maxChances = 10;
      int result=0;
      

      Scanner sc = new Scanner(System.in);
      Random rand = new Random();
      
      boolean playAgain = true;
      while(playAgain){
      int secretNumber = rand.nextInt(100)+1;

      System.out.println("The number is :" +secretNumber);
      
      int count=1;  
      while(count<=10){ 
        System.out.println("Guess a number:");
        int choice = sc.nextInt(); 
        count++;

      if(choice==secretNumber){
        System.out.println("Correct. You win");
        result = result + maxChances - count +1;
        System.out.println("Your score is:" +result );
        break;
      }
      else if(choice<secretNumber){
        System.out.println("Sorry!! The number is higher. Try again.");
      }
      else{
        System.out.println("Sorry!!The number is lower. Try again.");
      }
    }
    if(count>maxChances){
    System.out.println("Sorry your attempts are over.");
    }
    
   
    System.out.println("Do you want to play again? (yes/no): ");
            String playAgainInput = sc.next().toLowerCase();
            playAgain = playAgainInput.equals("yes") || playAgainInput.equals("y");
}
        System.out.println("Game Over!");
        System.out.println("Your score is:" +result );
        sc.close();
        
    }
}