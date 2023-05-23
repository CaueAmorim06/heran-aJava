public class Mayan extends Linguagem {
    public Mayan(String nome, int numFalantes){
        super(nome, numFalantes, "América Central", "verbo-objeto-sujeito");
        
        
    }

    public String getInfo(){
        return nome + " é falado por " + numFalantes + " pessoas principalmente em " 
        + regioesFaladas + "." + "\n A linguagem segue a ordem das palavras: " + ordemDasPalavras + " Fato interessante: " + nome + " é uma lingua ergativa." ;
    }
    public static void main(String[] args) {
        
    }

    
}
