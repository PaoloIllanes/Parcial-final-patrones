package visitor.ejercicio;

public abstract class IDepartamento {
    private String nombre;
    private int provincias;
    private String clima;
    private int habitantes;
    private int dineroTurismo;

    public IDepartamento(String nombre ,int provincias, String clima, int habitantes, int dineroTurismo){
        this.clima= clima;
        this.dineroTurismo= dineroTurismo;
        this.provincias= provincias;
        this.habitantes= habitantes;
        this.nombre= nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProvincias() {
        return provincias;
    }

    public void setProvincias(int provincias) {
        this.provincias = provincias;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public int getHabitantes() {
        return habitantes;
    }

    public void setHabitantes(int habitantes) {
        this.habitantes = habitantes;
    }

    public int getDineroTurismo() {
        return dineroTurismo;
    }

    public void setDineroTurismo(int dineroTurismo) {
        this.dineroTurismo = dineroTurismo;
    }
}
