
package snakepractice;

import java.util.Scanner;

public class Menu {
    public Posicion[][] Tablero;
    public Intento[] Intentos;
    
    public Menu(){
    this.Tablero = new Posicion[35][70];
    this.Intentos = new Intento[1];
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
                        imprimirTablero();
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
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
                        this.Tablero[i][j]= new Posicion(i,j,' ');
                }
             
        };
        Intento intentoActual = new Intento();
        
        Snake culebra = new Snake();
            int xCabezaRandom=(int) (Math.random() * 70); 
                int yCabezaRandom=(int) (Math.random() * 35);
        
        Posicion cabeza = new Posicion(xCabezaRandom, yCabezaRandom,'X');
        Posicion cola = new Posicion(xCabezaRandom, yCabezaRandom,'X');
        culebra.setCabeza(cabeza);
        culebra.setCola(cola);
        
            
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
            
            
            for(int i=0;i<35;i++){
                for(int j=0; j<70;j++){
                       System.out.print(this.Tablero[i][j].tipo);
                }
                System.out.println('-');
                
        
            
            
                
        
             
        };
        
            
         
        
    }
    
    public void imprimirHistoria(){};
    public void iniciarJuego(){};
    public void regresarJuego(){};
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
