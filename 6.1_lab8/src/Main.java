//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TEMA PROBLEMA 6.7
        Lucrator l1 = new Lucrator("Ion");
        Lucrator l2 = new Lucrator("Vasile");

        CalendarLucru calendar = new CalendarLucru();

        l1.setCalendar(calendar);
        l2.setCalendar(calendar);

        try{
            l1.lucreaza("Luni");
            l2.lucreaza("Marte");
            l1.lucreaza("Duminica");
        }
        catch(ExceptieZiNelucratoare e){
            System.out.println(e.getMessage());
        }

        Zi z = null;
        try{
            z.getNume(); //null pointer exception
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }

        Zi[] zile = new Zi[7];
        try{
            zile[9].getNume();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        try{
            throw new Exception("Exceptie generica");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Blocul finally tot se executa");
        }


    }

}