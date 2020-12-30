import java.util.*;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int computerScore = 0, playerScore = 0, counter = 0;
        System.out.println("Welcome to Rock Paper Scissors Game!");
        System.out.print("Before enter this game, please enter your name here: ");
        String name = sc.nextLine();
        System.out.print("How many numbers of game do you want to play? Answer: ");
        int numbersofgame = sc.nextInt();
        while (counter == 0) {
            int computerChoice = 1 + rand.nextInt(3);
            System.out.println("Hello, " + name);
            System.out.println("Choose 1 for rock, 2 for paper, 3 for Scissors");
            int playerChoice = sc.nextInt();
            if (playerChoice == computerChoice) {
                System.out.println("It's a tie!");
            } else if (playerChoice == 1) {
                if (computerChoice == 3) {
                    System.out.println("Congratulations, " + name + ". You won!");
                    playerScore++;
                    System.out.println("Computer " + computerScore + " vs " + playerScore + " You");
                } else if (computerChoice == 2) {
                    System.out.println("Sorry, " + name + ". You lost!");
                    computerScore++;
                    System.out.println("Computer " + computerScore + " vs " + playerScore + " You");
                }
            } else if (playerChoice == 2) {
                if (computerChoice == 1) {
                    System.out.println("Congratulations, " + name + ". You won!");
                    playerScore++;
                    System.out.println("Computer " + computerScore + " vs " + playerScore + " You");
                } else if (computerChoice == 3) {
                    System.out.println("Sorry, " + name + ". You lost!");
                    computerScore++;
                    System.out.println("Computer " + computerScore + " vs " + playerScore + " You");
                }
            } else if (playerChoice == 3) {
                if (computerChoice == 2) {
                    System.out.println("Congratulations, " + name + ". You won!");
                    playerScore++;
                    System.out.println("Computer " + computerScore + " vs " + playerScore + " You");
                } else if (computerChoice == 1) {
                    System.out.println("Sorry, " + name + ". You lost!");
                    computerScore++;
                    System.out.println("Computer " + computerScore + " vs " + playerScore + " You");
                }
            }
            if (playerScore == numbersofgame || computerScore == numbersofgame) {
                if (playerScore == numbersofgame) {
                    System.out.println("Congratulations, "+ name + ". You won this game!");
                    break;
                } else {
                    System.out.println("I'm sorry, " + name + ". You lost this game!");
                    break;
                }
            }
        }
    }
}