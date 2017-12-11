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
    

    public int mover(Posicion siguiente, int punteoActual){
        if (siguiente.tipo=='#'){
           correrCuerpo(siguiente) ;
            
        }
        else if(siguiente.tipo=='%'){
            punteoActual = punteoActual + 10;            
            correrCuerpo(siguiente) ;
            this.largoActual++; 
        }
        else if(siguiente.tipo=='$'){
           correrCuerpo(siguiente) ;
           punteoActual = punteoActual -10;
           this.largoActual--;
            
        }
        else if(siguiente.tipo==' '){
           correrCuerpo(siguiente) ;
        }
        
        return punteoActual;
    }
    public void setCuerpo(Posicion[] cuerpo) {
        this.cuerpo = cuerpo;
    }
    public void correrCuerpo(Posicion siguiente){
        int contadorCorrer=largoActual-1;
            while(contadorCorrer>=0){
                this.cuerpo[contadorCorrer+1]= this.cuerpo[contadorCorrer];
                contadorCorrer--;
            }
            this.cuerpo[0]= siguiente;
            this.cabeza = siguiente;
    }
    public int mover(int codigoTecla){
    
        return 1;
    }
    
   
        
              
                
    
    
}
