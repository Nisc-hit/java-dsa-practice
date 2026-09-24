import java.util.*;

public class JobSequencing {

    static class Job {
        int id, deadline, profit;

        Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void scheduleJobs(Job[] jobs) {

        Arrays.sort(jobs,
            (a, b) -> b.profit - a.profit);

        int maxDeadline = 0;

        for (Job job : jobs) {
            maxDeadline = Math.max(maxDeadline, job.deadline);
        }

        int[] slots = new int[maxDeadline + 1];
        Arrays.fill(slots, -1);

        int totalProfit = 0;

        for (Job job : jobs) {

            for (int slot = job.deadline; slot >= 1; slot--) {

                if (slots[slot] == -1) {
                    slots[slot] = job.id;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        System.out.println("Selected jobs:");

        for (int i = 1; i <= maxDeadline; i++) {
            if (slots[i] != -1) {
                System.out.print("J" + slots[i] + " ");
            }
        }

        System.out.println();
        System.out.println("Total profit: " + totalProfit);
    }

    public static void main(String[] args) {

        Job[] jobs = {
            new Job(1, 2, 100),
            new Job(2, 1, 19),
            new Job(3, 2, 27),
            new Job(4, 1, 25),
            new Job(5, 3, 15)
        };

        scheduleJobs(jobs);
    }
}