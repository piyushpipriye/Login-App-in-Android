package com.example.logindemo;
import java.util.Date;
public class Note {

    public  static final String TABLE_NAME ="notes";
    public  static  final  String  COLUMN_ID="id";
    public  static  final  String COLUMN_CONTENT="content";
    public  static final String COLUMN_TIMESTAMP="timestamp";

    public  static  final String CREATE_TABLE ="create table"+TABLE_NAME
            +"("+COLUMN_ID+"INTEGER PRIMARY KEY AUTOINCREMENT,"
            +COLUMN_CONTENT+"TEXT,"
            +COLUMN_TIMESTAMP+"DATETIME DEFAULT CURRENT_TIMESTAMP"
            +")";
    public Note() {
    }

    public Note(int id, String content, String timestamp) {
        this.id = id;
        this.content = content;
        this.timestamp = timestamp;
    }


    private int id;
    private  String content;
    private String timestamp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}
