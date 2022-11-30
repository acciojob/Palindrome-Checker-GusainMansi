import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        for(int i=0;i<n;i++) {
            int j = n - 1 - i;
            if (j>0 && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j)))
            { System.out.println("false");return;}
        }
        System.out.println("true");
    }
}
