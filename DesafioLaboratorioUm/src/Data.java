public class Data{
    private int dia;
    private int mes;
    private int ano;
    
        public Data(int dia, int mes, int ano){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;

                if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                    
                }
                    else if (mes == 2 ){

                    }else{

                    }
        
        
            
        }
        
        public int getDia(){
            return dia;
        }
        
        public int getMes(){
            return mes;
        }
        
        public int getAno(){
            return ano;
        }
        
        public void setDia(int dia){
            this.dia = dia;
        }
        
        public void setMes(int mes){
            this.mes = mes;
        }
        
        public void setAno(int ano){
            this.ano = ano;
        }

        //metodo toString
        public String toString(){
            return dia + "/" +  mes + "/" + ano;
        }

        //metodo de verificação de ano bissexto
        public boolean verificaAnoBissexto(){
            if (ano % 4 == 0) {
                if (ano % 100 == 0) {
                    if (ano % 400 == 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
        

}