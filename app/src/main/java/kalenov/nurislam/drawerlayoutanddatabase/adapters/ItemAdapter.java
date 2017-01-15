package kalenov.nurislam.drawerlayoutanddatabase.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import kalenov.nurislam.drawerlayoutanddatabase.R;
import kalenov.nurislam.drawerlayoutanddatabase.other.DataItems;

/**
 * Created by User on 14.01.2017.
 */

public class ItemAdapter extends ArrayAdapter<DataItems> {
/*Пере-Реализованный класс для работы с путктами меню*/
    public ItemAdapter(Context context, List<DataItems> dataItems) {
        super(context, 0 , dataItems);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        DataItems dataItems = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.drawer_layout_items , parent , false);

        }
        TextView textViewItem = (TextView)convertView.findViewById(R.id.text_view_drawer_item);
        textViewItem.setText(dataItems.getName());

        return convertView;
    }
}
