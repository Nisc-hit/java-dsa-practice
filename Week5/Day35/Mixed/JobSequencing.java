import java.util.Arrays;
class Job {
    int id, deadline, profit;
    Job(int id, int deadline, int profit) {
        this.id = id; this.deadline = deadline; this.profit = profit;
    }
}
public class JobSequencing {
    public static void main(String[] args) {
        Job[] jobs = {
            new Job(1, 4, 20),
            new Job(2, 1, 10),
            new Job(3, 1, 40),
            new Job(4, 1, 30)
        };
        System.out.println("Max profit = " + jobSequencing(jobs));
    }
    static int jobSequencing(Job[] jobs) {
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit); // greedy: highest profit first
        int maxDeadline = 0;
        for (Job job : jobs) maxDeadline = Math.max(maxDeadline, job.deadline);
        boolean[] slotUsed = new boolean[maxDeadline + 1];
        int totalProfit = 0;
        for (Job job : jobs) {
            for (int slot = job.deadline; slot > 0; slot--) {
                if (!slotUsed[slot]) {
                    slotUsed[slot] = true;
                    totalProfit += job.profit;
                    break;
                }
            }
        }
        return totalProfit;
    }
}