package kalenov.nurislam.drawerlayoutanddatabase.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kalenov.nurislam.drawerlayoutanddatabase.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_layout);

        new LeftMenuActivity(this , getBaseContext()); //Активация бокового меню



    }




}
