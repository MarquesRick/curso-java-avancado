package classe;

public class Equals {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.nome = "Henrique";
        u1.email = "henrique@email.com";

        Usuario u2 = new Usuario();
        u2.nome = "Henrique";
        u2.email = "henrique@email.com";

        System.out.println(u1.equals(u2));
    }
}
