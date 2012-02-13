/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.skyebook.viewportcolorchooser;

import com.jme3.gde.core.scene.SceneApplication;
import java.awt.Color;
import java.util.concurrent.Callable;
import org.openide.modules.ModuleInstall;
import org.openide.util.NbPreferences;

public class Installer extends ModuleInstall {

    @Override
    public void restored() {
        // Get the selected [or default] color
        final Color storedColor = new Color(
                NbPreferences.forModule(ColorPanel.class).getInt("viewportColor",Color.black.getRGB()));
        
        // Apply the color to the viewport
        SceneApplication.getApplication().enqueue(new Callable<Object>() {

            @Override
            public Object call() throws Exception {
                SceneApplication.getApplication().getViewPort().
                        setBackgroundColor(ColorConverter.fromAWT(storedColor));
                
                return null;
            }
        });
    }
}
