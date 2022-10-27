import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
		static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		static LinkedList list = new LinkedList();
	public static void main(String[] args) {
		int quantity;
		/*
		 * Inquires about the number of nodes/data to be inserted in the list.
		 * The valid inputs are only integers greater than or equal to 0;
		 */
		while(true) {
			try {
				System.out.print("The quantity of numbers to be inserted into the list: ");
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
		
		/*
		 * Inserts the numbers into the array.
		 * It continuously asks the user about then number to be inserted
		 * until we reached the quantity that the user has assigned.
		 * Integers only are allowed.
		 */
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
		
		/*
		 *The main menu of the program.
		 *Calls the methods of the operations selected by the command input of the user.
		 *Each methods also contains value checking. 
		 *If an error occurs, the user is returned into the main menu.
		 */
		while(true) {
			System.out.println("\nWhat do you want to do with the list?");
			System.out.println("1) Append");
			System.out.println("2) Display");
			System.out.println("3) Delete All");
			System.out.println("4) Exit");
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
			case 2:
				//Calls the Display() method of the LinkedList Class
				list.Display();
			break;
			
			case 3:
				//Calls the DeleteAll() method.
				DeleteAll();
			break;
				
			case 4:
				//Exits the program.
				System.out.println("Thank you!");
				System.exit(0);
			break;
			}
		}
	}
	
	/*
	 * Ask about the similar numbers to be deleted in the list.
	 * Then the DeleteAll() method of the LinkedList class is calls with the number input
	 * as its parameter.
	 * Value checking is also added to only allow integer inputs.
	 */
	public static void DeleteAll() {
		try {
			System.out.println("Enter the number to be deleted: ");
			int number = Integer.parseInt(in.readLine());
			list.DeleteAll(number);
			System.out.println("The numbers has been deleted!");
		} catch (Exception e) {
			System.out.println("Invalid input! Try again.");
		}
	}

}
