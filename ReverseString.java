import java.util.*;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        String revstr = "";
        for(int i=str.length()-1; i>=0; i--){
            revstr += str.charAt(i);
        }
        System.out.println("Reversed string: "+revstr);

    }
}




