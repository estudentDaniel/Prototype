 abstract class ViolaoPrototype{
    protected double valorCompra;
    public String exibirInfo;
    public abstract ViolaoPrototype clonar();
    //metodos/function

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }
    public abstract String exibirInfo();
}