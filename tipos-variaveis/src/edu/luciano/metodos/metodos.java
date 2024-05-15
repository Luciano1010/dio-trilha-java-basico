package edu.luciano.metodos;

public class metodos {
    public static void main(String[] args) {
        // esse metodo é puclico esta visivel a toda aplicaçao e para isso preciso passar 2 parametro por a funçao ja diz que precisar somar pelo menos 2 numeros
        public double somar(int num1, int num2){

            return num1 + num2;
            
        }

        // devido a palavra void ele nao tem retorno de nada, por ele nao retorna nenhuma resultado
        public void imprimir (String texto){
            // nao precisa da palavra return
        }

        // thowr indica que o metodo pode gerar uma exceçao que é preciso ser tratada para nao ser gerada o erro nesse caso o usuario colocar a divisao por 0 o algoritmo nao esta preparado para essa ação.
        public double dividir(int dividendo, int divisor) throws Exception{

        }
        // metodo nao visivel para outras classes
        private void metodoPrivado(){}

        // alguns equivocos estruturais

        public void validar(){
            // aqui validar indica que é necessario um retorno de algo e com a palavra void no metodo isso não é possivel
            // nesse caso ele precisa pssar um valor booleano
        }

        public void calcularEnviar(){
            // um metodo deve representar uma unica responsbilidade - ou é calcular ou enviar
        }

        public void gravarCliente(String nome, String cpf){
            // metodo responsavel por gravar 
            // informações de um cliente. por que nao criar
            //um objeto cliente e passar como parametro ?
            // veja abaixo
        }
    
        // um pouco de Orientaçao a objetos
        public void gravarCliente(Cliente cliente){}

        public void gravar (Cliente cliente){}
    

}
