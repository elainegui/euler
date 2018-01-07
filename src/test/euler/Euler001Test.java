package euler;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class Euler001Test {

	private Euler001 objectUnderTest = new Euler001();
	
	private long parameterizedLimit;
	private long parameterizedExpectedSum;
	
	public Euler001Test(long limit, long expectedSum) {
		this.parameterizedLimit = limit;
		this.parameterizedExpectedSum = expectedSum;
	}
	

	@Parameters(name = "{index}: testSumUpUntil{0} = {1}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {4, 3},
                {7, 14},
                {25, 143},
                {1000, 233168},
                {1_000_000, 233_333_166_668L},
                {100_000_000, 2_333_333_316_666_668L},
                {10_000_000_000L, 4_886_589_257_957_115_052L}
                
        });
    }
	
	@Test
	public void testSumUpUntilLimit() {
		//given: the limit of 4
		long limit = parameterizedLimit;
		
		//and: the expected outcome
		long expectedSum = parameterizedExpectedSum;
		
		//when: the sum is calculated
		long sum = objectUnderTest.sumAllMultiplesOf3And5(limit);
		
		//then: the sum should match the expected outcome
		assertEquals("The sum was wrong!", expectedSum, sum);
	}

	@Test
	public void testSumUpUntilLimitWith2Loops() {
		//given: the limit of 4
		long limit = parameterizedLimit;
		
		//and: the expected outcome
		long expectedSum = parameterizedExpectedSum;
		
		//when: the sum is calculated
		long sum = objectUnderTest.sumAllMultiplesOf3And5With2Loops(limit);
		
		//then: the sum should match the expected outcome
		assertEquals("The sum was wrong!", expectedSum, sum);
	}
	
}
