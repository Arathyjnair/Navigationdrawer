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
public class PrimeFrag extends Fragment {
    EditText edtprm;
    TextView txtprm;
    Button butprm;
    int n, count = 0;

    public PrimeFrag() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_prime, container, false);
        edtprm = v.findViewById(R.id.prm);
        txtprm = v.findViewById(R.id.prmtxtv);
        butprm = v.findViewById(R.id.prme);
        butprm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String p1 = edtprm.getText().toString();
                int n = Integer.parseInt(p1);
                for (int i = 2; i < n/2; i++) {
                    if (n % i == 0) {
                        count++;
                        break;
                    }
                }
                    if (count == 0) {
                        txtprm.setText(n + " is a prime number");
                    } else {
                        txtprm.setText(n + " is not a  prime number");
                    }

            }
        });
        return v;
    }
}



