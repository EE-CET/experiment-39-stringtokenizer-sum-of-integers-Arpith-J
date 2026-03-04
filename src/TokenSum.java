import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Read the entire line of integers
        // Create a StringTokenizer object for the line
        // Iterate through tokens (hasMoreTokens)
        // Parse each token to int and add to sum
        // Print the sum
        String s = sc.nextLine();
        StringTokenizer st = new StringTokenizer(s," ");
        int sum = 0;
        while(st.hasMoreTokens()){
            sum += Integer.parseInt(st.nextToken());
        }
        System.out.println(sum);
    }
}
