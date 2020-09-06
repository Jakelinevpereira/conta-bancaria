package contaBancaria;

import entities.Conta;
import entities.ContaDeNegocios;
import entities.ContaPoupanca;

public class Programa {

	public static void main(String[] args) {
		
		Conta acc = new Conta(1001, "Alex", 0.0);
		ContaDeNegocios bacc = new ContaDeNegocios(1002, "Maria", 0.0, 500.0);

		//UPCASTING
		
		Conta acc1 = bacc;
		Conta acc2 = new ContaDeNegocios(1003, "Bob", 0.0, 200.0);
		Conta acc3 = new ContaPoupanca(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		
		ContaDeNegocios acc4 = (ContaDeNegocios)acc2;
		acc4.emprestimo(100.0);
		
		//ContaDeNegocios acc5 = (ContaDeNegocios)acc3;
		if(acc3 instanceof ContaDeNegocios) {
			ContaDeNegocios acc5 = (ContaDeNegocios)acc3;
			acc5.emprestimo(200.0);
			System.out.println("Emprestimo!");
		}
		if(acc3 instanceof ContaPoupanca) {
			ContaPoupanca acc5 = (ContaPoupanca)acc3;
			acc5.atualizarSaldo();
			System.out.println("Atualizar!");
			
		}
		Conta acc6 = new Conta(1000, "Alex", 1000.0);
		acc6.saque(200.0);
		System.out.println(acc6.getSaldo());
		
		Conta acc7 = new ContaPoupanca(1008, "João", 1000.0, 0.01);
		acc7.saque(200.0);
		System.out.println(acc7.getSaldo());
		
		Conta acc8 = new ContaDeNegocios(1009, "Pedro", 1000.0, 500.0);
		acc8.saque(200.0);
		System.out.println(acc8.getSaldo());
	}

}
