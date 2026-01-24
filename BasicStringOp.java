
import java.util.*;

public class BasicStringOp {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String s = sc.nextLine();
        String s1 = "Sakshi";
        System.out.println(s);
        //accessing element at particular position
        System.out.println("Character at position 2 :" + s.charAt(1));
        //checking for equality of string
        String result = s1.equals(s) ? "Equal strings" : " Not Equal";
        System.out.println(result);
        //finding length of string
        System.out.println(s.length());
        //string concatenation
        String res = s1 + "Pawar";
        //Conversion to upper case 
        System.out.println(s1.toUpperCase());
        //Conversion to lower case 
        System.out.println(s1.toLowerCase());
        //Substring start is inclusive , end index is exclusive
        System.out.println("" + s1.substring(2, 5));
    }
}
