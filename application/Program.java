package application;

import java.util.Date;
import java.util.Scanner;

import entities.NotaFiscal;

public class Program {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o nome do cliente:");
	String nomeCliente = sc.nextLine();
	System.out.println("Digite o nome do cnpj:");
	long cnpj = sc.nextLong();
	Date dataCadastro = new Date();
	boolean statusFaturado =false;
	boolean statusCancelado = false;
	NotaFiscal nota = new NotaFiscal(nomeCliente,cnpj,dataCadastro,statusFaturado,statusCancelado);
	
	nota.faturar();
	System.out.println("A nota está futurada? "+ nota.isStatusFaturado());
	
	nota.cancelar();
	System.out.println("A nota está cancelada? " + nota.isStatusCancelado());
	
	System.out.println();
	System.out.println(nota);
	
	
	
	
	sc.close();	
	}

	
}

