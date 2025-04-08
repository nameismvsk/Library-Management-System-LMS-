package LBS;
import java.util.Scanner;

public class LibraryManagement {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        String[] availableBooks = {"Python", "Java", "JavaScript", "C#", "C++", "PHP", "Swift", "Go", "SQL", "R"};
        
        
        System.out.println("\n📚 Available Books:");
        for (String book : availableBooks) {
            System.out.println("- " + book);
        }
        
        
        System.out.print("\nEnter the book name to borrow: ");
        String chosenBook = scanner.nextLine();
        
        
        boolean bookFound = false;
        for (String book : availableBooks) {
            if (book.equalsIgnoreCase(chosenBook)) {
                bookFound = true;
                break;
            }
        }

        if (bookFound) {
            System.out.println("\n✔ You chose: " + chosenBook);
            System.out.print("Enter the number of days to borrow (Max 60 days): ");
            int borrowDays = scanner.nextInt();
            
            if (borrowDays > 60) {
                System.out.println("\n❌ Borrowing limit exceeded! Max allowed: 60 days.");
            } else {
               
                int borrowPrice = borrowDays * 5;
                System.out.println("\n💰 Borrowing price: ₹" + borrowPrice);
                
                
                System.out.print("Choose payment method (Online/Offline): ");
                scanner.nextLine(); 
                String paymentMethod = scanner.nextLine();
                
                System.out.println("\n✅ Payment successful via " + paymentMethod);
                System.out.println("📖 Enjoy reading " + chosenBook + "!");
            }
        } else {
            System.out.println("\n❌ Book not available in the library.");
        }

        
        System.out.print("\nEnter the number of days you kept the book: ");
        int returnDays = scanner.nextInt();
        
        if (returnDays > 60) {
            int extraDays = returnDays - 60;
            int fine = extraDays * 10;
            System.out.println("\n⚠ You exceeded the borrowing limit by " + extraDays + " days.");
            System.out.println("💰 Fine amount: ₹" + fine);
        } else {
            System.out.println("\n✅ No fine. Thank you for returning the book on time.");
        }

        
        System.out.print("\nDo you want to sell a book to the library? (yes/no): ");
        scanner.nextLine(); 
        String sellBookResponse = scanner.nextLine();

        if (sellBookResponse.equalsIgnoreCase("yes")) {
            System.out.print("Enter the book name to sell: ");
            String bookToSell = scanner.nextLine();

           
            int buyingPrice = 20 + (int)(Math.random() * 81);
            System.out.println("\n💰 The library will buy " + bookToSell + " for ₹" + buyingPrice);
        }

        System.out.println("\n📚 Thank you for using the Library Management System!");
        
        scanner.close();
    }
}
