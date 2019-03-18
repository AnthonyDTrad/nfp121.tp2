package question1;

/**
 * D�crivez votre classe FahrenheitCelsius ici.
 * Classe qui convertie un nombre en fahrenheit a un nombre arrondie en celcius
 * @author (Anthony Trad)
 * @version 1.0
 */
public class FahrenheitCelsius {

    /**
     * le point d'entr�e de cette application, dont le commentaire est �
     * compl�ter :
     * lire une valeur entiere par parametre et la convertir
     * @param args
     * Prendre une valeur en fahrenheit par args
     * et afficher la conversion en celcius
     */
    public static void main(String[] args) {
        int valF=0;
        float valC;
        
        if(args!=null&&args.length>0)
            for(int i=0;i<args.length;i++)
            {
                    valF=Integer.parseInt(args[i]);
                    valC=fahrenheitEnCelsius(valF);
                    System.out.println(valF + "\u00B0F -> " + valC + "\u00B0C"); // ligne,  // impos�s ?                                                                  // format
            }                                                                                                                                          
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
    /**
     * la m�thode � compl�ter.
     * 
     * @param f
     *            la valeur en degr� Fahrenheit
     * @return la conversion en degr� Celsius
     */
    public static float fahrenheitEnCelsius(int f) 
    {
        //Contraine 1 : Appliquer la formule :
        float valCelcius= (float)(5.0/9.0)*(f-32); 
        
        //Arrondire et retourner la valeur final 
        return ArrondirParCalcule(valCelcius,10);
    }
    /**
     * Une methode qui arrondie un flaot donne avec une precision donne
     * params value : la valeur a arrondir , la precision donnes sous la forme de 10^(le nombre de chiffre apres la virgule)
     * return float : return la valeur arrondie
     */
    public static float ArrondirParCalcule(float valeurAarrondir,int pr�cision) 
    {
        //Contrainte 2 : resultat avec 1 chiffre
        //derriere la virgule par calcul :
        
        //Valeur par defaut pour des input erronnes
        if(pr�cision<=0||pr�cision%10!=0)
            pr�cision = 10;
        
        //L'arrondire
        float valArrondie=(float)((int)(valeurAarrondir*pr�cision))
                                                    /pr�cision;
        return valArrondie;
    }

}
