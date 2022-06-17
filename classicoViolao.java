public class classicoViolao extends ViolaoPrototype{

    protected classicoViolao(classicoViolao classico){
        this.valorCompra = classico.getValorCompra();
    }
    public classicoViolao(){
        valorCompra = 0;
    }
    public String exibirInfo() {
        return "violao clasic "+getValorCompra();
    }
    @Override
    public ViolaoPrototype clonar() {
        // TODO Auto-generated method stub
        return new classicoViolao(this);
    }
    
}
