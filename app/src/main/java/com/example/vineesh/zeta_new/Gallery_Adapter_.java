package com.example.vineesh.zeta_new;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by vineesh on 24/01/2017.
 */

public class Gallery_Adapter_ extends BaseAdapter {


  /*  private final Integer[] flags;*/
  private final Activity context;
    public  Integer[] flags = new Integer[]{
        R.mipmap.ic_launcher,
                R.drawable.itsoft,
                R.drawable.itsoft,
                R.drawable.itsoft,
                R.drawable.itsoft,
                R.drawable.itsoft,
                R.drawable.itsoft,
                R.drawable.itsoft,
                R.drawable.itsoft,
                R.drawable.itsoft
    };
    public Gallery_Adapter_(Activity context) {
        this.context = context;

    }

    @Override
    public int getCount() {
        return flags.length;
    }

    @Override
    public Object getItem(int i) {
        return flags[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater=context.getLayoutInflater();
/*

        ImageView imageView = new ImageView(context);
        imageView.setImageResource(flags[i]);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
       */
/* imageView.setBackgroundColor(R.drawable.border_color);*//*

        imageView.setLayoutParams(new GridView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
*/

       View rootview= inflater.inflate(R.layout.gallery_custom_item,null,true);
        ImageView imageView = (ImageView) rootview.findViewById(R.id._imgv_gallery_item);
        imageView.setImageResource(flags[i]);

        return rootview;
    }
}
