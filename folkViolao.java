public class folkViolao extends ViolaoPrototype {

    protected folkViolao(folkViolao folk){
        this.valorCompra = folk.getValorCompra();
    }
    public folkViolao(){
        valorCompra = 0.0;
    }
    public String exibirInfo() {
        return "Violão folk :"+getValorCompra();
    }
    @Override
    public ViolaoPrototype clonar() {
        return new folkViolao(this);
    }
    
}
