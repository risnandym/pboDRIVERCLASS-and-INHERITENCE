public class MainATM{
	public static void main(String[]args){
		ATM a=new ATM();
		a.setNoAtm("4097 6625 0165 4308");
		a.setTglBuat("16 Maret 2018");
		a.setTglAktif("19 Maret 2018");
		a.setPassword("atulala123");
		
		Rekening r=new Rekening();
		r.setNama("Zafiratul Amalia");
		r.setAlamat("Bandung");
		r.setTgllahir("16 Desember 1997");
		r.setNorek(14635);
		
		System.out.println("Info Rekening");
		System.out.println("================================");
		System.out.println("  Nama: "+r.getNama());
		System.out.println("  Alamat: "+r.getAlamat());
		System.out.println("  Tanggal Lahir: "+r.getTgllahir());
		System.out.println("  No Rekening: "+r.getNorek());
		System.out.println("");
		System.out.println("Info ATM");
		System.out.println("=================================");
		System.out.println("  No ATM: "+a.getNoAtm());
		System.out.println("  Tanggal Buat: "+a.getTglBuat());
		System.out.println("  Tanggal Aktif: "+a.getTglAktif());
		System.out.println("  Password: "+a.getPassword());
	}
}