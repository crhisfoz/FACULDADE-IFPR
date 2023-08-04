
public class ExemploString {
	
	public static void main (String[] args) {
		String str1;
		String str2;
		
		
		str1 = "Um texto qualquer...    ";
		System.out.println("[" + str1 +"]");
		str1 = str1.trim(); //remove espaços no final 
		System.out.println("[" + str1 +"]");
		System.out.println("Tamanho do str1: " + str1.length());
		
		//substituir um substring dentro de um string
		str2 = str1.replace("texto", "teste");
		System.out.println("[" + str2 +"]");
		//copiar um substring
		str2 = str1.substring(6,10); // 6 inclusive, 10 exclusive
		System.out.println("[" + str2 +"]");
		
		//procurar um substring
		
		str1 = "humberto.beneduzzi@ifpr.edu.br";
		int posicao = str1.indexOf("@");
		System.out.println("O @ está na posição: " + posicao);
		System.out.println("Usuário: " + str1.substring(0,posicao));
		System.out.println("Servidor: " + str1.substring(posicao +1,str1.length()));
		
		//converter de outros tipos de String
		int valor = 5;
		String str3 = String.valueOf(valor);
		String conteudo = "5/6/3/8/22/98/1/0";
		String[] arrayConteudo = conteudo.split("/");
		System.out.println(arrayConteudo[1]);
			
		
		
		
		
	}
}

