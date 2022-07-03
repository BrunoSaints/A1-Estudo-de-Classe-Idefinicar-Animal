class Animal {
    String nome;
    int peso;
    void Registro(String Nome, int Peso){
        nome = Nome;
        peso = Peso;
    }    
    void exibirinformacao() {
        System.out.println (nome + "" + peso);
    }
}

public class Definir {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        animal1.Registro("Vaca"+"-",120);
        animal2.Registro("Galinha"+"-",18);
        animal1.exibirinformacao();
        animal2.exibirinformacao();
    }
}