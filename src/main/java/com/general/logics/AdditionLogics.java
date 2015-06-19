package com.general.logics;

public class AdditionLogics {

	public int getAdditionNumbers(Integer...numbers) {
		//TODO: We should improve this logic to support for String type inputs as well
		Integer result = 0;
		for (Integer number : numbers) {
			result += number;
			System.out.println(result);
		}
		System.out.println("total result : " + result);
		return result;
	}

	/*public int getAdditionOfThreeNumbers(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}*/
	
	public int getBonusAddition(int n1, int n2){
		return n1 + n2 + 5;
	}
}
