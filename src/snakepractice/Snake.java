package snakepractice;

public class Snake {
    public int largoActual;
    public Posicion cabeza, cola;
    public Posicion [] cuerpo;
    
    
    public Snake (){
        this.cuerpo= new Posicion[2450];
        this.largoActual = 1;
    }
    public Snake(Posicion cabeza, Posicion cola, Posicion [] cuerpo){
        this.cabeza = cabeza;
        this.cola= cola;
        this.cuerpo= cuerpo;
    }
    public Snake(Posicion cabeza, Posicion cola){
        this.cabeza = cabeza;
        this.cola= cola;
        this.largoActual=1;
        this.cuerpo= new Posicion[2450];
        this.cuerpo[0]= new Posicion(cabeza.x, cabeza.y,'X');
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
