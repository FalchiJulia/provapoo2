package provapoo2;

import java.util.LinkedList;

public class MainPessoa {

	public static void main(String[] args) {
		LinkedList<Pessoa>list = new LinkedList<Pessoa>();
		list.add(new Pessoafisica("abc", "123", "abc", "123"));
		list.add(new pessoajuridica("abc", "123", "abc", "123"));
		list.add(new Pessoafisica("julia", "979505646", "jaguara", "34667661844"));
		list.add(new pessoajuridica("espm", "50854600", "alvaroalvim", "61825675000164"));
		list.add(new Pessoafisica("gabriel", "979505646", "jaguara", "34667661844"));
		list.add(new pessoajuridica("espm", "50854600", "joaquimtavora", "61825675000164"));
		
		for(Pessoa p: list) {
			System.out.println(p);
		}

	}

}
