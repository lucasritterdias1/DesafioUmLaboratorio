import java.util.Scanner;

public class Principal{
    private Loja lojaMenu;
    private Produto produtoMenu;
    
    
    public static void main(String[] args){
     

    do{
        
        System.out.println("(1) criar uma loja");
        System.out.println("(2) criar um produto");
        System.out.println("(3) sair");
        
            //leitura do teclado
        System.out.println("Digite a opção desejada:");    
        opcao = ler.nextInt();        
         
        switch (opcao){
            case 1:
                //criacao objeto loja
                System.out.println("Digite o nome da loja: ");
                nomeLoja = ler.nextLine();
                System.out.println("Digite a quantidade de funcionarios da loja: ");
                qtdeFuncionarios = ler.nextInt();
                System.out.println("Digite o salário base dos funcionários: ");
                salarioBase = ler.nextDouble();
                System.out.println("Digite a data de fundação da loja: ");
                dataFundacao = ler.nextInt();

                break;
                
            case 2:
                //criacao objeto produto
                System.out.println("Digite o nome do produto: ");
                nomeDoProduto = ler.nextLine();
                System.out.println("Digite o preço do produto: ");
                precoDoProduto = ler.nextDouble();

                
                break;
                
            case 3:
                System.out.println("Saindo...");
            
                break;

            default:
                System.out.println("Opção Inválida!");
        }
        
    }while (opcao !=3);
    
    }
}
