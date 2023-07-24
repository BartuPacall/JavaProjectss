

package com.bartupacal.matematik;

public class Matematik implements IMatematik{

    @Override
    public void toplama(int a, int b) {
        System.out.println("Toplama sonucu : " + (a + b));
    }

    @Override
    public void carpma(int a, int b) {
        System.out.println("Çarpma sonucu : " +(a * b));
    }

    @Override
    public void bolme(int a, int b) {
        System.out.println("Bölme sonucu : " + ((double)a / b)); // dobule istiyoruz sonucu ondan böyle ekledik double ı
    }

    @Override
    public void cıkartma(int a, int b) {
        System.out.println("Çıkartma sonucu : " + (a - b ));
    }
    // bu kısmıda yazdıktan sonra properties packacking kısmındaki compress jar file ı tikli yap ve ok de sonra projenin üstünde sağ tıkla clean and build yap.
    // files paketler 3 dist ve oraya javanın kendi yüklediği kapet gelmiş kendi paketimizin bir jar şeklinde yüklendiğini görmek
    // jvm tarafından görülmesi isteniyorsa .class a dönüştürülmesi gerekiyor. .java uzantılı dosyalar dönüştür -> .class uzantılı dosyalara
    // JAR PROJESİNDE DEVAMI
}
