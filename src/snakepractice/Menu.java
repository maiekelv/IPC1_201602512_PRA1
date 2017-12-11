
package snakepractice;

import java.util.Scanner;

public class Menu {
    public Posicion[][] Tablero;
    public Intento[] Intentos;
    public Intento intentoActual;
    
    public Menu(){
    this.Tablero = new Posicion[35][70];
    this.Intentos = new Intento[1];
    }
    
    public void asignarCuerpoCulebra(){
        for(int i=0;i<35;i++){
                for(int j=0; j<70;j++){
                    if(this.Tablero[i][j].tipo=='X'){
                    this.Tablero[i][j].setTipo(' ');
                    
                    } 
            }
                
        };
        int contadorLargo = 0;
        
        while(contadorLargo<this.intentoActual.Snake.largoActual){
            this.Tablero[this.intentoActual.Snake.cuerpo[contadorLargo].x][this.intentoActual.Snake.cuerpo[contadorLargo].y].setTipo('X');
            contadorLargo++;
        }
        
    }
    public void mostrarMenu(){
        
        
        
        Scanner lectordeteclas = new Scanner(System.in);
        while(true){
            System.out.println("***********Juego Snake************");
            System.out.println("");
            System.out.println("1. Iniciar Juego");
            System.out.println("2.Regresar al Juego");
            System.out.println("3.Historial");
            System.out.println("4.Salir");
            System.out.println("Instrucciones");
            System.out.println("");
            System.out.println("Ingrese una opcion");
            try{
                int seleccion =lectordeteclas.nextInt();
               
                switch(seleccion){
                    case 1:
                        leerUsuario();
                        iniciarTablero();
                        imprimirTablero();
                        iniciarJuego();
                        break;
                    case 2:
                        regresarJuego();
                        break;
                    
                    case 3:
                        break;
                    
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Ingrese una opcion valida");
                        break;
                        
                    
                } 
                int enter = System.in.read();
                this.borrarConsola();
            
            }
            catch(Exception e){
                System.out.println("Error leyendo Tecla");
                lectordeteclas = new Scanner(System.in);
            }
        }
    };
    public void imprimirTablero(){
    for(int i=0;i<35;i++){
                for(int j=0; j<70;j++){
                       System.out.print(this.Tablero[i][j].tipo);
                }
                System.out.println(' ');
        
        };
    System.out.println("Nombre :" + intentoActual.Usuario.Nombre);
    System.out.println("Fecha de Nacimiento  " + intentoActual.Usuario.fechaNacimiento);
    System.out.println("Punteo " + intentoActual.Punteo);
    }
    public void leerUsuario(){
        this.intentoActual = new Intento();
        System.out.println("Ingrese su Nombre");
        Scanner sc = new Scanner(System.in);
        String nombre = sc.nextLine();
    
        System.out.println("Ingrese su Fecha de Nacimiento");
        String fechaDeNacimiento = sc.nextLine();
        this.intentoActual.Usuario = new Usuario(nombre, fechaDeNacimiento);
        this.intentoActual.Punteo =10;
    }
    public void iniciarTablero(){
            for(int i=0;i<35;i++){
                for(int j=0; j<70;j++){
                    if (i==0||i==34){
                    this.Tablero[i][j] = new Posicion(i,j,'#');
                    }
                    else if(j==0||j==69){
                    this.Tablero[i][j] = new Posicion(i,j,'#');
                    }
                    else{
                    
                        this.Tablero[i][j]= new Posicion(i,j,' ');
                    }
                }
             
        };
         
        
        
            int xCabezaRandom=(int) (Math.random() * 35);
            if(xCabezaRandom==0||xCabezaRandom==34){
               xCabezaRandom=1;
            }
            int yCabezaRandom=(int) (Math.random() * 70);
            if(yCabezaRandom==0||yCabezaRandom==69){
               yCabezaRandom=1;
            }
        
        Posicion cabeza = new Posicion(xCabezaRandom, yCabezaRandom,'X');
        Posicion cola = new Posicion(xCabezaRandom, yCabezaRandom,'X');
        Snake culebra = new Snake(cabeza, cola);
        this.intentoActual.setSnake(culebra);
            
            this.asignarCuerpoCulebra();
            int contadormas10 = 40;
            int contadormenos10= 30;
            int contadorcero= 20;
            
            while(contadormas10>0){
                int columnaRandom=(int) (Math.random() * 70); 
                int filaRandom=(int) (Math.random() * 35);
            if(this.Tablero[filaRandom][columnaRandom].tipo==' '){
                this.Tablero[filaRandom][columnaRandom].setTipo('%');
                contadormas10--;
            }
            }
            
            while(contadormenos10>0){
                int columnaRandom=(int) (Math.random() * 70); 
                int filaRandom=(int) (Math.random() * 35);
            if(this.Tablero[filaRandom][columnaRandom].tipo==' '){
                this.Tablero[filaRandom][columnaRandom].setTipo('$');
                contadormenos10--;
            }
            }
            
            while(contadorcero>0){
                int columnaRandom=(int) (Math.random() * 70); 
                int filaRandom=(int) (Math.random() * 35);
            if(this.Tablero[filaRandom][columnaRandom].tipo==' '){
                this.Tablero[filaRandom][columnaRandom].setTipo('#');
                contadorcero--;
            }
            
            }
            
            
            
            
         
        
    }
    
    public void imprimirHistoria(){};
    public void iniciarJuego(){
        Scanner lectordeteclas = new Scanner(System.in);
        while (true){
            try{
             
               
                String seleccion = lectordeteclas.nextLine();
                
                if(seleccion.equals("w")){    
                        moverArriba();
                        asignarCuerpoCulebra();
                        imprimirTablero();
                }
                else if(seleccion.equals("s")){
                    moverAbajo();
                    asignarCuerpoCulebra();
                    imprimirTablero();
                }
                else if(seleccion.equals("a")){
                    moverIzquierda();
                    asignarCuerpoCulebra();
                    imprimirTablero();
                }
                else if(seleccion.equals("d")){
                    moverDerecha();
                    asignarCuerpoCulebra();
                    imprimirTablero();
                }
                else if(seleccion.equals("m")){
               
                        mostrarMenu();
                }
                else{
                        System.out.println("Ingrese una opcion valida");
                }
                this.borrarConsola();
            
            }
            catch(Exception e){
                System.out.println("Error leyendo Tecla");
                lectordeteclas = new Scanner(System.in);
            }
            
        }
    };
    public void moverArriba(){
        int filaActual=this.intentoActual.Snake.cabeza.x;
        if(filaActual>1){
        Posicion siguiente = this.Tablero[this.intentoActual.Snake.cabeza.x-1][this.intentoActual.Snake.cabeza.y];
        this.intentoActual.Punteo=this.intentoActual.Snake.mover(siguiente, this.intentoActual.Punteo);
        validarPunteo();
        }
        
        
        
    }
    public void moverAbajo(){
    int filaActual=this.intentoActual.Snake.cabeza.x;
        if(filaActual<33){
        Posicion siguiente = this.Tablero[this.intentoActual.Snake.cabeza.x+1][this.intentoActual.Snake.cabeza.y];
        this.intentoActual.Punteo=this.intentoActual.Snake.mover(siguiente, this.intentoActual.Punteo);
        validarPunteo();
        }
    }
    public void moverIzquierda(){
    int columnaActual=this.intentoActual.Snake.cabeza.y;
        if(columnaActual>1){
        Posicion siguiente = this.Tablero[this.intentoActual.Snake.cabeza.x][this.intentoActual.Snake.cabeza.y-1];
        this.intentoActual.Punteo=this.intentoActual.Snake.mover(siguiente, this.intentoActual.Punteo);
        validarPunteo();
        }
    }
    public void moverDerecha(){
    int columnaActual=this.intentoActual.Snake.cabeza.y;
        if(columnaActual<68){
        Posicion siguiente = this.Tablero[this.intentoActual.Snake.cabeza.x][this.intentoActual.Snake.cabeza.y+1];
        this.intentoActual.Punteo=this.intentoActual.Snake.mover(siguiente, this.intentoActual.Punteo);
        validarPunteo();
        }
    }
    
    
    
    public void regresarJuego(){
    imprimirTablero();
    iniciarJuego();
    };
    
    public void crearTablero(){
        
    };
    
        public void borrarConsola()
{
    String sistemaOperativo=System.getProperty("os.name");                              
    
    if(sistemaOperativo.contains("Windows")) 
    {
        try{  
                Runtime.getRuntime().exec("cls"); 
        }catch(Exception e){}
    }
            
    else
    {   try{
            Runtime.getRuntime().exec("clear"); 
        }catch(Exception e){}
    }
    
    }
public void validarPunteo(){
    if(this.intentoActual.Punteo<1){
    System.out.println("Has Perdido");
    try{
        int Enter = System.in.read();
        mostrarMenu();
    }
    catch(Exception e){
        mostrarMenu();
    }
    }
    
    else if(this.intentoActual.Punteo>99){
    System.out.println("Has Ganado");
    try{
        int Enter = System.in.read();
        mostrarMenu();
    }
    catch(Exception e){
        mostrarMenu();
    }
    }
}        
}

