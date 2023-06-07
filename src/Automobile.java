public class Automobile {
    public String marca;
    public String modello;
    public int anno;
    public String colore;

    public Automobile(String marca , String modello , int anno , String colore){
        this.marca = marca;
        this.modello = modello;
        this.anno = anno;
        this.colore = colore;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public  void  mostraDettagli(){
        System.out.println("Questi sono i dettsgli: " + this.marca + this.modello + this.anno + this.colore);
    }

    public String getColore() {
        return colore;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }
    public void avvia(){
        System.out.println("Bruuuuuuum....popooppo!");
    }

    public  void ferma(){
        System.out.println("pufff....");
    }

    public void suona_clacson(){
        System.out.println("Beeeeep");
    }
}
