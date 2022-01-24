package com.bbt.proyectocoaspharma.Principal.especialidadfragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.bbt.proyectocoaspharma.R;

public class EspecialidadesListaFragment extends Fragment {

    public EspecialidadesListaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_especialidades_lista, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btn_infografia = view.findViewById(R.id.btn_infografia);
        Button btn_cerrar = view.findViewById(R.id.btn_cerrar);

        final NavController navController = Navigation.findNavController(view);

        btn_infografia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.navigate(R.id.especialidadesInfografiaFragment);
            }
        });

        btn_cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.popBackStack(R.id.especialidadesMenuFragment, true);
                navController.navigate(R.id.especialidadesMenuFragment);
            }
        });
    }
}