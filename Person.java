package addressbooksystem;

import java.util.Scanner;

public class Person {
	 private String firstName;
	 private String lastName;
	 private String address;
	 private String city;
	 private String state;
	 private int zip;
	 private String phoneNum;

	void addPerson() {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter First name: ");
        firstName = input.nextLine();
        System.out.print("Enter Last name: ");
        lastName = input.nextLine();
        System.out.print("Enter Address: ");
        address = input.nextLine();
        System.out.print("Enter City: ");
        city = input.nextLine();
        System.out.print("Enter state: ");
        state = input.nextLine();
        System.out.print("Enter Zip: ");
        zip = input.nextInt();
        System.out.print("Enter phone number: ");
        phoneNum = input.next();
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + 
				", lastName=" + lastName + 
				", address=" + address + 
				", city=" + city +
				", state=" + state + 
				", zip=" + zip + 
				", phoneNum=" + phoneNum + "]";	
	}
	
}
