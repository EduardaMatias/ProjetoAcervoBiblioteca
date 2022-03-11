package bibliotecaMenu;

public class Distopia extends FiccaoCientifica {

	@Override
	public void mostrarNome(){
		System.out.print("Nome: ");
		this.nome = "O Conto da Aia";
		System.out.println(nome);
	}
	
	public void mostrarEditora() {
		System.out.print("Editora: ");
		this.editora = "Rocco";
		System.out.println(editora);
	}
	
	public void mostrarAutor() {
		System.out.print("Autor(a): ");
		this.autor = "Margaret Atwood";
		System.out.println(autor);
	}
	
	public void mostrarSinopse() {
		System.out.print("Sinopse: ");
		this.sinopse = "\nO Conto da Aia � uma distopia futurista que se passa em um futuro pr�ximo em um estado evang�lico "
				+ "\n\t fortemente patriarcal e totalit�rio, conhecido como a Rep�blica de Gilead, o qual derrubou o governo dos Estados Unidos. "
				+ "\n\t A narradora e personagem principal � uma mulher chamada Offred, "
				+ "\n\t ela faz parte do grupo conhecido como �aias�, que s�o designadas a obrigatoriamente produzir filhos para os �comandantes� � "
				+ "\n\t a classe dominante de homens em Gilead.";
		System.out.println(sinopse);
	}
	
	public void mostrarAnoPubli() {
		System.out.print("Ano de publica��o: ");
		this.anoPubli = 1985;
		System.out.println(anoPubli);
	}
	
	public void mostrarClasseInd() {
		System.out.print("Classe indicativa: ");
		this.classeInd = "Adulto";
		System.out.println(classeInd);
	}
	
	public void mostrarTW() {
		System.out.print("TW: ");
		this.tw = "Estupro, Mortes e cenas violentas";
		System.out.println(tw);
	}
	
	public void mostrarQtdPag() {
		System.out.print("Quantidade de p�ginas: ");
		this.qtdPag = 368;
		System.out.println(qtdPag);
	}
}
