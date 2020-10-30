package com.daa.citas.ui.confirmarCita;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.citasmedicas.R;

public class ConfirmarCitaFragment extends Fragment {

    private ConfirmarCitaViewModel confirmarCitaViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        confirmarCitaViewModel =
                ViewModelProviders.of(this).get(ConfirmarCitaViewModel.class);
        View root = inflater.inflate(R.layout.fragment_confirmarcita, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        confirmarCitaViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}