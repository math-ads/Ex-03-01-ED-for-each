package controller;

public class ContaNumeroController {

	public ContaNumeroController() {
		super();}
	
	public int contaNum(String num) {
		int quantidade=0;
		   String[]vetorDigitos = num.split("");
		   for( String digitos: vetorDigitos ) {
			    quantidade = quantidade + 1;
			   System.out.println("digito "+ quantidade + " = " +digitos);
			   ;
		   }
		 return(quantidade);
	}
	}
	
