
package snakepractice;

public class Intento {
    public Usuario Usuario;
    public Snake Snake;
    public int Punteo;
    
    public Intento(){
        
    }
    public Intento(Usuario Usuario, Snake Snake, int Punteo){
        this.Usuario = Usuario;
        this.Snake = Snake;
        this.Punteo = Punteo;
    }

    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }

    public void setSnake(Snake Snake) {
        this.Snake = Snake;
    }

    public void setPunteo(int Punteo) {
        this.Punteo = Punteo;
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public Snake getSnake() {
        return Snake;
    }

    public int getPunteo() {
        return Punteo;
    }
    
}
