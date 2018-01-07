package euler;

public class Euler001 {

	//better
	public long sumAllMultiplesOf3And5(long limit) {
		long sum = 0;
		for (long number = 3; number < limit; number++) {
			if (isMultipleOf3Or5(number)) {
				sum += number;
			}
		}
		return sum;
	}

	private boolean isMultipleOf3Or5(long number) {
		return number % 3 == 0 || number % 5 == 0;
	}

	public long sumAllMultiplesOf3And5With2Loops(long limit) {
		long sum = 0;
		for (long number = 3; number < limit; number += 3) {
			sum += number;
		}
		for (long number = 5; number < limit; number += 5) {
			if (number % 3 == 0) {
				continue;
			}
			sum += number;
		}

		return sum;
	}

}
