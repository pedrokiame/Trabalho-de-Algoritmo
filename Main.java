import java.util.HashMap;
public class Main {
    static class Aluno {
        private String matricula;
        private String nome;

        public Aluno(String matricula, String nome) {
            this.matricula = matricula;
            this.nome = nome;
        }

        public String getMatricula() {
            return matricula;
        }

        public String getNome() {
            return nome;
        }

        @Override
        public String toString() {
            return "Aluno{" +
                    "matricula='" + matricula + '\'' +
                    ", nome='" + nome + '\'' +
                    '}';
        }}
    static HashMap<String, Aluno> tabelaHash = new HashMap<>();

    // Cadastrar aluno
    public static void cadastrarAluno(Aluno aluno) {
        tabelaHash.put(aluno.getMatricula(), aluno);}

    // Consultar aluno pela matrícula
    public static Aluno consultarAluno(String matricula) {
        return tabelaHash.get(matricula);
    }
    public static void main(String[] args) {

        // Cadastro de alunos
        cadastrarAluno(new Aluno("2025001", "Chaves Genius"));
        cadastrarAluno(new Aluno("2025002", "Pedro Kiame"));
        cadastrarAluno(new Aluno("2025003", "Amem Kiala"));

        // Consulta
        String matriculaConsulta = "2025002";
        Aluno aluno = consultarAluno(matriculaConsulta);

        if (aluno != null) {
            System.out.println("Aluno encontrado:");
            System.out.println(aluno);
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
}