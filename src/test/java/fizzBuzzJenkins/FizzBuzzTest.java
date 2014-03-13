package fizzBuzzJenkins;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;


public class FizzBuzzTest {
	
	FizzBuzz fizzBuzz = new FizzBuzz();
	
	@Test
	public void inputOneResultShouldBeOne(){
		assertEquals("1",fizzBuzz.getResult(1));
	}
	
	@Test
	public void inputTwoResultShouldBeTwo(){
		assertEquals("2", fizzBuzz.getResult(2));
	}
	
	@Test
	public void inputThreeResultShouldBeFizz(){
		assertEquals("Fizz", fizzBuzz.getResult(3));
	}
	
	@Test
	public void inputFiveResultShouldBeBuzz(){
		assertEquals("Buzz", fizzBuzz.getResult(5));
	}
	
	@Test
	public void inputFifteenResultShouldBeFizzBuzz(){
		assertEquals("FizzBuzz", fizzBuzz.getResult(15));
	}
}
