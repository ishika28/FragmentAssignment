package com.example.fragmentassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import com.example.fragmentassignment.Fragment.AreaOfCircleFragment;
import com.example.fragmentassignment.Fragment.AutomorphicNumberFragment;
import com.example.fragmentassignment.Fragment.PalindromeFragment;
import com.example.fragmentassignment.Fragment.ReverseNumberFragment;
import com.example.fragmentassignment.Fragment.ReverseStringFragment;
import com.example.fragmentassignment.Fragment.SumFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnSum, btnAreaOfCircle, btnReverseNumber,btnPalindrome,btnReverseString,btnAutomorphicNumber;
    private Boolean Status=true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSum=findViewById(R.id.btnSum);
        btnAreaOfCircle=findViewById(R.id.btnAreaOfCircle);
        btnPalindrome=findViewById(R.id.btnPalindrome);
        btnReverseNumber=findViewById(R.id.btnReverseNumber);
        btnReverseString=findViewById(R.id.btnReverseString);
        btnAutomorphicNumber=findViewById(R.id.btnReverseString);

        btnSum.setOnClickListener(this);
        btnReverseNumber.setOnClickListener(this);
        btnAreaOfCircle.setOnClickListener(this);
        btnPalindrome.setOnClickListener(this);
        btnAutomorphicNumber.setOnClickListener(this);
        btnReverseString.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (v.getId()) {
            case R.id.btnSum:
                SumFragment sumFragment = new SumFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,sumFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.btnAreaOfCircle:
                AreaOfCircleFragment areaFragment = new AreaOfCircleFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,areaFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.btnReverseNumber:
                ReverseNumberFragment reverseNumFragment = new ReverseNumberFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,reverseNumFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.btnPalindrome:
                PalindromeFragment palindromeFragment = new PalindromeFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,palindromeFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.btnAutomorphicNumber:
                AutomorphicNumberFragment automorphicFragment = new AutomorphicNumberFragment ();
                fragmentTransaction.replace(R.id.fragmentContainer,automorphicFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.btnReverseString:
                ReverseStringFragment reverseStringFragment = new ReverseStringFragment();
                fragmentTransaction.replace(R.id.fragmentContainer,reverseStringFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;


        }

    }
}
