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
		System.out.println("Reproduzindo música...");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando música...");
	}

	@Override
	public void escolherMusica() {
		System.out.println("Escolhendo música...");
	}

	@Override
	public void ligar(String numero) {
		System.out.println(String.format("Ligando para o número: [%s].", numero));
	}

	@Override
	public void atender() {
		System.out.println("Recebendo ligação...");
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando novo correio de voz...");
	}

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo página web...");
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Abrindo nova aba...");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página web...");
	}

	public String getCor() {
		return cor;
	}

	public String getModelo() {
		return modelo;
	}
}
