/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.epe.booksystem.model;

import com.csvreader.CsvWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class BookManager {

    public BookManager() {
    }

    public void addNewBook(ArrayList<Book> arrBook){
        String bookFile= "Book.csv";
        File file = new File (bookFile);
        if(file.exists())file.delete();
   
        try  {
            CsvWriter writer = new CsvWriter(new FileWriter(bookFile,true),';');
            for(Book newBook : arrBook){
                writer.write(newBook.getTitle());
                writer.write(newBook.getAuthor());
                writer.write(newBook.getEditorial());
                writer.write(Integer.toString(newBook.getYear()));
                writer.endRecord();
            }
            writer.close();
        }
    catch(IOException e){
            
        }
    }
    
    public ArrayList<Book> readAllBooks(){
        ArrayList<Book> arrBook = new ArrayList<Book>();
                
        try{
            String bookFile= "Book.csv";
            File f=new File(bookFile);
            
            if(f.exists())
            {
                FileReader fr = new FileReader(f);
                BufferedReader br=new BufferedReader(fr);
                String line;
                while((line = br.readLine())!=null)
                {
                    Book book = new Book();
                    String[] contact = line.split(";");
                    
                    book.setTitle(contact[0]);
                    book.setAuthor(contact[1]);
                    book.setEditorial(contact[2]);
                    book.setYear(Integer.parseInt(contact[3]));
            
                    
            
                    arrBook.add(book);
                }
                br.close();
            
            }
        }catch(Exception e){
            System.out.println(e);}
       return arrBook; 
    }
    public void showBookByEditorial(String editorial){
        System.out.println("\n\tBooks of "+editorial);
        
        ArrayList<Book> arrBook = new ArrayList<>();
        arrBook = readAllBooks();
        for (int i = 0; i < arrBook.size(); i++) {
            Book book = new Book();
            book = arrBook.get(i);
            if (book.getEditorial().equals(editorial)) {
                book.showInformationBook();
            }
        }
    }
    
    public void showBookByYear(int year){
        System.out.println("\n\tBooks of "+year);
        
        ArrayList<Book> arrBook = new ArrayList<Book>();
        arrBook = readAllBooks();
        
        for (int i = 0; i < arrBook.size(); i++) {
            Book book = new Book();
            book = arrBook.get(i);
            if (book.getYear()==year) {
                book.showInformationBook();
            }
        }
    }
    
    public void countBookByEditorial(String editorial){
        int count = 0;
        ArrayList<Book> arrBook = new ArrayList<Book>();
        arrBook = readAllBooks();
                
        for (int i = 0; i < arrBook.size(); i++) {
            Book book = new Book();
            book = arrBook.get(i);
            if (book.getEditorial().equals(editorial)) {
                count++;
            }
        }
        
        System.out.println("\nThe Editorial "+editorial+" have "+count+" Books");
    }

    
    
}
