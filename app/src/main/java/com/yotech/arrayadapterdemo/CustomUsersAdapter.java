package com.yotech.arrayadapterdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomUsersAdapter extends ArrayAdapter<UserInfo> {
    public CustomUsersAdapter(Context context, ArrayList<UserInfo> userInfos) {
        super(context, 0, userInfos);
     }

     @Override
     public View getView(int position, View convertView, ViewGroup parent) {

        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
           convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
        }

         // Get the data item for this position
         UserInfo userInfo = getItem(position);

         // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvHome = (TextView) convertView.findViewById(R.id.tvHometown);
        // Populate the data into the template view using the data object
        tvName.setText(userInfo.getName());
        tvHome.setText(userInfo.getHometown());
        // Return the completed view to render on screen
        return convertView;
    }
}
