/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author laboradagr_sd2082
 */
public class Grayscale {
//C:\\Users\\laboradagr_sd2082\\Downloads\\flower.jpg"

    public static void main(String args[]) throws IOException {
        BufferedImage img = null;
        File f = null;
        int width;
        int height;

        //read image
        try {
            File input = new File("C:\\Users\\laboradagr_sd2082\\Downloads\\flower.jpg");
            img = ImageIO.read(input);
            width = img.getWidth();
            height = img.getHeight();

            for (int i = 0; i < height; i++) {

                for (int j = 0; j < width; j++) {

                    Color c = new Color(img.getRGB(j, i));

                    if (c.getRed() >= 70 || c.getGreen() >= 36 || c.getBlue() >= 236) {
                        Color newColor = new Color(255, 255, 255);
                        img.setRGB(j, i, newColor.getRGB());
                    }

                }
            }

            File ouptut = new File("C:\\Users\\laboradagr_sd2082\\Downloads\\grasya.jpg");
            System.out.println("Processed");
            ImageIO.write(img, "jpg", ouptut);
            

        } catch (Exception e) {
        }
    }

}
