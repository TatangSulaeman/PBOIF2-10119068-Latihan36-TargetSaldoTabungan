/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.targetsaldotabungan.tugas;

/**
 *
 * @author amtat
 * Nama                 : Tatang Sulaeman
 * Kelas                : IF2
 * NIM                  : 10119068
 * Deskripsi program    : Menampilkan Target Saldo Tabungan
 */
public class Main {
    public static void main(String[] args){
        Tabungan tabungan = new Tabungan();
        System.out.println(tabungan.inputUser());
        System.out.println(tabungan.saldoTarget ());
        System.out.println("DIBUAT OLEH TATANG SULAEMAN");
    }
}
