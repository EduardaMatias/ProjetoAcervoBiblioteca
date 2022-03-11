package bibliotecaMenu;

public class RomanceDeEpoca extends FormaBiblioteca {
	@Override
	public void mostrarNome() {
		System.out.print("Nome: ");
		this.nome = "Perdida";
		System.out.println(nome);
	}

	public void mostrarEditora() {
		System.out.print("Editora: ");
		this.editora = "Verus";
		System.out.println(editora);
	}

	public void mostrarAutor() {
		System.out.print("Autor(a): ");
		this.autor = "Carina Rissi";
		System.out.println(autor);
	}

	public void mostrarSinopse() {
		System.out.print("Sinopse: ");
		this.sinopse = "Sofia vive em uma metr�pole e est� acostumada com a "
				+ "\nmodernidade e as facilidades que ela traz. "
				+ "\nEla � independente e tem pavor � mera men��o da palavra casamento. "
				+ "\nAp�s comprar um celular novo, algo misterioso acontece e Sofia "
				+ "\ndescobre que est� perdida no s�culo dezenove, "
				+ "\nsem ter ideia de como voltar para casa � ou se isso sequer � poss�vel. "
				+ "\nEnquanto tenta desesperadamente encontrar um meio de retornar ao "
				+ "\ntempo presente, ela � acolhida pela fam�lia Clarke. "
				+ "\nCom a ajuda do prestativo � e lindo � Ian Clarke, Sofia "
				+ "\nembarca numa busca fren�tica e acaba encontrando pistas que talvez "
				+ "\npossam ajud�-la a resolver esse mist�rio e voltar para sua t�o "
				+ "\namada vida moderna.O que ela n�o sabia era que seu cora��o tinha outros "
				+ "planos.";
		System.out.println(sinopse);
	}

	public void mostrarAnoPubli() {
		System.out.print("Ano de publica��o: ");
		this.anoPubli = 2013;
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
		this.qtdPag = 364;
		System.out.println(qtdPag);
	}
}