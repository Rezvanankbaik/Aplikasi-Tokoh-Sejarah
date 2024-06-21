package com.example.RHA

import com.example.tugas_pts.R

data class Data_tokoh (
    var namaTokoh : String,
    var asalNegara : String,
    var dexkripsiTokoh : String,
    var profesi : String,
    val gambarTokoh : Int
)
val dataTokoh = arrayOf(
    Data_tokoh(
        "Albert Einstein",
        "Jerman",
        "Albert Einstein merupakan seseorang yang lahir pada tanggal 14 Maret 1879 di Ulm, Jerman dan ia merupakan seorang putra insinyur listrik.\n" +
                "Ayah dari Albert Einstein bernama Hermann Einstein dan ibunya bernama Pauline Koch. Albert Einstein pindah ke Munich pada tahun 1880 karena ayahnya dan pamannya yaitu Jakob, membangun perusahaan yang memproduksi listrik dengan cara memanfaatkan arus searah Menjelang awal kariernya, Einstein berpendapat bahwa mekanika Newton tak lagi mampu menyatukan hukum mekanika klasik dengan hukum medan elektromagnetik. Hal ini mendorongnya mengembangkan teori relativitas khusus saat bekerja di Kantor Paten Swiss di Bern (1902–1909). Tetapi, ia menyadari bahwa prinsip relativitas juga dapat diperluas cakupannya pada medan gravitasi, dan ia menerbitkan sebuah makalah mengenai relativitas umum pada tahun 1916 dengan teorinya tentang gravitasi. Einstein terus meneliti masalah mekanika statistika dan teori kuantum, yang mengarah pada penjelasannya mengenai teori partikel dan gerak molekul. Einstein juga meneliti kandungan termal cahaya yang meletakkan dasar bagi teori foton cahaya. Pada tahun 1917, ia menerapkan teori relativitas umum untuk memodelkan struktur alam semesta .",
        "Ilmuan",
        R.drawable.aset4
    ),
    Data_tokoh(
        "Soekarno",
        "Indonesia",
        "Soekarno atau Bung Karno yang menjadi Bapak Kebangkitan Asia-Afrika mempunyai nama besar Putra Sang Fajar. Ia merupakan sosok hebat dengan gagasan pemikiran yang dihasilkan. Tidak jarang gagasan yang disampaikannya menuai kontroversi dan juga mengundang kekaguman. Jiwa kepemimpinan, patriotisme, dan kutu buku telah dekat dengan Bung Karno sejak kecil.",
        "Presiden",
        R.drawable.soekarno
    ),
    Data_tokoh(
        "Ibu Kartini",
        "Indonesia",
        "\"MENGENAL SOSOK R.A KARTINI, PAHLAWAN EMANSIPASI PEREMPUAN \"\n" +
                "                \"Kartini merupakan seorang pejuang kemerdekaan dan kedudukan kaumnya pada saat itu, terutama wanita Jawa. Pada masa perjuangan kemerdekaan, hanya perempuan bangsawan saja yang mendapatkan kesempatan pendidikan. Semasa hidupnya, kaum perempuan tidak diperbolehkan menempuh pendidikan yang tinggi",
        "Guru",
        R.drawable.aset
    ),
    Data_tokoh(
        "Uncle Sam",
        "America",
        "ulukan itu biasanya diasosiasikan dengan tokoh kartun yang berambut putih panjang, berjanggut, serta mengenakan mantel, rompi, topi tinggi, dan celana panjang bergaris. Melansir Britannica, asal-usul julukan Uncle Sam atau Paman Sam, meskipun diperdebatkan, biasanya dikaitkan dengan seorang pedagang daging dari Troy, New York, Samuel Wilson. Wilson dikenal dengan sebutan \"Paman Sam\" Wilson.\n" +
                "\n" +
                "Artikel ini telah tayang di Kompas.com dengan judul \"Hari Ini dalam Sejarah: Asal Mula Julukan \"Uncle Sam\" untuk AS\", \n" +
                "\n" +
                "\n" +
                "Kompascom+ baca berita tanpa iklan: https://kmp.im/plus6\n" +
                "Download aplikasi: https://kmp.im/app6",
        "tukang bungkus daging",
        R.drawable.uncle_sam
    ),

    Data_tokoh(
        "Mohamad Hatta",
        "Indonesia",
        "\n" +
                "Dalam perjuangan kemerdekaan, beliau memiliki peran dalam pembentukan Perhimpunan Indonesia, menjadi seorang pemimpin dari PUTERA yaitu Pusat Tenaga Rakyat, menjadi seorang anggota Panitia Sembilan yang melakukan perumusan terhadap Piagam Jakarta.",
        "Aktivis",
        R.drawable.mohamad_hatta
    ),

    Data_tokoh(
        "Nikola tesla",
        "Serbia",
        "\n" +
                "Edison mengusung arus searah (DC) dan Nikola Tesla menghadirkan sistem arus bolak-balik (AC). Meskipun keduanya sama-sama jenis, tapi faktanya Tesla tidak membantu dalam menciptakan bola lampu. Thomas Alva Edison lah yang menerima hak paten bola lampunya dengan filamen karbon pada 1879.",
        "Insinyur listrik",
        R.drawable.nikola_tesla
    ),

    Data_tokoh(
        "Karl Marx",
        "Jerman",
        "Karl Marx | Buku, Teori, Keyakinan, Anak, Komunisme ...\n" +
                "Siapa Karl Marx? Karl Marx adalah seorang filsuf Jerman pada abad ke-19. Dia bekerja terutama di bidang filsafat politik dan merupakan pendukung komunisme yang terkenal. Dia menulis The Communist Manifesto dan penulis Das Kapital, yang bersama-sama menjadi dasar Marxisme.",
        "Ahli sejarah",
        R.drawable.karl
    ),

    Data_tokoh(
        "irving fisher",
        "America",
        "\n" +
                "Irving Fisher mengemukakan bahwa dalam teori kuantitas uang, jumlah peredaran uang berbanding lurus dengan perubahan harga. Menurutnya, perubahan jumlah uang yang beredar akan memengaruhi harga barang. Selain itu, Fisher juga menjelaskan bahwa peningkatan jumlah uang dapat menyebabkan inflasi, begitu pula sebaliknya.5 Des 2022",
        "Pereka cipta",
        R.drawable.irving
    ),

    Data_tokoh(
        "Jokowi Dodo",
        "Indonesia",
        "Ir. H. Joko Widodo adalah Presiden ke-7 Republik Indonesia yang mulai menjabat sejak 20 Oktober 2014. Lahir di Surakarta, Jawa Tengah, pada 21 Juni 1961, Joko Widodo pertama kali terjun ke pemerintahan sebagai Wali Kota Surakarta (Solo) pada 28 Juli 2005 hingga 1 Oktober 2012.\n" +
                "\n",
        "Presiden",
        R.drawable.jokowi
    ),

    Data_tokoh(
        "Charlie Chaplin",
        "Britania",
        "\n" +
                "Charles Chaplin adalah seorang aktor komik asal Inggris, sutradara film dan juga komposer terbaik yang dikenal karena karyanya selama era silent film. Dia menjadi bintang film paling terkenal di dunia sebelum akhir Perang Dunia I, meskipun frekuensi perannya dalam film-film menurun di era 20-an.",
        "Aktor film & televisi",
        R.drawable.caplin
    ),



)

