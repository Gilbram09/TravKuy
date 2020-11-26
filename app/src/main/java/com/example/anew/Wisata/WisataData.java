package com.example.anew.Wisata;

import com.example.anew.R;

import java.util.ArrayList;

public class WisataData {

    private static String[] wisataName = {
            "London, Inggris Raya",
            " Paris, Prancis",
            "Roma, Italia",
            "Kreta, Yunani",
            " Bali, Indonesia",
            "Phuket, Thailand",
            " Barcelona, Spanyol",
            " Istanbul, Turki",
            " Marakesh, Maroko",
            " Dubai, Uni Emirat Arab",
    };

    private static String[] WisataDetail = {
            "London merupakan tempat dimana Buckingham Palace atau kediaman ratu Inggris berada. Selain melihat bangunan-bangunan tua yang sarat sejarah, ada berbagai destinasi wisata yang bisa dikunjungi di wilayah metropolitan terbesar di Inggris ini. Diantaranya Tate Modern, Royal Opera House, Sherlock Holmes Museum, The National Gallery, hingga berbelanja bebas di Oxford Street.",


            "Kota yang terkenal romantis ini turun satu peringkat dari tahun lalu. Meski demikian, keromantisan paris tetap memukau para wisatawan dan sering sekali menjadi latar tempat film-film bergenre drama. Gak cuma produksi Hollywood, beberapa film Indonesia ada juga lho yang syuting di sini. Menara Eiffel dan Arc de Triomphe adalah salah dua dari ikon menawan yang paling populer dan  wajib dikunjungi saat berada disini.",

            "Kota dengan bangunan artistik di dunia ini menjadi incaran tujuan para pecinta seni. Mulai dari seni pahatan, mozaik, hingga lukisan akan dapat dilihat dari berbagai bangunan yang ada. Dijuluki sebagai kota abadi, Roma menyimpan berbagai cerita sejarah yang dapat disaksikan dari bangunan-bangunan kuno yang masih berdiri. Seperti misalnya Colosseum,  arena gladiator yang dibangun sejak abad 70 M.",

            "Pantai menjadi destinasi utama jika kamu ingin mengunjungi Kreta. Hal ini dikarenakan Kreta merupakan pulau yang berbatasan langsung dengan Laut Tengah. Selain pantai, kamu juga bisa memperdalam wawasanmu tentang sejarah dan peradaban manusia di sini lho. Salah satu cerita sejarah yang berasal dari Kreta yakni tempat lahirnya Zeus, raja para dewa.",

            "Sudah tak dipungkiri lagi, Bali menjadi ikon utama pariwisata Indonesia. Keindahan alam seperti pantai, budaya serta kuliner menjadi daya tarik utama wisatawan mancanegara untuk berkunjung ke pulau yang juga dikenal dengan nama Dewata ini. Pantai Kelingking di Nusa Penida, Bali juga didapuk sebagai pantai terbaik nomor 19 di dunia lho.",

            "Di Phuket, kamu akan merasakan sensasi pemandangan indah Laut Andaman. Tepatnya di Laem Phromthep, wisatawan akan takjub melihat indahnya matahari terbenam. Soal pantai, Phuket memiliki sejumlah nama yang sudah taka sing lagi bagi para penyelam dunia diantaranya Patong Bay, Pantai Ao Sane, Pantai Kata, Pantai Naiharn, dan Pantai Meridien.",

            "Barcelonistas pasti memasukkan Barcelona dalam travel list bukan? Ngaku aja deh. Selain karena menjadi markasnya FCB, Barcelona juga menarik wisatawan dunia dengan berbagai spot wisata  Church of the Sacred Family, Park Güell, serta mengunjungi desa wisata Poble Village Espanyol.",

            "Menjadi pusat perekonomian, budaya, dan sejarah Turki menjadikan Istanbul sebagai destinasi yang direkomendasikan oleh traveler dunia. Wisatawan muslim yang berkunjung ke Istanbul pasti akan menyempatkan diri untuk masuk dan beribadah di Blue Mosque atau Masjid Biru yang sangat terkenal dan menjadi salah satu ikon di Istanbul.",

            "Berjuluk Kota Merah, wisatawan dapat menghabiskan waktu liburannya dengan mengunjungi dua tempat wisata unik peradaban yakni siwata kota tua di Medina dan Gueliz sebagai ikon kota modern. Jangan lupa pula untuk merasakan hawa tandus dari Gurun Sahara yang sangat rugi untuk dilewatkan begitu saja.",

            "Berbicara tentang Dubai pasti tak lepas dari pesona ketinggian gedung pencakar langit Burj Khalifa. Bangunan setinggi 828 meter ini menjadi yang paling tinggi di dunia. Jika dulunya terkenal dengan tanah yang tandus, kini Dubai sudah semakin bersolek dan menyajikan tempat-tempat menarik yang menjadikannya sebagai salah satu destinasi favorit dunia.",

    };

    private static int[] WisataImage = {
            R.drawable.london,
            R.drawable.paris,
            R.drawable.roma,
            R.drawable.kreta,
            R.drawable.bali,
            R.drawable.phuket,
            R.drawable.barca,
            R.drawable.istanbul,
            R.drawable.mrks,
            R.drawable.dubai,

    };

    public static ArrayList<parcelable> getListData() {
        ArrayList<parcelable> list= new ArrayList<>();
        for (int position = 0; position < wisataName.length;position++) {
            parcelable Nama = new parcelable();
            Nama.setName(wisataName[position]);
            Nama.setDetail(WisataDetail[position]);
            Nama.setPhoto(WisataImage[position]);
            list.add(Nama);
        }
        return list;



    }

}






