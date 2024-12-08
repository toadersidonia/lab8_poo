public class Lucrator {
    private String nume;
    private CalendarLucru c;

    public Lucrator(String nume) {
        this.nume = nume;
        this.c = new CalendarLucru();
    }

    public String getNume(){
        return this.nume;
    }
    public CalendarLucru getCalendar(){
        return this.c;
    }
    public void setCalendar(CalendarLucru c){
        this.c = c;
    }

    public void lucreaza(String zi) throws ExceptieZiNelucratoare{
        boolean gasit = false;
        for(Zi z : c.zile){
            if(z.getNume().equals(zi)){
                gasit = true;
            }
        }
        if(gasit  == true){
            for(Zi z : c.zile){
                if(z.getNume().equals(zi)) {
                    if (z.getLucratoare() == true) {
                        System.out.println("Lucratorul " + nume + " lucreaza " + zi);
                    } else {
                        throw new ExceptieZiNelucratoare("Lucratorul " + nume + " NU lucreaza " + zi); //o aruncam explicit, atunci punem si in semnatura metodei
                    }
                }
            }
        }else{
            System.out.println("Ziua introdusa nu exista");
        }

    }
}
