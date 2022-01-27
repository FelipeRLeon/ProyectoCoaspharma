package com.bbt.proyectocoaspharma.Principal.especialidadfragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.bbt.proyectocoaspharma.R;
import com.bbt.proyectocoaspharma.recyclerviews.ListMenuEsp;
import com.bbt.proyectocoaspharma.recyclerviews.ListMenuEspAdapter;

import java.util.ArrayList;
import java.util.List;

public class EspecialidadesMenuFragment extends Fragment {

    List<ListMenuEsp> elements;
    RecyclerView recuclerMenuEsoLista;


    public EspecialidadesMenuFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View vista = inflater.inflate(R.layout.fragment_especialidades_menu, container, false);



        elements = new ArrayList<>();
        ListMenuEspAdapter listAdapter = new ListMenuEspAdapter(elements, getContext());

        RecyclerView recyclerView =  vista.findViewById(R.id.listRecyclerViewMenuEsp);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        init();

        listAdapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final NavController navController = Navigation.findNavController(v);
                Toast.makeText(getContext(),
                        "Seleccion: "+elements.get
                                (recyclerView.getChildAdapterPosition(v))
                                .getName_esp(),Toast.LENGTH_SHORT).show();
                navController.navigate(R.id.especialidadesImagenFragment);

            }
        });

        recyclerView.setAdapter(listAdapter);

        return vista;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
    public void init() {

        elements.add(new ListMenuEsp("#3082cc", "Med General"));
        elements.add(new ListMenuEsp("#1ae5be", "Cirugía"));
        elements.add(new ListMenuEsp("#27ae60", "Gastroenterología"));
        elements.add(new ListMenuEsp("#fda144", "Dermatología"));
        elements.add(new ListMenuEsp("#ec5c8c", "Ginecología"));
        elements.add(new ListMenuEsp("#242883", "Med Interna"));
        elements.add(new ListMenuEsp("#7a3fe1", "Odontología"));
        elements.add(new ListMenuEsp("#be8b87", "Ortopedía"));
        elements.add(new ListMenuEsp("#ff4d4d", "Otorrinolaringología"));
        elements.add(new ListMenuEsp("#efce4a", "Pediatría"));
    }
}