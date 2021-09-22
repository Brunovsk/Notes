package entities;



import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NotaFiscal {
	private String nomeCliente;
	private long cnpj;
	private Date dataCadastro;
	private boolean statusFaturado = false;
	private boolean statusCancelado = false;
	
	public NotaFiscal(){
		
	}
	
	public NotaFiscal(String nomeCliente, long cnpj, Date dataCadastro, boolean statusFaturado,
			boolean statusCancelado) {
		this.nomeCliente = nomeCliente;
		this.cnpj = cnpj;
		this.dataCadastro = dataCadastro;
		this.statusFaturado = statusFaturado;
		this.statusCancelado = statusCancelado;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}


	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}


	public long getCnpj() {
		return cnpj;
	}


	public void setCnpj(long cnpj) {
		this.cnpj = cnpj;
	}


	public Date getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(Date dataCdastro) {
		this.dataCadastro = dataCdastro;
	}


	public boolean isStatusFaturado() {
		return statusFaturado;
	}


	public void setStatusFaturado(boolean statusFaturado) {
		this.statusFaturado = statusFaturado;
	}


	public boolean isStatusCancelado() {
		return statusCancelado;
	}


	public void setStatusCancelado(boolean statusCancelado) {
		this.statusCancelado = statusCancelado;
	}
	
	public void faturar() {
		statusFaturado = true;
	}
	public void cancelar() {
		statusCancelado = true;
	}
	
	public String toString() {
		return "DADOS DA NOTA:\n"
				+ "NOME DO CLIENTE: "+ getNomeCliente()+"\n"
				+"CNPJ: "+getCnpj()+"\n"
				+"DIAS CADASTRADO: "+diasCadastrado()+"\n"
				+"STATUS FATURADO: "+isStatusFaturado()+"\n"
				+"STATUS CANCELADO: "+isStatusCancelado()+"\n";
	}
	
	public long diasCadastrado() {
		Date dataHj = new Date();
		long diff = dataHj.getTime() - dataCadastro.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	public static NotaFiscal criarNota(String nomeCliente, long cnpj,Date dataCadastro, boolean statusFaturado, boolean statusCancelado) {
		NotaFiscal nota = new NotaFiscal();
		nota.nomeCliente = nomeCliente;
		nota.cnpj = cnpj;
		nota.dataCadastro = dataCadastro;
		nota.statusFaturado = statusFaturado;
		nota.statusCancelado= statusCancelado;
		return nota;
		
	}
	
	
	
}

