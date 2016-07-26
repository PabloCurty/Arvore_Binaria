package arvore;

public class ArvoreBinaria {
	
	private No raiz;
	private ArvoreBinaria arvoreEsquerda;
	private ArvoreBinaria arvoreDireita;
	
	public ArvoreBinaria() {
		super();
	}

	public No getRaiz() {
		return raiz;
	}

	public void setRaiz(No raiz) {
		this.raiz = raiz;
	}

	public ArvoreBinaria getArvoreEsquerda() {
		return arvoreEsquerda;
	}

	public void setArvoreEsquerda(ArvoreBinaria arvoreEsquerda) {
		this.arvoreEsquerda = arvoreEsquerda;
	}

	public ArvoreBinaria getArvoreDireita() {
		return arvoreDireita;
	}

	public void setArvoreDireita(ArvoreBinaria arvoreDireita) {
		this.arvoreDireita = arvoreDireita;
	}

	public void insereAluno(int matricula, String nome){
		
		Aluno aluno = new Aluno(matricula, nome);
		No no = new No(aluno);
		inserir(no);
		
	}

	public void inserir(No no) {
		if(this.raiz == null){
			this.raiz = no;
		}else
			if(no.getAluno().getMatricula() > this.raiz.getAluno().getMatricula()){
				if(this.arvoreDireita == null){
					this.arvoreDireita = new ArvoreBinaria();
				}
				this.getArvoreDireita().inserir(no);
			}else
				if(no.getAluno().getMatricula() < this.raiz.getAluno().getMatricula()){
					if(this.arvoreEsquerda == null){
						this.arvoreEsquerda = new ArvoreBinaria();
					}
					this.arvoreEsquerda.inserir(no);
				}
		
	}
	
	public void percorrerInOrder(){
		
		if(this.raiz == null){
			return;
		}
		
		if(this.arvoreEsquerda != null){
			this.arvoreEsquerda.percorrerInOrder();
		}
		
		System.out.println("Matrícula: " + this.raiz.getAluno().getMatricula());
        System.out.println("Nome: " + this.raiz.getAluno().getNome());
        
        if(this.arvoreDireita != null){
        	this.arvoreDireita.percorrerInOrder();
        }
		
	}
	
	public void percorrerPreOrder() {
		if(this.raiz == null){
			return;
		}
		
		System.out.println("Matrícula: " + this.raiz.getAluno().getMatricula());
        System.out.println("Nome: " + this.raiz.getAluno().getNome());
        
		
		if(this.arvoreEsquerda != null){
			this.arvoreEsquerda.percorrerInOrder();
		}
			
        if(this.arvoreDireita != null){
        	this.arvoreDireita.percorrerInOrder();
        }
	}
	
	public void percorrerPostOrder() {
		if(this.raiz == null){
			return;
		}
		
		if(this.arvoreEsquerda != null){
			this.arvoreEsquerda.percorrerInOrder();
		}
			
        if(this.arvoreDireita != null){
        	this.arvoreDireita.percorrerInOrder();
        }
        
        System.out.println("Matrícula: " + this.raiz.getAluno().getMatricula());
        System.out.println("Nome: " + this.raiz.getAluno().getNome());
        
		
	}
	
	public Aluno busca(int matricula){
		
		if(this.raiz == null){
			return null;
		}else
			if(matricula == this.raiz.getAluno().getMatricula()){
				return this.raiz.getAluno();
			}else
				if(matricula > this.raiz.getAluno().getMatricula()){
					if(this.arvoreDireita == null){
						return null;
					}
					return this.arvoreDireita.busca(matricula);
				}else
					if(matricula < this.raiz.getAluno().getMatricula()){
						if(this.arvoreEsquerda == null){
							return null;
						}
						return this.arvoreEsquerda.busca(matricula);
					}
		
		return this.raiz.getAluno();
	}
}
