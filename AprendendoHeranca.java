package aprendendoheranca;
public class AprendendoHeranca {
    public static void main(String[] args) {
        //Programa principal
        
        /*Visitante v1 = new Visitante();
        v1.setNome("Claudio");
        v1.setIdade(19);
        v1.setSexo("M");
        v1.toString();
        System.out.println(v1.toString());
        */
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(01);
        a1.setCurso("ADS");
        a1.setIdade(19);
        a1.setSexo("M");
        a1.pagarMensalidade();
        Bolsista b1 = new Bolsista();
        b1.setMatricula(02);
        b1.setNome("João");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
               
       
        
      
    }
    
}
