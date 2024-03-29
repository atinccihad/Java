<h5 align="center"><img src="https://upload.wikimedia.org/wikipedia/tr/2/2e/Java_Logo.svg"/></h5>                                                                       
<h3>Java (programlama dili)</h3><br>
Java, Sun Microsystems mühendislerinden James Gosling tarafından geliştirilmeye başlanmış açık kaynak kodlu, nesneye yönelik, platform bağımsız, yüksek verimli, çok işlevli, yüksek seviye, hem yorumlanan hem de derlenen bir dildir.<br>
Java, Sun Microsystems'den James Gosling tarafından geliştirilen bir programlama dilidir ve 1995 yılında Sun Microsystems'in çekirdek bileşeni olarak piyasaya sürülmüştür. <br>Bu dil C ve C++'dan birçok sözdizim türetmesine rağmen bu türevler daha basit nesne modeli ve daha az düşük seviye olanaklar içerir. Java uygulamaları bilgisayar mimarisine bağlı olmadan herhangi bir Java Sanal Makinesi (Java Virtual Machine - JVM) üzerinde çalışabilen tipik bytecode'dur (sınıf dosyası).<br>
Java'nın sık kullanılan sloganlarından biri olan, çevirisi "bir defa yaz, her yerde çalıştır" olan "write once, run anywhere - WORA",[3] Java'nın; derlenmiş Java kodunun, Java'yı destekleyen bütün platformlarda tekrar derlenmeye ihtiyacı olmadan çalışabileceğini ima eder.[4] 2016 yılında bildirilen 9 milyon geliştiricisi ile, özellikle istemci sunucu web uygulamaları için olmak üzere, kullanımda olan en popüler programlama dillerinden birisidir.<br>
Java ilk çıktığında daha çok küçük cihazlarda kullanılmak için tasarlanmış ortak bir düzlem dili olarak düşünülmüştü. Ancak düzlem bağımsızlığı özelliği ve tekbiçim kütüphane desteği C ve C++'tan çok daha üstün ve güvenli bir yazılım geliştirme ve işletme ortamı sunduğundan, hemen her yerde kullanılmaya başlanmıştır. Özellikle kurumsal alanda ve mobil cihazlarda son derece popüler olan Java özellikle J2SE 1.4 ve 5 sürümü ile masaüstü uygulamalarda da yaygınlaşmaya başlamıştır.<br>
Java'nın ilk sürümü olan Java 1.0 (1995) Java Platform 1 olarak adlandırıldı ve tasarlama amacına uygun olarak küçük boyutlu ve kısıtlı özelliklere sahipti.<br> 
Daha sonra düzlemin gücü gözlendi ve tasarımında büyük değişiklikler ve eklemeler yapıldı. Bu büyük değişikliklerden dolayı geliştirilen yeni düzleme Java Platform 2 adı verildi ama sürüm numarası 2 yapılmadı, 1.2 olarak devam etti. 2004 sonbaharında çıkan Java 5, geçmiş 1.2, 1.3 ve 1.4 sürümlerinin ardından en çok gelişme ve değişikliği barındıran sürüm oldu. Java SE 8 ise Java teknolojisinin günümüz sürümüdür. 13 Kasım 2006'da Java düzlemi GPL ruhsatıyla açık kodlu hale gelmiştir.<br>
<h5>Çalışma mantığı</h5>
Bir Java yazılımı şu şekilde geliştirilir;<br>
•	Yazılımcı Java kodunu yazar.<br>
•	Bu kod bir Java derleyicisi ile derlenir. Derleme sonucunda "bytecode" adı verilen bir tür sanal makine kodu ortaya çıkar. Platform bağımsızlığını sağlayan bytecode'dur.<br> Çünkü bir kere bytecode oluştuktan sonra yazılım, sanal makine içeren tüm işletim sistemlerinde çalışabilmektedir.
•	Bu bytecode Java Sanal Makinesi (Java Virtual Machine - JVM) tarafından işletilir. Bu aşama, her bir bytecode komutunun teker teker yorumlanması ile icra edilebileceği gibi, anında derleme (Just-in-time compilation - JIT) kullanılarak da gerçekleştirilebilir.<br>
<h5>Bazı kavramlar</h5>
<h6>Nesneye yönelik yazılımlama mantığı</h6>
<h6>Anında Derleme</h6>
<p>Java ilk çıktığında bytecode işletme hızı çok iyi değildi. Yerine göre sistemin öz yazılımlarından 5-10 kat yavaş çalışıyordu. Bu nedenle bazı yazılım geliştirme şirketleri JIT yani "Just-in-time compilation", "anında derleme" araçları üretmeye başladılar. Yapılan şey bytecode'u sanal makinenin kurulu olduğu gerçek sistemin diline anında derleme yaparak dönüştürmesiydi. Bu sayede verimde ciddi artışlar sağlandı. Ama 2000 yılından sonra geliştirilen sanal makinelerde (HotSpot gibi) JIT'in işlevi VM içinde yer almaya başlamış, işlemci hızı ve bellek miktarının dramatik biçimde artması ile dış JIT yazılımları popülerliğini kaybetmiştir. Bugün hâlen birkaç ürün (Excelsior JET gibi) pazarda bulunsa da genellikle bu yöndeki ihtiyaç azalmıştır.</p>
<h5>Java API</h5>
Java API, Java yazılımlarında kullanılan yazılım kütüphanelerine genel olarak verilen isimdir. Java API ile disk, grafik, ağ, veri tabanı, güvenlik gibi yüzlerce konuda kullanıcılara erişim imkânı sunulur. Java API J2SDK'nın bir parçasıdır.<br>
<h5>Atık Veri Toplayıcı</h5>
Atık veri toplama teknolojisi (Garbage Collection) Java'dan önce de var olan ama Java ile adını duyurmuş ve yaygın olarak kullanılmaya başlanmış bir kavramdır. C++, C gibi dillerin en büyük engellerinden birisi dinamik bellek yönetimidir. Yazılımda gösterici (işaretçi - pointer) kullanarak dinamik olarak bellek ayırdıktan sonra o bellek ile işiniz bittiğinde mutlaka ayrılan belleği bellek yöneticiye özel altyordamlar yardımıyla (delete, free...) iade etmeniz gerekir. Yoksa bellek sızıntısı (memory leak) oluşur ve bu bir süre sonra yazılımın ve işletim sisteminin beklenenden farklı davranmasına yol açabilir. Sızıntıların saptanması oldukça güçtür ve bulunması zor hatalara yol açar.<br> Bu nedenle bugünün tüm büyük C ve C++ yazılımları az da olsa bellek sızıntısı içerir (işletim sistemleri dahil).<br>
Atık veri toplayıcı sayesinde Java'da bir nesne oluşturulduktan sonra o nesne ile işiniz bittiğinde hiçbir şey yapmanız gerekmez: Sanal makine akıllı bir biçimde kullanılmayan bellek bölümlerini belirli aralıklarla ya da uyarlamalı yöntemlerle otomatik olarak temizler ve sisteme iade eder. Bu işleme çöp toplama (atık toplama - garbage collection) adı verilir. Çöp toplama sistemlerinin yapısı oldukça karmaşıktır ve geçen yıllar içinde büyük gelişmeler kaydedilmiştir. Çöp toplayıcının varlığı Java'da bellek sızıntısı olmayacağı anlamına gelmez, ama bellek sızıntıları daha ender olarak ve farklı şekillerde karşınıza çıkar ve genellikle tedavi edilmesi daha kolaydır.<br>
<h4>Jar</h4>
Jar (Java Arşivi - Java Archive), aslında bir tür sıkıştırma formatıdır. Jar ile derlenen Java kodları ile oluşan yazılımın paketlenip taşınması kolay bir hale getirilir. Jar dosyaları temelde bytecode blokları içerir. Jar dosyaları genellikle kütüphane oluşturmada ya da uygun biçimde hazırlanırsa işletim sisteminden doğrudan çalıştırılabilecek bir şekilde kullanılabilir (çalıştırılabilir jar - executable jar). Jar dosyalarının içeriğini sıkışıtırma yazılımları ya da java yazılım geliştirme araçları ile inceleyebilirsiniz. Java 1.5 ile yeni bir tür jar oluşturma metodu da kullanıma girdi. Pack200 adı verilen hiper-sıkıştırma (hyper-compression) algoritması ile jar dosyaları daha küçük boyutlara indirgenebiliyor. Ancak bu teknoloji daha çok ağ üzerinden yapılan transferlerde kullanılıyor. Daha fazla ayrıntı için: buraya bakınız 24 Ocak 2012 tarihinde Wayback Machine sitesinde arşivlendi.
<h4>AWT ve Swing</h4>
AWT, ilk Java ile birlikte geliştirilen temel grafik arayüz oluşturma kütüphanesine verilen isimdir. AWT işletim sisteminin doğal grafik yapılarına erişimi sağlar. Ancak Java 2 platformu ile birlikte AWT yetersiz görülmüş ve çok daha geniş ve gelişmiş özelliklere sahip Swing kütüphanesi sisteme eklenmiştir. Özellikle çok platform destekleyen yazılımlarda kullanıcı arayüzü geliştirme aracı olarak swing hâlen önemini korumaktadır. Swing önceleri işletim sisteminin kullandığı donanım grafik hızlandırma araçlarını kullanmadığından yavaşlığı ile eleştirilere hedef olmuştu. Özellikle Java 1.4 ile Swing, hem genel olarak sanal makinenin hızlanması ve kısmen donanım hızlandırmayı kullanması ile bu kötü şöhretinden sıyrılmaya başladı. AWT hâlen Swing'in bir alt katmanında, temel iki boyutlu grafik işlemlerinde kullanılmaya devam ediyor.<br>
<h4>SWT</h4>
SWT Swing'e bir alternatif olarak IBM tarafından geliştirilen bir gösterim sistemidir. Swing'den en büyük farkı çalıştığı işletim sisteminin grafik kütüphanesi ve komutlarını kullanmasıdır. Bu nedenle SWT uygulamaları Swing'e göre çoğu yerde daha hızlı ve işletim sistemindeki diğer uygulamaları andıran bir şekilde çalışmasını sağlar. Swing'in Java 1.5 ile performans açığını kapattığı iddia edilse de SWT'nin de artık Java camiasında kabul görmüş bir sistem olduğu açıktır. SWT'nin dezavantajı ise Java'nin bir parçası olmamasıdır. Yani SWT uygulamaları SWT kütüphanesi ile birlikte dağıtılmaktadır. Ayrıca SWT farklı işletim sistemlerinde farklı olgunluk ve performansta işlemektedir ve özellikle Windows dışı sistemlerde henüz yeterince olgunlaşamamıştır. En bilinen SWT uygulamaları, ünlü Java yazılım geliştirme aracı (IDE) Eclipse ve BitTorrent uygulaması Azureus'tur.<br>
<h4>HotSpot Teknolojisi</h4>
Sun Microsystems tarafından geliştirilen Java sanal makinesi, HotSpot adı verilen özel bir teknolojiyi içinde barındırır. HotSpot, yani "sıcak nokta", bir yazılımda sürekli olarak tekrarlanan ve üzerinden geçilen kod bölümlerine verilen bir isimdir. HotSpot sanal makinesi şu anda iki ayrı modda sanal makinenin çalışmasını sağlamaktadır: İstemci (Client) ve Sunucu (Server) modları. İstemci modunda bytecode büyük ölçüde daha başlangıçta JIT ile sistemin öz makine koduna dönüştürülerek işletilir ama çalışma anında daha fazla iyileştirme işlemi gerçekleştirilmez. Bir uygulamanın hızı istemci modunda zaman içinde bu nedenle değişmez. Sunucu modunda ise sanal makine başlangıçta bytecode'unu sistemin öz koduna dönüştürmekte acele etmez. Bu nedenle sunucu modu başlangıçta istemci modundan oldukça yavaştır. Yazılım çalışmaya devam ettikçe sanal makine yazılımdaki sıcak noktaları tespit edip bytecode'u sadece JIT ile makine koduna dönüştürmekle kalmaz, ayrıca oldukça yoğun bir iyileştirmeye de tabi tutar. Sonuçta sunucu modunda uygulamalar zaman içinde hızlanır, uzun soluklu uygulamaların bu nedenle sunucu modunda işletilmesi önerilir. Mustang kod adlı Java SE 6'da istemci modunda da benzeri bir teknolojinin kullanılması bekleniyor. Dolphin kod adlı Java SE 7'de ise bu iki mod arasındaki fark azalacağından sistemin tek modda çalışması bekleniyor.<br>
<h5>Uygulamacık</h5>
Uygulamacık (applet 12 Nisan 2011 tarihinde Wayback Machine sitesinde arşivlendi.), uzaktaki sistem üzerinden indirilip internet tarayıcı üzerinde çalıştırılabilen Java uygulamalarına verilen isimdir. Java'nın son kullanıcılar tarafından tanınması uygulamacık sayesinde olmuştur dersek yanlış olmaz. Uygulamacıklar sisteme zarar veremeyecek bir şekilde tasarlanmıştır. İçerisinde uygulamacık olan bir sayfayı açmaya çalıştığınızda tarayıcınız otomatik olarak Java sanal makinesini çalıştırıp ekranın uygulamacığa ayrılan bölümünde uygulamanın çalışmasını sağlar.<br>
Fakat, son yıllarda birçok Java programcısı Uygulamacıklar üzerinden gözünü çekmiştir. Artık HTML, CSS ve JavaScript sayesinde çok daha hızlı, pratik, güvenli ve kusursuz uygulamalar/web hizmetleri yapılabiliyor olması bunun en önemli sebebidir.<br>
<h5>WebStart</h5>
WebStart teknolojisi uygulama kurulum, güncelleme ve silme dertlerine deva olmak üzere tasarlanmış bir sistemdir. WebStart teknolojisi kısaca yazılımların uzaktan yerel sisteme güvenli olarak kurulmasını ve korumalı bir alanda çalıştırılmasını sağlar. Applet'lerin bir sonraki adımı olarak görülebilir. Bir WebStart uygulamasını kurmak için internet üzerindeki özel bir bağlantıya tıklamak yeterlidir. Sistem otomatik olarak WebStart sistemini çalıştırıp yazılımı Java cep belleğine indirir. İstenirse masaüstüne kısayol koymasını da sağlar. Daha sonra sistem çevrimiçi (online) ya da çevrimdışı (offline) olarak çalıştırılabilir ve uzaktaki yazılım güncellendiğinde otomatik olarak -istenirse- yerel makinedeki yazılımın da güncellenmesi sağlanabilir. Kullanıcının özel olarak izin vermesi halinde uygulama yerel sisteme erişim hakkı kazanabilir. Aksi takdirde WebStart uygulamaları sisteme yazma işlemi gerçekleştiremezler.<br>
Bu Java teknolojisi de, günümüzdeki programcıların takibinde değildir.<br> 

<h5>Java yazımı (Sözdizimi)</h5>
Sınıf temelli nesneye yönelik bir dil olan Java, yazım olarak C++ ile benzerlikler arz eder. Java'nın yanında C#, Perl, JavaScript gibi diller de aynı dil ailesine aittir. "{}" şeklinde süslü parantezler içerisindeki bloklar, ++ arttırma ve — azaltma işleçleri bu dilin belirgin özelliklerindendir.<br>
Hello World!<br>
 // HelloWorld.java<br>
 public class HelloWorld{<br>
     public static void main(String[] args) {<br>
         System.out.println("Hello World!");<br>
     }<br>
 }<br>
•	"Hello World.java" ile "public class Hello World" bu kısımda iki isim aynı olmalıdır aksi takdirde uygulama çalıştırılamaz.<br>
•	class: Sınıf tanımlayabilmek için class ön eki şarttır.<br>
•	public: Sınıfın dışarıdan erişebilir olduğu,<br>
•	static: Sınıf tarafından paylaşıldığı,<br>
•	void: Bir değer döndürmediği anlamına gelir.<br>
•	Public ve Static'e erişim belirleyicisi (access specifier) de denir.<br>
•	Void'e dönüş tipi (return type) de denir.<br>
•	String args[]: Parantezin içinde yöntemin aldığı parametreleri belirleriz. "String" sınıf adı, "args" da parametre adıdır. "[]" ise args'ın bir dizi (array) olduğunu belirtiyor.<br>
•	"System.out.println();" ile yazımızı yazdırıyoruz ve yeni satıra geçmesini sağlıyoruz.<br>
•	Yazımızı "System.out.print("Hello World!");" ile de yazdırabilirdik. Fakat imleç yeni satıra geçmezdi.<br>
•	Java Türkçe karakterleri (C# gibi) "değişken adlarında, sınıf adlarında" da kullanmamıza imkân tanır.<br>
Java'da yazdığımız yazılımları derlememiz için öncelikle sınıf adı ile aynı adı taşıyan dosya ismine sahip olmamız gerekmektedir. Yukarıdaki örnek yazılımı sınıf ismi olan "HelloWorld" ifadesini kullanıp uzantısı ile beraber "HelloWorld.java" ismi ile kaydedebiliriz. J2SDK veya benzer bir Java geliştirme ortamı kurulu sistemimizde yazılan uygulama aşağıdaki şekilde derlenebilir.<br>
javac -encoding UTF-8 HelloWorld.java<br>
javac, yazılan programı derleyerek ".class" uzantılı bir dosya üretir. ".class" sınıf dosyaları JVM'de çalışabilecek bytecode'lar içeren sınıf dosyalarıdır. Örnek uygulamayı çalıştırmak için:<br>
java HelloWorld<br>
yazabiliriz.<br>Java komutu öncelikle sınıf yolunda "HelloWorld" sınıfını arayacaktır.
<br>Bulduğu takdirde "HelloWorld" sınıfında "main" metodunu arayacaktır.
Eğer metot bulunur ise bu metot icra edilecektir.<br>
<h5>Kapsamlı örnek</h5>

package TekCift;<br>
import javax.swing.JOptionPane;<br>
public class TekCift {
	/**
	 * Tam sayı (int ingilizce de integer’ın kısaltmasıdır)
	 */
	private int kullanicininGirdigi;
	/**
	 * Bu yapıcı fonksiyondur. TekCift objesi yaratılırken çağrılır.
	 */
	public TekCift() {
	}

	/**
	 * Aşağıdaki ana fonksiyondur. Java yorumlayıcısı programı çalıştırmak için
	 * ilk bu fonksiyonu çağırır.
	 * 
	 * @param argumanlar
	 *            Komut satırı argümanları (kullanılmıyor)
	 */
	public static void main(final String[] argumanlar) {
		TekCift obje = new TekCift();
		obje.pencereGoster();
	}

	/**
	 * Aşağıdaki fonksiyon "Sayı giriniz" diyaloğunu gösterir
	 */
	public void pencereGoster() {
		try {
			kullanicininGirdigi = Integer.parseInt(JOptionPane.showInputDialog("Lütfen bir sayı giriniz."));
			hesapla();
		} catch (final NumberFormatException e) {
			System.err.println("HATA: Geçersiz bir değer girdiniz. Lütfen sayısal bir değer giriniz.");
		}
	}

	 /**
	 * Aşağıdaki fonksiyon kullanıcının girdiği değere göre çift ya da tek
	 * penceresi gösterir.
	 */
	private void hesapla() {
		if ((kullanicininGirdigi % 2) == 0) {
			JOptionPane.showMessageDialog(null, "Çift");
		} else {
			JOptionPane.showMessageDialog(null, "Tek");
		}
	}

•	package anahtar kelimesi dosyanın başında paket belirtmek için kullanılır.<br>
•	kullanıcı arayüzü gösterebilmek içın javax.swing.JOptionPane kütüphanesine ihtiyacımız var. Dosyanın başındaki import cümlesi tam bu işe yarar.<br>
•	TekCift sınıfı kullanıcının girdiği bir tam sayıyı hafızasında tutmak için kullanıcının girdiği değişkenini tanımlıyor. Diğer sınıfların bu değişkeni görmemesi için private (özel) anahtar kelimesini kullanılıyoruz.<br>
