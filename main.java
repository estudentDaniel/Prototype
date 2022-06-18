public class main {
    public static void main(String[] args) {
        
        folkViolao folk = new folkViolao();
        ClassicViolao classic = new ClassicViolao();
        ViolaoFlet flet = new ViolaoFlet();
        ViolaoJumbo jumbo = new ViolaoJumbo();
        Violao7Cordas v7Cordas = new Violao7Cordas();
        Violao12Cordas v12Cordas = new Violao12Cordas();
        ViolaoZero zero = new ViolaoZero();



       ViolaoPrototype violaonovo = zero.clonar();
       violaonovo.setValorCompra(2500);
       ViolaoPrototype violaousado = zero.clonar();
       violaousado.setValorCompra(1500);

       System.out.println(violaonovo.exibirInfo());
       System.out.println(violaousado.exibirInfo());

//-------------------------------------------------------------------------

       ViolaoPrototype violaoFletN = flet.clonar();
       violaoFletN.setValorCompra(3000);
       ViolaoPrototype violaoFletU = flet.clonar();
       violaoFletU.setValorCompra(2800);
 
//-------------------------------------------------------------------------
       

  



    }
}
