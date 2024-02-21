package com.example.gestion_reclamations;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.gestion_reclamations.databinding.FragmentWelcomeBinding;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link HomeActivity#newInstance} factory method to
 * create an instance of this fragment.
 *
 */

public class AuthenticationFragment extends Fragment {

    private FragmentWelcomeBinding binding;
    public static HomeActivity newInstance() {
        return new HomeActivity();
    }

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        binding = FragmentWelcomeBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
    @Override
    public void onViewCreated(@NonNull View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.buttonlogin.setEnabled(false);
        binding.buttonsignup.setEnabled(true);
        binding.email.setEnabled(true);
        binding.editTextTextPassword.setEnabled(false);
        binding.email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                binding.buttonlogin.setEnabled(!s.toString().isEmpty());
                binding.editTextTextPassword.setEnabled(!s.toString().isEmpty());

            }

        });
        binding.email.setOnClickListener(v -> {
            // The user just clicked
        });
    }
}