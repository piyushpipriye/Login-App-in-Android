package com.example.logindemo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public  static final int DATABASE_VERSION=1;
    public static final String DATABASE_NAME="notes_db";

  public DatabaseHelper(Context context){
      super(context,DATABASE_NAME,null,DATABASE_VERSION);
  }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Note.CREATE_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS "+Note.TABLE_NAME);
    }

    public long insertNote(Note note)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values =new ContentValues();
         values.put(Note.COLUMN_CONTENT,note.getContent());
         long count=db.insert(Note.TABLE_NAME,null,values);
         return count;
    }

    public Note getNote(long id){
      SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.query(Note.);
    }
}
