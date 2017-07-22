package com.example.vineesh.zeta_new;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by vineesh on 24/01/2017.
 */

public class Academy_adapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] academic_list;
    private final Integer[] imageId;

    public Academy_adapter(Activity context, String[] academic_list, Integer[] imageId) {
        super(context, R.layout.custom_academy_items,academic_list);

        this.context = context;
        this.academic_list = academic_list;
        this.imageId = imageId;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();

        View rootview=inflater.inflate(R.layout.custom_academy_items,null,true);

        TextView txtpoints = (TextView) rootview.findViewById(R.id.txt_academ);
        ImageView imageView = (ImageView) rootview.findViewById(R.id.img_academ);

        txtpoints.setText(academic_list[position]);
        imageView.setImageResource(imageId[position]);
        return rootview;
    }

}
