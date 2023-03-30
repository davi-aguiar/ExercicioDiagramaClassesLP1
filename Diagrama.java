public class Diagrama{
    private int dia;
    private String mes;
    private int ano;

    public Diagrama(int dia, String mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }
    public void imprimirData(){
        System.out.println("/"+dia+" /" + mes +"/" + ano);
    }

    public String toString() {
        return dia + mes + ano;
    }

}