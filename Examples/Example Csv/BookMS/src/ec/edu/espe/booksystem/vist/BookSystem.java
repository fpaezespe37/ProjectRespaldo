package ec.edu.espe.booksystem.vist;

import ec.edu.epe.booksystem.model.Book;
import ec.edu.epe.booksystem.model.BookManager;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

public class BookSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean exit = false;
        int option;
        BookManager bookMa = new BookManager();
        ArrayList<Book> arrBook = new ArrayList<Book>();
        while(!exit){
            System.out.println("\n\t Book manage System\n");
            System.out.println("1| Add a book");
            System.out.println("2| Show all books");
            System.out.println("3| Find books by Editorial");
            System.out.println("4| Find books for year");
            System.out.println("5| Count books by Editorial");
            System.out.println("6| Exit");
           
            System.out.println("\nDigite una opcion: ");
            option = Integer.parseInt(scn.nextLine());
           
            switch(option){
                case 1:
                    Book book = new Book();
                    book.dataEntry();
                    arrBook = bookMa.readAllBooks();
                    arrBook.add(book);
                    bookMa.addNewBook(arrBook);
                    break;
                case 2:
                    arrBook = bookMa.readAllBooks();
                    for (int i = 0; i < arrBook.size(); i++) {
                        arrBook.get(i).showInformationBook();
                    }
                    
                    break;
                case 3:
                    System.out.println("Input Editorial: ");
                    String editorial = scn.nextLine();
                    bookMa.showBookByEditorial(editorial);
                    break;
                case 4:
                    System.out.println("Input Year: ");
                    int year = Integer.parseInt(scn.nextLine());
                    bookMa.showBookByYear(year);
                    break;
                case 5:
                    System.out.println("Input Editorial");
                    String editorialcount = scn.nextLine();
                    bookMa.readAllBooks();
                    bookMa.countBookByEditorial(editorialcount);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Digite una opcion valida");
            }
        }
    }
    
}
