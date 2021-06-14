package grade;
import java.util.Scanner;
public class Grade {

		public static void main(String[] args) {
								String p = "P";
								String m = "M";
								String d = "D";
								String u = "U";
								
			
				double sum= 0.0 ;
				int count = 0;
				double avg = 0.0;
											Scanner input = new Scanner(System.in);
											System.out.println("U = 1.8\nP = 2.4 \nM = 3.2\nD = 4.0\n ");
											System.out.println("How many your marks??");
											Scanner mark = new Scanner(System.in); 
			double marks = input.nextInt();
											System.out.println("please enter your grade");
		double[] grade = new double[(int) marks];
		
		for(int i = 0 ; i < marks ; i++) {
				grade[i] = input.nextDouble();
				sum += grade[i];
				count++;
		}
		System.out.println("the plural is : " + sum);
		avg = sum/marks;
		System.out.println("your average is : " + avg);
		
		if(avg >= 2.4 && avg < 3.2) {
			System.out.println("your grade is " + p);
		}if(avg >= 3.2 && avg <= 3.9) {
			System.out.println("your grade is " + m);
		}if(avg == 4) {

			System.out.println("your grade is " + d);
		}if(avg > 4) {
			System.out.println("valid in put");
		}
		if (avg < 2.4){
			System.out.println("your grade is " + u);
		}
	
		
		}

		}