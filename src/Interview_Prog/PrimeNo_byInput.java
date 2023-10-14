package Interview_Prog;

public class PrimeNo_byInput {

	public static void main(String[] args) {
		int n = 5; // change n value to print more or less primes
		int count = 0;
		int number = 2; // start with first prime number
		while (count < n) {
			if (isPrime(number)) {
				System.out.print(number + " ");
				count++;
			}
			number++;
		}
	}

	// helper method to check whether a number is prime or not
	public static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}
