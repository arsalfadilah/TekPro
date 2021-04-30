package Polymorphism;

public class hewan {
		protected String jenis;
		protected String ciri;
		
		public hewan(){
			
		}
		
		public hewan(String jenis, String ciri){
			this.jenis = jenis;
			this.ciri = ciri;
		}
		
		public void infoHewan(){
			System.out.println("Jenis Hewan : " + jenis);
			System.out.println("Ciri Hewan : " +ciri);
		}
}
