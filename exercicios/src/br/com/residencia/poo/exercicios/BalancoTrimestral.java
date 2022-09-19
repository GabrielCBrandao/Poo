package br.com.residencia.poo.exercicios;

public class BalancoTrimestral {

	public static void main(String[] args) {
		int gastosJaneiro= 15000;
		int gastosFevereiro= 23000;
		int gastosMarco= 17000;
		int gastosAbril=12000;
		int gastosMaio=13000;
		int gastosJunho= 12500;
		int gastosJulho= 17800;
		int gastosAgosto= 9000;
		int gastosSetembro= 10000;
		int gastosOutubro= 22000;
		int gastosNovembro= 25000;
		int gastosDezembro=30000;
		int gastosPrimeiroTrimestre;
		int gastosSegundoTrimestre;
		int gastosTerceiroTrimestre;
		int gastosQuartoTrimestre;
		int gastosPrimeiroSemestre;
		int gastosSegundoSemestre;
		int gastoAnual;
		
		
		gastosPrimeiroTrimestre=gastosJaneiro+gastosFevereiro+gastosMarco;
		gastosSegundoTrimestre=gastosAbril+gastosMaio+gastosJunho;
		gastosTerceiroTrimestre=gastosJulho+gastosAgosto+gastosSetembro;
		gastosQuartoTrimestre=gastosOutubro+gastosNovembro+gastosDezembro;
		gastosPrimeiroSemestre=gastosPrimeiroTrimestre+gastosSegundoTrimestre;
		gastosSegundoSemestre=gastosTerceiroTrimestre+gastosQuartoTrimestre;
		gastoAnual=gastosPrimeiroSemestre+gastosSegundoSemestre;
		
		
		System.out.println("O gasto total da empresa no primeiro trimestre foi de R$ "+ gastosPrimeiroTrimestre);
		System.out.println("O gasto total da empresa no segundo trimestre foi de R$ "+ gastosSegundoTrimestre);
		System.out.println("O gasto total da empresa no terceiro trimestre foi de R$ "+ gastosTerceiroTrimestre);
		System.out.println("O gasto total da empresa no quarto trimestre foi de R$ "+ gastosQuartoTrimestre);
		System.out.println("O gasto total da empresa no primeiro semestre foi de R$ "+ gastosPrimeiroSemestre);
		System.out.println("O gasto total da empresa no segundo semestre foi de R$ "+ gastosSegundoSemestre);
		System.out.println("O gasto total da empresa no ano foi de R$ "+ gastoAnual);

	}

}
