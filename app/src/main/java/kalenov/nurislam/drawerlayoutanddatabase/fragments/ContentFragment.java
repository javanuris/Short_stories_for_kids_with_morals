package kalenov.nurislam.drawerlayoutanddatabase.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import kalenov.nurislam.drawerlayoutanddatabase.R;

/**
 * Created by User on 14.01.2017.
 */

public class ContentFragment extends Fragment {
    /*Фрагмент класс с конетеом*/
    /*Как это работает ?*/
    /*R.layout.fragment_root - это будет это ображать контент */
    public static final String INFORMATION_NUMBER = "regpwpihttjwnbowt";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_root , container , false);
    }
}
