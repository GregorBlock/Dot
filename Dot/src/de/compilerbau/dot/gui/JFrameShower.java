package de.compilerbau.dot.gui;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JFrame;

/**
 * Zeigt den Frame an.
 */
public class JFrameShower implements Runnable
{
   //Frame der angezeigt werden soll
   private final JFrame frame;

   /**
    * Konstruktor.
    * 
    * @param jframe Anzuzeigender Frame.
    */
   public JFrameShower(JFrame jframe)
   {
      this.frame = jframe;
      EventQueue.invokeLater(this);
   }

   /**
    * Öffnet den Frame in der Mitte des Bildschirms.
    * 
    */
   public void run()
   {
      // frame.pack();
      //Sichtbarkeit des Frames auf true setzen (anzeigen)
      frame.setVisible(true);
      Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
      Rectangle abounds = frame.getBounds();
      // Frame in die Mitte des Bildschirms setzen
      frame.setLocation((dim.width - abounds.width) / 2,
            (dim.height - abounds.height) / 2);
      
      // Frame wird nicht nur versteckt, sondern auch wirklich geschlossen,
      // wenn man auf das 'X' klickt
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}