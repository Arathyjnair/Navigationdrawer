package com.example.user.navigationdrawer;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class customFragment extends Fragment {

    ImageView im;
    TextView tv;
    ArrayList<String> fine;
    ListView lst;

    private int[] images = {R.mipmap.android, R.mipmap.blackberry,R.mipmap.iphone,R.mipmap.ubundu};

    public customFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_custom, container, false);
    }

    @Override
    public void onViewCreated(final View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //im = view.findViewById(R.id.img);
        // tv = view.findViewById(R.id.txt);
        lst = view.findViewById(R.id.listt);
        fine = new ArrayList<String>();

        fine.add("Android");
        fine.add("Blackberry");
        fine.add("Iphone");
        fine.add("Ubundu");
        adapt adp = new adapt();
        lst.setAdapter(adp);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0)
                {
                    Toast.makeText(getContext(), "Android", Toast.LENGTH_SHORT).show();
                } else if (position == 1)
                {
                    Toast.makeText(getContext(), "Blackberry", Toast.LENGTH_SHORT).show();
                }
                else if(position==2)
                {
                    Toast.makeText(getContext(), "Iphone", Toast.LENGTH_SHORT).show();
                }
                else if(position==3)
                {
                    Toast.makeText(getContext(), "Ubundu", Toast.LENGTH_SHORT).show();
                }
            }

        });
        // return view;
    }

    class adapt extends BaseAdapter {

        LayoutInflater inflate;


        @Override
        public int getCount() {
            return fine.size();
        }

        @Override
        public Object getItem(int position) {
            return position;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View cview, ViewGroup parent) {

            inflate = (LayoutInflater) getActivity().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            cview = inflate.inflate(R.layout.list_single, null);
            // ViewHolder holder=new RecyclerView.ViewHolder();
            tv = (TextView) cview.findViewById(R.id.txt);
            im = (ImageView) cview.findViewById(R.id.img);
            im.setImageResource(images[position]);
            tv.setText("" + fine.get(position));
            return cview;
        }
    }
}
