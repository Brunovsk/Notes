package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.NotaFiscal;
 
public class Program {

	public static void main(String[] args) throws ParseException {
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyy");
	
	System.out.println("Digite o nome do cliente:");
	String nomeCliente = sc.nextLine();
	System.out.println("Digite o nome do cnpj:");
	long cnpj = sc.nextLong();
	System.out.println("Digite a data de cadastro");
	Date dataCadastro = sdf.parse(sc.next());
	boolean statusFaturado =false;
	boolean statusCancelado = false;
	//NotaFiscal nota = new NotaFiscal(nomeCliente,cnpj,dataCadastro,statusFaturado,statusCancelado);
	
	NotaFiscal nota = NotaFiscal.criarNota(nomeCliente,cnpj,dataCadastro,statusFaturado,statusCancelado);
	
	nota.faturar();
	System.out.println("A nota está futurada? "+ nota.isStatusFaturado());
	
	nota.cancelar();
	System.out.println("A nota está cancelada? " + nota.isStatusCancelado());
	
	System.out.println("Dias cadastrados: "+ nota.diasCadastrado());
	
	System.out.println();
	System.out.println(nota);
	
	
	
	
	sc.close();	
	}

	
}

