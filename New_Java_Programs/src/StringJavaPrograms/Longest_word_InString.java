package StringJavaPrograms;

import java.util.Scanner;

public class Longest_word_InString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Plz Enter asentence :");
		String inputByuser = sc.nextLine();
		int length = 0;
		String longestword = null;
		String[]words = inputByuser.split(" ");
		for(int i = 0 ; i < words.length ; i++) {
			if(length < words[i].length()) {
				length = words[i].length();
				longestword = words[i];
			}
		}
		System.out.println(length);
		System.out.println(longestword);
	}
	
	
}

