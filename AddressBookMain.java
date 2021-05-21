package addressbooksystem;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
    	 List<Person> addresssBook = new LinkedList<Person>();
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Address Book !");
        int a =0 ;
        while (a==0) {
        	 System.out.print("\nEnter Choice\n1. Add Person\n2. View Address Book\n3.exit\nChoice: ");
             int choice = input.nextInt();
             Person p;
			switch (choice){
                 case 1:
                     p = new Person();
                     p.addPerson();
                     addresssBook.add(p);
                     break;
                 case 2:
                     if(addresssBook.isEmpty()){
                         System.out.println("Address Book is Empty !");
                     } else {
                         for (Person person : addresssBook) {
                             System.out.println(person.toString());
                         }
                     }
                     break;
                 case 3:
                     a=1;
                     break;
			}
        	
        }
 
   
    }
}