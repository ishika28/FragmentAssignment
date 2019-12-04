package com.example.fragmentassignment.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fragmentassignment.Areaofcircle;
import com.example.fragmentassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AreaOfCircleFragment extends Fragment implements View.OnClickListener {

    private Button btnAreaOfCircle;
    private EditText etRadius;
    private TextView tvArea;


    public AreaOfCircleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_area_of_circle, container, false);

        etRadius=view.findViewById(R.id.etRadius);
        tvArea=view.findViewById(R.id.tvArea);
        btnAreaOfCircle=view.findViewById(R.id.btnAreaOfCircle);
        btnAreaOfCircle.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(etRadius.getText()))
        {
            etRadius.setError("Enter radius of circle");
            return;
        }
        else{
            float radius = Float.parseFloat(etRadius.getText().toString());
            float cArea;

            cArea = Areaofcircle.areaOfCircle(radius);

            tvArea.setText("Area of Circle :" + cArea + " cm");

            Toast.makeText(getActivity(),"Area of Circle :"+cArea,Toast.LENGTH_LONG).show();
        }


    }
}
