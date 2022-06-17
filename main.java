public class main {
    public static void main(String[] args) {
        System.out.println("teste");
        folkViolao folk = new folkViolao();
        classicoViolao classic = new classicoViolao();


       ViolaoPrototype violaonovo = folk.clonar();
       violaonovo.setValorCompra(2500);
       ViolaoPrototype violaousado = folk.clonar();
       violaonovo.setValorCompra(1500);

  

       System.out.println(violaousado.exibirInfo);

    }
}
