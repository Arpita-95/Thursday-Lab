package com.arpita.lab;

public class KidUsers implements LibraryUser {
	
	//instance variables for KidUsers class
		int age;
		String bookType;
		
		
		public KidUsers(int age,String bookType) {
			super();
			this.age = age;
			this.bookType = bookType;
			
		}
		


		@Override
		public void registerAccount() {
			
			if(age<12) {
				System.out.println("You have successfully registered as a Kids Account");
			}
			else {
				System.out.println("Sorry, Age must be less than 12 to register as a kid");
			
			}
			
		}

		@Override
		public void requestBook() {
			
			if(bookType.equals("Storytelling")) {
				System.out.println("Book issued successfully, you have to return the book within 10 days");
			}
			else {
				System.out.println("Sorry you are allowed to take only kids books");
			}
			
		}
		

}
