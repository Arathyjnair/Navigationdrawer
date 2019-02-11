package com.example.user.navigationdrawer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawer;
  int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

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
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        WecomeFrag we=new WecomeFrag();
        loadfragment(we);

    }

   // @Override
//    protected void onResume() {
//        AddFragment add = new AddFragment();
//        android.support.v4.app.FragmentTransaction homeFragmentTransaction
//                = getSupportFragmentManager().beginTransaction();
//        homeFragmentTransaction.replace(R.id.frame, add);
//        homeFragmentTransaction.commit();
//        drawer.closeDrawer(GravityCompat.START);
//        //return true;
//
//        super.onResume();
//    }

    @Override
    public void onBackPressed() {
        count++;
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

        if (drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            WecomeFrag we=new WecomeFrag();
            loadfragment(we);

            if (count == 2) {

                super.onBackPressed();
            }
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
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.add) {
            AdditionFrag add = new AdditionFrag();
            android.support.v4.app.FragmentTransaction homeFragmentTransaction
                    = getSupportFragmentManager().beginTransaction();
            homeFragmentTransaction.replace(R.id.frame, add);
            homeFragmentTransaction.commit();
            drawer.closeDrawer(GravityCompat.START);
            return true;

        } else if (id == R.id.sub) {
            SubtractFrag subb = new SubtractFrag();
             loadfragment(subb);
        } else if (id == R.id.prm) {
            PrimeFrag prm=new PrimeFrag();
            loadfragment(prm);
        } else if (id == R.id.palind) {
            PalinFragment palinn=new PalinFragment();
            loadfragment(palinn);

        }
        else if(id== R.id.cstmvw) {
            customFragment cusfrag=new customFragment();
            loadfragment(cusfrag);
        }
        else if(id==R.id.recyclrview){
            RecyclerFrag recfrag=new RecyclerFrag();
            loadfragment(recfrag);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;

    }

    private void loadfragment(Fragment fragment) {
        android.support.v4.app.FragmentTransaction homeFragmentTransaction
                = getSupportFragmentManager().beginTransaction();
        homeFragmentTransaction.replace(R.id.frame, fragment);
        homeFragmentTransaction.commit();

    }
}