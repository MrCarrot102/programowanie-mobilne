package com.example.pum_lista2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pum_lista2.databinding.FragmentABinding;

public class FragmentA extends Fragment {

    private FragmentABinding binding;

    public FragmentA() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentABinding.inflate(inflater);

        binding.fabA.setOnClickListener(view -> {
            NavDirections action = FragmentADirections.actionFragmentAToFragmentB(5);
            Bundle args = new Bundle();
            args.putInt("value", 5);
            Navigation.findNavController(requireView()).navigate(action);
        });

        return binding.getRoot();
    }
}