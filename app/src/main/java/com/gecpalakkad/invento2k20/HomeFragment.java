package com.gecpalakkad.invento2k20;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {
ImageView eventsCse,genEvents,eceEvents,eeeEvents,itEvents,meEvents;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_home,container,false);

        eventsCse = (ImageView) view.findViewById(R.id.id_cse);
        eventsCse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animFadein = AnimationUtils.loadAnimation(getContext(),R.anim.fade_in);
                eventsCse.startAnimation(animFadein);

                Intent intent = new Intent(getActivity(),EventsCseActivity.class);
                startActivity(intent);
            }
        });
        
        genEvents = view.findViewById(R.id.id_general_event);
        genEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animFadein = AnimationUtils.loadAnimation(getContext(),R.anim.fade_in);
                genEvents.startAnimation(animFadein);

                Toast.makeText(getContext(), "GeneralEventPage", Toast.LENGTH_SHORT).show();
            }
        });
        eceEvents = view.findViewById(R.id.id_ece);
        eceEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animFadein = AnimationUtils.loadAnimation(getContext(),R.anim.fade_in);
                eceEvents.startAnimation(animFadein);

                Toast.makeText(getContext(), "Ece Event Page", Toast.LENGTH_SHORT).show();
            }
        });

        eeeEvents = view.findViewById(R.id.id_eee);
        eeeEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animFadein = AnimationUtils.loadAnimation(getContext(),R.anim.fade_in);
                eeeEvents.startAnimation(animFadein);
                Toast.makeText(getContext(), "EEE Event Page", Toast.LENGTH_SHORT).show();
            }
        });

        itEvents = view.findViewById(R.id.id_it);
        itEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animFadein = AnimationUtils.loadAnimation(getContext(),R.anim.fade_in);
                itEvents.startAnimation(animFadein);
                Toast.makeText(getContext(), "IT Event Page", Toast.LENGTH_SHORT).show();
            }
        });

        meEvents = view.findViewById(R.id.id_me);
        meEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation animFadein = AnimationUtils.loadAnimation(getContext(),R.anim.fade_in);
                meEvents.startAnimation(animFadein);
                Toast.makeText(getContext(), "ME Event Page", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
