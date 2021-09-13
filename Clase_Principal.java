/**
 *
 * @author Luis
 */
public class Clase_Principal {
    public static void main(String[] args) {
        
                Direccion d1 = new Direccion("Calle 31 #9D-", 3);
        Direccion d2 = new Direccion("Calle 19B #6A-", 39);
        
        Persona p = new Persona("Luis", 19);
        p.setDirección(d1);
        
        Empresa e = new Empresa("1A", "Security INC");
        e.setDirección(d2);

        System.out.println("Mi nombre es " + p.getNombre() + " y tengo "+ p.getEdad() + " años " + "y mi dirección es " + p.getDirección().getCalle() + p.getDirección().getNumero());
        System.out.println("El nombre de esta empresa es "+ e.getNombre() + " y su dirección es " + e.getDirección().getCalle() + e.getDirección().getNumero());
    }
    
}
