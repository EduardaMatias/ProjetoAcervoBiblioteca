package bibliotecaMenu;

public class Autobiografia extends Biografia{

	@Override
	public void mostrarNome(){
		System.out.print("Nome: ");
		this.nome = "O Di�rio de Anne Frank";
		System.out.println(nome);
	}
	
	public void mostrarEditora() {
		System.out.print("Editora: ");
		this.editora = "Record";
		System.out.println(editora);
	}
	
	public void mostrarAutor() {
		System.out.print("Autor(a): ");
		this.autor = "Anne Frank";
		System.out.println(autor);
	}
	
	public void mostrarSinopse() {
		System.out.print("Sinopse: ");
		this.sinopse = "\nO di�rio de Anne Frank, o depoimento da pequena Anne, "
				+ "\n\t morta pelos nazistas ap�s passar anos escondida no s�t�o de uma casa em Amsterd�, "
				+ "\n\t narra os sentimentos, os medos e as pequenas alegrias de uma menina judia que, "
				+ "\n\t como sua fam�lia, lutou em v�o para sobreviver ao Holocausto. "
				+ "\n\t Uma poderosa lembran�a dos horrores de uma guerra, "
				+ "\n\t um testemunho eloquente do esp�rito humano, "
				+ "\n\t assim podemos descrever os relatos feitos por Anne em seu di�rio. "
				+ "\n\t As anota��es mostram um fascinante relato sobre a coragem e a fraqueza humana e, "
				+ "\n\t sobretudo, um vigoroso autorretrato de uma menina sens�vel e determinada";
		System.out.println(sinopse);
	}
	
	public void mostrarAnoPubli() {
		System.out.print("Ano de publica��o: ");
		this.anoPubli = 1947;
		System.out.println(anoPubli);
	}
	
	public void mostrarClasseInd() {
		System.out.print("Classe indicativa: ");
		this.classeInd = "12 anos";
		System.out.println(classeInd);
	}
	
	public void mostrarTW() {
		System.out.print("TW: ");
		this.tw = "Nenhum";
		System.out.println(tw);
	}
	
	public void mostrarQtdPag() {
		System.out.print("Quantidade de p�ginas: ");
		this.qtdPag = 352;
		System.out.println(qtdPag);
	}
	
	
}
