public class main {
    public static void main(String[] args) {
        System.out.println("teste");
        folkViolao PrototipoCanon1 = new folkViolao();
        classicoViolao PrototipoCanon2 = new classicoViolao();


       ViolaoPrototype Violaonovo = PrototipoCanon1.clonar();
      Violaonovo.setValorCompra(2500);
● CanonPrototype T4iusada = PrototipoCanon1.clonar();
● T4iusada.setValorCompra(1000);
    }
}
