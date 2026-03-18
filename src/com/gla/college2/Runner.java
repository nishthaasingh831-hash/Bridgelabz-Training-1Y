package com.gla.library;
import com.gla.library.book.Books;
import com.gla.library.members.Members;
import com.gla.library.transactions.Transactions;
public class Runner{
    public static void main(String[] args){
        Books b=new Books("Java Programming","James Gosling");
        Members m=new Members("Nishtha Singh",125294287);
        Transactions t=new Transactions();
        b.displayBook();
        m.displayMember();
        t.issueBook(b,m);
    }
}