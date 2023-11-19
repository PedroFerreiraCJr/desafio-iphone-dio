package me.dio.desafio_iphone;

public interface Main {
	public static void main(String[] args) {
		IPhone meuIphone = new IPhone("Branco", "IPhone 7 Plus");
		AparelhoTelefonico telefone = meuIphone;
		telefone.ligar("85999887766");

		ReprodutorMusical reprodutor = meuIphone;
		reprodutor.tocar();

		Navegador navegador = meuIphone;
		navegador.adicionarNovaAba();
		navegador.atualizarPagina();
		navegador.exibirPagina();
	}
}
