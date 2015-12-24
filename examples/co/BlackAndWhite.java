package com.felight.examples.co;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BlackAndWhite {

    public static boolean convertToBW(String sourceFileName,String destinationFileName) 
    {
        try 
        {
         BufferedImage original = ImageIO.read(new File(sourceFileName));
         BufferedImage binarized = new BufferedImage(original.getWidth(), original.getHeight(),BufferedImage.TYPE_BYTE_BINARY);

         int red;
         int newPixel;
         //int threshold =230;
         int threshold =100;

            for(int i=0; i<original.getWidth(); i++) 
            {
                for(int j=0; j<original.getHeight(); j++)
                {

                    // Get pixels
                  red = new Color(original.getRGB(i, j)).getRed();

                  int alpha = new Color(original.getRGB(i, j)).getAlpha();

                  if(red < threshold)
                    {
                        newPixel = 100;
                    }
                    else
                    {
                        newPixel = 250;
                    }
                    newPixel = colorToRGB(alpha, newPixel, newPixel, newPixel);
                    binarized.setRGB(i, j, newPixel);

                }
            } 
            ImageIO.write(binarized, "jpg",new File(destinationFileName) );
         }
        catch (IOException e) 
        {
                e.printStackTrace();
        }
		return true;    
    }

     private static int colorToRGB(int alpha, int red, int green, int blue) {
            int newPixel = 0;
            newPixel += alpha;
            newPixel = newPixel << 8;
            newPixel += red; newPixel = newPixel << 8;
            newPixel += green; newPixel = newPixel << 8;
            newPixel += blue;

            return newPixel;
        }
}