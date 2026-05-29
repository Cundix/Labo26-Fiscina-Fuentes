package escuela;

public enum Editorial {

    KAPELUSZ, SUDAMERICANA, ATLANTIDA, EL_ATENEO, INTERZONA, SUR, ALIANZA;

    public void mostrarEditorial()
    {
        for (Editorial editorial : Editorial.values())
        {
            System.out.println(editorial);
        }
    }

}
