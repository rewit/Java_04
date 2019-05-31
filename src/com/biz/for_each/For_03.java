package com.biz.for_each;

public class For_03 {

	public static void main(String[] args) {
		int intSum = 0;
		int intE = 1;
		intSum = intSum +intE; //1
		
		intE++; //2
		intSum = intSum + intE; //1 + 2

		intE++; //3
		intSum = intSum + intE; //1 + 2 + 3

		
		intSum = 0; //짝수의 합
		for(int i = 0 ; i <= 10 ; i+=2) {
			System.out.println(i);
			//intSum = intSum + i;
			intSum += i;
}                    
			System.out.println("짝수의 합 :"+intSum);

		intSum = 0; //홀수의 합
		for(int i = 1 ; i <= 10 ; i+=2) {
			System.out.println(i);
			//intSum = intSum + i;
			intSum += i;
	}                    
			System.out.println("홀수의 합 :"+intSum);

			for(int i =1 ; i < 100 ; i++);
			
			for(int i= 1 ; i < 100 ; i++) {
				for(long j = 1; j < 10000000000l; j++);
				System.out.println(i);
			}
			
			
}
	
}