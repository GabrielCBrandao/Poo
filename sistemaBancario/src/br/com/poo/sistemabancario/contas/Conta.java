package br.com.poo.sistemabancario.contas;

import java.io.ObjectInputFilter.Config;

public class Conta {
	// declaração de variáveis
	private int numero;
	private String titular;
	protected double saldo;
	
	private void setNumero(int numero) {
		this.numero = numero;
	}

	private void setTitular(String titular) {
		this.titular = titular;
	}

	private void setConta(double conta) {
		this.conta = conta;
	}

	private int getNumero() {
		return numero;
	}

	private String getTitular() {
		return titular;
	}

	private double getSaldo() {
		return saldo;
	}

	private double getConta() {
		return conta;
	}

	public double conta;
	/*
	 * TIPOS DE CLASSE public-> público protected-> protegido default-> padrão
	 * private->privado
	 */

	// ações da conta

	/*Método saque sem tratamento
	 * public void sacar(double valor) { double novoSaldo= this.saldo - valor;
	 * this.saldo=novoSaldo;
	 */
	// Metodo saque com tratamento parcial
	public boolean sacar(double valor) {
		
		if(this.saldo<valor) {
			System.out.println("Saldo insuficiente!"); 
			return false;
		}else {
			double novoSaldo= this.saldo - valor;
		this.saldo=novoSaldo;
		return true;}
			
		}
	//Método depósito sem tratamento
	/*public void depositar(double valor) { 
		double novoSaldo= this.saldo + valor;
		this.saldo=novoSaldo;
	}*/
	//Método depósito com tratamento parcial
	
	public boolean depositar(double valor) {
		if(valor<0) {
			System.out.println("Valor inválido!");
			return false;
		}
		else {
			double novoSaldo= this.saldo + valor;
			this.saldo=novoSaldo;
			
			return true;
		}
			
		}
		//método transferência
		
		public boolean transferir( Conta destino, double valor) {
			boolean retirou= this.sacar(valor);
			if(retirou==false) {
				return false;
				}
			else {
				destino.depositar(valor);
				return true;
			}
			}
		}
		
			
		

		
	

	
	
	

