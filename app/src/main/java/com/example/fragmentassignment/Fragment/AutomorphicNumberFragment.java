package com.example.fragmentassignment.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fragmentassignment.Automorphic;
import com.example.fragmentassignment.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class AutomorphicNumberFragment extends Fragment {

    private Button btnAutomorphicNumber;
    private EditText etAutomorhic;
    private TextView tvOutput;
    public AutomorphicNumberFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_automorphic_number,container,false);

        etAutomorhic = view.findViewById(R.id.etAutomorphicNum);
        tvOutput = view.findViewById(R.id.tvOutput);
      btnAutomorphicNumber=view.findViewById(R.id.btnAutomorphicNumber);
      btnAutomorphicNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int automorphicNum = Integer.parseInt(String.valueOf(etAutomorhic.getText()));
                boolean isAutomorphic = Automorphic.isAutomorphic(automorphicNum);

                if(isAutomorphic)
                {
                    tvOutput.setText(etAutomorhic.getText()+" is automorphic number");
                }
                else{
                    tvOutput.setText(etAutomorhic.getText()+" is not automorphic number");
                }
            }
        });

        return view;
    }

}
