package com.example.a1711501526_tugas_fragment;

import android.media.Image;
import android.os.Bundle;
import android.transition.Slide;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;



public class fragmentExplore extends Fragment {
    View view;
    public fragmentExplore() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.explore_fragment,container,false);
//        return super.onCreateView(inflater, container, savedInstanceState);
        return view;

    }


}
