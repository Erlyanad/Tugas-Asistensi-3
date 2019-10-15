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

//    public void setNamaKendaraan(String namaKendaraan) {
//        this.namaKendaraan = namaKendaraan;
//    }
//
//    public String getNamaKendaraan() {
//        return namaKendaraan;
//    }
//    
//    public void setTipeKendaraan(String tipeKendaraan) {
//        this.tipeKendaraan = tipeKendaraan;
//    }
//
//    public String getTipeKendaraan() {
//        return tipeKendaraan;
//    }
//    
//    public void setKapasitasMesin(int kapasitasMesin) {
//        this.kapasitasMesin = kapasitasMesin;
//    }
//
//    public int getKapasitasMesin() {
//        return kapasitasMesin;
//    }
//    
//    public void setBahanBakar(float bahanBakar) {
//        this.bahanBakar = bahanBakar;
//    }
//  
//    public float getBahanBakar() {
//        return bahanBakar;
//    }

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
