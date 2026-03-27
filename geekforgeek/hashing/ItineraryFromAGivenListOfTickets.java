import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class ItineraryFromAGivenListOfTickets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of tickets: ");
        int n = sc.nextInt();
        HashMap<String, String> map = new HashMap<>();
        HashMap<String, String> rev = new HashMap<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter from to: ");
            String from = sc.next(), to = sc.next();
            map.put(from, to);
            rev.put(to, from);
        }
        String start = "";
        for (String key : map.keySet()) {
            if (!rev.containsKey(key)) {
                start = key;
                break;
            }
        }
        List<String> itinerary = new ArrayList<>();
        while (start != null) {
            itinerary.add(start);
            start = map.get(start);
        }
        System.out.println("Itinerary: " + itinerary);
    }
}