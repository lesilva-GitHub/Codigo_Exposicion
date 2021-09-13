/**
 *
 * @author Luis
 */
public class Persona {    
    private String nombre;
    private int edad;

    private Direccion dirección;

    public Persona(String n, int ed) {
        this.nombre = n;
        this.edad = ed;

    }
    public Direccion getDirección() {
        return dirección;
    }
    public void setDirección(Direccion dirc) {
        this.dirección = dirc;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    } 
}
