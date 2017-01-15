package kalenov.nurislam.drawerlayoutanddatabase.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by User on 14.01.2017.
 */

public class DBConnect extends SQLiteOpenHelper{
    //Коннектиться с БД (SQLite)
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "savedate.db";
        public DBConnect(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
//db.execSQL(DATABASE_NAME);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
