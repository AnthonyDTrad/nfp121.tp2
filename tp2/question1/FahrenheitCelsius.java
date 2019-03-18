package question1;

/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * Classe qui convertie un nombre en fahrenheit a un nombre arrondie en celcius
 * @author (Anthony Trad)
 * @version 1.0
 */
public class FahrenheitCelsius {

    /**
     * le point d'entrée de cette application, dont le commentaire est à
     * compléter :
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
                    System.out.println(valF + "\u00B0F -> " + valC + "\u00B0C"); // ligne,  // imposés ?                                                                  // format
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
     * la méthode à compléter.
     * 
     * @param f
     *            la valeur en degré Fahrenheit
     * @return la conversion en degré Celsius
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
    public static float ArrondirParCalcule(float valeurAarrondir,int précision) 
    {
        //Contrainte 2 : resultat avec 1 chiffre
        //derriere la virgule par calcul :
        
        //Valeur par defaut pour des input erronnes
        if(précision<=0||précision%10!=0)
            précision = 10;
        
        //L'arrondire
        float valArrondie=(float)((int)(valeurAarrondir*précision))
                                                    /précision;
        return valArrondie;
    }

}
