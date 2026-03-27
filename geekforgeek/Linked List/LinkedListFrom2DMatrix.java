import java.util.Scanner;

class Node {
    int data;
    Node next;
    Node(int d) { data = d; next = null; }
}

public class LinkedListFrom2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter cols: ");
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print("Enter mat[" + i + "][" + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }
        Node head = null, tail = null;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                Node newNode = new Node(mat[i][j]);
                if (head == null) head = tail = newNode;
                else { tail.next = newNode; tail = newNode; }
            }
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}