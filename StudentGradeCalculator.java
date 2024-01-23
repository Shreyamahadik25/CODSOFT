package CODSOFT;

import java.util.*;

public class StudentGradeCalculator {	
		public static void main(String args[]) {		
			Scanner sc=new Scanner(System.in);
			System.out.println("enter marks obtained out of 100 in each subject");
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int d=sc.nextInt();
			int e=sc.nextInt();
			
			int total=a+b+c+d+e;
			
			System.out.println("total marks= " +total);
			
			float percentage=(total/5);
			
			System.out.println("average percentage= " +percentage);
			if(percentage<35)
			{
				System.out.println("fail");
			}
			if(percentage>=35 && percentage<=50)
			{
				System.out.println("C grade");
			}
			if(percentage>50 && percentage<=75 )
			{
				System.out.println("B grade");
			}
			if(percentage>75 && percentage<=90)
			{
				System.out.println("A grade");
			}
			if(percentage>90 && percentage<=100)
			{
				System.out.println("A+ grade");
			}					
		}
	}

