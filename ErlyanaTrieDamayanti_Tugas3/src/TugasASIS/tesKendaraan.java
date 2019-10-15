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
public class tesKendaraan {
    public static void main(String[] args) {
        kendaraan k;
        mobil m1 = new mobil ();
        m1.setIdKendaraan(992);
        m1.setJarakTempuhAwal(50);
        m1.setJarakTempuh(50);
        
        mobil m2 = new mobil ();
        m2.setNamaKendaraan("Mobil");
        m2.setTipeKendaraan("Manual");
        m2.setKapasitasMesin(1500);
        m2.setBahanBakar(100);
        m2.setIdKendaraan(990);
        m2.setJarakTempuhAwal(50);
        m2.setJarakTempuh(20);
        
        sepedaMotor s1 = new sepedaMotor();
        s1.setIdKendaraan(402);
        s1.setJarakTempuhAwal(19);
        s1.setJarakTempuh(64);
        
        sepedaMotor s2 = new sepedaMotor();
        s2.setNamaKendaraan("Sepeda Motor");
        s2.setTipeKendaraan("Manual");
        s2.setBahanBakar(1000);
        s2.setIdKendaraan(400);
        s2.setJarakTempuhAwal(19);
        s2.setJarakTempuh(990);
        
        k=m1;
        k.infoKendaraan();
        System.out.println("=================================================");
        k=m2;
        k.infoKendaraan();
        System.out.println("=================================================");
        k=s1;
        k.infoKendaraan();
        System.out.println("=================================================");
        k=s2;
        k.infoKendaraan();
        System.out.println("");
    }
}
    

