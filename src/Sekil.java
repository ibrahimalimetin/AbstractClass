 //Abstract (Soyut) Sınıflar; interfaceler gibi objeler oluşturamıyoruz. Referansları alt sınıflara direk referans olabilir. Somut
 // ve soyut sınıflar bir arada bulunur. ÖZellik eklenebilir. 
      
/**
 *
 * @author Ibrahim Ali Metin
 */
public abstract class Sekil {
    // Abstract olabilmesi için anahtar kelimeye ihtiyaç vardır. 
    
    private String isim;

    public Sekil(String isim) {
        this.isim = isim;
    }
    
    public void isminioku(){
        System.out.println("Bu obje " + isim + "objesidir.");
    }
    
    abstract void alanHesapla();
        // Gövdesi (soyut) bir method dur. Alt sınıflar bu methodu yazmak zorundadır.
        // Soyut method olarak yazılmasının sebebi daire ve kare için kendilerinin tanımlaması gerekiyor dedik. Alan hesaplamalar
        // iki şekilde farklıdır. 

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
     
}
