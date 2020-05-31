package javapart5;

import javax.swing.*;

public class BookManagement {
    int n;
    Book [] book;

    public BookManagement(Book[] book) {
        this.book = book;
        this.n =book.length;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Book[] getBook() {
        return book;
    }

    public void setBook(Book[] book) {
        this.book = book;
    }
    void tongsobestsell(){
        int a =0;
        for (int i = 0;i<n;i++){
            if (book[i].getTotalSold()>1000){
                a++;
            }
        }
        System.out.println("tong so sach best sell:"+a);
    }
    public void sachbanchaynhat(){
        long b =book[0].getTotalSold();
        int c=0;
        for (int i =0;i<n;i++){
            if (b<book[i].getTotalSold()){
                b=book[i].getTotalSold();
                c++;
            }
        }
        System.out.println("sach ban chay nhat: " +" "+book[c].getName() +" "+ book[c].getAuthor() +" "+ book[c].getPrice() +" "+ book[c].getTotalSold());
    }
    public void insach(){
        for (int i = 0;i<n;i++){
            System.out.println(book[i].getName() +" "+ book[i].getAuthor() +" "+ book[i].getPrice() +" "+ book[i].getTotalSold());
        }
    }
}
