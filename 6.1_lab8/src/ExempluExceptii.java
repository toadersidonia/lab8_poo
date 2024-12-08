public class ExempluExceptii {

    public void f() throws ExceptieF
    {
        try{
            g();
        }catch(ExceptieG e){
            throw new ExceptieF("Mesaj de exceptie pentru F" + e.getMessage());
        }

    }
    public void g() throws ExceptieG{
        throw new ExceptieG("Mesaj de exceptie pentru G");

    }
    public static void main(String[] args){
        ExempluExceptii e = new ExempluExceptii();
        try{
            e.f();
        }catch(ExceptieF ex){
            System.out.println(ex.getMessage());

        }
    }
}
