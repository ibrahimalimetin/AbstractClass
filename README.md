# AbstractClass
Java - AbstractClass

Java Abstraction

Abstraction yapısı kurularak kullanıcıya yapılacak işlemin fonksiyonelliği sunulur. 
Bu şekilde kullanıcı kullandığı metodun ne yaptığıyla ilgilenirken, nasıl yaptığıyla ilgilenmez. Bu durumda fonksiyonellik ön plana
çıkarken, işin nasıl yapıldığı gizlenir. Yani kullanıcı bir arabayı çalıştırır, o arabanın ilk tetiklemeden sonra hangi aşamalardan
geçtiği, arka tarafta neler olduğu konularıyla ilgilenmez.

Java’da Abstraction interface (arayüz) ve abstract class (soyut sınıf) yapıları ile sağlanır. Abstract sınıflarla yapılan
tanımlamalara ve kullanım durumuna göre soyutlama oranı fark yaratırken, Interface ler kullanılarak %100 soyutlama sağlanır.

Abstract Class Teknik Özellikleri


* Java’da Abstract sınıflar “abstract class” anahtar kelimeleri ile oluşturulur.

* Java’da bir sınıf abstract olarak tanımlandıysa, abstract bir metot içerir veya içermez.

* Java’da bir sınıf içerisinde abstract metot varsa o sınıf abstract sınıf olmak zorundadır.

* Java’da tanımlanan abstract metotların gövdeleri olamaz (Gövdeden kasıt içinde işlem yapacak kodlar olmak zorundadır).

* Java’da tanımlanan abstract sınıfların içerisindeki abstract olmayan metotların gövdeleri olmalıdır.

* Java’da tanımlanan bir sınıf abstract bir sınıf tarafından genişletilirse (extend edilirse) abstract sınıfın tüm abstract 
metotlarını implement etmek yani kendi bünyesinde bu metotlara gövde oluşturmak zorundadır. Eğer bu metotlara sınıf içerisinde 
gövde yazılmayacaksa tanımlanan sınıfın yapısı abstract class olarak tanımlanmalıdır.
