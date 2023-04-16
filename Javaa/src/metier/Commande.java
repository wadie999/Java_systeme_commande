package metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Commande {
	protected Client C;
	protected int Id;
	protected Date date;
	protected String Type;
	protected int Payee;
	protected List<LigneCommande> lignes=new ArrayList<>();
	public Commande(Client c, int id, Date date, String type, int payee) {
		
		C = c;
		Id = id;
		this.date = date;
		Type = type;
		Payee = payee;
		
	}
	public Commande() {
		
	}
	public Client getC() {
		return C;
	}
	public void setC(Client c) {
		C = c;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public int getPayee() {
		return Payee;
	}
	public void setPayee(int payee) {
		Payee = payee;
	}
	public List<LigneCommande> getLignes() {
		return lignes;
	}
	public void setLignes(List<LigneCommande> lignes) {
		this.lignes = lignes;
	}
	
	public float CalculCommande(){
		float total=0;
		for(LigneCommande L:lignes) {
			total+=L.CalculProduit();
		}
		return total;
	}
	public void Ajouter_ligne(LigneCommande L) {
		lignes.add(L);
		
	}
	
	
	 
	
	 
	
	

}
