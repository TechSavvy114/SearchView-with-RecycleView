package com.techSavvy.SearchRecyclerView.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.UUID;

public class CityDataItem implements Parcelable {

    private String cityId;
    private String cityName;
    private String province;


    public CityDataItem() {
    }

    public CityDataItem(String cityId, String cityName,
                        String province) {

        if (cityId == null) {
            cityId = UUID.randomUUID().toString();
        }

        this.cityId = cityId;
        this.cityName = cityName;
        this.province = province;

    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "CityDataItem{" +
                "cityId='" + cityId + '\'' +
                ", cityName='" + cityName + '\'' +
                ", province='" + province + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.cityId);
        dest.writeString(this.cityName);
        dest.writeString(this.province);

    }

    protected CityDataItem(Parcel in) {
        this.cityId = in.readString();
        this.cityName = in.readString();
        this.province = in.readString();

    }

    public static final Parcelable.Creator<CityDataItem> CREATOR = new Parcelable.Creator<CityDataItem>() {
        @Override
        public CityDataItem createFromParcel(Parcel source) {
            return new CityDataItem(source);
        }

        @Override
        public CityDataItem[] newArray(int size) {
            return new CityDataItem[size];
        }
    };
}



