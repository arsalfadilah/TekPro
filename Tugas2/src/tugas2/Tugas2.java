package tugas2;

/**
 * Tugas Relationship is-a
 * @author Kazuno
 *
 */

class SAO{
	private String nickname;
	private int level;
	private String job;
	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void tampilData(){
		System.out.println("===== SAO =====");
		System.out.println("Nickname : " + nickname);
		System.out.println("Level    : " + level);
		System.out.println("Job      : " + job);
		System.out.println();
	}
}

class ML{
	private String nickname;
	private String role ;
	
	public String getNickname(){
		return nickname;
	}
	
	public void setNickname( String newNickname ){
		nickname = newNickname;
	}
	
	public String getRole(){
		return role;
	}
	
	public void setRole( String newRole ){
		role = newRole;
	}
	
	public void tampilData(){
		System.out.println("===== ML =====");
		System.out.println("Nickname : "+nickname);
		System.out.println("Role     : "+role);
		System.out.println();
	}
}

public class Tugas2 {
	
	public static void main(String[]args){
		
		SAO kirito = new SAO();
		ML kazuno = new ML();
		
		kirito.setNickname("Kirito");
		kirito.setLevel(99);
		kirito.setJob("Dual Sword");
		kirito.tampilData();
		
		kazuno.setNickname("Kazuno");
		kazuno.setRole("Offlancer");
		kazuno.tampilData();
	}
}

