package aula2704;

public class Animal {
    private String nome;
    private float comprimento;
    private int num_patas;
    private String cor;
    private String ambiente;
    private float vel_media;

    public Animal(String nome, float comprimento, int num_patas, String cor, String ambiente, float vel_media) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.num_patas = num_patas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.vel_media = vel_media;
    }

    // Getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getNum_patas() {
        return num_patas;
    }

    public void setNum_patas(int num_patas) {
        this.num_patas = num_patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVel_media() {
        return vel_media;
    }

    public void setVel_media(float vel_media) {
        this.vel_media = vel_media;
    }

    // Método para imprimir os dados do animal
    public void dados() {
        System.out.println("Nome: " + nome);
        System.out.println("Comprimento: " + comprimento);
        System.out.println("Número de patas: " + num_patas);
        System.out.println("Cor: " + cor);
        System.out.println("Ambiente: " + ambiente);
        System.out.println("Velocidade média: " + vel_media);
    }

    public void rugir() {
    }


}




--------------------------------------------------------------------------------------------------------------------------------------
  
  
  
  
  package aula2704;

public class TesteAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Leão", 2.2f, 4, "Marrom", "Savana", 80f);
        Animal animal2 = new Animal("Tubarão", 3.5f, 0, "Cinza", "Oceano", 45f);

        animal1.dados();
        animal1.rugir();
        System.out.println();
        animal2.dados();
        animal2.rugir();
    }
}

