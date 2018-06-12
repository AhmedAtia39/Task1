package com.example.ahmed.task1;

/**
 * Created by AHMED on 10/06/2018.
 */

public class ListItem {
    public String txt_msg, txt_accepted_time, txt_info_attendance, txt_info_help, txt_acceped_accept;
    public int img_type_car, img_accepted_time, img_info_attendance, img_info_help, img_acceped_accept;

    public ListItem(String txt_msg, String txt_accepted_time, String txt_info_attendance, String txt_info_help, String txt_acceped_accept, int img_type_car, int img_accepted_time, int img_info_attendance, int img_info_help, int img_acceped_accept) {
        this.txt_msg = txt_msg;
        this.txt_accepted_time = txt_accepted_time;
        this.txt_info_attendance = txt_info_attendance;
        this.txt_info_help = txt_info_help;
        this.txt_acceped_accept = txt_acceped_accept;
        this.img_type_car = img_type_car;
        this.img_accepted_time = img_accepted_time;
        this.img_info_attendance = img_info_attendance;
        this.img_info_help = img_info_help;
        this.img_acceped_accept = img_acceped_accept;
    }
}
