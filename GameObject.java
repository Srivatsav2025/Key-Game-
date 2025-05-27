import javax.swing.JLabel;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class import javax.swing.JLabel;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public abstract class GameObject extends JLabel{
    protected boolean interactable;
    protected BufferedImage image;
    protected int x;
    protected int y;
    protected boolean isVisible;
    protected boolean isSolid;

    public GameObject(int x, int y, boolean interactable, boolean isVisible){
        this.interactable = interactable;
        this.isVisible = isVisible;
        this.x = x;
        this. y = y;
        this.setLocation(x,y);
        
    }

  public abstract void update(ArrayList<GameObject> objects);
  public abstract void interact();

  public void render(Graphics g){
        if(isVisible && image != null){
            g.drawImage(image,x,y, null);
        }
  }

 public boolean hasCollidedWith(GameObject other) {
        // TODO implement collision detection here
       
        return this.getBounds().intersects(other.getBounds());
    }
public boolean isNear(GameObject other, int interactionDistance){
    int dx = this.getX() - other.getX();
    int dy = this.getY() - other.getY();
    double distance = Math.sqrt(dx*dx + dy*dy);

    return distance <= interactionDistance;
}

public boolean getInteractable(){
    return interactable;
}
public boolean getVisibility(){
    return isVisible;
}
public boolean getSolid(){
    return isSolid;
}



    
}
        
   



    
}
