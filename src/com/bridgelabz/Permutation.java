package com.bridgelabz;

public class Permutation {

	static void printPermutatn(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans + " ");
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			// ith char of string
			char ch = str.charAt(i);
			String ros = str.substring(0, i) + str.substring(i + 1);
			printPermutatn(ros, ans + ch);
		}
	}

	public static void main(String[] args) {
		String s = "abb";
		printPermutatn(s, " ");
	}
}
