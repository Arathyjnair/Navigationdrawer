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
public class PalinFragment extends Fragment {
EditText edtpalin;
TextView txtpalin;
Button btpalin;
int s=0,r=0,n,temp=0;
    public PalinFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_palin, container, false);
        edtpalin=v.findViewById(R.id.palind);
        txtpalin=v.findViewById(R.id.palinn);
        btpalin=v.findViewById(R.id.palim);
        btpalin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strpali=edtpalin.getText().toString();
                int n= Integer.parseInt(strpali);
                temp=n;
                while (n!=0)
                {
                    s=n%10;
                    n=n/10;
                    r=(r*10)+s;
                }
                if(temp==r)
                {
                    txtpalin.setText(temp + " is a palindrome number ");
                }
                else
                {
                    txtpalin.setText(temp + " is not a palindrome number ");
                }
            }
        });
        return  v;

    }

}
