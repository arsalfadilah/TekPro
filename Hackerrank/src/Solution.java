import java.util.*;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        String A = sc.next();
        sc.close();
        char temp[] = new char[A.length()];
        int j = 0;
        
        for(int i = temp.length; i>0; i--) {
        	temp[i-1] = A.charAt(j);
        	j++;
        }
        
        String reverse = new String(temp);
            
        if(reverse.equals(A)) {
        	System.out.println("Yes");
        } else {
        	System.out.println("No");
        }
       
	}

}
