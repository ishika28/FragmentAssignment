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

import com.example.fragmentassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SumFragment extends Fragment implements View.OnClickListener{
    private Button btncalculate;
    private EditText etfirst, etsecond;
    private TextView tvResult;


    public SumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sum, container, false);

        etfirst=view.findViewById(R.id.etfirst);
        etsecond=view.findViewById(R.id.etsecond);
        tvResult=view.findViewById(R.id.tvResult);
        btncalculate= view.findViewById(R.id.btncalculate);
        btncalculate.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(etfirst.getText()))
        {
            etfirst.setError("Enter first number");
            return;
        }
        else if(TextUtils.isEmpty(etsecond.getText()))
        {
            etsecond.setError("Enter second number");
        }
        else {
            int first = Integer.parseInt(etfirst.getText().toString());
            int second = Integer.parseInt(etsecond.getText().toString());
            int result = first + second;
            tvResult.setText(Integer.toString(result) + "");
            Toast.makeText(getActivity(), "sum is:" + result, Toast.LENGTH_SHORT).show();
        }
    }
}
