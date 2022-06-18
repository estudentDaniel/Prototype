public class ViolaoZero extends ViolaoPrototype{

    protected ViolaoZero(ViolaoZero zero){
        this.valorCompra = zero.getValorCompra();
    }
    ViolaoZero(){
        this.valorCompra = 0;
    }
    @Override
    public ViolaoPrototype clonar() {
        // TODO Auto-generated method stub
        return new ViolaoZero();
    }

    @Override
    public String exibirInfo() {
        // TODO Auto-generated method stub
        return "Violão do tipo zero... e seu valor é de: "+ getValorCompra();
    }
    
}
