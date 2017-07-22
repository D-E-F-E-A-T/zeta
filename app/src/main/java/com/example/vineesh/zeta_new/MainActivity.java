package com.example.vineesh.zeta_new;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    android.support.v7.app.ActionBar actionBar;
    //declarion
    LinearLayout lyt_aboutus,lyt_innovation,lyt_accademy,lyt_gallery,lyt_contact,lyt_enquiry;
    ImageButton imgbtn_call,imgbtn_facebook,imgbtn_web;
    Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
        toolbar.setTitle("");


        //
         actionBar = getSupportActionBar();
        // set the icon
        actionBar.setIcon(R.drawable.ic_zeta);

                    lyt_aboutus=(LinearLayout)findViewById(R.id.lyt_aboutus);
                    lyt_accademy=(LinearLayout)findViewById(R.id.lyt_academy);
                    lyt_contact=(LinearLayout)findViewById(R.id.lyt_contactus);
                    lyt_enquiry=(LinearLayout)findViewById(R.id.lyt_enquiry);
                    lyt_gallery=(LinearLayout)findViewById(R.id.lyt_gallery);
                    lyt_innovation=(LinearLayout)findViewById(R.id.lyt_innovation);



                     imgbtn_call=(ImageButton)findViewById(R.id.imgb_call);
                     imgbtn_facebook=(ImageButton)findViewById(R.id.imgb_facebook);
                     imgbtn_web=(ImageButton)findViewById(R.id.imgb_web);




        lyt_aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               /* toolbar.setBackgroundColor(getResources().getColor(R.color.colorActionbar));
                toolbar.setTitle("About us");*/

                Fragment f=new AboutUsfra();
                Loadfragments(f,"About us");

            }
        });
        lyt_innovation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               Fragment f=new InnovationFra();
                Loadfragments(f,"Innovation");
            }
        });
        lyt_accademy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment f=new AcademyFra();
                Loadfragments(f,"Academy");
            }
        });
        lyt_gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment f=new GalleryFrag();
                Loadfragments(f,"Gallery");
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    private void Loadfragments(Fragment f,String title) {

        toolbar.setBackgroundColor(getResources().getColor(R.color.colorActionbar));
        toolbar.setTitle(title);
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_main_container,f);
        ft.addToBackStack("one");
        ft.commit();
    }

   /* private void showFragments(Fragment fra) {
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.fragment_main_container,fra);
        ft.addToBackStack("innovation");
        ft.commit();
    }*/


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {

            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.mShare) {

            Toast.makeText(this, "share button", Toast.LENGTH_SHORT).show();

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            // Handle the camera action
        } else if (id == R.id.nav_gallery) {

        } else if (id == R.id.nav_slideshow) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
