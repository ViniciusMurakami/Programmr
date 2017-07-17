import java.io.*;

public class PalindromString {
    public static void main(String a[]) throws Exception {
        String strn;
        int flag = 0;
        System.out.println("Enter the string:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strn = br.readLine();
        System.out.println("Result string is:");
        //write your logic here
        String x = new StringBuilder(strn).reverse().toString();
        if (x.equalsIgnoreCase(strn)){
            flag=1;
        }else{
            flag=0;
        }

        //end
        if (flag == 1)
            System.out.print("palindrome");
        else
            System.out.print("not a palindrome");

    }
}
