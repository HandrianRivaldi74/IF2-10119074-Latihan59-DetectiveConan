/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if2.pkg10119074.latihan59.detectiveconan;

/**
 *
 * @author Acer
 * Nama  : HANDRIAN RIVALDI
 * Kelas : PBOIF2
 * NIM   : 10119074
 * Deskrifsi:
 */
public class IF210119074Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShinichiKudo objShinichiKudo = new ShinichiKudo("Detektif", "Bernyanyi", "Yusaku Kudo", "Ran Mouri", "Sepak bola dan olahraga lainnya");
        objShinichiKudo.setNama("Shinichi Kudo");
        KaitoKid objKaitoKid = new KaitoKid("Pesulap, Pencuri baik hati", "Takut ikan", "Touchi Kuroba", "Aoko Nakamori", "Bermain papan ski");
        objKaitoKid.setNama("Kaito Kuroba");

        System.out.println("======Karakter Kartun dalam Anime Detective Conan======");
        System.out.println("Nama                : "+objShinichiKudo.getNama());
        objShinichiKudo.tampilHasil();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nama                : "+objKaitoKid.getNama());
        objKaitoKid.tampilHasil();
    }
    
}
