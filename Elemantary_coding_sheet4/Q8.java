import java.util.*;

public class Q8 {

    public static String moveRobot(int input1, int input2, String input3, String input4) {
        int xGrid = input1;
        int yGrid = input2;
        String position = input3;
        String instructions = input4;
        
        // Parse position: format "x-y-D"
        String[] parts = position.split("-");
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);
        char direction = parts[2].charAt(0);
        
        // Parse instructions: space-separated M, L, or R
        String[] moves = instructions.split(" ");
        
        boolean error = false;
        
        for (String move : moves) {
            if (move.isEmpty()) continue;
            
            char cmd = move.charAt(0);
            
            if (cmd == 'M') {
                // Move 1 unit forward in the direction robot is facing
                int newX = x;
                int newY = y;
                
                if (direction == 'E') newX++;
                else if (direction == 'W') newX--;
                else if (direction == 'N') newY++;
                else if (direction == 'S') newY--;
                
                // Check if new position is within grid bounds
                if (newX < 0 || newX > xGrid || newY < 0 || newY > yGrid) {
                    error = true;
                    break; // Stop processing on invalid move
                }
                
                x = newX;
                y = newY;
            } 
            else if (cmd == 'L') {
                // Turn 90 degrees left
                if (direction == 'E') direction = 'N';
                else if (direction == 'N') direction = 'W';
                else if (direction == 'W') direction = 'S';
                else if (direction == 'S') direction = 'E';
            }
            else if (cmd == 'R') {
                // Turn 90 degrees right
                if (direction == 'E') direction = 'S';
                else if (direction == 'S') direction = 'W';
                else if (direction == 'W') direction = 'N';
                else if (direction == 'N') direction = 'E';
            }
        }
        
        // Format output
        String result = x + "-" + y + "-" + direction;
        if (error) {
            result += "-ER";
        }
        
        return result;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int xGrid = sc.nextInt();
            int yGrid = sc.nextInt();
            String position = sc.next();
            String instructions = sc.nextLine().trim(); // Read rest of line
            
            System.out.print(moveRobot(xGrid, yGrid, position, instructions));
        }
    }

}
