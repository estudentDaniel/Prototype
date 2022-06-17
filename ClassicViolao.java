public class ClassicViolao extends ViolaoPrototype {

    protected ClassicViolao(ClassicViolao classic){
        this.valorCompra = classic.getValorCompra();
    }
    public ClassicViolao(){
        valorCompra = 0;
    }
    public String exibirInfo(){
        return "Vilão classico, valor: "+ getValorCompra();
    }
    @Override
    public ViolaoPrototype clonar() {
        return new ClassicViolao(this);  //retornando o proprio objeto
    }
    
}
