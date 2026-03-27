import java.util.Scanner;
import java.util.Arrays;

public class MeetingRooms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of meetings: ");
        int n = sc.nextInt();
        int[][] meetings = new int[n][2];
        System.out.print("Enter start and end: ");
        for (int i = 0; i < n; i++) {
            meetings[i][0] = sc.nextInt();
            meetings[i][1] = sc.nextInt();
        }
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        int rooms = 1;
        int end = meetings[0][1];
        for (int i = 1; i < n; i++) {
            if (meetings[i][0] < end) {
                rooms++;
                end = Math.min(end, meetings[i][1]);
            } else {
                end = meetings[i][1];
            }
        }
        System.out.println("Rooms needed: " + rooms);
    }
}