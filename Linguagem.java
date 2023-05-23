public class Linguagem {    
    protected String nome;
    protected int numFalantes;
    protected String regioesFaladas;
    protected String ordemDasPalavras;

    public Linguagem(String nome, int numFalantes, String regioesFaladas, String ordemDasPalavras){
        this.nome = nome;
        this.numFalantes = numFalantes;
        this.regioesFaladas = regioesFaladas;
        this.ordemDasPalavras = ordemDasPalavras;
    }
    public String getInfo(){
        return nome + " é falado por " +numFalantes+ " pessoas principalmente em " + regioesFaladas+ "." + "\nA linguagem segue a ordem das palavras " + ordemDasPalavras + ".";
                
    }
    
    public static void main(String[] args) {
        Linguagem Japones = new Linguagem("Japones", 127000000, "Japão", "sujeito-objeto-verbo");
        System.out.println(Japones.getInfo());
        Linguagem Yucatan = new Linguagem("Yucatan", 6000000, "América Central", "verbo-objeto-sujeito");
        System.out.println(Yucatan.getInfo());
        Linguagem Mandarim = new Linguagem("Chinês", 918000000, "China, Taiwan, Malásia, Indonésia e Cingapura", "sujeito-verbo-objeto");
        System.out.println(Mandarim.getInfo());
        Linguagem Birmanes = new Linguagem("Birmanês", 38000000, "Mianmar e Tailândia", "sujeito-objeto-verbo");
        System.out.println(Birmanes.getInfo());
        
            
        }
    }
    

