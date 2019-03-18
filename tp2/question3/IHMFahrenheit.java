package question3;

import question2.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class IHMFahrenheit extends JFrame implements ActionListener{
  private JTextField entree = new JTextField( 6 );
  /** Le bouton de conversion. */
  private JButton  boutonDeConversion = new JButton( "convertir" );
  /** La sortie en degré Celsius. */
  private JTextField sortie = new JTextField( 6 );

  public IHMFahrenheit(){
    super("IHM Fahrenheit");
 
    setLayout(new FlowLayout());
    add( entree ); add( boutonDeConversion ); add( sortie );
    sortie.setEditable( false );
    getContentPane().setBackground( Color.pink );
    setLocation(100,100);
    pack();setVisible(true);
    
    boutonDeConversion.addActionListener( this );
  }

  /** 
   * méthode déclenchée lorsque le bouton de conversion est appuyé. 
   * remarquer que le champs de droite (les degrés Celsius) n'est pas éditable.
   * @param ae l'événement transmis
   */
  public void actionPerformed( ActionEvent ae )
  {
      String val=entree.getText();

      if(TryParseInt(val))
      {
          float res=FahrenheitCelsius.fahrenheitEnCelsius(Integer.parseInt(val));
          if(res<-273.1)
            res=-273.1F;
          sortie.setText(String.valueOf(res));
      }
      else
          sortie.setText("Error in input!");
  }
  
  
  public static void main(String[] args){
      new IHMFahrenheit();
    }
    /**
     * Une methode qui essaye de convertir un string en un entier sans se
     * soucier des parse invalid et des input erronnes
     * params value : la valeur a convertir
     * return boolean : return si la conversion a etait faite
     */
   private static boolean TryParseInt(String value) {  
     try {  
         Integer.parseInt(value);  
         return true;  
      } catch (NumberFormatException e) {  
         return false;  
      }  
    }
}
