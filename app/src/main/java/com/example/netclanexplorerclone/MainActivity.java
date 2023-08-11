package com.example.netclanexplorerclone;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentTransaction;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView refine;
    public static final int FRAGMENT_REQUEST_CODE = 1;
    private Toolbar toolbar, subToolbar;
    private TextView personalButton, businessButton, merchantButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("");

        toolbar = findViewById(R.id.custom_toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayShowHomeEnabled(false);

        refine = findViewById(R.id.btn_right);
        refine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRefineFragment();
            }
        });

        subToolbar = findViewById(R.id.subToolbar);
        setSupportActionBar(subToolbar);

        personalButton = findViewById(R.id.personalBtn);
        businessButton = findViewById(R.id.businessBtn);
        merchantButton = findViewById(R.id.merchantBtn);

        openPersonalFragment();
        personalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSectionButtons("personal");
                openPersonalFragment();
            }
        });

        businessButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSectionButtons("business");
            }
        });

        merchantButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showSectionButtons("merchant");
            }
        });

        // Initially, show buttons for the selected section
        showSectionButtons("personal"); // or "business" or "merchant"




//        ActionBar actionBar = getActionBar();
//        actionBar.setDisplayShowTitleEnabled(false);
//        actionBar.setDisplayShowHomeEnabled(false);


    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//
//        if (id == R.id.action_left) {
//            // Handle left button click
//            return true;
//        } else if (id == R.id.action_right) {
//            openFragment();
//            return true;
//        }
//
//        // Add other menu item cases here
//
//        return super.onOptionsItemSelected(item);
//    }




    private void openRefineFragment() {
        // Replace 'YourFragment' with the actual name of your Fragment class
        RefineFragment fragment = new RefineFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        // Set the custom animation for fragment transition
        transaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left,
                R.anim.slide_in_left, R.anim.slide_out_right);

        // Replace the fragment container with the new fragment
        transaction.replace(android.R.id.content, fragment)
                .addToBackStack(null) // Add this if you want to navigate back to the previous fragment
                .commit();
    }

    private void openPersonalFragment() {
        // Replace 'YourFragment' with the actual name of your Fragment class
        PersonalItemFragment fragment = new PersonalItemFragment();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        // Set the custom animation for fragment transition
        transaction.setCustomAnimations(R.anim.slide_in_right, R.anim.slide_out_left,
                R.anim.slide_in_left, R.anim.slide_out_right);

        // Replace the fragment container with the new fragment
        transaction.replace(R.id.fragment_personal, fragment)
                .addToBackStack(null) // Add this if you want to navigate back to the previous fragment
                .commit();
    }


    public void loadFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();

        // Replace the current fragment with the new fragment
        transaction.replace(R.id.fragmentContainer, fragment);
        transaction.addToBackStack(null); // Add to back stack

        transaction.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    private void showSectionButtons(String section) {
        personalButton.setAlpha((float) 0.8);
        businessButton.setAlpha((float) 0.8);
        merchantButton.setAlpha((float) 0.8);

        if (section.equals("personal")) {
            personalButton.setAlpha((float) 1);
        } else if (section.equals("business")) {
            businessButton.setAlpha((float) 1);
        } else if (section.equals("merchant")) {
            merchantButton.setAlpha((float) 1);
        }
    }



}