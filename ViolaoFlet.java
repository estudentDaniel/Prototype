public class ViolaoFlet extends ViolaoPrototype{

    protected ViolaoFlet(ViolaoFlet flet){
        this.valorCompra = flet.getValorCompra();
    }
    //constructor public 
    public ViolaoFlet (){
        this.valorCompra = 0;
    }
    @Override
    public ViolaoPrototype clonar() {
        // TODO Auto-generated method stub
        return new ViolaoFlet(); // retornado meu proprio objeto;

    }

    @Override
    public String exibirInfo() {
        // TODO Auto-generated method stub
        return "violao Flet plano e liso e com cordas de nilon...."+getValorCompra();
    }
    
}
