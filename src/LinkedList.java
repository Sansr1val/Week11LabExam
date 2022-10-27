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
		
		while(true) {
			System.out.println("\nWhat do you want to do with the list?");
			System.out.println("1) Display");
			System.out.println("2) Append");
			System.out.println("3) Insert After");
			System.out.println("4) Insert Before");
			System.out.println("5) Delete");
			System.out.println("6) Exit");
			int command;
			while(true) {
				try {
					System.out.print("\nEnter your Command:");
					command = Integer.parseInt(in.readLine());
					break;
				} catch (Exception e) {
					System.out.println("Invalid input!");
				}
			}
			
			switch (command){
			}
		}
	}

}
