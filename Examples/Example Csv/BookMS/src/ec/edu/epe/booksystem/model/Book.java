/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.epe.booksystem.model;

import java.util.Scanner;


public class Book {
    private String title;
    private String author;
    private String editorial;
    private int year;

    public Book() {
    }

    public Book(String title, String author, String editorial, int year) {
        this.title = title;
        this.author = author;
        this.editorial = editorial;
        this.year = year;
    }

    
    public void showInformationBook(){
        System.out.println("\nTitle     : "+this.getTitle());
        System.out.println("Author    : "+this.getAuthor());
        System.out.println("Editorial : "+this.getEditorial());
        System.out.println("Year      : "+this.getYear());
    }
    public void dataEntry(){
        Scanner scn = new Scanner(System.in);
        System.out.println("\n\tBook Information\n");
        try{
           
            System.out.println("Title: ");
            this.title=(scn.nextLine()); 
            System.out.println("Author: ");
            this.author=(scn.nextLine());
            System.out.println("Editorial: ");
            this.editorial = scn.nextLine();
            System.out.println("Year: ");
            this.year = (Integer.parseInt(scn.nextLine()));      
        }
        catch(Exception e){
            System.out.println("Invalid format");
            e.printStackTrace();
        }
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * @param author the author to set
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * @return the editorial
     */
    public String getEditorial() {
        return editorial;
    }

    /**
     * @param editorial the editorial to set
     */
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }
}
