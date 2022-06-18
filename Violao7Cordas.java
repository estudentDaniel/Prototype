public class Violao7Cordas extends ViolaoPrototype{

    protected Violao7Cordas(Violao7Cordas cordas){
        this.valorCompra = cordas.getValorCompra();
    }
    Violao7Cordas(){
        this.valorCompra = 0;
    }
    @Override
    public ViolaoPrototype clonar() {
        // TODO Auto-generated method stub
        return new Violao7Cordas();
    }

    @Override
    public String exibirInfo() {
        // TODO Auto-generated method stub
        return "Violão do tipo 7 codas e Custa: "+ getValorCompra();
    }
    
}
