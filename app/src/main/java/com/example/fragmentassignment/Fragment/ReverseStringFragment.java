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
import com.example.fragmentassignment.ReverseString;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReverseStringFragment extends Fragment implements View.OnClickListener {

    private Button btnReverseString;
    private EditText etReverseString;
    private TextView tvReverse;

    public ReverseStringFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
               View view =inflater.inflate(R.layout.fragment_reverse_string, container, false);
        etReverseString = view.findViewById(R.id.etString);
        btnReverseString = view.findViewById(R.id.btnReverseString);
        tvReverse = view.findViewById(R.id.tvReverseOutput);

        btnReverseString.setOnClickListener(this);
               return view;
    }

    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(etReverseString.getText()))
        {
            etReverseString.setError("Enter any alphabets");
            return;
        }
        else{
            String revStr, result;

            revStr = etReverseString.getText().toString();

            //calling the function from another class

            result = ReverseString.reverseString(revStr);

            tvReverse.setText(result+" is a reverse string");


            Toast.makeText(getActivity(),"Reverse Number is :"+result,Toast.LENGTH_LONG).show();

        }
    }
}
