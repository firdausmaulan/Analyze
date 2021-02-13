package com.fd.analyze;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.fd.analyze.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private final MainPresenter presenter = new MainPresenter();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnCalculate.setOnClickListener(view -> {
            int height = Integer.parseInt(binding.etHeight.getText().toString());
            int weight = Integer.parseInt(binding.etWeight.getText().toString());
            binding.tvResult.setText(presenter.calculateBMI(height, weight));
        });
    }
}