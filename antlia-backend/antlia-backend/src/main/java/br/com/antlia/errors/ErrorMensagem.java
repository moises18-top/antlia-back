package br.com.antlia.errors;

public class ErrorMensagem extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mensagem;
	
	public ErrorMensagem(String msg) {
		this.mensagem = msg;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	
}
