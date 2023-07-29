package infra;

import modelo.basico.Produto;

public class ProdutoDAO extends DAO<Produto>{
	
	public ProdutoDAO() {
		super(Produto.class);
//		foi chamado esse constutor padrão:
//		public DAO(Class<E> classe) {
//			this.classe = classe;
//			em = emf.createEntityManager();
		
//		em vez desse:
//			public DAO() {
//			this(null);
//		}
	}

}
