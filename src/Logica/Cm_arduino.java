package logeo.ug.pkg2020;
import com.panamahitek.*;
import java.util.logging.*;
import jssc.*;

public class Cm_arduino {
    
  static PanamaHitek_Arduino ino = new PanamaHitek_Arduino();  
  static SerialPortEventListener listener = new SerialPortEventListener()
 {
     @Override
     public void serialEvent(SerialPortEvent spe){
     try{
        if (ino.isMessageAvailable()) {
        System.out.println("mensaje recibido:");
        System.out.println(ino.printMessage());
        
        }    
         
     }catch(SerialPortException | ArduinoException ex){
     Logger.getLogger(Cm_arduino.class.getName()).log(Level.SEVERE, null, ex);
       }
     }  

   
 };  
     
public static void main(String[] args) {
     try
    {
        
      ino.arduinoRX("COM5", 9600, listener);
     
    }catch (ArduinoException | SerialPortException ex){
         Logger.getLogger(Cm_arduino.class.getName()).log(Level.SEVERE, null, ex);
    }
 }

}  