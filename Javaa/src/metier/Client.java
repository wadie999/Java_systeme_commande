package metier;


public class Client {
	
	protected int Id;
	protected String Name;
	protected String adresse;
	protected int Tel;
	public Client(int id, String name, String adresse, int tel) {
		
		Id = id;
		Name = name;
		this.adresse = adresse;
		Tel = tel;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getTel() {
		return Tel;
	}
	public void setTel(int tel) {
		Tel = tel;
	}
	
	
	

}
