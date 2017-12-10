package snakepractice;

public class Snake {
    public Posicion cabeza, cola;
    public Posicion [] cuerpo;
    
    public Snake (){}
    public Snake(Posicion cabeza, Posicion cola, Posicion [] cuerpo){
        this.cabeza = cabeza;
        this.cola= cola;
        this.cuerpo= cuerpo;
    }

    public Posicion getCabeza() {
        return cabeza;
    }

    public Posicion getCola() {
        return cola;
    }

    public Posicion[] getCuerpo() {
        return cuerpo;
    }

    public void setCabeza(Posicion cabeza) {
        this.cabeza = cabeza;
    }

    public void setCola(Posicion cola) {
        this.cola = cola;
    }
    

    public void setCuerpo(Posicion[] cuerpo) {
        this.cuerpo = cuerpo;
    }
    
    public int mover(int codigoTecla){
    
        return 1;
    }
    
   
        
              
                
    
    
}
