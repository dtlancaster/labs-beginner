import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * Test PowerBall class.
 * 
 * @author Dylan Lancaster
 * @version 11/06/2019
 */
public class PowerBallTicket
{
    /**
     * Main method.
     * 
     * @param args not used
     * @throws IOException IO exception
     */
    public static void main(String[] args) throws IOException
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        System.out.print("How many PowerBall tickets do you want?");
        int numberOfTickets = sc.nextInt();

        PowerBall pb = new PowerBall();
        FileWriter fw = new FileWriter(fileName);
        PrintWriter pw = new PrintWriter(fw);

        for (int i = 0; i < numberOfTickets; i++)
        {
            pb.generateLotteryPicks();
            pw.print(pb.toString() + "\n");
        }

        pw.close();
    }
}
