package com.example.musthofakamal.mineralwater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Minuman> minuman = new ArrayList<>();
    private RecyclerView recyclerView;
    private rvAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mAdapter = new rvAdapter(minuman);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);

        dataMinuman();
    }

    private void dataMinuman() {
        Minuman menu = new Minuman(R.drawable.aqua, "Aqua", "Ini Adalah Air Mineral  Aqua", "Aqua adalah sebuah  air mineral dalam kemasan (AMDK) yang diproduksi oleh PT Aqua Golden Mississippi Tbk di Indonesia sejak tahun 1973. Selain di Indonesia, Aqua juga dijual di Malaysia, Singapura, dan Brunei. Aqua adalah merek AMDK dengan penjualan terbesar di Indonesia dan merupakan salah satu merek AMDK yang paling terkenal di Indonesia, sehingga telah menjadi seperti merek generik untuk AMDK.");
        minuman.add(menu);
        menu = new Minuman(R.drawable.pristine, "Pristine", "Ini Adalah Air Mineral Pristine", "Water Sources of PRISTINE original come from Pangrango Gede Mountain, 30 miles from the South Jakarta (1.5 hours from Central Jakarta), located beside the \"National Park Pangrango Gede\".");
        minuman.add(menu);
        menu = new Minuman(R.drawable.leminerale, "Leminerale", "Ini Adalah Air Mineral  Leminerale", "Le Minerale, pure and preserved mineral water sourced from the mountain and packed directly on site using the latest technology (mineral protection system) to bring you a healthy refreshment for optimum body function.");
        minuman.add(menu);
        menu = new Minuman(R.drawable.cleo, "Cleo", "Ini Adalah Air Mineral  Cleo", "Cleo pure water adalah air yang kadar kemurniannya mendekati 100%. Air semacam ini tidak lagi mengandung bakteri, virus, mineral atau zat-zat lain yang akan membahayakan tubuh dalam jangka panjang. Konsumsilah air murni, sebab mengonsumsi air yang tidak murni justru mengundang risiko");
        minuman.add(menu);
        menu = new Minuman(R.drawable.club, "Club", "Ini Adalah Air Mineral  Club", "Club adalah  air mineral dalam kemasan atau air mineral di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur. Club diproduksi oleh PT Tirta Sukses Perkasa (dahulu PT Tirta Bahagia) sejak tahun 1986. Pada bulan November 2013, merek Club diakuisisi oleh PT Indofood CBP Sukses Makmur Tbk.");
        minuman.add(menu);
        menu = new Minuman(R.drawable.vit, "Vit", "Ini Adalah Air Mineral  Vit", "VIT adalah sebuah  air mineral dalam kemasan (AMDK) yang diproduksi oleh PT Tirta Investama di Indonesia. Mulai diproduksi sejak tanggal 16 November 1982 dan awalnya dimiliki oleh PT Varia Industri Tirta. Pada tanggal 17 Juli 1987 kepemilikan PT Varia Industri Tirta beralih kepada Tirto Utomo. Sebelas tahun kemudian, setelah melakukan merger dengan PT Varia Industri Tirta, PT Tirta Investama menjadi pemilik merek VIT.");
        minuman.add(menu);
        menu = new Minuman(R.drawable.ades, "Ades", "Ini Adalah Air Mineral  Ades", "AdeS is a brand of drinking water available in Indonesia. The mineral water is also known as I-Lohas in Japan. The Coca-Cola Company acquired the Ades bottled water brand for $20 million in 2000 as part of its $45 million investment in the country since 1999 under PT Akasha Wira International Tbk. It is currently made by PT Coca-Cola Bottling Indonesia in Bekasi, West Java, where it also made Coca-Cola, Fanta and Sprite.");
        minuman.add(menu);
        menu = new Minuman(R.drawable.nestle, "Nestle", "Ini Adalah Air Mineral  Nestle", "Henri Nestlé’s water bottling factory was the earliest incarnation of what would eventually become the world’s leading bottled water company. Nestlé took a step onto the world stage with giants such as Perrier and Nestlé Pure Life. This is commercialized since 1998. Today this impressive portfolio encompasses 50 brands on five continents");
        minuman.add(menu);
        menu = new Minuman(R.drawable.amidis, "Amidis", "Ini Adalah Air Mineral  Amidis", "AMIDIS adalah produk Air Mineral Dalam Kemasan (AMDK) yang sudah diproduksi sejak tahun 1997 dan merupakan air minum distilasi pertama di Indonesia yang telah menjadi salah satu produk AMDK yang dipercaya karena kualitas mutu dan kemurniannya.");
        minuman.add(menu);
        menu = new Minuman(R.drawable.equil, "Equil", "Ini Adalah Air Mineral  Equil", "EQUIL  was first bottled in 1998 at the source, Villa D’Equilibrium, and launched to the market which was then predominantly monopolized by few European brands. Although drinking natural mineral water is embedded in the European fine dining culture, the gourmet and exclusivity of the concept has been accepted by the local Socialites.");
        minuman.add(menu);
        menu = new Minuman(R.drawable.evian, "Evian", "Ini Adalah Air Mineral Evian", "Evian is owned by Danone, a French multinational corporation. In addition to the mineral water, Danone Group uses the Evian name for a line of organic skin care products as well as a luxury resort in France.");
        minuman.add(menu);
        mAdapter.notifyDataSetChanged();
    }
}
