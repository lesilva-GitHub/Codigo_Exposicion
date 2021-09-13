/**
 *
 * @author Luis
 */
public class Empresa {
        private String cif;
    private String nombre;

    private Direccion dirección;

    public Empresa(String c, String nombre){
        this.cif = c;
        this.nombre = nombre;
    }
    public Direccion getDirección() {
        return dirección;
    }
    public void setDirección(Direccion dirección) {
        this.dirección = dirección;
    }
    public String getCif() {
        return cif;
    }
    public void setCif(String cif) {
        this.cif = cif;
    }  
    public String getNombre(){
        return nombre;
    } 
    public void setNombre(String nombre){
        this.nombre = nombre;
    }   
}
