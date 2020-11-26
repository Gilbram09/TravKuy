package com.example.anew.Wisata;

import android.os.Parcel;
import android.os.Parcelable;

public class parcelable implements Parcelable {
    private String Name;
    private String detail;
    private int photo;

    public parcelable() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    protected parcelable(Parcel in) {
        Name = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    {
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(Name);
        dest.writeString(detail);
        dest.writeInt(photo);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<parcelable> CREATOR = new Creator<parcelable>() {
        @Override
        public parcelable createFromParcel(Parcel in) {
            return new parcelable(in);
        }

        @Override
        public parcelable[] newArray(int size) {
            return new parcelable[size];
        }
    };

}
