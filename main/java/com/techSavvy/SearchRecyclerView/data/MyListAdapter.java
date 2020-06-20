package com.techSavvy.SearchRecyclerView.data;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.techSavvy.SearchRecyclerView.R;
import com.techSavvy.SearchRecyclerView.model.CityDataItem;
import java.util.List;

public class MyListAdapter extends BaseAdapter {

    public static final String CITY_KEY = "city_key";
    private Context mContext;
    private List<CityDataItem> cityDataItems;
    private LayoutInflater mInflater;

    public MyListAdapter(Context context, List<CityDataItem> cityDataItems) {
        this.mContext=context;
        this.cityDataItems=cityDataItems;
        mInflater=LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return cityDataItems.size();
    }

    @Override
    public Object getItem(int position) {
        return cityDataItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView=mInflater.inflate(R.layout.list_item_layout,parent,false);
        }
        TextView textView=convertView.findViewById(R.id.textView);
        ImageView imageView=convertView.findViewById(R.id.imageView);

        CityDataItem cityDataItem=cityDataItems.get(position);
        textView.setText(cityDataItem.getCityName());

        return convertView;
    }
}
