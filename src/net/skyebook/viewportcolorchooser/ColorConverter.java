/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.skyebook.viewportcolorchooser;

import com.jme3.math.ColorRGBA;
import java.awt.Color;

/**
 *
 * @author Skye Book
 */
public class ColorConverter {
    
    public static ColorRGBA fromAWT(Color color){
        return new ColorRGBA(color.getRed()/255f, color.getGreen()/255f,
                color.getBlue()/255f, 1f);
    }
    
    public static Color toAWT(ColorRGBA color){
        return new Color(color.r, color.g, color.b);
    }
    
}
