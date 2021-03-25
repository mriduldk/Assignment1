package in.codingstudio.assignment1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;

import in.codingstudio.assignment1.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private AdapterForRecyclerView adapter;
    private ArrayList<CountryData> countryDataArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.toolbarMainActivity.setTitle("Country and its Capital");
        binding.toolbarMainActivity.setTitleTextColor(getResources().getColor(R.color.white));

        countryDataArrayList = new ArrayList<>();

        prepareData();

        binding.recyclerViewMainActivity.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        adapter = new AdapterForRecyclerView(MainActivity.this, countryDataArrayList);
        binding.recyclerViewMainActivity.setAdapter(adapter);

        binding.recyclerViewMainActivity.addItemDecoration(new DividerItemDecoration(getApplicationContext(), DividerItemDecoration.VERTICAL));
    }

    void prepareData(){

        CountryData countryData = new CountryData("Afghanistan", "Kabul", "Afghani");
        countryDataArrayList.add(countryData);

        countryData = new CountryData("Australia", "Canberra", "Australian Dollar");
        countryDataArrayList.add(countryData);

        countryData = new CountryData("Bahrain", "Manama", "Bahraini Dinarv");
        countryDataArrayList.add(countryData);

        countryData = new CountryData("Bangladesh", "Dhaka", "Taka");
        countryDataArrayList.add(countryData);

        countryData = new CountryData("Belgium", "Brussels", "Euro");
        countryDataArrayList.add(countryData);

        countryData = new CountryData("China", "Beijing", "Chinese Yuan");
        countryDataArrayList.add(countryData);

        countryData = new CountryData("Greece", "Athens", "Euro");
        countryDataArrayList.add(countryData);

        countryData = new CountryData("India", "New Delhi", "Indian Rupee");
        countryDataArrayList.add(countryData);

        countryData = new CountryData("Japan", "Tokyo", "Yen");
        countryDataArrayList.add(countryData);

        countryData = new CountryData("United States of America", "Washington D.C.", "United States Dollar");
        countryDataArrayList.add(countryData);

    }


}