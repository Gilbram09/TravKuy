package com.example.anew.kuliner;

import com.example.anew.R;

import java.util.ArrayList;
import java.util.Collection;

public class KulinerData {

    private static String[] kulinerName = {
            "  Osteria Francescana (Modena, Italia)",
            "El Celler de Can Roca (Girona, Spanyol)",
            " Mirazur (Menton, Prancis)",
            " Eleven Madison Park (New York)",
            "Gaggan (Bangkok)",
            "Central (Lima, Peru)",
            "Maido (Lima, Peru)",
            "Arpege (Paris, Prancis)",

    };

    private static String[] kulinerDetail = {
            "Kalau kamu punya rencana berpelesir ke Italia, luangkan waktumu untuk mecicipi hidangan klasik ala Negeri Spaghetti itu. Selain memiliki destinasi wisata sekaligus menjadi salah satu pusat mode dunia, Italia pun memiliki restoran terbaik di dunia.\n" +
                    "\n" +
                    "Adalah restoran Osteria Francescana yang baru saja dinobatkan sebagai restoran terbaik dunia untuk kedua kalinya. Restoran itu mendapat gelar terbaik pada sebuah acara penghargaan yang diselenggarakan oleh majalah lifestyle Inggris Restaurant di Bilbao, Spanyol, Selasa (19/6/2018).\n" +
                    "\n" +
                    "Sebelumnya, restoran itu memenangkan gelar yang sama pada tahun 2016.\n",


            "Roca bersaudara, Joan, Jordi, dan Josep berhasil membawa restorannya,El Celler de Can Roca di Girona, Spanyol, meraih puncak teratas ajang pemilihan restoran terbaik di dunia, The World’s 50 Best Restaurants. El Celler yang dibangun Joan (head chef), Jordi (pastry chef), dan Josep (sommelier) sejak 1986 ini mengalahkan pesaingnya Noma dari Copenhagen, Denmark yang sebelumnya menduduki peringkat pertama di tahun 2014. Kedua restoran ini telah bersaing ketat sejak empat tahun lalu, namuntahun ini El Celler boleh tersenyum bahagia atas kemenangannya. El Celler de Can Roca, terpilih karena telah menjadi yang terdepan dalam eksperimen molecular gastronomy dan presentasi hidangan yang tidak biasa. Tentu saja sinergi antara bahan tradisional dan teknik memasak jualah yang telah meraih hati sekian banyak orang berpengaruh di dunia kuliner yang menjadi juri. Lalu usai pengumuman kemenangan ini, bukankah rasanya ingin segera memesan meja di El Celler de Can Roca untuk menyantap “hidangan terbaik di dunia” ? (IL) Dok : El Celler de Can Roca",

            "Mirazur adalah sebuah restoran di Menton, Prancis yang berperingkat tiga bintang oleh Michelin Guide. Restoran ini dikelola oleh koki Argentina Mauro Colagreco, yang sebelumnya bekerja dengan Bernard Loiseau, Alain Passard, Alain Ducasse, dan Guy Martin. Dia membuka Mirazur pada 2006 pada usia 29 tahun",

            "Eleven Madison Park adalah restoran Amerika yang terletak di 11 Madison Avenue, di East 24th Street, di Distrik Flatiron Manhattan, New York City. Ini peringkat ketiga di antara 50 Restoran Terbaik Dunia di tahun 2016, dan menempati urutan teratas pada tahun 2017.",

            "Gaggan adalah restoran yang dikelola oleh koki Gaggan Anand di Bangkok, Thailand. Pada 25 Agustus 2019 Gaggan ditutup dan tanggal penyajian tamu terakhir adalah 24 Agustus 2019.",

            "Central Restaurante adalah restoran yang terletak di Distrik Barranco, Lima, Peru. Central Restaurante adalah restoran andalan chef Peru, Virgilio Martínez Véliz, dan berfungsi sebagai bengkelnya dalam penyelidikan dan integrasi bahan-bahan asli Peru ke dalam menu restoran",


            "Masakan fusi tidak lain adalah memasak, begitulah fasih kata yang melingkupi tindakan. Darah memunculkan di perapian. Orang-orang bernyanyi di perapian. Cerita individu dan kolektif bergabung di perapian. hidup, elemen-elemennya kohesif, dialog dipromosikan di dalam perapian, elemen-elemen dihadapkan, lawan-lawannya tertarik, dapur Nikkei lahir, dari sejarah kompleks yang dikenal sebagai Peru dan dari bagian lain yang setara, jauh dan asing, memanggil Jepang yang datang bersama untuk hidup secara harmonis dan menciptakan realitas ketiga: The Nikkei Kitchen Selamat datang di dunia kita. ",

            "DArpège adalah restoran Prancis bintang 3 Michelin di Paris. Kokinya adalah Alain Passard. Itu sebelumnya dikenal sebagai L'Archestrate oleh Alain Senderens. Passard membeli restoran itu dari Senderens pada tahun 1986.",



    };

    private static int[] kulinerImage = {
            R.drawable.r1,
            R.drawable.r2,
            R.drawable.r3,
            R.drawable.r4,
            R.drawable.r5,
            R.drawable.r6,
            R.drawable.r7,
            R.drawable.r8,

    };

    public static Collection<? extends kuliner> getListData() {
        ArrayList<kuliner> list= new ArrayList<>();
        for (int position = 0; position < kulinerName.length;position++) {
            kuliner Nama = new kuliner();
            Nama.setName(kulinerName[position]);
            Nama.setDetail(kulinerDetail[position]);
            Nama.setPhoto(kulinerImage[position]);
            list.add(Nama);
        }
        return list;



    }

}



