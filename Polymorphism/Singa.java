package Polymorphism;

public class Singa extends hewan {
	private String suara;
	private String berjalan;
	private String alatBernapas;
	
	public Singa(String suara, String berjalan, String alatBernapas){
		this.suara = suara;
		this.berjalan = berjalan;
		this.alatBernapas = alatBernapas;
	}
	
	public Singa(String nama, String jenis, String ciri, String suara, String berjalan, String alatBernapas){
		super(nama, jenis, ciri);
		this.suara = suara;
		this.berjalan = berjalan;
		this.alatBernapas = alatBernapas;
	}
	
	@Override
	public void infoHewan(){
		super.infoHewan();
		System.out.println(
				    "Suara hewan    : " + suara
				+ "\nCara berjalan  : " + berjalan
				+ "\nAlat Bernapas  : " + alatBernapas);
	}
}
