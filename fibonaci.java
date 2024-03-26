import java.util.Scanner;

public class FibonacciSeries {
	    public static void main(String[] args) {
		            Scanner input = new Scanner(System.in);

			            System.out.print("Enter the number of terms in the Fibonacci series: ");
				            int n = input.nextInt();

					            int firstTerm = 0, secondTerm = 1;

						            System.out.println("Fibonacci Series up to " + n + " terms:");

							            for (int i = 1; i <= n; ++i) {
									                System.out.print(firstTerm + ", ");

											            int nextTerm = firstTerm + secondTerm;
												                firstTerm = secondTerm;
														            secondTerm = nextTerm;
															            }

								            input.close();
									        }
}

