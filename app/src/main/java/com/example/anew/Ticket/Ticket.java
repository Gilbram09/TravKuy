package com.example.anew.Ticket;

import android.os.Parcel;
import android.os.Parcelable;

public class Ticket implements Parcelable {

    private String Name;
    private String detail;
    private int photo;
    private String Namee;
    private String detaill;
    private int photoo;

    public Ticket() {

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

    protected Ticket(Parcel in) {
        Name = in.readString();
        detail = in.readString();
        photo = in.readInt();
        detaill = in.readString();
        photoo = in.readInt();
    }

    public static final Creator<Ticket> CREATOR = new Creator<Ticket>() {
        @Override
        public Ticket createFromParcel(Parcel in) {
            return new Ticket(in);
        }

        @Override
        public Ticket[] newArray(int size) {
            return new Ticket[size];
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
        parcel.writeString(detaill);
        parcel.writeInt(photoo);
    }
}
