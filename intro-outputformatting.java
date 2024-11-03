import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n",s1,x); /// printf is used to format specifiers
              // -15s which indicates left indicates
              // %03d will format 5 as 005, padding with leading zeros to ensure it's three digits long.
              // %n  to ouput a newline
                
                //Complete this line
            }
            System.out.println("================================");

    }
}




/*java 100
cpp 65
python 50
Your Output (stdout)
================================
java           100
cpp            065
python         050
================================*/
