package com.example.insuingae;

import java.util.ArrayList;
import java.util.Date;

public class Insus {
    private String title;
    private String publisher;
    private String contents;
    private Date createdAt;
    private boolean iscompleted;



    public Insus(String title, String publisher, String contents, Date createdAt, boolean iscompleted) {
        this.title = title;
        this.publisher = publisher;
        this.contents = contents;
        this.createdAt = createdAt;
        this.iscompleted = iscompleted;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public boolean isIscompleted() {
        return iscompleted;
    }

    public void setIscompleted(boolean iscompleted) {
        this.iscompleted = iscompleted;
    }
}
