package com.techSavvy.SearchRecyclerView.ui;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.techSavvy.SearchRecyclerView.R;
import com.techSavvy.SearchRecyclerView.data.MyDataAdapter;
import com.techSavvy.SearchRecyclerView.model.CityDataItem;
import com.techSavvy.SearchRecyclerView.sample.SampleDataProvider;



public class DetailsActivity extends AppCompatActivity {

    private TextView tvName, tvCapital;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        String cityId = getIntent().getStringExtra(MyDataAdapter.ITEM_KEY);
        initViews();
        displayCityData(cityId);
    }

    private void initViews() {

        this.tvName = findViewById(R.id.tv_name);
        this.tvCapital = findViewById(R.id.tv_capital);
        this.imageView = findViewById(R.id.imageView);

    }

    private void displayCityData(String cityId) {
        CityDataItem item = SampleDataProvider.dataItemMap.get(cityId);
        this.tvName.setText(item.getCityName());
        this.tvCapital.setText(item.getProvince());

    }
}
