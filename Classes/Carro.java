public class Carro {
 
    private String marca;
    private String modelo;
    private int ano;
    private Pessoa dono; 


    public Carro(String marca, String modelo, int ano, Pessoa dono) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.dono = dono;
    }

   

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Pessoa getDono() {
        return dono;
    }

    public void setDono(Pessoa dono) {
        this.dono = dono;
    }

    
    public void exibirInfo() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        if (dono != null) {
            System.out.println("Dono: " + dono.getNome()); 
        } else {
            System.out.println("Dono: Nenhum"); 
        }
    }
}
