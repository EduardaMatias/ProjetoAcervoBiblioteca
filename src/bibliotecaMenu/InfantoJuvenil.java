package bibliotecaMenu;

public class InfantoJuvenil extends Infantil {

	@Override
	public void mostrarNome(){
		System.out.print("Nome: ");
		this.nome = "A Bolsa Amarela";
		System.out.println(nome);
	}
	
	public void mostrarEditora() {
		System.out.print("Editora: ");
		this.editora = "Casa Lygia Bojunga";
		System.out.println(editora);
	}
	
	public void mostrarAutor() {
		System.out.print("Autor(a): ");
		this.autor = "Lygia Bojunga";
		System.out.println(autor);
	}
	
	public void mostrarSinopse() {
		System.out.print("Sinopse: ");
		this.sinopse = "\n� o romance de uma menina que entra em conflito consigo mesma e com a fam�lia ao"
				+ "\n\t reprimir tr�s grandes vontades "
				+ "\n\t (que ela esconde numa bolsa amarela)- a vontade de crescer, a de ser garoto e a de"
				+ "\n\t se tornar escritora. A partir dessa revela��o- por si mesma uma "
				+ "\n\t contesta��o � estrutura familiar tradicional em cujo meio crian�a n�o tem "
				+ "\n\t vontade- essa menina sens�vel e imaginativa nos conta o seu dia-a-dia, "
				+ "\n\t juntando o mundo real da fam�lia ao mundo criado por sua imagina��o f�rtil e povoado"
				+ "\n\t de amigos secretos e fantasias.";
		System.out.println(sinopse);
	}
	
	public void mostrarAnoPubli() {
		System.out.print("Ano de publica��o: ");
		this.anoPubli = 1976;
		System.out.println(anoPubli);
	}
	
	public void mostrarClasseInd() {
		System.out.print("Classe indicativa: ");
		this.classeInd = "Livre";
		System.out.println(classeInd);
	}
	
	public void mostrarTW() {
		System.out.print("TW: ");
		this.tw = "Nenhum";
		System.out.println(tw);
	}
	
	public void mostrarQtdPag() {
		System.out.print("Quantidade de p�ginas: ");
		this.qtdPag = 104;
		System.out.println(qtdPag);
	}
	
}
