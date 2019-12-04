package com.example.fragmentassignment.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.fragmentassignment.Palindrome;
import com.example.fragmentassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PalindromeFragment extends Fragment {


    private Button btnCheckPalindrome;
    private EditText etpalindrome;
    private TextView tvOutput;
    public PalindromeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_palindrome, container, false);
        etpalindrome = view.findViewById(R.id.etPalindrome);
        tvOutput = view.findViewById(R.id.tvOutput);
        btnCheckPalindrome = view.findViewById(R.id.btnCheck);
        btnCheckPalindrome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int palindromeNum = Integer.parseInt(String.valueOf(etpalindrome.getText()));
                boolean isPalindrome = Palindrome.isPalindrome(palindromeNum);

                if(isPalindrome)
                {
                    tvOutput.setText(etpalindrome.getText()+" is palindrome number");
                }
                else{
                    tvOutput.setText(etpalindrome.getText()+" is not palindrome number");
                }
            }
        });

        return view;
            }


    }


