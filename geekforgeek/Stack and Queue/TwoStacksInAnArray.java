import java.util.Scanner;

class TwoStacks {
    int[] arr;
    int size;
    int top1, top2;

    TwoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = size;
    }

    void push1(int x) {
        if (top1 < top2 - 1) {
            top1++;
            arr[top1] = x;
        }
    }

    void push2(int x) {
        if (top1 < top2 - 1) {
            top2--;
            arr[top2] = x;
        }
    }

    int pop1() {
        if (top1 >= 0) {
            int x = arr[top1];
            top1--;
            return x;
        }
        return -1;
    }

    int pop2() {
        if (top2 < size) {
            int x = arr[top2];
            top2++;
            return x;
        }
        return -1;
    }
}

public class TwoStacksInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        TwoStacks ts = new TwoStacks(n);
        System.out.print("Enter operations: ");
        int ops = sc.nextInt();
        for (int i = 0; i < ops; i++) {
            System.out.print("1 push1, 2 push2, 3 pop1, 4 pop2: ");
            int type = sc.nextInt();
            if (type == 1) {
                System.out.print("Enter value: ");
                int val = sc.nextInt();
                ts.push1(val);
            } else if (type == 2) {
                System.out.print("Enter value: ");
                int val = sc.nextInt();
                ts.push2(val);
            } else if (type == 3) {
                System.out.println("Pop1: " + ts.pop1());
            } else {
                System.out.println("Pop2: " + ts.pop2());
            }
        }
    }
}