package com.example.anew.kuliner;

import android.os.Parcel;
import android.os.Parcelable;

public class kuliner implements Parcelable {
    private String Name;
    private String detail;
    private int photo;

    public kuliner() {

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

    protected kuliner(Parcel in) {
        Name = in.readString();
        detail = in.readString();
        photo = in.readInt();
    }

    public static final Creator<kuliner> CREATOR = new Creator<kuliner>() {
        @Override
        public kuliner createFromParcel(Parcel in) {
            return new kuliner(in);
        }

        @Override
        public kuliner[] newArray(int size) {
            return new kuliner[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(Name);
        parcel.writeString(detail);
        parcel.writeInt(photo);
    }
}
