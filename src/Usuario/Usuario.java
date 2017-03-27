
package biblioteca.usuario;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;


public abstract class Usuario
{
    private String nome;   
    private String CPF;
    private String RG;
    private String tipo;
    private int bookLimit;
    private int daysLimit;
    private int codigo;

    public Usuario(String name, String cpf, String rg, int bookLimit, int daysLimit, int code, String type)
    {
        this.nome = name;
        this.CPF  = cpf;
        this.RG = rg;
        this.bookLimit = bookLimit;
        this.daysLimit = daysLimit;        
        this.codigo = code;
        this.tipo = type;
    }

    public String getType() {
        return tipo;
    }
    
    public void addFileUser()
    {
        try
        {
            File fp = new File("usuarios.csv");
            FileWriter fw = new FileWriter(fp, true);
            PrintWriter pw = new PrintWriter(fw); // cria um PrintWriter que irá escrever no arquivo

            if(fp.exists() == false)  // caso o arquivo nao exista, cria um arquivo
            { 
                fp.createNewFile();
            }

            // Os comandos abaixo salvam os dados no arquivo, após cada dado adicionado é acrescentada uma virgula para separa-los.
            pw.print(this.getCode());  
            pw.print(",");
            pw.print(this.getName());
            pw.print(",");
            pw.print(this.getCPF());
            pw.print(",");
            pw.print(this.getRG());
            pw.print(",");
            pw.print(this.getBookLimit());
            pw.print(",");
            pw.print(this.getDaysLimit());
            pw.print(",");
            pw.println(this.getType());

            pw.close(); 
            fw.close();
        }

        catch(Exception e){
            System.out.println("Não é possível escrever no arquivo :/");
        }
    }
    
    public void printUser()      // Método que define o tipo do usuário
    {
        PrintStream pw = new PrintStream(System.out);
        
        String mytype = "--Não definido--";
        
        switch (this.getType())
        {
            case "T":
                mytype = "Professor";
                break;
                
            case "S":
                mytype = "Estudante";
                break;
                
//            case "P":
//                mytype = "Pessoa (Comunidade)";
//                break;
        }
        
        // Os comandos abaixo pegam os dados dos usuários  solicitado pelo sistema
        
        pw.println("//--------------------------------------");
        pw.println("||Código: " + this.getCode());
        pw.println("||Nome: " + this.getName());
        pw.println("||CPF: " + this.getCPF());
        pw.println("||RG: " + this.getRG());
        pw.println("||Limite de livros: " + this.getBookLimit());
        pw.println("||Limite de dias: " + this.getDaysLimit());
        pw.println("||Tipo: " + mytype);
        pw.println("\\\\--------------------------------------");
    }
    
    
    // Abaixo os getters e setters da classe Usuario
    
    public void setType(String type) 
    {
        this.tipo = type;
    }    
    
    public String getName()
    {
        return nome;
    }

    public void setName(String name)
    {
        this.nome = name;
    }

    public String getCPF() 
    {
        return CPF;
    }

    public void setCPF(String CPF)
    {
        this.CPF = CPF;
    }

    public String getRG()
    {
        return RG;
    }

    public void setRG(String RG) 
    {
        this.RG = RG;
    }

    public int getBookLimit()
    {
        return bookLimit;
    }

    public void setBookLimit(int bookLimit) 
    {
        this.bookLimit = bookLimit;
    }

    public int getDaysLimit()
    {
        return daysLimit;
    }

    public void setDaysLimit(int daysLimit) 
    {
        this.daysLimit = daysLimit;
    }       

    public int getCode() 
    {
        return codigo;
    }
}
