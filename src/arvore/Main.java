package arvore;

public class Main {
	
	public static void main(String[] args) {
		
		ArvoreBinaria ab = new ArvoreBinaria();
		
		ab.insereAluno(1, "Pablo");
		ab.insereAluno(2, "Rodrigo");
		ab.insereAluno(3, "Marcelo");
		ab.insereAluno(10, "Romulo");
		ab.insereAluno(7, "Alexandre");
		
		ab.percorrerInOrder();
	}

}
