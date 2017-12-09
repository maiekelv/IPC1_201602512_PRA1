
package snakepractice;

import java.util.logging.Logger;


public class Usuario {
    public String Nombre;
    public String fechaNacimiento;
    
    public Usuario(){
    }
    public Usuario(String Nombre, String fechaNacimiento){
        this.Nombre = Nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
           
}
