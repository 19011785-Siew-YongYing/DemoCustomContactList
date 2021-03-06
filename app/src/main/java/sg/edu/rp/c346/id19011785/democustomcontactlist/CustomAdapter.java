package sg.edu.rp.c346.id19011785.democustomcontactlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Contact> contactList;

    public CustomAdapter(Context context, int resource, ArrayList<Contact> objects){
        super (context, resource, objects);
        parent_context = context;
        layout_id = resource;
        contactList = objects;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.tvN);
        TextView tvCode = rowView.findViewById(R.id.tvC);
        TextView tvNum = rowView.findViewById(R.id.tvNumber);
        ImageView ivGender = rowView.findViewById(R.id.ivImage);

        Contact current = contactList.get(position);
        tvName.setText(current.getName());
        tvCode.setText("+" + current.getCountryCode());
        tvNum.setText(current.getPhoneNum() + "");

        // Newly added codes to display correct image based on Gender
        if (current.getGender() == 'F') {
            ivGender.setImageResource(R.drawable.female);
        } else {
            ivGender.setImageResource(R.drawable.male);
        }
        return rowView;
    }
}
