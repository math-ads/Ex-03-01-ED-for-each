 package view;

import javax.swing.JOptionPane;

import controller.ContaNumeroController;

public class Principal {

	public static void main(String[] args) {
		int num;
		do {
		num = Integer.parseInt(JOptionPane.showInputDialog("insira numero"));
		}while (num<10||num>9999);
		ContaNumeroController contNum= new ContaNumeroController();
		String numero= Integer.toString(num);
		int resp = contNum.contaNum(numero);
		System.out.println("A quantidade de digitos é " + resp);
	}
	
}
