import java.util.Scanner;

public class FactorialCalculator {
	    public static void main(String[] args) {
		            Scanner input = new Scanner(System.in);

			            System.out.print("Enter a number to find its factorial: ");
				            int number = input.nextInt();

					            long factorial = calculateFactorial(number);

						            System.out.println("The factorial of " + number + " is: " + factorial);

							            input.close();
								        }

	        public static long calculateFactorial(int number) {
			        if (number == 0) {
					            return 1;
						            } else {
								                long factorial = 1;
										            for (int i = 1; i <= number; i++) {
												                    factorial *= i;
														                }
											                return factorial;
													        }
				    }
}

