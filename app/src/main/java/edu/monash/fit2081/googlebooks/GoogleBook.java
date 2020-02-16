package edu.monash.fit2081.googlebooks;

public class GoogleBook {
    private String bookTitle;
    private String authors;
    private String publishedDate;
    private String subTitle;

    public GoogleBook(String bookTitle, String authors, String publishedDate,String subTitle) {
        this.bookTitle = bookTitle;
        this.authors = authors;
        this.publishedDate = publishedDate;
        this.subTitle = subTitle;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }


}
