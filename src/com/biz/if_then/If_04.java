package com.biz.if_then;

public class If_04 {

	public static void main(String[] args) {
		
		//1~100의 숫자중에서 6의 배수를 확인하는 방법
		for(int i = 1 ; i < 100 ; i++) {
			// i를 6으로 나누었을때 나머지가 0인 수 (6의 배수)
			if( i % 6 == 0) { 
				System.out.println(i+"는 6의 배수입니다");
			}
		} 
	}

}
