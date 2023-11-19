package me.dio.desafio_iphone;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, Navegador {

	private final String cor;
	private final String modelo;

	public IPhone(String cor, String modelo) {
		super();
		this.cor = cor;
		this.modelo = modelo;
	}

	@Override
	public void tocar() {
		System.out.println("Reproduzindo m�sica...");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando m�sica...");
	}

	@Override
	public void escolherMusica() {
		System.out.println("Escolhendo m�sica...");
	}

	@Override
	public void ligar(String numero) {
		System.out.println(String.format("Ligando para o n�mero: [%s].", numero));
	}

	@Override
	public void atender() {
		System.out.println("Recebendo liga��o...");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando novo correio de voz...");
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo p�gina web...");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Abrindo nova aba...");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando p�gina web...");
	}

	public String getCor() {
		return cor;
	}

	public String getModelo() {
		return modelo;
	}
}
