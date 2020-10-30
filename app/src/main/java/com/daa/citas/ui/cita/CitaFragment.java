package com.daa.citas.ui.cita;

import android.os.Bundle;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.daa.citas.model.Cita;
import com.example.citasmedicas.R;

import java.util.Date;
import java.util.Timer;

import static java.util.UUID.randomUUID;

public class CitaFragment extends Fragment {

    private EditText edtIDCita;
    private EditText edtNombreDoctor;
    private EditText edtServicio;
    private EditText edtEmpresa;
    private EditText edtDia;
    private EditText edthorario;
    private TextView vwDescripcion;

    Button btnSiguiente;

    private CitaViewModel citaViewModel;

    private static final String TAG = CitaFragment.class.getSimpleName();

    TextWatcher tt = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        /*citaViewModel =
                ViewModelProviders.of(this).get(CitaViewModel.class);*/

        View v = inflater.inflate(R.layout.fragment_cita, container, false);

        loadDataView(v);


        return v;
    }


    private void loadDataView(View v){

        try {

            //Associando la view (Actividad o fragmento) a un ViewModel, es el medio por la cual se transfiere datos desde su fuente
            citaViewModel =
                    ViewModelProviders.of(this).get(CitaViewModel.class);

            //Asociando variables a componentes de la vista
            edtIDCita = v.findViewById(R.id.edtIDCita);
            vwDescripcion = v.findViewById(R.id.vwDescriipcion);
            edtNombreDoctor = v.findViewById(R.id.edtNombreDoctor);
            edtServicio= v.findViewById(R.id.edtServicio);
            edtEmpresa = v.findViewById(R.id.edtEmpresa);
            edtDia = v.findViewById(R.id.edtDia);
            edthorario = v.findViewById(R.id.edtHorario);

            btnSiguiente = v. findViewById(R.id.btnSiguiente);



            final Observer<Cita> observerProducto = new Observer<Cita>() {
                @Override
                public void onChanged(Cita resultado) {
                    Log.d(TAG, " ******** Evento onChanged(String resultado) +*******+");
                    edtIDCita.setText(resultado.getIdCita().toString());
                    vwDescripcion.setText(" - "+resultado.getDescripcion());
                    Log.d(TAG, " ******** ID: "+resultado.getId().toString());
                    Log.d(TAG, " ******** Servicio: "+resultado.getDescripcion());
                }
            };

            citaViewModel.getCitaData().observe(this, observerProducto);
            //FIN de iimplementación del ViewModel

            /*cita = new Cita(randomUUID(), randomUUID(), randomUUID(),
                    randomUUID(), "Cardiologia", "Servicio de cardiologia", new Date(), new Timer());*/

            //Asociando evento clic al boton "Calcula" :: OPCIONAL
            btnSiguiente.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d(TAG, "Evento btnSiguiente.setOnClickListener()::onClick(View v)");
                    citaViewModel.crearCita( randomUUID(), randomUUID(), randomUUID(), edtServicio.getText().toString(), "Servicio de cardiologia", new Date(), new Timer()  );
                    Log.d(TAG, "On click()");
                }
            });


        } catch (Exception e){
            Log.i(TAG, "******** Evento Error: "+e.getMessage());
        }

    }
}

