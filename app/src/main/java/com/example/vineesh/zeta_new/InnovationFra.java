package com.example.vineesh.zeta_new;

import android.app.ActionBar;
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



public class InnovationFra extends Fragment {

    public InnovationFra() {




        /*((MainAcivity)this.getActivity()).getToolbar();  // getToolbar will be method in Activity that returns Toolbar!!  don't use getSupportActionBar for getting toolbar!!
// get action bar
        this.getActivity().getSupportActionBar();

        getActionBar().setIcon(
                new ColorDrawable(getResources().getColor(android.R.color.transparent)));*/
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
       
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Innovation");

        ((AppCompatActivity) getActivity()).getSupportActionBar().setIcon(
                new ColorDrawable(getResources().getColor(android.R.color.transparent)));
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root2=inflater.inflate(R.layout.fragment_innovation, container, false);
        return root2;
    }

    @Override
    public void onPause() {
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("");
        ((AppCompatActivity) getActivity()).getSupportActionBar().setIcon(R.drawable.ic_zeta);

        super.onPause();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {



        super.onActivityCreated(savedInstanceState);
    }


}
