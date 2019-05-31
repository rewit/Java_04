package com.biz.for_each;

public class For_06 {

	public static void main(String[] args) {

		/*
		 * 
		 *intMin부터 intMax까지의  
		 * 1.전체합
		 * 2.짝수의 합
		 * 3.홀수의 합
		*/
		
		int intmin = 0;
		int intMax = 10;
		int intSum = 0;
		int intEvenSum = 0;
		int intoddSum = 0;
		
		for(int i = intmin; i<=intMax; i++ ) {
			intSum +=i;
		}
		
		
		int intEven = intmin + intmin%2;
		for(int i =intEven; i<=intMax; i+=2) {
			intEvenSum +=i;
		}
		
		
		int intodd = intmin +((intmin+1)%2);
		for(int i =intodd; i<=intMax; i+=2) {
			intoddSum +=i;
		intodd +=i;
		}
		System.out.println("intMin부터 intMax까지의 합:" +intSum);
		System.out.println("intMin부터 intMax까지의 짝수합:"+intEvenSum);
		System.out.println("intMin부터 intMax까지의 홀수합:"+intoddSum);		
		
		}
		
	}


