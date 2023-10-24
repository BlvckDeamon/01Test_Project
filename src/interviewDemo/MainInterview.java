package interviewDemo;

import java.util.List;

class Book {
	int id;
	String title;
	String author;
	String category;
	double price;
	int quantity;

}

class User {
	int id;
	String name;
	String email;
	String membershipType;

}

class Cart {
	User user;
	List<Book> books;

}

class Order {
	int id;
	User user;
	List<Book> books;
	double totalAmount;

}

class Discount {

	public double applyDiscount(User user, double totalAmount) {
		switch (user.membershipType) {

		case "Basic":
			return totalAmount;

		case "Premium":
			return totalAmount * 0.75;

		case "VIP":
			return totalAmount * 0.5;

		default:
			return totalAmount;

		}

	}
}

public class MainInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Book b = new Book();
		b.id=1;
		b.author="tushar";
		b.category="friction";
		b.price = 1000;
		b.quantity =2;
		
		
		User u = new User();
		u.id=1;
		u.email="vivek@gmail.com";
		u.name= "vivek";
		u.membershipType="Premium";

	}

}
