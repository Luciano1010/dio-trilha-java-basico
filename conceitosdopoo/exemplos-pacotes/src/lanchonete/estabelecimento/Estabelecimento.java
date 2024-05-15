package lanchonete.estabelecimento;

import lanchonete.areacliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarifado;
import lanchonete.atendimento.cozinha.Cozinheiro;


public class Estabelecimento {
    public static void main(String[] args) {
       Cozinheiro cozinheiro = new Cozinheiro();
       
      // cozinheiro.lavarIngredientes();
      // cozinheiro.baterVitaminaLiquitificador();
      // cozinheiro.selecionarIngredientesLanche();
      // cozinheiro.prepararLanche();
      // cozinheiro.prepararVitamina();
        

        cozinheiro.adicionarComboNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarSucoNoBalcao();

        // Almoxarifado almoxarife = new Almoxarifado();
        // ações que nao preciam estar visiveis a toda aplicação
        // almoxarife.contrlarEntrada();
        // almoxarife.contrlarSaida();
        // acao que somente o pacote cozinha precisa conhecer (Default)
        //almoxarife.entregarIngredientes();
        //almoxarife.trocarGas();


       Atendente atendente = new Atendente();
       
      // atendente.pegarLancheCozinha();
       atendente.receberPagamento();
       atendente.servindoMesa();
     // somemte o pacote cozinha preciso conhecer
      // atendente.trocarGas();


        Cliente cliente = new Cliente();

        cliente.fazerPedido();
        cliente.escolherLanche();
        cliente.pagarConta();
        

      
       

      
    }
}
