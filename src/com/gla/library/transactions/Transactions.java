package com.gla.library.transactions;
import com.gla.library.book.Books;
import com.gla.library.members.Members;
public class Transactions{
    public void issueBook(Books b,Members m){
        System.out.println("Book Issued Successfully");
        System.out.println("Book: "+b.title);
        System.out.println("Issued To: "+m.name);
    }
}