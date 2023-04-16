package metier;



public class LigneCommande {
	protected Produit P;
	protected Commande C;
	protected float QteCommandee;
	protected int Reduction;
	public LigneCommande(Produit p, Commande c, int qteCommandee, int reduction) {
		
		P = p;
		C = c;
		QteCommandee = qteCommandee;
		Reduction = reduction;
	}
	public LigneCommande() {
		
	}
	public Produit getP() {
		return P;
	}
	public void setP(Produit p) {
		P = p;
	}
	public Commande getC() {
		return C;
	}
	public void setC(Commande c) {
		C = c;
	}
	public float getQteCommandee() {
		return QteCommandee;
	}
	public void setQteCommandee(int qteCommandee) {
		QteCommandee = qteCommandee;
	}
	public int getReduction() {
		return Reduction;
	}
	public void setReduction(int reduction) {
		Reduction = reduction;
	}
	
	public float CalculProduit(){
		
		return QteCommandee*(P.getPrixUnit())*(1-Reduction/100);
	}
	
	

}
