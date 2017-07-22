package com.example.vineesh.zeta_new;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;


public class GalleryFrag extends Fragment {

    GridView gridView;

    public GalleryFrag() {



        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Gallery");

        ((AppCompatActivity) getActivity()).getSupportActionBar().setIcon(
                new ColorDrawable(getResources().getColor(android.R.color.transparent)));



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root= inflater.inflate(R.layout.fragment_gallery, container, false);

        gridView=(GridView)root.findViewById(R.id.grid_view);

       // Gallery_Adapter_ gadapter=new Gallery_Adapter_(getActivity(),flags);
        gridView.setAdapter(new Gallery_Adapter_(getActivity()));





        return root;
    }


    @Override
    public void onPause() {
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("");
        // ((AppCompatActivity) getActivity()).getSupportActionBar().setBackgroundColor(getResources().getColor(R.color.colorActionbar));
        ((AppCompatActivity) getActivity()).getSupportActionBar().setIcon(R.drawable.ic_zeta);
        super.onPause();
    }


}
