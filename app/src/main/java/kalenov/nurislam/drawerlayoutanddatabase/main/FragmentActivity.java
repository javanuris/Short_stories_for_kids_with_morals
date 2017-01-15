package kalenov.nurislam.drawerlayoutanddatabase.main;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import kalenov.nurislam.drawerlayoutanddatabase.R;

/**
 * Created by User on 14.01.2017.
 */

public class FragmentActivity {
/*Фрагмент классс , точнее класс для где имплементятся Фрагметн классы уже с конетентом , они в папке fragments*/
    private Fragment fragment;
    private int position;
    Bundle args;
    AppCompatActivity appCompatActivity ;

    public FragmentActivity(Fragment fragmentType , AppCompatActivity appCompatActivity){
        fragment = fragmentType;
        args = new Bundle();
        this.appCompatActivity = appCompatActivity;
    }

    public void selectedItem(String requesToFragment , int position){
        args.putInt(requesToFragment , position);
        fragment.setArguments(args);
        FragmentManager fragmentManager =appCompatActivity.getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.content_frame , fragment).commit();
    }

}
