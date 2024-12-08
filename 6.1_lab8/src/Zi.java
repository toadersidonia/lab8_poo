public class Zi {
    private String nume;
    private boolean esteLucratoare;

    public Zi(){
        nume = "";
        esteLucratoare = false;
    }
    public Zi(String nume, boolean esteLucratoare){
        this.nume = nume;
        this.esteLucratoare = esteLucratoare;
    }

    public String getNume(){
        return nume;
    }
    public void setNume(String nume){
        this.nume = nume;
    }
    public Zi getZi(){
        return this;
    }

    public void setLucratoare(boolean esteLucratoare){
        this.esteLucratoare = esteLucratoare;
    }
    public boolean getLucratoare(){
        return esteLucratoare;
    }
}
