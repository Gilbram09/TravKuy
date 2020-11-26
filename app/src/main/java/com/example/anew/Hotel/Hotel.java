package com.example.anew.Hotel;

import android.os.Parcel;
import android.os.Parcelable;

public class Hotel implements Parcelable {

    private String Name;
    private String detail;
    private int photo;

    private String detaill;
    private int photoo;

    public Hotel() {

    }

    public String getDetaill() {
        return detaill;
    }

    public void setDetaill(String detaill) {
        this.detaill = detaill;
    }

    public int getPhotoo() {
        return photoo;
    }

    public void setPhotoo(int photoo) {
        this.photoo = photoo;
    }

//batas

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

    protected Hotel(Parcel in) {
        Name = in.readString();
        detail = in.readString();
        photo = in.readInt();

        //batas

        detaill = in.readString();
        photoo = in.readInt();
    }

    public static final Creator<Hotel> CREATOR = new Creator<Hotel>() {
        @Override
        public Hotel createFromParcel(Parcel in) {
            return new Hotel(in);
        }

        @Override
        public Hotel[] newArray(int size) {
            return new Hotel[size];
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

        //batas

        parcel.writeString(detaill);
        parcel.writeInt(photoo);
    }

}
