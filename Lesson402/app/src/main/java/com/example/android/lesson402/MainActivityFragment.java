package com.example.android.lesson402;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.android.jokelibrary.JokeSmith;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainActivityFragment extends Fragment {


    public MainActivityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_mainactivity, container, false);
        TextView textView = rootView.findViewById(R.id.text_view);
        JokeSmith jokeSmith = new JokeSmith();
        textView.setText(jokeSmith.getJoke());
        return rootView;

    }

}
