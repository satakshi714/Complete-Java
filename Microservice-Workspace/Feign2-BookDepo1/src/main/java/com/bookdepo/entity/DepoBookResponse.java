package com.bookdepo.entity;
public class DepoBookResponse {

    private int depoId;
    private String depoAddress;
    private BookInfo bookInfo;

    public DepoBookResponse() {
    }

    public DepoBookResponse(int depoId, String depoAddress, BookInfo bookInfo) {
        this.depoId = depoId;
        this.depoAddress = depoAddress;
        this.bookInfo = bookInfo;
    }

    public int getDepoId() {
        return depoId;
    }

    public void setDepoId(int depoId) {
        this.depoId = depoId;
    }

    public String getDepoAddress() {
        return depoAddress;
    }

    public void setDepoAddress(String depoAddress) {
        this.depoAddress = depoAddress;
    }

    public BookInfo getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(BookInfo bookInfo) {
        this.bookInfo = bookInfo;
    }
}