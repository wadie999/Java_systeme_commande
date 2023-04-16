package metier;

public class Produit {
	protected int  Id;
	protected String designation;
	protected int prixUnit;
	protected int QteStock;
	public Produit(int id, String designation, int prixUnit, int qteStock) {
		
		Id = id;
		this.designation = designation;
		this.prixUnit = prixUnit;
		QteStock = qteStock;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getPrixUnit() {
		return prixUnit;
	}
	public void setPrixUnit(int prixUnit) {
		this.prixUnit = prixUnit;
	}
	public int getQteStock() {
		return QteStock;
	}
	public void setQteStock(int qteStock) {
		QteStock = qteStock;
	}
	public Produit() {
		
	}
	
	
	

}
