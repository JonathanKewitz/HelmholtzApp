package com.ffm.helmholtzschule.helmholtzapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;

public class Tab4mensa extends Fragment {
    MensaAdapter mensaAdapter;
    ListView lstMenu;
    DataStorage dataStorage = DataStorage.getInstance();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab4mensa, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        mensaAdapter = new MensaAdapter(getView().getContext(), dataStorage.getGerichte());
        lstMenu = (ListView) getView().findViewById(R.id.mensaMenu);

        lstMenu.setAdapter(mensaAdapter);
        mensaAdapter.notifyDataSetChanged();

        super.onViewCreated(view, savedInstanceState);
    }
}
