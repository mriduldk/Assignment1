package in.codingstudio.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import in.codingstudio.assignment1.databinding.ActivityCountryDetailsBinding;

import static in.codingstudio.assignment1.GlobalValues.CAPITAL_NAME;
import static in.codingstudio.assignment1.GlobalValues.COUNTRY_NAME;
import static in.codingstudio.assignment1.GlobalValues.CURRENCY;

public class CountryDetails extends AppCompatActivity {

    private ActivityCountryDetailsBinding binding;
    private String countryName, capitalName, currency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCountryDetailsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.toolbarCountryDetailsActivity.setTitle("Country Details");
        binding.toolbarCountryDetailsActivity.setTitleTextColor(getResources().getColor(R.color.white));
        setSupportActionBar(binding.toolbarCountryDetailsActivity);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        binding.toolbarCountryDetailsActivity.setNavigationIcon(R.drawable.ic_round_arrow_back_24);


        countryName = getIntent().getStringExtra(COUNTRY_NAME);
        capitalName = getIntent().getStringExtra(CAPITAL_NAME);
        currency = getIntent().getStringExtra(CURRENCY);

        binding.textViewCountryName.setText(countryName);
        binding.textViewCapitalName.setText(capitalName);
        binding.textViewCurrency.setText(currency);

    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
