package provapoo2;

import java.util.LinkedList;

public class MainVeiculo {
		public static void main(String[] args) {
			LinkedList<Veiculo> list = new LinkedList<Veiculo>();
			list.add(new Carro("QQS3I10", 10, 100, false, 250.00, 10.00));
			list.add(new Moto("QQS3I10",10,100,false,90.00,10));
			list.add(new Carro("QQS3I10", 10, 100, false, 250.00, 10.00));
			list.add(new Moto("QQS3I10",10,100,false,90.00,10));
			
			for(Veiculo v : list) {
				boolean viajou;
				if(v instanceof Moto) {
					viajou = v.viajar(100);
					System.out.println(viajou);
				}
				if(v instanceof Carro) {
					viajou = v.viajar(120);
					System.out.println(viajou);
				}
				System.out.println(v.toString());
			}
		
		}
	}

