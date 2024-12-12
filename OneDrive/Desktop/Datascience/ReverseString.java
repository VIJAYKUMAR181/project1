import java.util.*;

public class ReverseString {
    public static String reversestring(String str) {
        String revstr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revstr = revstr + str.charAt(i);
        }
        return revstr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        System.out.println(reversestring(str));
        sc.close();
    }
}
