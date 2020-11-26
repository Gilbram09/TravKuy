package com.example.anew.Hotel;

import com.example.anew.R;

import java.util.ArrayList;
import java.util.Collection;

public class HotelData {
    private static String[] HotelName = {
            "Viroth's Hotel, Siem Reap, Kamboja",
            "Tulemar Bungalows & Villas, Manuel Antonio, Kosta Rika",
            "Taj Umaid Bhawan Palace Jodhpur, Jodhpur, India",
            "Hanoi La Siesta Hotel & Spa, Hanoi, Vietnam",
            "Gili Lankanfushi, Lankanfushi, Maladewa",
            "Belvedere, Riccione, Italia",
            "The Nantucket Hotel & Resort, Nantucket, Massachusetts",
            "La Reserve Paris Hotel  Prancis",
            " Nayara Springs, La Fortuna de San Carlos, Kosta Rika",
    };

    private static String[] HotelDetail = {
            "   Hotel bergaya Kamboja yang memiliki 35 kamar ini memiliki kolam renang di tepi kolam renang, spa dengan layanan lengkap dan armada kecil dari Mercedes-Benz vintage yang menjemput Anda.",


            "   Bungalow dan vila yang menakjubkan ini memiliki 34 rumah yang terletak di lereng bukit Kosta Rika. Termasuk pemandangan panorama, seperti kartu pos dari garis pantai Manuel Antonio yang subur. Resor ini mencakup pantai eksklusif dan empat kolam renang, serta layanan spa dan petualangan sehari.",

            "Bertengger tinggi di atas ibukota gurun Jodhpur, hotel warisan mewah ini adalah rumah keluarga kerajaan Jodhpur. Hotel ini memiliki 64 kamar dan suite yang terinspirasi Art Deco yang terletak hanya 20 menit dari bandara. Istana ini terletak di 26 hektar taman yang rimbun yang merupakan rumah bagi burung-burung merak hidup, dan kolam yang panjang. Manjakan diri Anda dengan perawatan spa di tempat dan yoga dan meditasi, atau mencicipi masakan otentik Alka dan masakan India.",

            "Hotel ini memiliki 50 kamar mewah yang luas di jantung permata tersembunyi Hanoi, Old Quarter. Dengan memperhatikan layanan pelanggan, hotel ini menyediakan layanan peristirahatan malam hari, Wi-Fi gratis, dan spa di tempat serta restoran Vietnam otentik.",

            "Villa mewah yang menakjubkan ini menyatu dengan lingkungan alami Maladewa yang memiliki pantai. Selama masa inap Anda, tuan rumah tamu pribadi Anda akan menangani segala hal untuk Anda, memberi makan, atau bahkan membuat tempat tidur di bawah bintang. Hotel ini memiliki bar overwater, santapan Jepang, dan spa inklusif. Mereka juga akan mengatur kegiatan sehari-hari seperti snorkeling, menyelam, kelas memasak, dan pelayaran kapal pesiar.",

            "Terletak di tepi laut, hotel ini dekat dengan tempat perbelanjaan dan hiburan terbaik yang ditawarkan Italia. Hotel ini mencakup spa dengan layanan lengkap dan merupakan tujuan para penggemar bersepeda karena liburan sepeda dan layanan bersepedanya, yang merupakan cara terbaik untuk melihat kawasan di luar kereta api atau mobil. Lebih baik lagi, hotel ini ramah hewan.",

            "Nantucket Hotel & Resort yang bersejarah terletak beberapa menit dari pusat kota, pantai, feri, restoran dan perbelanjaan. Banyak kamar hotel dan cottage memiliki dapur kecil, pemandangan laut dan pelabuhan.",

            "Dengan pemandangan Menara Eiffel dan sepelemparan batu dari Champs-Elysees, hotel bergaya Paris abad ke-19 ini memiliki detail menarik seperti kain brokat, warna yang kaya dan kamar mandi marmer. Spa terletak di sekitar kolam renang dalam ruangan 16 meter, dan mencakup layanan penuh seperti pijat dan perawatan anti-penuaan.",

            "Nayara Springs terpilih sebagai hotel bintang 1 terbaik di 2016 dan 2017, dan untuk alasan yang baik. Vila-vila mewah yang terpencil terletak di antara hutan hujan Kosta Rika yang subur di Taman Nasional Gunung Api Arenal.\n" +
                    "\n" +
                    "Hotel ini memiliki kolam renang pribadi, spa pemenang penghargaan dengan yoga harian, dua kolam renang besar, lounge piano dan bar di samping kegiatan petualangan sehari-hari seperti arung jeram dan canyoning.",


    };

    private static int[] HotelImage = {
            R.drawable.v2,
            R.drawable.t1,
            R.drawable.v3,
            R.drawable.hanoi,
            R.drawable.gili,
            R.drawable.tripad,
            R.drawable.nutck,
            R.drawable.ppp,
            R.drawable.nayara,

    };





    public static Collection<? extends Hotel> getListData() {
        ArrayList<Hotel> list= new ArrayList<>();
        for (int position = 0; position < HotelName.length;position++) {
            Hotel Nama = new Hotel();
            Nama.setName(HotelName[position]);
            Nama.setDetail(HotelDetail[position]);
            Nama.setPhoto(HotelImage[position]);




            list.add(Nama);
        }
        return list;



    }

}






