package bibliotecaMenu;

public class SerialKiller extends Terror{

	@Override
	public void mostrarNome(){
		System.out.print("Nome: ");
		this.nome = "Bom dia, Ver�nica";
		System.out.println(nome);
	}
	
	public void mostrarEditora() {
		System.out.print("Editora: ");
		this.editora = " Dark Side";
		System.out.println(editora);
	}
	
	public void mostrarAutor() {
		System.out.print("Autor(a): ");
		this.autor = "Ilana Casoy, Raphael Montes ";
		System.out.println(autor);
	}
	
	public void mostrarSinopse() {
		System.out.print("Sinopse: ");
		this.sinopse = "A rotina da secret�ria de pol�cia Ver�nica Torres era pacata, "
				+ "\nburocr�tica e repleta de sonhos interrompidos at� aquela manh�. "
				+ "\nUm abismo se abre diante de seus p�s de uma hora para outra quando, "
				+ "\nna mesma semana, ela presencia um suic�dio inesperado e recebe a liga��o "
				+ "\nan�nima de uma mulher clamando por sua vida. "
				+ "\nVer�nica sente um verdadeiro calafrio, "
				+ "\nmas abra�a a oportunidade de mostrar suas habilidades investigativas e "
				+ "\ndecide mergulhar sozinha nos dois casos";
		System.out.println(sinopse);
	}
	
	public void mostrarAnoPubli() {
		System.out.print("Ano de publica��o: ");
		this.anoPubli = 2019;
		System.out.println(anoPubli);
	}
	
	public void mostrarClasseInd() {
		System.out.print("Classe indicativa: ");
		this.classeInd = "Adulto";
		System.out.println(classeInd);
	}
	
	public void mostrarTW() {
		System.out.print("TW: ");
		this.tw = "Cenas violentas";
		System.out.println(tw);
	}
	
	public void mostrarQtdPag() {
		System.out.print("Quantidade de p�ginas: ");
		this.qtdPag = 256;
		System.out.println(qtdPag);
	}
}