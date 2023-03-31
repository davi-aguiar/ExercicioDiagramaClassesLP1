public class Exame {
    private String descricao;
    private int codigo;
    private double valor;
    private Diagrama realizacao;
    
    public Exame(int codigo, double valor, Diagrama realizacao, String descricao){
        this.realizacao = realizacao;
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }
     public void relatorioE(){
        System.out.print(descricao  +" "+ codigo +" "+ valor );
        realizacao.imprimirData();
    }
    
}

