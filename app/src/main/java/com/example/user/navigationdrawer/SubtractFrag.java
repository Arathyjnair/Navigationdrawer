package com.example.user.navigationdrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class SubtractFrag extends Fragment {
    EditText sub1, sub2;
    TextView txtvw2;
    Button subbtrct;

    public SubtractFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_subtract, container, false);
        sub1 = v.findViewById(R.id.subtrct);
        sub2 = v.findViewById(R.id.subtrct1);
        txtvw2 = v.findViewById(R.id.subtxt);
        subbtrct = v.findViewById(R.id.sbtrct);
        subbtrct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vi) {
                String s3 = sub1.getText().toString();
                String s4 = sub2.getText().toString();
                int diff = Integer.parseInt(s3);
                int diff1 = Integer.parseInt(s4);
                int subbb = diff - diff1;
                txtvw2.setText("The difference is " + subbb);
            }

        });
        return v;
    }
}

