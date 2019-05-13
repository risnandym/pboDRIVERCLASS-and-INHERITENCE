public class Rekening{
	private String nama, alamat, tgllahir;
	private int norek;
	
	public void setNama(String nama){
		this.nama=nama;
	}
	public String getNama(){
		return this.nama;
	}
	public void setAlamat(String alamat){
		this.alamat=alamat;
	}
	public String getAlamat(){
		return this.alamat;
	}
	public void setTgllahir(String tgllahir){
		this.tgllahir=tgllahir;
	}
	public String getTgllahir(){
		return this.tgllahir;
	}
	public void setNorek(int norek){
		this.norek=norek;
	}
	public int getNorek(){
		return this.norek;
	}
}