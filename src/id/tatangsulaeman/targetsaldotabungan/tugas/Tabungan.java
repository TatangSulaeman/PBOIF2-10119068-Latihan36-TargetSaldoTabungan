/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatangsulaeman.targetsaldotabungan.tugas;

import java.io.PrintStream;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;
/**
 *
 * @author amtat
 * Nama                 : Tatang Sulaeman
 * Kelas                : IF2
 * NIM                  : 10119068
 * Deskripsi program    : Menampilkan Target Saldo Tabungan
 */
public class Tabungan {
    int i =1;
    float bungaPerBulan;
    double saldoAwal,saldoPenargetan,saldo;
    
    
    public double inputUser(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Saldo Awal : Rp. ");
        saldoAwal = keyboard.nextDouble();
        
        System.out.print("Bunga perBulan : ");
        bungaPerBulan = keyboard.nextFloat();
        
        System.out.print("Saldo Target : Rp. ");
        saldoPenargetan = keyboard.nextDouble();
        
        return saldoPenargetan;
    }
    
    public float bungaTabungan(){
        bungaPerBulan = (float) (bungaPerBulan/100);
        return bungaPerBulan;
    }
    
    public double saldoTarget (){
        DecimalFormat mataUangIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols nRp = new DecimalFormatSymbols();
        
        nRp.setCurrencySymbol("Rp. ");
        nRp.setMonetaryDecimalSeparator(',');
        nRp.setGroupingSeparator('.');
        
        mataUangIndonesia.setDecimalFormatSymbols(nRp);
        while (i< saldoPenargetan){
            saldo = (saldoAwal * 0.08) + saldoAwal;
            System.out.printf("Saldo di bulan ke-" + i + " %s %n", mataUangIndonesia.format(saldo));
            saldoAwal = saldo ;
            if (saldoAwal >= saldoPenargetan){
                break;
            }i++;
        }
        return saldoPenargetan;
    }
    
    
}
