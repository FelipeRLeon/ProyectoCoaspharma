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

public class EspecialidadesInfografiaFragment extends Fragment {

    public EspecialidadesInfografiaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_especialidades_infografia, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button btn_next = view.findViewById(R.id.btn_next);
        Button btn_back = view.findViewById(R.id.btn_back);
        Button btn_cerrar = view.findViewById(R.id.btn_cerrar);

        final NavController navController = Navigation.findNavController(view);

        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.popBackStack(R.id.especialidadesVideoFragment, true);
                navController.navigate(R.id.especialidadesVideoFragment);
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navController.popBackStack(R.id.especialidadesPresentacionesFragment, true);
                navController.navigate(R.id.especialidadesPresentacionesFragment);
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