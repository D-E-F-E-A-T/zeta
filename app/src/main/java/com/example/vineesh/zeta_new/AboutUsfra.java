package com.example.vineesh.zeta_new;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class AboutUsfra extends Fragment {

    public AboutUsfra() {
        // Required empty publi
        // ic constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("About us");

        ((AppCompatActivity) getActivity()).getSupportActionBar().setIcon(
                new ColorDrawable(getResources().getColor(android.R.color.transparent)));
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root=inflater.inflate(R.layout.fragment_about_usfra, container, false);
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {

        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onPause() {
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("");
       // ((AppCompatActivity) getActivity()).getSupportActionBar().setBackgroundColor(getResources().getColor(R.color.colorActionbar));
        ((AppCompatActivity) getActivity()).getSupportActionBar().setIcon(R.drawable.ic_zeta);
        super.onPause();
    }


}
