import java.util.*;

public class Berkeley {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();
        int[] clocks = new int[n];

        System.out.println("Enter clock times:");
        for (int i = 0; i < n; i++) clocks[i] = sc.nextInt();

        int master = 0, sum = 0;
        for (int c : clocks) sum += c - clocks[master];

        int avg = sum / n;

        System.out.println("Average offset: " + avg);
        System.out.println("Synchronized times:");
        for (int i = 0; i < n; i++)
            System.out.println("Process " + i + ": " + (clocks[i] + avg));

        sc.close();  // <-- fixes the yellow warning
    }
}
