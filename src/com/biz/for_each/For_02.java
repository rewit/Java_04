package com.biz.for_each;

public class For_02 {

	public static void main(String[] args) {

		int intGu = 2;
		System.out.println("===="+ intGu + "단 ====");
		for(int intEle = 2; intEle < 10 ; intEle++) {
			System.out.println(intGu + "x" + intEle + "=" +intGu * intEle);
		}
		
		intGu++;
		System.out.println("===="+ intGu + "단 ====");
		for(int intEle = 2; intEle < 10 ; intEle++) {
			System.out.println(intGu + "x" + intEle + "=" +intGu * intEle);
		}
		//for문 (;;)에는 3개의 명령문이 들어가는데 첫번째는 최초 실행시에만 실행 두번째는 조건 세번째는 증가값

		
	}

}
