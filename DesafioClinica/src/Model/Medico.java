package Model;

public class Medico {

    private String nome;

    private int CRM;

    private String especialidade;

    public Medico(String nome, int CRM, String especialidade) {
        this.nome = nome;
        this.CRM = CRM;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCRM() {
        return CRM;
    }

    public void setCRM(int CRM) {
        this.CRM = CRM;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nome='" + nome + '\'' +
                ", CRM=" + CRM +
                ", especialidade='" + especialidade + '\'' +
                '}';
    }

}
