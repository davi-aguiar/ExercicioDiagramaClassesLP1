public class Main {
    public static void main(String []args )throws Exception{
        Diagrama d1 = new Diagrama(22," marco", 2002);
        Exame ex1 = new Exame(1,1.0,d1,"tudo nosso" );
        Endereco e1 = new Endereco ("IFBA",666,66);
        Paciente p1 = new Paciente(666,e1,ex1, "jota");
        
        p1.relatoriop1();
    }
    
}
