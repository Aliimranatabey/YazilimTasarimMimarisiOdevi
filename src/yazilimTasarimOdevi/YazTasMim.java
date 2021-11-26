package yazilimTasarimOdevi;

public class YazTasMim {
	

	class Kutuphane_Yonetim_Sistemi{
		String Adi;
		String Adres;

		public void RezervasyonKontrol(){
			System.out.println("Rezervasyon Bilgileri Listeleniyor");
		}
		public void KitapKonumKontrol(){
			System.out.println("Kitabýn kütüphanede mi yoksa kütühane üyelerinden birine ödünç verilip verilmediði kontrol ediliyor ve listeleniyor .");
		}
		
		}
	
	
	class Kitap {
		String ISBN;
		String baslik;
		String konu;
		String yazar;
		String yayin;
		int rafNo;

		public void BarkodOlustur(){}
		public void NushaOlustur(){}
		
	}
	
	
	class Raf {
		String rafNumarasi;

		public void rafNumarasinaGoreYerlestir(){}
		
	}
	
	
	class Uye_Bilgileri {
		String adi;
		String soyadi;
		int telefonNo;
		String mail;
		int uyeNo;
	}
	
	
	class Barkod_Okuyucu extends Uye_Bilgileri {
		public void uyeBilgileriGetir() { }
		public void kitapBilgileriGetir() { }
		public void taramaYap() { }
		public void uyeBilgileriListele() { }
		public void kitapBilgileriListele() { }

	}
	
	
	class Kutuphane_Karti { }
	
	
	class Kitap_Ogesi extends Kitap {
		String barkod;
		public void kitapBilgileriGetir() { }
		
	}
	
	
	class Kitap_Rezervasyon {
		public void kitapRezervasyonYap() { }
		
	}
	
	
	class Kitap_Islemleri {
		int kitap_MaxSinir = 5;
		int gun_MaxSýnýr = 10;

		public void kitapAl() { }
		public void kitapTeslimEt() { }
		
	}
	
	
	class Bildirim extends Uye_Bilgileri {
		
		public void uyeBilgileriGetir() { }
		public void maileGonder() { }
		public void telefonaGonder() { }
		
	}
	
	
	class Hesap {}
	class Kutuphane_Uyesi  { }
	class Kutuphane_Yoneticisi extends Hesap  { }

	class Odeme {}
	class Kredi_Karti extends Hesap { }
	class Nakit extends Hesap { }
	
	
	class Ceza() {
		public void gunAsimiKontrol(int toplamGun , int maxGun ) {
			int sonuc= toplamGun-maxGun;
			if(sonuc>=0) {
				System.out.println("KÝTABI ÝADE ETTÝÐÝNÝZ ÝÇÝN TEÞEKKÜRLER");
			}else{
				System.out.println("LÜTFEN BORCUNUZU ODEYÝNÝZ");
			}
		}
		public void cezaHesapla(int toplamGun , int maxGun, int gunBasinaBorc) { 
			int totalGun= toplamGun-maxGun;
			int borc=totalGun*gunBasinaBorc;
			System.out.println("BORCUNUZ :"+borc);
			
		}
		public void cezaTahsili() {}
	}
	
	class Kitap_Kontrol extends Katalog{
		public void katalogBilgileriGetir() {}
	}
	
	class Katalog implements Arama  {
		public void kitapBilgileriGetir() {}

		
		public void olmayanKitaplariListele() {
			
			
		}

		
		public void kitapDurumBilgisiKontrol() {
			
			
		}
		
	}
	 
	
	public interface Arama {
		public void olmayanKitaplariListele() ;
		public void kitapDurumBilgisiKontrol() ;
	
	
	
	public void main(String[] args) {
		Kutuphane_Yonetim_Sistemi kutuphane_Yonetim_Sistemi = new Kutuphane_Yonetim_Sistemi();
		Kitap kitap = new Kitap();
		Raf raf = new Raf(); 
		Uye_Bilgileri uye_Bilgileri = new Uye_Bilgileri();
		Barkod_Okuyucu barkod_Okuyucu= new Barkod_Okuyucu(); 
		Kutuphane_Karti kutuphane_Karti = new Kutuphane_Karti(); 
		Kitap_Ogesi kitap_Ogesi = new Kitap_Ogesi(); 
		Kitap_Rezervasyon kitap_Rezervasyon=new Kitap_Rezervasyon();
		Kitap_Islemleri kitap_Islemleri = new Kitap_Islemleri();
		Bildirim bildirim = new Bildirim(); 
		Hesap hesap = new Hesap(); 
		Kutuphane_Uyesi kutuphane_Uyesi = new Kutuphane_Uyesi(); 
		Kutuphane_Yoneticisi kutuphane_Yoneticisi = new Kutuphane_Yoneticisi(); 
		Odeme odeme = new Odeme(); 
		Kredi_Karti kredi_Karti = new Kredi_Karti(); 
		Nakit nakit = new Nakit(); 
		Ceza ceza = new Ceza(); 
		Katalog katalog = new Katalog(); 
		Kitap_Kontrol kitap_Kontrol = new Kitap_Kontrol(); 

	}
}