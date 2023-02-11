package com.ems.book;

import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.jupiter.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import com.ems.book.entity.Book;
import com.ems.book.exception.GlobalException;
import com.ems.book.service.BookService;

class BookServiceTest {

	BookService b;
	
	@BeforeEach
	void setup()
	{
		b=new BookService();
	}
	
	@AfterEach
	void cleanup() 
	{
		b=null;
		System.out.println("object is garbaje collcted");
	}
	
	@Test
	@DisplayName("Test for addBook Method")
	@Order(1)
	public void addBookTest()
	{
		b.addBook(101,"java",500);
		b.addBook(102,"u & me",600);
		b.addBook(103, "india",800);
		assertEquals(3,b.lengthOfList());
	}
	@Test
	@DisplayName("Test for Display all book")
	@Order(2)
	public void DisplayAllTest()
	{
		b.addBook(101, "java", 500);
		//assertThat(b.displayAll()).isNotNull();
		assertNotNull(b.displayAll());
	}
	@Test
	@DisplayName("Test for Display All Book By Id")
	@Order(value=3)
	public void DisplayBookById(long Id) throws GlobalException
	{
		b.addBook(101, "java", 500);
		Book b1=b.displayById(101);
		//assertThat(b1.getBookName()).isEqualTo("java");
		assertEquals("java",b1.getBookName());
		
	}
	@Test
	@DisplayName("Test for update By Id")
	@Order(value=4)
	public Book updateById(long id)throws GlobalException
	{
//		Scanner sc=new Scanner(System.in);
		int i;
		for(i=0;i<b.getBk().size();i++)
		{
			if(b.getBk().get(i).getBookId()==id)
			{
				
				b.getBk().get(i).setBookName("abc");
				b.getBk().get(i).setBookId(110);
				b.getBk().get(i).setBookPrice(600);
				return b.getBk().get(i);
			}
		}
		if(i==b.getBk().size())
			throw new GlobalException("book is not flound");
		return null;
	}

	
}
