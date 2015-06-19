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
}
