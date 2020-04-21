package com.company;

public class Buch {

    private String titel;
    private String author;
    private String isbn;
    private String genre;
    private String verlag;
    private int erscheinungsjahr;
    private String kommentar;

    public String get_Titel() {
        return this.titel;
    }

    public void set_Titel(String titel) {
        this.titel = titel;
    }

    public String get_Author() {
        return this.author;
    }

    public void set_Author(String author) {
        this.author = author;
    }

    public String get_ISBN() {
        return this.isbn;
    }

    public void set_ISBN(String isbn) {
        this.isbn = isbn;
    }

    public String get_Genre() {
        return this.genre;
    }

    public void set_Genre(String genre) {
        this.genre = genre;
    }

    public String get_Verlag() {
        return this.verlag;
    }

    public void set_Verlag(String verlag) {
        this.verlag = verlag;
    }

    public int get_Erscheinungsjahr() {
        return this.erscheinungsjahr;
    }

    public void set_Erscheinungsjahr(int erscheinungsjahr) {
        this.erscheinungsjahr = erscheinungsjahr;
    }

    public String get_Kommentar() {
        return this.kommentar;
    }

    public void set_Kommentar(String kommentar) {
        this.kommentar = kommentar;
    }




    public Buch(String titel, String author) {

        this.titel = titel;
        this.author = author;
        this.isbn = "";
        this.genre = "";
        this.verlag = "";
        this.erscheinungsjahr = 0;
        this.kommentar = "";

    }

    public Buch(String titel, String author, String isbn, int erscheinungsjahr)
    {
        this.titel = titel;
        this.author = author;
        this.isbn = isbn;
        this.genre = "";
        this.verlag = "";
        this.erscheinungsjahr = erscheinungsjahr;
        this.kommentar = "";
    }

    public Buch (String titel, String author, String isbn, String genre, String verlag, int erscheinungsjahr, String kommentar )
    {
        this.titel = titel;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
        this.verlag = verlag;
        this.erscheinungsjahr = erscheinungsjahr;
        this.kommentar = kommentar;
    }

    public Buch()
    {
        this("", "", "", "", "", 0,"");
    }
}
