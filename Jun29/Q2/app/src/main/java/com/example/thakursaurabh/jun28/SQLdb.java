package com.example.thakursaurabh.jun28;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;

public class SQLdb {
    Context context;
    SQLiteDatabase db;
    private static SQLdb sqldb;

    SQLdb(Context context){
        this.context = context;
        db = context.openOrCreateDatabase("notesDB",Context.MODE_PRIVATE,null);
    }

    void createTable(){
        try {
            db.execSQL("CREATE TABLE IF NOT EXISTS noteslist (notes VARCHAR)");
        } catch (Exception e) {
            throw e;
        }
    }

    public static SQLdb getInstance(Context context) {
        if(sqldb == null) {
            sqldb = new SQLdb(context);
        }
        return  sqldb;

    }

    void insert(String note){
        db.execSQL("INSERT INTO noteslist VALUES('"+note+"');");
    }

    boolean checkTable(String tablename) {
        Cursor c = null;
        /* get cursor on it */
        try
        {
            c = db.query(tablename, null,
                    null, null, null, null, null);
        }
        catch (Exception e) {
            /* fail */
            return false;
        }
        return true;
    }

    ArrayList<String> getNotes() {
        Cursor c = db.rawQuery("SELECT * FROM  noteslist;",null);
        ArrayList<String> notes = new ArrayList<>();
        if(c.moveToFirst()) {
            do {
                int index = c.getColumnIndex("notes");
                String note = c.getString(index);
                notes.add(note);
            } while (c.moveToNext());
        }
        return  notes;
    }
}
