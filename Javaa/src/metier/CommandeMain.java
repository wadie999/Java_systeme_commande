package metier;

import java.util.Date;
import java.util.Scanner;


public class CommandeMain {

	
	   

	public static void main(String[] args) {
		  
		   Date d=new Date(); 
		   
		   
		Client c1=new Client(1,"Hajar","Rabat",10);
		
		Commande C= new Commande(c1,1,d,"Express",1);
		
		
		System.out.println("Saisair Le Produit:");
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter la Designation : ");
		String des=scanner.nextLine();
		
		
		
		
		Produit P=new Produit(1,des,200,200);
	
		System.out.println("Enter la Quantite Commandee : ");
		int quantite=scanner.nextInt();
		
		LigneCommande L=new LigneCommande(P,C,quantite,5);
		C.Ajouter_ligne(L);
		System.out.println("Bon de commande: "+C.Id);
		
		System.out.println("Date:"+C.getDate() );
		System.out.println("Client :" +c1.Name);
		System.out.println("Articles ");
		System.out.println("Designation : " +L.getP().designation);
		System.out.println("Qte : "+L.QteCommandee);
		System.out.println("Prix Unitaire: " +L.getP().prixUnit);
		System.out.println("Reduction : " +L.getReduction());
		System.out.println("Total  : " +L.CalculProduit());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
