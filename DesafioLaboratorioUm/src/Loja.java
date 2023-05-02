public class Loja{
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
        
        //metodos construtores
        public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario){
            this.nome =nome;
            this.salarioBaseFuncionario = salarioBaseFuncionario;
            this.quantidadeFuncionarios = quantidadeFuncionarios;
        }
        
        public Loja(String nome, int quantidadeFuncionarios){
            this.nome = nome;
            this.quantidadeFuncionarios = quantidadeFuncionarios;
            this.salarioBaseFuncionario = -1;
        }
    
        //metodos de acesso para cada atributo(variavel)
        public String getNome(){
            return nome;
        }
    
        public int getQuantidadeFuncionarios(){
            return quantidadeFuncionarios;
        }
    
        public double getSalarioBaseFuncionario(){
            return salarioBaseFuncionario;
        }
    
        public void setNome(String nome){
            this.nome = nome;
        }
    
        public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
            this.quantidadeFuncionarios = quantidadeFuncionarios;
        }
    
        public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
            this.salarioBaseFuncionario = salarioBaseFuncionario;
        }

        //metodo que classifica o tamanho da loja de acordo com qtd funcionarios
        public char tamanhoDaLoja(){
            if (quantidadeFuncionarios < 10) {
                return 'P';
            }else if (quantidadeFuncionarios >=10 && quantidadeFuncionarios <= 30){
                return 'M';
            }else{
                return 'G';
            }
        }
    
        //metodo tostring
        public String toString(){
            return "Nome da empresa: " + nome + " Quantidade funcionários da empresa: " + quantidadeFuncionarios + " Salário base do funcionário: " + salarioBaseFuncionario;
        }
        
        //metodo que retorna gastos com salario da empresa
        public double gastosComSalario(){
            if (salarioBaseFuncionario != -1){
              return (salarioBaseFuncionario*quantidadeFuncionarios);  
            }else{
                return -1;
            }
        }
        

}