public class Paciente {
    private String nome;
    private int idade;
    private Endereco end;
    private Exame tipoExame;

    public Paciente(int idade, Endereco end, Exame tipoExame, String nome){
        this.end = end;
        this.nome = nome;
        this.tipoExame = tipoExame;
        this.idade = idade;
    }
    public void relatoriop1 (){
        end.imprimirEnd();
        tipoExame.relatorioE();
        System.out.println(nome+" "+ idade );

    }

}
