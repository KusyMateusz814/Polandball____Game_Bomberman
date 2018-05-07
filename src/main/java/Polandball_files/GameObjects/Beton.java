package Polandball_files.GameObjects;

import Polandball_files.Others.GetConstans;

import static Polandball_files.Others.GetConstans.BetonString;

/**
 * Klasa reprezentujaca niezniszczalna przeszkode typu Beton
 */
public class Beton extends Terrain {
    /**
     * Konstruktor klasy Beton
     * @param x polozenie na osi x
     * @param y polozenie na osi y
     */
    public Beton(int x,int y){
        super();
        x_=x;
        y_=y;
        name_class_object=BetonString;
        buffImage_= GetConstans.BetonBuff;
    }
    /**
     * Metoda udostepniająca obiektowi grafike
     * @return bufferedImage/null - zwraca stworzone zdjecie, lub w wypadku zlapania wyjatku null
     */
   /* private BufferedImage createBufferedImage(){
        try {
            File file = new File(BetonString);
            BufferedImage bufferedImage= ImageIO.read(file);
            return bufferedImage;
        }
        catch(IOException e ){
            e.printStackTrace();
            System.out.println("Blad wczytywania obiektu typu beton");
        }catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }*/
}
