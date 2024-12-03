package tp_excp;

public class Factorielle {
	public static void main (String[] args) throws SaisieNbException { 
	 int i, nbEntiers=0, factorielle=1; 
	 int ancien; 
	 try {
		nbEntiers= Integer.parseInt(args[0]);
		if(nbEntiers<0) {
			throw new SaisieNbException();
		}else if(nbEntiers>20) {
			throw new SaisieSupException();
		}
	} catch (NumberFormatException e) {
		System.out.println("Donnez en paramètre la base de la factorielle : "+e.getMessage());
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("La base de la factorielle doit être ENTIERE"+e.getMessage());
	}catch(SaisieNbException n) {
		System.out.println("la factorielle d'un nombre négatif n'est pas définie");
	}catch(SaisieSupException n) {
		System.out.println("le factorielle est supérieur à 20 ");
	}
	 for (i=2;i<= nbEntiers;i++) 
	 { 
	 ancien=factorielle; 
	 factorielle *= i; 
	 } 
	 System.out.println(" Voila la factorielle des "+ nbEntiers +  " premiers entiers : "+ factorielle );  }


}
