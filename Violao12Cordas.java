public class Violao12Cordas extends ViolaoPrototype{

    protected Violao12Cordas(Violao12Cordas cordas){
        this.valorCompra = cordas.getValorCompra();
    }
    Violao12Cordas(){
        this.valorCompra = 0;
    }
    @Override
    public ViolaoPrototype clonar() {
        // TODO Auto-generated method stub
        return new Violao12Cordas();
    }

    @Override
    public String exibirInfo() {
        // TODO Auto-generated method stub
        return "Violoão 12 cordas .... seu valor é: "+ getValorCompra();
    }
    
}
