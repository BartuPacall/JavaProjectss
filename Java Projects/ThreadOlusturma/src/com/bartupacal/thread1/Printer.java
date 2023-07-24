
package com.bartupacal.thread1;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Printer extends Thread {
    
    private String isim;

    public Printer(String isim) {
        this.isim = isim;
    }

    @Override
    public void run() {
        System.out.println(isim + "Çalışıyor...");
        
        for(int i =1 ; i<=10;i++ ){
            try {
                System.out.println(isim + "Yazıyor : " + i);
                Thread.sleep(1000); // 1 sn lik aralıklarla oluşturmuş olduk
            } catch (InterruptedException ex) {
                System.out.println("Thread kesintiye uğradı...");
            }
        }
        System.out.println(isim + "işini bitirdi...");
    }
    
}
