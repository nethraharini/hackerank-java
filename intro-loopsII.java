import java.util.*;
import java.io.*;
public class series{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt(); // Number of queries
        
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            int term = a + b;
            StringBuilder sb = new StringBuilder();
            
            for (int i = 0; i < n; i++) {
                sb.append(term).append(" ");
                term += (2 << i) * b; // 1 << i is equivalent to 2^i
            }
            
            System.out.println(sb.toString().trim()); // Print the series
        }
        
        sc.close();
    }
}

/*input
  2
0 2 10
5 3 5
Output

2 6 14 30 62 126 254 510 1022 2046
8 14 26 50 98*/
  
