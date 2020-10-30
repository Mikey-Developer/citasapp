package com.daa.citas.ui.cita;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.daa.citas.model.Cita;

import java.util.Date;
import java.util.Timer;
import java.util.UUID;

import static java.util.UUID.randomUUID;


public class CitaViewModel extends ViewModel {

    Cita cita;

    //Tipo objeto
    private MutableLiveData<Cita> citaData;

    private MutableLiveData<String> mText;

    private static final String TAG = CitaViewModel.class.getSimpleName();

    public CitaViewModel() {
        citaData = new MutableLiveData<>();
        mText = new MutableLiveData<>();
        mText.setValue("Elabrocacion de citas");
    }

    public LiveData<String> getText() {
        return mText;
    }

    //Tipo objeto
    public LiveData<Cita> getCitaData() {
        return citaData;
    }

    public void crearCita(UUID id_Cliente, UUID id_Doctor, UUID id_Servicio, String nombre, String descripcion, Date fecha, Timer horario) {

        //Creando el constructor de Cita
        cita = new Cita(randomUUID(), id_Cliente, id_Doctor,
                id_Servicio, nombre, descripcion, fecha, horario);
        Log.d(TAG, " ******** Evento crearCita() +*******"+ cita.getIdCita());
        //Enviando y regresa el Tipo objeto Producto hacia la View de MainActivity
        citaData.setValue(cita);

    }


    //Envia a la View do el objecto de producto.
    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

}