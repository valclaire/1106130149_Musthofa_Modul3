package com.example.musthofakamal.mineralwater;

/**
 * Created by Musthofa Kamal on 2/25/2018.
 */

public class Minuman {
    String nama, detail, komposisi;
    int image;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
    public String getKomposisi() {
        return komposisi;
    }

    public void setKomposisi(String komposisi) {
        this.komposisi = komposisi;
    }
    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }
    public Minuman(int image, String nama, String detail, String komposisi){
        this.nama = nama;
        this.detail = detail;
        this.komposisi = komposisi;
        this.image = image;
    }
}
