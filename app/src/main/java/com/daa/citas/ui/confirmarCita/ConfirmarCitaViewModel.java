package com.daa.citas.ui.confirmarCita;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ConfirmarCitaViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ConfirmarCitaViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Confirmacion de cita");
    }

    public LiveData<String> getText() {
        return mText;
    }
}