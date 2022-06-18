public class ViolaoJumbo extends ViolaoPrototype{

    //constructor of protected
    protected ViolaoJumbo(ViolaoJumbo jumbo){//estou recebendo o meu valor como parametro 
        this.valorCompra = jumbo.getValorCompra(); //aqui estou passando e acessado via get o valor que foi passado...
    }

    //constructor of public
    ViolaoJumbo(){ // esse constructor tem a funcao de iniciar minha variavel com zero(0)
        this.valorCompra = 0; 
    }
    //metodo clonar()
    @Override
    public ViolaoPrototype clonar() {
        // TODO Auto-generated method stub
        return new ViolaoJumbo(); //retornando o meu proprio objeto para ser clonado
    }

    @Override
    public String exibirInfo() {
        // TODO Auto-generated method stub
        return "Usado por elvis presley...valor: "+ getValorCompra();
    }
    
}
