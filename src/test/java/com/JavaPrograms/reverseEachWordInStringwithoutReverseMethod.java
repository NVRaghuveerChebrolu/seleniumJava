package com.JavaPrograms;

public class reverseEachWordInStringwithoutReverseMethod {
	public static void main(String[] args) {
		String str="Hi How are you doing?";
		String []words=str.split("\\s");
		String ReverseString="";
		int count =words.length;
	//	for (int i=count-1 ; i>=0;i--){
		for (int i=0 ; i<count;i++){
			String word =words[i];
			String RevWord="";
			for (int j= word.length()-1; j>=0;j--){
				RevWord=RevWord+word.charAt(j);
			}
			//System.out.println(RevWord);
			ReverseString=ReverseString+RevWord+ " ";
			//System.out.println(ReverseString);
		}
		System.out.println("input: "+str);
		System.out.println("output: "+ReverseString);
	}
}
