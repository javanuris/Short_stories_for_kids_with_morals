package kalenov.nurislam.drawerlayoutanddatabase.main;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import kalenov.nurislam.drawerlayoutanddatabase.database.DBConnect;
import kalenov.nurislam.drawerlayoutanddatabase.other.DataItems;

/**
 * Created by User on 15.01.2017.
 */

public class MenuDatabaseActivity {
/*Класс который напрямую работает с БД и берет данные для бокового меню*/
    private DBConnect dbConnect;
    private SQLiteDatabase sqLiteDatabase;
    private static final String TABLE_MENU ="main_menu";
    private static final String KEY_ID = "_id";
    private static final String KEY_MENU_ITEM="menu_item";

   public MenuDatabaseActivity(Context context){
        dbConnect= new DBConnect(context);
        sqLiteDatabase = dbConnect.getReadableDatabase();
    }

    public void addDataItem(DataItems dataItems){

    }
    //выбор конкретного контакта
    public DataItems getDataItem(int id){
        sqLiteDatabase  = dbConnect.getReadableDatabase();
        Cursor cursor = sqLiteDatabase.query(TABLE_MENU , new String[]{KEY_ID,KEY_MENU_ITEM}, KEY_ID + "=?",new
        String[]{String.valueOf(id)}, null , null, null, null);
        if(cursor!=null)
            cursor.moveToFirst();
        DataItems dataItems = new DataItems();
        dataItems.setName(cursor.getString(0));
        return dataItems;
    }

/*Именно этот метод берет взвбивает все данные в коллекцю для далнейшей с ней работы*/
    public List<DataItems> getAllDataItems(){
        List<DataItems> dataList = new ArrayList<DataItems>();
        String selectQuery = "select * from "+TABLE_MENU;
        sqLiteDatabase  = dbConnect.getWritableDatabase();
        Cursor cursor = sqLiteDatabase.rawQuery(selectQuery , null);
        if(cursor.moveToFirst()){
            do{
                DataItems dataItems = new DataItems();
                dataItems.setName(cursor.getString(1));
                dataList.add(dataItems);
            }while (cursor.moveToNext());
        }
        return dataList;
    }

    public int getDataItemsDataItem(){
        return 0;
    }
    public int updateDataItem(DataItems dataItems){
        return 0;
    }
    public void deleteDataItem(DataItems dataItems){
    }
    // Пока что без коментов этот метод
    public int getDataItemsCount(){
        String countQuery = "select * from "+TABLE_MENU;
        SQLiteDatabase db = dbConnect.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery , null);
        cursor.close();
        return cursor.getCount();
    }
}
