package com.marinakhrolenko.myfragments.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.marinakhrolenko.myfragments.R;

/**
 * Created by Администратор on 02.02.2015.
 */
public class Fragment2 extends Fragment {
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment2,container, false);
    }
}
