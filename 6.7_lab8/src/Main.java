//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    ClasaB o = new ClasaC(); //upcast - obiectul de tip Clasa C e tratat ca un obiect de Clasa A

        try{
            o.method(); //metoda care arunca exceptia
        }catch(Exception3 e3){
            System.out.println(e3.getMessage());
        }catch(Exception2 e2){
            System.out.println(e2.getMessage());
        }catch(Exception1 e1){
            System.out.println(e1.getMessage());
        }
        //=> Exceptie aruncata in metoda din clasa C
        //Obiectul e creat ca instanta a clasei C, dar tratat ca un obiect de tip A
        //!!!!Metoda suprascrisa e chemata in functie de tipul real al obiectului !!! Adica C
        //Exceptiile cele mai specifice trebuie scrise in primele blocuri catch(cea mai specifica e Exception3)
        //pana la cele mai generale(Exception1)
    }
}