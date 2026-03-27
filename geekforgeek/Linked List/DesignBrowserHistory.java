import java.util.Scanner;
import java.util.Stack;

class BrowserHistory {
    private Stack<String> history;
    private Stack<String> forward;
    private String current;

    public BrowserHistory(String homepage) {
        history = new Stack<>();
        forward = new Stack<>();
        current = homepage;
    }

    public void visit(String url) {
        history.push(current);
        current = url;
        forward.clear();
    }

    public String back(int steps) {
        while (steps > 0 && !history.isEmpty()) {
            forward.push(current);
            current = history.pop();
            steps--;
        }
        return current;
    }

    public String forward(int steps) {
        while (steps > 0 && !forward.isEmpty()) {
            history.push(current);
            current = forward.pop();
            steps--;
        }
        return current;
    }
}

public class DesignBrowserHistory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter homepage: ");
        String homepage = sc.nextLine();
        BrowserHistory browser = new BrowserHistory(homepage);
        System.out.print("Enter number of operations: ");
        int ops = sc.nextInt();
        sc.nextLine(); // consume newline
        for (int i = 0; i < ops; i++) {
            System.out.print("Enter operation (visit/back/forward): ");
            String op = sc.nextLine();
            if (op.startsWith("visit ")) {
                String url = op.substring(6);
                browser.visit(url);
                System.out.println("Visited: " + url);
            } else if (op.startsWith("back ")) {
                int steps = Integer.parseInt(op.substring(5));
                String curr = browser.back(steps);
                System.out.println("Current: " + curr);
            } else if (op.startsWith("forward ")) {
                int steps = Integer.parseInt(op.substring(8));
                String curr = browser.forward(steps);
                System.out.println("Current: " + curr);
            }
        }
    }
}