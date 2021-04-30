package Polymorphism;

public class Lebah extends hewan {
	private String suara;
	private String berjalan;
	
	public Lebah(String suara, String berjalan){
		this.suara = suara;
		this.berjalan = berjalan;
	}
	
	public Lebah(String jenis, String ciri, String suara, String berjalan){
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
