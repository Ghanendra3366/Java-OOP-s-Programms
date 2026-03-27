import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class FIFOPageReplacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter frames: ");
        int frames = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int[] pages = new int[n];
        for (int i = 0; i < n; i++) pages[i] = sc.nextInt();
        int faults = fifoPageReplacement(pages, frames);
        System.out.println("Page Faults: " + faults);
    }
    static int fifoPageReplacement(int[] pages, int frames) {
        Queue<Integer> q = new LinkedList<>();
        int faults = 0;
        for (int page : pages) {
            if (!q.contains(page)) {
                if (q.size() == frames) q.poll();
                q.add(page);
                faults++;
            }
        }
        return faults;
    }
}