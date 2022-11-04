package CRUD;

import java.util.HashMap;
import java.util.Scanner;

public class Metodos {

	Scanner scan = new Scanner(System.in);
	HashMap<Integer, Bean>map=new HashMap<Integer, Bean>();
	Bean bean = new Bean();
	Integer id=1;
	Integer OpcPrincipal;

	public void cadastrar(){
		bean = new Bean();

		System.out.println("Digite o nome do Produto");
		bean.setNome(scan.next());

		System.out.println("Digite a categoria do Produto");
		bean.setCategoria(scan.next());

		System.out.println("Digite o valor do produto");
		bean.setValor(scan.nextDouble());

		map.put(id, bean);

		System.out.println(bean.getNome());

		System.out.println(bean.getCategoria());

		System.out.println(bean.getValor());
		id = id+1;	
	}
	public void update() {
		System.out.println("Digite o id do produto a ser atualizado");
		Integer idProd = scan.nextInt();
		Bean value = map.get(idProd);

		System.out.println("Atualizar nome");
		String novoNome = scan.next();

		value.setNome(novoNome);

		System.out.println("Atualizar categoria");
		String novaCategoria = scan.next();


		value.setCategoria(novaCategoria);

		System.out.println("Atualizar valor");
		Double novoValor = scan.nextDouble();

		value.setValor(novoValor);
	}

	public void lista() {
		for (Integer key : map.keySet()) {

			bean = map.get(key);
			System.out.println(key + " = " + bean.getNome());		

			System.out.println(key + " = " + bean.getCategoria());			

			System.out.println(key + " = " + bean.getValor());
			}	
		}
		public void delete() {
	System.out.println("Digite o id do produto a ser deletado");
	Integer idDelet=scan.nextInt();
	map.remove(idDelet);
}}	
