package snakepractice;
import jcurses.system.InputChar;
import jcurses.system.Toolkit;

public class SnakePractice {
    
    


    public static void main(String[] args) {
        
         int y = 0;
        Toolkit.init();
        while (true) {
            InputChar c = Toolkit.readCharacter();
            if ('q' == c.getCharacter())
                break;
        }
        Toolkit.shutdown();
        Menu mainMenu = new Menu();
        mainMenu.mostrarMenu();
        
        
        
                
            }
        
    }

 
