import java.util.Scanner;
import java.util.Stack;

public class OnlineStockSpan {
    static class StockSpanner {
        Stack<int[]> stack;

        public StockSpanner() {
            stack = new Stack<>();
        }

        public int next(int price) {
            int span = 1;
            while (!stack.isEmpty() && stack.peek()[0] <= price) {
                span += stack.pop()[1];
            }
            stack.push(new int[]{price, span});
            return span;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StockSpanner spanner = new StockSpanner();
        System.out.print("Enter number of prices: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter price: ");
            int price = sc.nextInt();
            int span = spanner.next(price);
            System.out.println("Span: " + span);
        }
    }
}