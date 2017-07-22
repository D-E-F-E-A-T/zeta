package com.example.vineesh.zeta_new;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;




public class AcademyFra extends Fragment {
    ListView lv_academy;
    String[] academic_list = {
            "Kerala’s leading civil service academy\n" +
                    "with best quality",
            "Interview guidance programs & mains\n" +
                    "concept building programs by IAS, IPS & \n" +
                    "IFS officers",
            "All subject delivered by nationaly best\n" +
                    "reputed faculties",
            "Classrooms equiped with latest audio\n" +
                    "visual systems, best resource library",
            "Well acclaimed study material",
            "Extended support ever after completion\n" +
                    "of the course",
            "Pioneer in the concept of answer writing,all\n" +
                    "India rest series postel test series programs",
            "Not just teaching, but effective study practice",
            "Personality development & softskill",
            "International science league",
            "International quizzing"
    } ;
    Integer[] imageId = {
            R.drawable.academ1,
            R.drawable.academ1,
            R.drawable.academ1,
            R.drawable.academ1,
            R.drawable.academ1,
            R.drawable.academ1,
            R.drawable.academ1,
            R.drawable.academ1,
            R.drawable.academ1,
            R.drawable.academ1,
            R.drawable.academ1

    };



    public AcademyFra() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("Academy");

        ((AppCompatActivity) getActivity()).getSupportActionBar().setIcon(
                new ColorDrawable(getResources().getColor(android.R.color.transparent)));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root=inflater.inflate(R.layout.fragment_academy, container, false);

        lv_academy=(ListView)root.findViewById(R.id.listview_academy);
        Academy_adapter adapter=new Academy_adapter(getActivity(),academic_list,imageId);
        Log.w("hai","list set'");
        lv_academy.setAdapter(adapter);


        return root;
    }

    @Override
    public void onPause() {
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("");
        // ((AppCompatActivity) getActivity()).getSupportActionBar().setBackgroundColor(getResources().getColor(R.color.colorActionbar));
        ((AppCompatActivity) getActivity()).getSupportActionBar().setIcon(R.drawable.ic_zeta);
        super.onPause();
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {


        super.onActivityCreated(savedInstanceState);
    }
}
