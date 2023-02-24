package com.arpita.lab;

public class AdultUsers implements LibraryUser {
	
	//instance variables for AdultUsers class
		int age;
		String bookType;
		
		
		public AdultUsers(int age, String bookType) {
			super();
			this.age = age;
			this.bookType = bookType;
		}

		@Override
		public void registerAccount() {
			
			if(age>12) {
				System.out.println("You have successfully registered under an Adult Account");
			}
			else {
				System.out.println("Sorry, Age must be greater than 12 to register as an adult");
			}
			
		}

		@Override
		public void requestBook() {
			if(bookType.equals("Fiction")) {
				System.out.println("Book issued successfully, you have to return the book within 7 days");
			}
			else {
				System.out.println("Sorry, you are allowed to take only adult Fiction books");
			}
			
		}


}
