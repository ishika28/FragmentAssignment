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
public class ReverseNumberFragment extends Fragment implements View.OnClickListener {
    private Button btnReverseNumber;
    private EditText etReverseNumber;
    private TextView tvReverse;

    public ReverseNumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_reverse_number, container, false);
        etReverseNumber = view.findViewById(R.id.etReverseNumber);
        btnReverseNumber = view.findViewById(R.id.btnReverse);
        tvReverse = view.findViewById(R.id.tvReverseOutput);

        btnReverseNumber.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if(TextUtils.isEmpty(etReverseNumber.getText()))
        {
            etReverseNumber.setError("Enter number");
            return;
        }
        else {
            int number=Integer.parseInt(etReverseNumber.getText().toString());

            int reverse = 0;
            while (number != 0) {
                int digit = number % 10;
                reverse = reverse * 10 + digit;
                number /= 10;
                int revNum, result;
                result = reverse;


                revNum = Integer.parseInt(etReverseNumber.getText().toString());

                //calling the function from another class


                tvReverse.setText(Integer.toString(result) + "");


                Toast.makeText(getActivity(), "Reverse Number is :" + result, Toast.LENGTH_LONG).show();
            }
        }
    }
}
