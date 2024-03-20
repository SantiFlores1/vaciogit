
public class Persona {
    
    
    private String nombre;

    private String apellido;

    private int edad;

    private int dni;
    
    private Perro mascota1;
    private Perro mascota2;
    private Perro mascota3;
    
    public Persona(String nombre, String apellido, int edad, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        mascota1=null;
        mascota2=null;
        mascota3=null;
    }
    
    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void adoptarPerro(Perro perrito) {
        
       if(mascota1==null){
            mascota1=perrito;
            System.out.println("adopto a "+mascota1.getNombre());
        }else if(mascota2==null){
            mascota2=perrito;
            System.out.println("adopto a "+mascota2.getNombre());
        }else if(mascota3==null){
            mascota3=perrito;
            System.out.println("adopto a "+mascota3.getNombre());
        }else{
            System.out.println("Ya no puede adoptar");
        }
    }

    public String perroMasGrande() {
    String perroMayor=null;
    int mayor=0;
        
        if(mascota1!=null && mascota1.getEdad()>mayor ){
            perroMayor=mascota1.getNombre();
            mayor=mascota1.getEdad();
        }
        if(mascota2!=null && mascota2.getEdad()>mayor ){
            perroMayor=mascota2.getNombre();
            mayor=mascota2.getEdad();
        }
        if(mascota3!= null && mascota3.getEdad()>mayor ){
            perroMayor=mascota3.getNombre();
            mayor=mascota3.getEdad();
        }
        return "El perro mayor es: "+perroMayor+" con "+mayor;
        
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", mascota1=" + mascota1.getNombre() + ", mascota2=" + mascota2.getNombre() + ", mascota3=" + mascota3.getNombre() + '}';
    }
    
    
    
}
