public class ClasaB extends ClasaA{
   //suprascriem metoda din clasa A si aruncam o excepitie
    public void method() throws Exception2{
        throw new Exception2("Exceptie aruncata in metoda din clasa B");
    }
}
