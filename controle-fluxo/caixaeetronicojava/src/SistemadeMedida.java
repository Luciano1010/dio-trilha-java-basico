public class SistemadeMedida {
    public static void main(String[] args) {
        String plano = "M"; //M / T
		/*modo convencional com if else - precisou de mais informações, mais dependende de aplicação esse metodo te da mais recurso do que uma estrutura switch case*/
		if(plano == "B") {
			System.out.println("100 minutos de ligação");
		}else if(plano == "M") {
			System.out.println("100 minutos de ligação");
			System.out.println("Whats e Intagram grátis");	
		}else if(plano == "T") {
			System.out.println("100 minutos de ligação");
			System.out.println("Whats e Intagram grátis");	
			System.out.println("5Gb Youtube");	
		}

        /* a mesma situçao só que com o switch case reduziu-se as linhas de códigos, melhor uso para complementar e usar as estruturas condicionais encadeada para situações mais complexas */ 
        switch (plano) {
			case "T": {
				System.out.println("5Gb Youtube");
                break;
			}
			case "M": {
				System.out.println("Whats e Intagram grátis");
                break;
			}
			case "B": {
				System.out.println("100 minutos de ligação");
                break;
			}
		}
    }


}
