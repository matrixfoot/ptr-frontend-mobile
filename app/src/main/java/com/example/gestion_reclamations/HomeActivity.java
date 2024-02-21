package com.example.gestion_reclamations;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private TextView textViewAccountBalance;
    private TextView textViewRecentTransactions;
    private Button btnTransferMoney;
    private Button btnPayBills;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Initialize views
        textViewAccountBalance = findViewById(R.id.textViewAccountBalance);
        textViewRecentTransactions = findViewById(R.id.textViewRecentTransactions);
        btnTransferMoney = findViewById(R.id.btnTransferMoney);
        btnPayBills = findViewById(R.id.btnPayBills);

        // Simulated account balance and recent transactions
        String accountBalance = "$1,234.56";
        String recentTransactions = "Recent Transactions:\n- Grocery shopping\n- Phone bill payment";

        // Set the text for account balance and recent transactions
        textViewAccountBalance.setText("Account Balance: " + accountBalance);
        textViewRecentTransactions.setText(recentTransactions);

        // Button click listeners
        btnTransferMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Transfer Money button click
                Toast.makeText(HomeActivity.this, "Transfer Money Clicked", Toast.LENGTH_SHORT).show();
                // Add your logic for transferring money
            }
        });

        btnPayBills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle Pay Bills button click
                Toast.makeText(HomeActivity.this, "Pay Bills Clicked", Toast.LENGTH_SHORT).show();
                // Add your logic for paying bills
            }
        });
    }
}
