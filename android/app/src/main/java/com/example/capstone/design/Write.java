package com.example.capstone.design;

import android.net.Uri;
import android.widget.Spinner;

public class Write {
    private String Uid; // 글쓴이 식별용
    private String Title;
    private String Content;
    private String Date;
    private String url;


    public Write() {
    }

    public Write(String Uid, String Title, String Content, String Date, String url) {
        this.Uid = Uid;
        this.Title = Title;
        this.Content = Content;
        this.Date = Date;
        this.url = url;

    }

    public String getUid() {
        return Uid;
    }

    public void setUid(String uid) { this.Uid = Uid; }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String Image) {
        this.url = Image;
    }
}