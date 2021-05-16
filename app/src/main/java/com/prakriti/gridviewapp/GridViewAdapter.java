package com.prakriti.gridviewapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class GridViewAdapter extends BaseAdapter {

    private Context context;

    private String animals[] = new String[] {"BEAR", "BIRD", "CAT", "COW", "DOLPHIN", "FISH", "FOX", "HORSE", "LION", "TIGER"};
    private int images[] = { R.drawable.bear, R.drawable.bird, R.drawable.cat, R.drawable.cow, R.drawable.dolphin, R.drawable.fish,
            R.drawable.fox, R.drawable.horse, R.drawable.lion, R.drawable.tiger };

    public GridViewAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return animals.length;
    }

    @Override
    public Object getItem(int position) {
        return images[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setLayoutParams(new GridView.LayoutParams(300, 300)); // because Gridview is the parent for these images
        imageView.setPadding(10, 10, 10, 10);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setOnClickListener(v -> {
            Toast.makeText(context, "This animal is: " + animals[position], Toast.LENGTH_SHORT).show();
        });
        return imageView;
    }

}
