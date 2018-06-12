package com.example.ahmed.task1.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ahmed.task1.ListItem;
import com.example.ahmed.task1.R;

import java.util.ArrayList;

/**
 * Created by AHMED on 11/06/2018.
 */

public class ListviewAdapter extends BaseAdapter {

    private static ArrayList<ListItem> listItems;
    int x;
    private LayoutInflater mInflater;

    public ListviewAdapter(Context context, ArrayList<ListItem> listItems, int item_row) {
        ListviewAdapter.listItems = listItems;
        mInflater = LayoutInflater.from(context);
        this.x = item_row;
    }

    @Override
    public int getCount() {
        return listItems.size();
    }

    @Override
    public Object getItem(int i) {
        return listItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            // to define which row item that inflate
            if (x == 0)
                convertView = mInflater.inflate(R.layout.row_item, null);
            else if (x == 1)
                convertView = mInflater.inflate(R.layout.row_item_cancel, null);
            holder = new ViewHolder();
            holder.txt_msg = convertView.findViewById(R.id.txt_msg);
            holder.txt_accepted_time = convertView.findViewById(R.id.txt_accepted_time);
            holder.txt_info_attendance = convertView.findViewById(R.id.txt_info_attendance);
            holder.txt_info_help = convertView.findViewById(R.id.txt_info_help);
            holder.txt_acceped_accept = convertView.findViewById(R.id.txt_acceped_accept);
            holder.img_type_car = convertView.findViewById(R.id.image_type_car);
            holder.img_accepted_time = convertView.findViewById(R.id.image_accepted_time);
            holder.img_info_attendance = convertView.findViewById(R.id.image_info_attendance);
            holder.img_info_help = convertView.findViewById(R.id.image_info_help);
            holder.img_acceped_accept = convertView.findViewById(R.id.image_acceped_accept);

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txt_msg.setText(listItems.get(position).txt_msg);
        holder.txt_accepted_time.setText(listItems.get(position).txt_accepted_time);
        holder.txt_info_attendance.setText(listItems.get(position).txt_info_attendance);
        holder.txt_info_help.setText(listItems.get(position).txt_info_help);
        holder.txt_acceped_accept.setText(listItems.get(position).txt_acceped_accept);
        holder.img_type_car.setImageResource(listItems.get(position).img_type_car);
        holder.img_accepted_time.setImageResource(listItems.get(position).img_accepted_time);
        holder.img_info_attendance.setImageResource(listItems.get(position).img_info_attendance);
        holder.img_info_help.setImageResource(listItems.get(position).img_info_help);
        holder.img_acceped_accept.setImageResource(listItems.get(position).img_acceped_accept);

        return convertView;
    }

    public static class ViewHolder {
        public TextView txt_msg, txt_accepted_time, txt_info_attendance, txt_info_help, txt_acceped_accept;
        public ImageView img_type_car, img_accepted_time, img_info_attendance, img_info_help, img_acceped_accept;
    }
}

