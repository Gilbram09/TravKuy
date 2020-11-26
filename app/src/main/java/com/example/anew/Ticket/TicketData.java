package com.example.anew.Ticket;

import com.example.anew.R;

import java.util.ArrayList;

public class TicketData {

    private static String[] tiketName = {
            "Ticket Kereta",
            "Ticket Pesawat",

    };

    private static String[] tiketDetail = {
            "Argo Wilis\n" +
                    "relasi Gambir – Bandung – Surabaya Gubeng. Jadwal berangkat pukul 05.00 WIB, kereta api ini terdiri dari rangkaian eksekutif, dan total 400 tempat duduk.",


            "Garuda Indonesia\n"+
                    "merupakan maskapai penerbangan nasional terkemuka di Indonesia yang tergabung dalam aliansi SkyTeam. Mulai mengudara sejak 1949, kini Garuda Indonesia melayani penerbangan ke 40 destinasi domestik dan 36 destinasi internasional. Maskapai penerbangan yang dulunya dikenal sebagai Garuda Indonesian Airways ini menawarkan tiga tipe kelas penerbangan bertaraf internasional, yaitu kelas ekonomi, kelas bisnis dan kelas satu. Tingginya dedikasi Garuda Indonesia di industri penerbangan telah dibuktikan melalui predikat Maskapai Penerbangan Regional Terbaik di Dunia yang diberikan oleh Skytrax." ,




    };

    private static int[] tiketImage = {
            R.drawable.kereta,
            R.drawable.garuda,

    };



    private static String[] tiket2Detail = {
            "cumputer line \n"+
                    "KRL Commuter Line adalah layanan kereta rel listrik komuter yang beroperasi di wilayah Jabodetabek dan sudah beroperasi sejak tahun 1925 dan dioperasikan oleh PT Kereta Commuter Indonesia yang merupakan anak perusahaan dari PT Kereta Api Indonesia (PT KAI).",



            "Lion Air\n" +
                    "Lima belas tahun lebih mengudara dan melayani masyarakat, hingga saat ini Lion Air telah terbang ke 183 rute penerbangan yang terbagi dalam rute domestik yang tersebar ke seluruh penjuru Indonesia dari sabang sampai merauke, dan rute Internasional menuju sejumlah negara seperti, Singapore, Malaysia, Saudi Arabia dan China. Jumlah rute tentunya akan terus bertambah karena melihat pasar penerbangan di Indonesia yang terus berkembang begitu pesat. Dengan kepemilikan pesawat sebanyak 112 armada yang terbagi dalam beberapa tipe seperti Boeing 747-400, Boeing 737-800, Boeing 737-900 ER, dan Airbus A330-300. Jumlah armada pun juga akan bertambah sesuai dengan pengiriman pemesanan pesawat yang dilakukan oleh Lion Air." ,



    };

    private static int[] tiket2Image = {
            R.drawable.krl,
            R.drawable.lion,

    };


    public static ArrayList<Ticket> getListData() {
        ArrayList<Ticket> list= new ArrayList<>();
        for (int position = 0; position < tiketName.length;position++) {
            Ticket Nama = new Ticket();
            Nama.setName(tiketName[position]);
            Nama.setDetail(tiketDetail[position]);
            Nama.setPhoto(tiketImage[position]);

            Nama.setPhotoo(tiket2Image[position]);
            Nama.setDetaill(tiket2Detail[position]);


            list.add(Nama);
        }
        return list;



    }

}








