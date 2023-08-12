package com.example.netclanexplorerclone;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link RefineFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class RefineFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private ToggleButton coffeeBtn, businessBtn, hobbiesBtn, friendshipBtn, moviesBtn, dinningBtn, datingBtn, matrimonyBtn;


    public RefineFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment RefineFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static RefineFragment newInstance(String param1, String param2) {
        RefineFragment fragment = new RefineFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }



    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_refine, container, false);
        coffeeBtn = rootView.findViewById(R.id.toggleButton);
        coffeeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Hello", Toast.LENGTH_SHORT).show();
                updateButtonAppearance(coffeeBtn);
            }
        });

        businessBtn = rootView.findViewById(R.id.toggleButton2);
        businessBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Hello", Toast.LENGTH_SHORT).show();
                updateButtonAppearance(businessBtn);
            }
        });

        hobbiesBtn = rootView.findViewById(R.id.toggleButton3);
        hobbiesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Hello", Toast.LENGTH_SHORT).show();
                updateButtonAppearance(hobbiesBtn);
            }
        });

        friendshipBtn = rootView.findViewById(R.id.toggleButton4);
        friendshipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Hello", Toast.LENGTH_SHORT).show();
                updateButtonAppearance(friendshipBtn);
            }
        });

        moviesBtn = rootView.findViewById(R.id.toggleButton5);
        moviesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Hello", Toast.LENGTH_SHORT).show();
                updateButtonAppearance(moviesBtn);
            }
        });

        dinningBtn = rootView.findViewById(R.id.toggleButton6);
        dinningBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Hello", Toast.LENGTH_SHORT).show();
                updateButtonAppearance(dinningBtn);
            }
        });

        datingBtn = rootView.findViewById(R.id.toggleButton7);
        datingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Hello", Toast.LENGTH_SHORT).show();
                updateButtonAppearance(datingBtn);
            }
        });

        matrimonyBtn = rootView.findViewById(R.id.toggleButton8);
        matrimonyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Hello", Toast.LENGTH_SHORT).show();
                updateButtonAppearance(matrimonyBtn);
            }
        });

        FloatingActionButton fab = rootView.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getParentFragmentManager().popBackStack();

            }
        });

        Button saveBtn = rootView.findViewById(R.id.saveButton);
        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getParentFragmentManager().popBackStack();

            }
        });


        return rootView;
    }

    private void updateButtonAppearance(ToggleButton toggleButton) {
        toggleButton.setBackgroundResource(R.drawable.button_toggle_background);
    }
}