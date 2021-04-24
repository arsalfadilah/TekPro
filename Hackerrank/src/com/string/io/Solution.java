package com.string.io;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
    	a = a.toLowerCase();
    	b = b.toLowerCase();
        char A[] = a.toCharArray();
        char B[] = b.toCharArray();
        char temp;
        
        if(a.length() != b.length()) {
        	return false;
        } else {
        	
            for(int i = 0; i<A.length; i++) {
            	for(int j=i+1; j<A.length; j++) {
            		if(A[i]>A[j]) {
            			temp = A[i];
            			A[i] = A[j];
            			A[j] = temp;
            		}
            	}
            }
            
            for(int i = 0; i<A.length; i++) {
            	for(int j=i+1; j<A.length; j++) {
            		if(B[i]>B[j]) {
            			temp = B[i];
            			B[i] = B[j];
            			B[j] = temp;
            		}
            	}
            }
        	
        	for(int i = 0; i<A.length; i++) {
        		if(A[i] != B[i]) {
        			return false;
        		}
        	}
        	
        	return true;
        	
        }
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}