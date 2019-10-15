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
public class sepedaMotor extends kendaraan {
    private String namaKendaraan, tipeKendaraan;
    private float bahanBakar;

    public sepedaMotor () {
        this.namaKendaraan = "Sepeda Motor";
        this.tipeKendaraan = "Matic";
        this.bahanBakar = 10000;
    }
    
    public void setNamaKendaraan(String namaKendaraan) {
        this.namaKendaraan = namaKendaraan;
    }

    public String getNamaKendaraan() {
        return namaKendaraan;
    }

    public void setTipeKendaraan(String tipeKendaraan) {
        this.tipeKendaraan = tipeKendaraan;
    }

    public String getTipeKendaraan() {
        return tipeKendaraan;
    }

    public void setBahanBakar(float bahanBakar) {
        this.bahanBakar = bahanBakar;
    }

    public float getBahanBakar() {
        return bahanBakar;
    }
    
    @Override
    public float efektifitas(){
        float efektifitas, x, y;
        x = getJarakTempuh();
        y = (float) Math.floor(getBahanBakar());
        efektifitas = (float) Math.exp(x/y) * (float) Math.log10(2);
        return efektifitas;
    }

    public String cekEfektifitas(){
        String efektif;
        if(efektifitas() > 0 && efektifitas() <= 0.5){
            efektif  = "Efektif";
        }else{
            efektif  = "Tidak Efektif";
        }
        return efektif;
    }

    @Override
    public void infoKendaraan() {
        System.out.println("Nama Kendaraan\t\t : " +getNamaKendaraan());
        System.out.println("Tipe Kendaraan\t\t : " +getTipeKendaraan());
        System.out.println("Bahan Bakar\t\t : " +getBahanBakar() + "ml");
        super.infoKendaraan();
        System.out.println("Keefektifan Mesin\t : " +cekEfektifitas());

    }
}
