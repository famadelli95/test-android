package com.example.androidtest;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.androidtest.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);

    }

    public void onRegistrationClick(View view){
        TextView textFirstName = findViewById(R.id.textViewFirstName);
        TextView textLastName = findViewById(R.id.textViewLastName);
        TextView textEmail = findViewById(R.id.textViewEmail);
        EditText editTextFirstName = findViewById(R.id.editTextFirstName);
        EditText editTextLastName = findViewById(R.id.editTextLastName);
        EditText editTextEmail = findViewById(R.id.editTextEmail);


        textFirstName.setText("First Name: " + editTextFirstName.getText().toString());
        textLastName.setText("Last Name: " + editTextLastName.getText().toString());
        textEmail.setText("Email: " + editTextEmail.getText().toString());

    }
}