package com.example.awsyogya;


import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;


public class LinkFragment extends Fragment {

    private View view;
    private TextView hello;
    private LinearLayout link_twitter;
    private LinearLayout link_facebook;
    private LinearLayout link_instagram;
    private LinearLayout link_website;
    private LinearLayout link_youtube;

    public LinkFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_link, container, false);
        link_twitter= (LinearLayout)view.findViewById(R.id.link_twitter);
        link_twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Loading", Toast.LENGTH_SHORT).show();

                Intent pindah = new Intent(Intent.ACTION_VIEW,Uri.parse("https://twitter.com/StaklimJogja"));
                startActivity(pindah);
            }
        });
        link_website= (LinearLayout)view.findViewById(R.id.link_website);
        link_website.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Loading", Toast.LENGTH_SHORT).show();

                Intent pindah = new Intent(Intent.ACTION_VIEW,Uri.parse("http://www.staklimyogyakarta.com/"));
                startActivity(pindah);
            }
        });
        link_facebook= (LinearLayout)view.findViewById(R.id.link_facebook);
        link_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Loading", Toast.LENGTH_SHORT).show();

                Intent pindah = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.facebook.com/staklimjogja/"));
                startActivity(pindah);
            }
        });
        link_instagram= (LinearLayout)view.findViewById(R.id.link_instagram);
        link_instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Loading", Toast.LENGTH_SHORT).show();

                Intent pindah = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.instagram.com/staklim_jogja/"));
                startActivity(pindah);
            }
        });
        link_youtube= (LinearLayout)view.findViewById(R.id.link_youtube);
        link_youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"Loading", Toast.LENGTH_SHORT).show();

                Intent pindah = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=mL-2EdDFsTg"));
                startActivity(pindah);
            }
        });
        return  view;
    }

}
