package sg.edu.rp.c346.id21023701.p09problemstatement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<song> songArrayList;

    public CustomAdapter(Context context, int resource, ArrayList<song> objects){
        super(context, resource, objects);

        parent_context=context;
        layout_id=resource;
        songArrayList = objects;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Obtain the LayoutInflater object
        LayoutInflater inflater = (LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        // "Inflate" the View for each row
        View rowView = inflater.inflate(layout_id, parent, false);

        // Obtain the UI components and do the necessary binding
        TextView tvName = rowView.findViewById(R.id.textView);
        TextView tvVersion = rowView.findViewById(R.id.textView2);

        // Obtain the Android Version information based on the position
        song currentsong = songArrayList.get(position);

        // Set values to the TextView to display the corresponding information
        tvName.setText(currentsong.getTitle());
        tvVersion.setText(currentsong.toString());

        return rowView;
    }
}
