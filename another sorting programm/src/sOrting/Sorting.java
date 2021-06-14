package sOrting;

import java.util.Scanner;

public class Sorting {
		public static void main(String[] args) {
			System.out.println("please enter the text");
			Scanner sc = new Scanner (System.in);
			String input = sc.nextLine(); 
			int length = input.length();
			String out = "" ;
			System.out.println("\n" + "After the modification");
			for(int i = 0 ; i<length ; i++) {
				 char inputFromUser = input.charAt(i);
				 if(inputFromUser =='a') {
					 inputFromUser = '*';
					}else if(inputFromUser == 'z') {
						inputFromUser = 'd';
					}else if(inputFromUser == '2') {
						inputFromUser = '2';
					}else if(inputFromUser == '0') {
						inputFromUser = 's';
					}else if(inputFromUser == ' ') {
						inputFromUser = 'V';
					}
					else {
						inputFromUser = (char)(inputFromUser+3);
					}
				 out = out + inputFromUser ;
			
			}
			System.out.println(out + "\n");
			System.out.println("\n" + "Befor the modification");
				System.out.println(input + "\n");
			}
			
}
