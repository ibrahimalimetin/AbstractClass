/**
 *
 * @author Ibrahim Ali Metin
 */
public class Main {
    public static void main(String[] args) {
        //Alt sınıflar methodları kendine göre yazmak zorunda ise biz methodları abstract olarak yazıyoruz
        Sekil sekil;
        
        sekil = new Kare("Kare2", 7); // Abstract sınıfında bir referans ürettik alt sınıflara direk referans oldu, interface de bu şekilde idi. 
                
        Kare kare1 = new Kare("Kare1", 2);
        Daire daire1 = new Daire("Daire1", 9);
        
        kare1.alanHesapla();
        sekil.alanHesapla();
        daire1.alanHesapla();
        kare1.cevreHesapla();
    }
}
