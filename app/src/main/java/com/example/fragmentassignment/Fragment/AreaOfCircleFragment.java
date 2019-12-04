package com.example.fragmentassignment.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.fragmentassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AreaOfCircleFragment extends Fragment implements View.OnClickListener {


    public AreaOfCircleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_area_of_circle, container, false);
    }

    @Override
    public void onClick(View v) {

    }
}
