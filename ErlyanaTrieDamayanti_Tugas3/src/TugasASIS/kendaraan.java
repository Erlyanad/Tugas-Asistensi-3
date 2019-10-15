/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasASIS;

/**
 *
 * @author USER
 */
public class kendaraan {
    private int idKendaraan;
    protected float jarakTempuhAwal;
    protected float jarakTempuh;

    public void setIdKendaraan(int idKendaraan) {
        this.idKendaraan = idKendaraan;
    }

    public int getIdKendaraan() {
        return idKendaraan;
    }

    public void setJarakTempuhAwal(float jarakTempuhAwal) {
        this.jarakTempuhAwal = jarakTempuhAwal;
    }

    public float getJarakTempuhAwal() {
        return jarakTempuhAwal;
    }

    public void setJarakTempuh(float jarakTempuh) {
        this.jarakTempuh = jarakTempuh;
    }

    public float getJarakTempuh() {
        return jarakTempuh;
    }

    public float totalJarak() {
        float total;
        return total = getJarakTempuhAwal() + getJarakTempuh();
    }

    public float efektifitas() {
        return 0;
    }

    public void infoKendaraan() {
        System.out.println("ID Kendaraan\t\t : " +getIdKendaraan());
        System.out.println("Jarak Tempuh Awal\t : " +getJarakTempuhAwal() + "km");
        System.out.println("Jarak Tempuh\t\t : " +getJarakTempuh() + "km");
        System.out.println("");
        System.out.println("Total Jarak\t\t : " +totalJarak() + "km");

    }
}
