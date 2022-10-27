import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
		static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		static LinkedList list = new LinkedList();
	public static void main(String[] args) {
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
		
				case 1:
                   		System.out.print("Enter an integer number to be Appended: ");
				int value = Integer.parseInt(in.readLine());
                    		list.append();

				case 2:
				list.Display();
				
				break;
			
				case 3:
	
				DeleteAll();
				
				break;
				
				case 4:
				System.out.println("Thank you!");
				System.exit(0);
			break;
			}
		}
	}
	
	
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
