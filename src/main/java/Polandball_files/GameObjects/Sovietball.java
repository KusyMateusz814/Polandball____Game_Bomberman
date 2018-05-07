package Polandball_files.GameObjects;

import static Polandball_files.Others.GetConstans.SovietBallBuff;
import static Polandball_files.Others.GetConstans.SovietBallString;

/**
 * Klasa reprezentujaca wroga typu Sovietball
 */
public class Sovietball extends Enemy {
    /**
     * Konstruktor klasy Sovietball
     * @param x obecne polozenie obiektu na osi x
     * @param y obecne polozenie obiektu na osi y
     */
    public Sovietball(int x,int y){
        super();
        x_=x;
        y_=y;
        velX_=0;//Monsterspeed;
        velY_=0;//Monsterspeed;
        name_class_object=SovietBallString;
        buffImage_=SovietBallBuff;
        distance_from_elevation_walls=1/32;
        distance_from_azimuth_walls=1/32;
    }

}
