class RodarAplicacao {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();
        
        //upcasts
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //downcast abaixo- devem ser evitados na orientacao a objetos
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}