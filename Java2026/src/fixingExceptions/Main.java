package fixingExceptions;



public class Main{

    static int longitudString(String string) throws NombreNulo{
        if(string.equals(null)) { throw new NombreNulo("Nombre nulo"); }
        else return string.length();
    }

    public static void main(String[] args){
        String nombre = null;
        try {
                System.out.println("El largo del nombre es:" + longitudString(nombre));
        }
        catch (NombreNulo e)
        {
            e.msg();
        }
    }
}


