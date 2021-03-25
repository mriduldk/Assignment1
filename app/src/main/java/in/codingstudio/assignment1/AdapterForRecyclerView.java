package in.codingstudio.assignment1;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import in.codingstudio.assignment1.databinding.RecyclerviewLayoutBinding;

import static in.codingstudio.assignment1.GlobalValues.CAPITAL_NAME;
import static in.codingstudio.assignment1.GlobalValues.COUNTRY_NAME;
import static in.codingstudio.assignment1.GlobalValues.CURRENCY;

public class AdapterForRecyclerView extends RecyclerView.Adapter<AdapterForRecyclerView.ViewHolder> {

    private final Context context;
    private final ArrayList<CountryData> countryArrayList;

    public AdapterForRecyclerView(Context context, ArrayList<CountryData> countryArrayList) {
        this.context = context;
        this.countryArrayList = countryArrayList;
    }

    @NonNull
    @Override
    public AdapterForRecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterForRecyclerView.ViewHolder holder, int position) {

        CountryData countryData = countryArrayList.get(position);

        holder.binding.textViewCountryName.setText(countryData.getCountryName());
        holder.binding.textViewCapitalName.setText(countryData.getCapital());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, CountryDetails.class);
                intent.putExtra(COUNTRY_NAME, countryData.getCountryName());
                intent.putExtra(CAPITAL_NAME, countryData.getCapital());
                intent.putExtra(CURRENCY, countryData.getCurrency());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return countryArrayList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        RecyclerviewLayoutBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            binding = RecyclerviewLayoutBinding.bind(itemView);
        }
    }
}
