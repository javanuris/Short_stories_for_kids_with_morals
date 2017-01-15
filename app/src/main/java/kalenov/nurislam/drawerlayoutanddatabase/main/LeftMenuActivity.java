package kalenov.nurislam.drawerlayoutanddatabase.main;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import kalenov.nurislam.drawerlayoutanddatabase.R;
import kalenov.nurislam.drawerlayoutanddatabase.adapters.ItemAdapter;
import kalenov.nurislam.drawerlayoutanddatabase.fragments.ContentFragment;
import kalenov.nurislam.drawerlayoutanddatabase.other.DataItems;

/**
 * Created by User on 14.01.2017.
 */

public class LeftMenuActivity {
    private String[] mPlanetTitles;
    private DrawerLayout mDrawerLayout;
    private ListView mDrwaerList;
    private AppCompatActivity activity;
    private Context context;
    private List<DataItems> dataItemses;
/*Класс для бокового меню. Пункты из бд */
    public LeftMenuActivity(AppCompatActivity activity , Context context){
       MenuDatabaseActivity databaseActivity = new MenuDatabaseActivity(context);
        this.activity = activity;
        this.context = context;
        mPlanetTitles = activity.getResources().getStringArray(R.array.items);
        mDrawerLayout = (DrawerLayout) activity.findViewById(R.id.drawer_layout);
        mDrwaerList = (ListView)activity.findViewById(R.id.left_drawer);
        dataItemses =  databaseActivity.getAllDataItems(); // Данные для путнктов меня беру с БД
        ItemAdapter itemAdapter = new ItemAdapter(context , dataItemses);
        mDrwaerList.setAdapter(itemAdapter);
        mDrwaerList.setOnItemClickListener(new LeftMenuActivity.DrawerItemClickListener());


    }
    private class DrawerItemClickListener implements ListView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            selectItem(position);
        }
    }
    private void selectItem(int position){
        FragmentActivity fragmentActivity = new FragmentActivity(new ContentFragment(), activity);
        fragmentActivity.selectedItem(ContentFragment.INFORMATION_NUMBER , position);
        mDrwaerList.setItemChecked(position , true);
        mDrawerLayout.closeDrawer(mDrwaerList);
    }

}
