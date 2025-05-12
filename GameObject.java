public abstract class GameObject extends JLabel{
    public GameObject(int x, int y){
        this.setLocation(x,y);
    }

  public abstract void update();
}
