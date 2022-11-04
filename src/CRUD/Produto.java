package CRUD;

import java.util.Scanner;
public class Produto  {
	public static void main(String[]args) {
		Metodos met = new Metodos();
		Scanner scan = new Scanner(System.in);
		Integer OpcPrincipal;


		do{
			System.out.println(" Selecione: ");
			System.out.println(" 1.Cadastrar novo produto ");
			System.out.println(" 2.Atualizar os dados de um produto ");
			System.out.println(" 3.Lista de produtos ");
			System.out.println(" 4.Remover um produto ");
			System.out.println(" 5.Sair ");
			OpcPrincipal = scan.nextInt();

			if (OpcPrincipal == 1) {
				met.cadastrar();
			} else if (OpcPrincipal == 2) {
				met.update();
			} else if (OpcPrincipal == 3) {
				met.lista();
			}
			else if(OpcPrincipal == 4) {
				met.delete();
			}
		}while(OpcPrincipal < 5);
	}}

