package com.gecpalakkad.invento2k20;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

public class MyCustomPagerAdapter extends PagerAdapter {
    Context context;
    int images[];
    LayoutInflater layoutInflater;


    public MyCustomPagerAdapter(Context context, int images[]) {
        this.context = context;
        this.images = images;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((ConstraintLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        View itemView = layoutInflater.inflate(R.layout.item, container, false);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);

        container.addView(itemView);

        //listening to image click
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               switch (position + 1 ){

                   case 1:
                       Intent intent  = new Intent(context , SpecialEventPage.class);
                       context.startActivity(intent);
                       break;
                   case 2:
                       Intent intent1  = new Intent(context , NatyaEvent.class);
                       context.startActivity(intent1);
                       break;

                   case 3:
                       Intent intent2 = new Intent(context , FasionShow.class);
                       context.startActivity(intent2);
                       break;
                   case 4:
                       Intent intent3 = new Intent (context , Mudrace.class);
                       context.startActivity(intent3);
                       break;
                   default:
                       break;
               }
            }
        });

        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((ConstraintLayout) object);
    }
}