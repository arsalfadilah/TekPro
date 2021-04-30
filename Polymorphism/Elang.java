package Polymorphism;

public class Elang extends hewan {
	private String suara;
	private String berjalan;
	
	public Elang(String suara, String berjalan){
		this.suara = suara;
		this.berjalan = berjalan;
	}
	
	public Elang(String jenis, String ciri, String suara, String berjalan){
		super(jenis, ciri);
		this.suara = suara;
		this.berjalan = berjalan;
	}
	
	@Override
	public void infoHewan(){
		super.infoHewan();
		System.out.println("Suara hewan : " + suara
				+ "\nCara berjalan : " + berjalan);
	}
}
