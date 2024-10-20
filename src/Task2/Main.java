package Task2;
import java.util.Scanner;

/**
 * Main class to test the State pattern implementation with user control.
 */
public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Scanner scanner = new Scanner(System.in);
        String command = "";

        System.out.println("Media Player is ready. We are listening to Software Designer Patterns Podcast today.");
        System.out.println("Available commands: play, pause, stop, exit");

        while (!command.equalsIgnoreCase("exit")) {
            System.out.print("Enter command: ");
            command = scanner.nextLine().trim();

            switch (command.toLowerCase()) {
                case "play":
                    player.play();
                    break;
                case "pause":
                    player.pause();
                    break;
                case "stop":
                    player.stop();
                    break;
                case "exit":
                    System.out.println("Exiting the media player.");
                    break;
                default:
                    System.out.println("Unknown command. Please enter play, pause, stop, or exit.");
                    break;
            }
        }

        scanner.close();
    }
}

