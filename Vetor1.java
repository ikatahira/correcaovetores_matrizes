public class Vetor1{
/**
 * Construa uma classe com 1 vetor produto de 10 elementos para guardar o nome dos produtos e 1 vetor estoque de 10 elementos inteiros
	
		Leia o Nome do Produto e logo após ler o nome, já leia o estoque.
		Após ler todos os produtos e seus estoques imprima os produtos que o estoque seja maior que 10. 
        EX: “Impressão: O produto monitor tem 10 unidades em estoque”.
 * @param args
 */
public static void main(String[] args) {
    
String produto[]=new String[10];
int estoque[]=new int[10];

for (int i = 0; i < estoque.length; i++) {
    produto[i]="x";
    estoque[i]=2;
}
for (int i = 0; i < estoque.length; i++) {
    System.out.println("O produto "+produto[i]+ " tem "+ estoque[i]+" unidades em estoque");
}

}

}