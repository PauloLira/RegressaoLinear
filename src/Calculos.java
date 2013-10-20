import java.math.BigDecimal;
import java.util.List;


public class Calculos {
	
	public static float mediaValor(List<Apartamento> values){
		float result = 0;
		float temp = 0;
		for(Apartamento v: values){
			temp += v.getValor();
		}
		
		result = temp / values.size();
		System.out.println("Media Valor: "+result);
		return result;
	};
	
	public static float mediaM2(List<Apartamento> values){
		float result = 0;
		float temp = 0;
		for(Apartamento v: values){
			temp += v.getM2();
		}
		
		result = temp / values.size();
		System.out.println("Media M2: "+result);
		return result;
	};
	
	public static float somatoriaM2(List<Apartamento> values){
		float result = 0;
		for(Apartamento v: values){
			result += v.getM2() ;
		}	
		System.out.println("Somatorio M2: "+result);
		return result;
	};
	
	public static float somatoriaValor(List<Apartamento> values){
		float result = 0;
		for(Apartamento v: values){
			result += v.getValor() ;
		}	
		System.out.println("Somatorio Valor: "+result);
		return result;
	};
	
	public static float quadradoSomatoriaM2(List<Apartamento> values){
		float result = 0;
		for(Apartamento v: values){
			result += Math.pow(v.getM2(), 2);
		}
		System.out.println("Somatorio Quadrado m2: "+ result);
		return result;
	};
	
	public static BigDecimal quadradoSomatoriaValor(List<Apartamento> values){
		float result = 0;
		
		for(Apartamento v: values){
			result += Math.pow(v.getValor(), 2);
		}	
		
		System.out.println("Somatorio Quadrado Valores: "+ BigDecimal.valueOf(result));
		return BigDecimal.valueOf(result);
	};
	
	
	public static BigDecimal somatoriaM2xValor(List<Apartamento> values){
		 
		float result = 0;
		 
		for(Apartamento v: values){
			 result += v.getM2() * v.getValor();
		}	
		
		System.out.println("Somatorio Multiplicacao M2xValor: "+BigDecimal.valueOf(result));
		return BigDecimal.valueOf(result);
	};
	
	
	
	 public static Double calculoInicial(List<Apartamento> aps) {
		 BigDecimal qtdItens = BigDecimal.valueOf(aps.size());
		 BigDecimal elementosPorSomatoriaValorxM2;
		 elementosPorSomatoriaValorxM2 =  somatoriaM2xValor(aps).
				 multiply(qtdItens); 
		 
		 double multiplicacaoSomatorias =  somatoriaM2(aps) * somatoriaValor(aps);
		 
		 
		 double cima = elementosPorSomatoriaValorxM2.doubleValue() - multiplicacaoSomatorias;
		 System.out.println( "Cima: "+ BigDecimal.valueOf(cima));
		 
		 double baixo = 0;
		 
		 double itensXSomatoriaAoQuadrado = aps.size() * quadradoSomatoriaM2(aps);
		 System.out.println("Somatoria m2 ao Wuadrado"+ BigDecimal.valueOf(itensXSomatoriaAoQuadrado) );
		 double somatorioDeM2AoQuadrado = Math.pow(somatoriaM2(aps),2);
		 System.out.println("Tatal m2 ao quadrrado: " +BigDecimal.valueOf(somatorioDeM2AoQuadrado));
		 baixo = itensXSomatoriaAoQuadrado - somatorioDeM2AoQuadrado;
		 System.out.println("Baixo: "+BigDecimal.valueOf(baixo));
		 
		 double result = cima/baixo;
		 
		 System.out.println("Resultado Inicial: "+ BigDecimal.valueOf(result));
		 return result;
	} 
	 
	 public static Double CalculoMedio(List<Apartamento> aps){
		 
		double result = mediaValor(aps) - calculoInicial(aps) * mediaM2(aps); 
		
		System.out.println("Calculo Medio: "+ result );
		 
		 return result;
		 
	 }
	 
	 public static Double CalculoFinal(List<Apartamento> aps, Integer valorUsuario){
		 
		 Double result = 0.0;
		 
		 result = calculoInicial(aps) * valorUsuario-CalculoMedio(aps); 
		 
		 
		 System.err.println("Seu Apartamento de "+valorUsuario +
				 "m2 fica Por: "+ BigDecimal.valueOf(result).intValue()+" R$");
		 
		 return 0.0;
		 
	 }
		


}
