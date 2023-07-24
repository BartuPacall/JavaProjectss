
package com.bartupacal.thread3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args){
        /* Thread printer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread çalışıyor...");
                for(int i =1 ;i<=10 ; i++){
                    try {
                        System.out.println("Yazıyor : " + i);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        System.out.println("Thread kesintiye uğradı...");
                    }
                }
            }
        }); */
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread çalışıyor...");
                for(int i =1 ;i<=10 ; i++){
                    try {
                        System.out.println("Yazıyor : " + i);
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        System.out.println("Thread kesintiye uğradı...");
                    }
                }
            }
        }).start();
        // printer1.start();
        
        System.out.println("Main thread çalışıyor...");
        }
    }
    

