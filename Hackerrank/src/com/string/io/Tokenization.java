package com.string.io;

import java.util.*;

public class Tokenization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        scan.close();
        
        String[] token = s.split(" A-Za-z !,?._'@]\+");
		
	}

}
