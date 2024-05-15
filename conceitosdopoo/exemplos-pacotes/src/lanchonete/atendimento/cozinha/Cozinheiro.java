package lanchonete.atendimento.cozinha;



public class Cozinheiro {

    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NO BALÇÃO");
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALÇÃO");
    }

    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche() {
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }

    private void prepararVitamina() {
        System.out.println("PREPARANDO VITAMA");
    }

    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("SELECIONADO O PÃO, TOMATE, ALFACE, QUEIJO");
    }

    private void selecionarIngredientesVitamina() {
        System.out.println("SELECIONADO FRUTA");
    }

    private void lavarIngredientes() {
        System.out.println("LAVANDO OS INGREDIENTES");
    }

    private void baterVitaminaLiquitificador() {
        System.out.println("BATENDO OS INGREDIENTES NO LIQUITIFICADOR");
    }

    private void fritarIngredidentesLanche() {
        System.out.println("FRITANDO OS INGREDIENTES DO LANCHE");
    }


    private void pedirParaTrocarGas(Almoxarifado funcionario) {
        funcionario.trocarGas();
    }

    private void pedirIngredientes(Almoxarifado funcionario){
            funcionario.entregarIngredientes();
    }



}
