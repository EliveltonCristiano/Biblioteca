
package biblioteca.usuario;

// Classe Professor que passa no construtor o nome, cpf, rg, número máximo de empréstimo, o dia máximo, código  e o tipo de usuário. 

public class Professor extends Usuario
{
    public Professor(String name, String cpf, String rg, int code)
    {
        super(name, cpf, rg, 6 , 60, code, "T");
    }
}
