package classe;

import java.util.Objects;

public class Usuario {
    String nome;
    String email;

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Usuario) {
            Usuario outro = (Usuario) obj;
            return outro.nome.equals(this.nome);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email);
    }
}
