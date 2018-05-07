package Polandball_files.Frames;

import Polandball_files.Panels.StartPanel;

import javax.swing.*;

import static Polandball_files.Others.GetConstans.BackgroundString;

/**
 * Okno glowne, wyświetlane podczas uruchomienia gry
 */
public class MainFrame extends JFrame {

    /**
     * Obiekt typu startPanel, zawierajacy wyglad okna glownego
     */

    public static StartPanel startPanel;

    /**
     * Konstruktor okna glownego, zawierający metode initMainFrame()
     */

    public MainFrame() {
        initMainFrame();
    }

    /**
     * MetodA zawierająca parametry i komponenty okna glownego
     */

    private void initMainFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        startPanel =new StartPanel(new ImageIcon(BackgroundString).getImage());
        this.getContentPane().add(startPanel);
        this.pack();
        this.setLocationRelativeTo(null);//ustawienie ramki na srodku
        this.setVisible(true);
    }
}
