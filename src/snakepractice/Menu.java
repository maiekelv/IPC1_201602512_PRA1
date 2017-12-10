
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
                int yCabezaRandom=(int) (Math.random() * 70);
        
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
               
                switch(seleccion){
                    case "w":
                        leerUsuario();
                        iniciarTablero();
                        imprimirTablero();
                        break;
                    case "s":
                        break;
                    
                    case "a":
                        break;
                    
                    case "d":
                        
                        break;
                    case "m":
                        mostrarMenu();
                        
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
        
}

