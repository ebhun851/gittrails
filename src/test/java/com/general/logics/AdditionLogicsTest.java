package com.general.logics;

import static org.junit.Assert.assertThat;

import org.hamcrest.core.Is;
import org.junit.Test;

public class AdditionLogicsTest {
		
	private AdditionLogics additionLogics = new AdditionLogics();
	
	@Test
	public void getResult_AdditionOf2Numbers(){
		int result = additionLogics.getAdditionOfTwoNumbers(5, 5);
		
		assertThat(result, Is.is(10));
	}
	
	@Test
	public void getResult_AdditionOf3Numbers(){
		int result = additionLogics.getAdditionOfThreeNumbers(5, 5, 5);
		
		assertThat(result, Is.is(15));
	}
	
	@Test
	public void getBonusResult_AdditionOf2Numbers(){
		int result = additionLogics.getBonusAddition(5, 5);
		
		assertThat(result, Is.is(15));
	}
}
