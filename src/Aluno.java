public class Aluno extends Pessoa{
    private int matr;
    private String curso;

    public int getMatr() {
        return matr;
    }

    public void setMatr(int matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Aluno(String nome, int idade, char sexo, int matr, String curso) {
        super(nome, idade, sexo);
        this.matr = matr;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome=" + getNome() +
                ", idade=" + getIdade() +
                ", sexo=" + getSexo() +
                ", matr=" + matr +
                ", curso='" + curso + '\'' +
                '}';
    }
}
