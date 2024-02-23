package com.example.gestion_reclamations;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class HomeFragment extends Fragment {

    // Constructor
    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // Initialize and setup any views or listeners here
        // For example, setting up the testimonies slider or handling form submission

        // Example: Handle Submit Button click
        Button submitButton = view.findViewById(R.id.btnSubmit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Submit button click here
                // You can retrieve data from the EditText fields and perform actions
                // For example:
              /**  EditText nameEditText = view.findViewById(R.id.editTextName);
                String name = nameEditText.getText().toString();

                EditText emailEditText = view.findViewById(R.id.editTextEmail);
                String email = emailEditText.getText().toString();

                EditText messageEditText = view.findViewById(R.id.editTextMessage);
                String message = messageEditText.getText().toString();**/

                // Perform actions with the data (e.g., submit form data to server)
                // Example:
                // sendDataToServer(name, email, message);
                // Show a toast or dialog to indicate submission
                Toast.makeText(getContext(), "Form Submitted", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
