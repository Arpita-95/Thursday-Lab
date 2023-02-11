package com.ems.book.service;
import java.util.ArrayList;

import java.util.List;
import com.ems.book.entity.Book;
import com.ems.book.exception.GlobalException;

public class BookService {
	private List<Book> bk=new ArrayList();
	
	public void addBook(long bookId, String bookName, double bookPrice)
	{
		bk.add(new Book( bookId, bookName, bookPrice));
		
	}
	public List<Book> displayAll()
	{
		return bk;
	}
	
	public int lengthOfList()
	{
		return bk.size();
	}
	public Book displayById(long bookId) throws GlobalException
	
	{
		int i;
		for(i=0;i<bk.size();i++)
		{
			if(bk.get(i).getBookId()==bookId)
				return bk.get(i);
		}
		if(i==bk.size())
			throw new GlobalException("Book not found");
		return null;
	}
	public Book displayByName(String bookName) throws GlobalException
	{
		int j;
		for(j=0;j<bk.size();j++)
		{
			if(bk.get(j).getBookName().equals(bookName))
				return bk.get(j);
		}
		if(j==bk.size())
			throw new GlobalException("Book not found");
		return null;
	}
	
	public List<Book> getBk() {
		return bk;
	}
	public void setBk(List<Book> bk) {
		this.bk = bk;
	}
	
	
	
	

}
