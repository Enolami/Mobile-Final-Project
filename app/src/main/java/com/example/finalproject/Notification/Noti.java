package com.example.finalproject.Notification;

public class Noti {
    private String title;
    private String body;

    public Noti(String title, String body)
    {
        this.title = title;
        this.body = body;
    }

    public String getTittle(){return title;}
    public String getBody(){return body;}
    public void setTittle(String title){this.title = title;}
    public void setBody(String body){this.body = body;}
}
