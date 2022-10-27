import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
		static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		int quantity;
		while(true) {
			try {
				System.out.println("The quantity of numbers to be inserted into the list: ");
				quantity = Integer.parseInt(in.readLine());
				if(quantity<0) {
					System.out.println("Only integers >= 0 is allowed.");
				}else {
					break;
				}
			} catch (Exception e) {
				System.out.println("Invalid input! Try again.");
			}
		}
		
		for(int i =1; i<=quantity; i++) {
			while(true) {
				try {
					System.out.print("Enter a number: ");
					int number = Integer.parseInt(in.readLine());
					list.Append(number);
					break;
				} catch (Exception e) {
					System.out.println("Invalid input! Try again.");
				}
			}
		}
		System.out.println("The linked list is successfully created!");
		
	}

}
