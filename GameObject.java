import javax.swing.JLabel;

public abstract class GameObject extends JLabel{
    public GameObject(int x, int y){
        this.setLocation(x,y);
    }

  public abstract void update();

 public boolean hasCollidedWith(GameObject other) {
        // TODO implement collision detection here
        if(this.getX() <= other.getX() + other.getWidth()){//left of hero right of obj
            return true;
        }
        if(this.getX() + this.getWidth() >= other.getX() ){//right of hero left of obj
            return true;
        }
        if(this.getY() <= other.getY() + other.getHeight()){//up of hero down of obj
            return true;
        }
        if(this.getY() + this.getHeight() >= other.getY() ){//down of hero up of obj
            return true;
        }




        return false;
    }



    
}
