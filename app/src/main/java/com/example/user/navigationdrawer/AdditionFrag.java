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
public class AdditionFrag extends Fragment {
    EditText sum1, sum2;
    Button bt;
    TextView tw;

    public AdditionFrag() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_addition, container, false);
        sum1 = v.findViewById(R.id.summ);
        sum2 = v.findViewById(R.id.summm);
        tw=v.findViewById(R.id.txtvw);
        bt = v.findViewById(R.id.add);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View vi) {
                String s1 = sum1.getText().toString();
                String s2 = sum2.getText().toString();
                int sum = Integer.parseInt(s1);
                int sm = Integer.parseInt(s2);
                int add = sum + sm;
            tw.setText("The sum is "+add);

            }
        });
        return  v;
    }
}


