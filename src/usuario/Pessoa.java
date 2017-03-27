
package biblioteca.usuario;

// Classe pessoa que passa no construtor o nome, cpf, rg, número máximo de empréstimo, o dia máximo, código  e o tipo de usuário. 

public class Pessoa extends Usuario
{
    public Pessoa(String name, String cpf, String rg, int code)
    {
        super(name, cpf, rg, 2, 15, code, "P");
    }
}
