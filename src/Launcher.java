import java.util.Scanner;

public class Launcher {

    public static int fibo(int n)
    {
        if (n == 0 || n == 1)
            return n;
        else
            return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args)
    {
        System.out.println("Welcome!");
        System.out.println("Enter a command");
        Scanner myObj = new Scanner(System.in);
        String cmd;

        // System.out.println("entered cmd: " + cmd);

        do {
            cmd = myObj.nextLine();
            // fibo command
            if ("fibo".equals(cmd))
            {
                System.out.println("Please give an index");
                int index = Integer.parseInt((myObj.nextLine()));
                System.out.println(fibo(index));
            }

            else if ("freq".equals(cmd))
            {
                System.out.println("Please give a file path");
                String path = myObj.nextLine();

            }

            else if (!"quit".equals(cmd))
                System.out.println("Unknown command");
            else if ("quit".equals(cmd))
                break;
        }
        while (true);
    }
}
