import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter text");

        String cmd = myObj.nextLine();
        // System.out.println("entered cmd: " + cmd);

        if (!"quit".equals(cmd))
            System.out.println("Unknown command");
    }
}
