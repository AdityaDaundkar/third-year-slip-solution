import java.util.Scanner;

class CricketPlayer {
    int pid;
    String pname;
    int totalRuns;
    int inningsPlayed;
    int notOutTimes;

    public CricketPlayer(int pid, String pname, int totalRuns, int inningsPlayed, int notOutTimes) {
        this.pid = pid;
        this.pname = pname;
        this.totalRuns = totalRuns;
        this.inningsPlayed = inningsPlayed;
        this.notOutTimes = notOutTimes;
    }

    public double calculateAverage() {
        if (inningsPlayed - notOutTimes == 0) {
            return 0.0; // To avoid division by zero
        }
        return (double) totalRuns / (inningsPlayed - notOutTimes);
    }
}

public class CricketAverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of players: ");
        int n = scanner.nextInt();

        CricketPlayer[] players = new CricketPlayer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Player " + (i + 1) + ":");
            System.out.print("Player ID: ");
            int pid = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
            System.out.print("Player Name: ");
            String pname = scanner.nextLine();
            System.out.print("Total Runs: ");
            int totalRuns = scanner.nextInt();
            System.out.print("Innings Played: ");
            int inningsPlayed = scanner.nextInt();
            System.out.print("Not Out Times: ");
            int notOutTimes = scanner.nextInt();

            players[i] = new CricketPlayer(pid, pname, totalRuns, inningsPlayed, notOutTimes);
        }

        double maxAverage = Double.MIN_VALUE;
        CricketPlayer maxAvgPlayer = null;

        for (CricketPlayer player : players) {
            double average = player.calculateAverage();
            if (average > maxAverage) {
                maxAverage = average;
                maxAvgPlayer = player;
            }
        }

        System.out.println("\nPlayer with Maximum Average:");
        System.out.println("Player ID: " + maxAvgPlayer.pid);
        System.out.println("Player Name: " + maxAvgPlayer.pname);
        System.out.println("Average: " + maxAverage);

        scanner.close();
    }
}
