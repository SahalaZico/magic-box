package com.linkedlist;

public class Nilai implements Comparable<Nilai> {

    private String nama;
    private float IPK;

    public Nilai() {
        nama = "";
        IPK = 0;
    }

    public Nilai(String _nama, float _IPK) {
        nama = _nama;
        IPK = _IPK;
    }

    public void move(int dnama, int dIPK) {
        this.nama += dnama;
        this.IPK += dIPK;
    }

    @Override
    public String toString() {
        return (this.nama + "," + this.IPK);
    }

    @Override
    public int compareTo(Nilai o) {
        if (nama.equals(o.nama) && IPK == o.IPK) {
            return 0;
        } else {
            return 1;
        }
    }

}
