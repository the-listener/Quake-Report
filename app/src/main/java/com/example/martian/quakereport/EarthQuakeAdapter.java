package com.example.martian.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by martian on 16/1/17.
 */

public class EarthQuakeAdapter extends ArrayAdapter {

    public EarthQuakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.layout_earthquake, parent, false);
        }

        Earthquake currentEarthquake= (Earthquake) getItem(position);

        TextView magView=(TextView)listItemView.findViewById(R.id.magnitude);
        magView.setText(currentEarthquake.getmMagnitude());

        TextView placeView=(TextView)listItemView.findViewById(R.id.place);
        placeView.setText(currentEarthquake.getmPlace());

        TextView dateView=(TextView)listItemView.findViewById(R.id.date);
        dateView.setText(currentEarthquake.getmDate());

        return  listItemView;
    }
}