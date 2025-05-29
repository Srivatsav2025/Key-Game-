import java.util.ArrayList;

public class Bedroom extends Room{
    private Key bedroomKey;
    private Door bedroomDoor;
    private ArrayList<GameObject> objects;
    private Player player;
    private Couch couch;
    private Couch interactableCouch;
    private Bed bed;

    public Bedroom(Player player){
        this.player = player;
        bedroomKey = new Key(300,300,player);
        bedroomDoor = new Door(400,50, bedroomKey, player);
        couch = new Couch(200,400,false,this);
        interactableCouch = new Couch(500,400,true,this);
        bed = new Bed(1000,200,false,this);

        objects = new ArrayList<GameObject>();
        objects.add(bedroomKey);
        objects.add(bedroomDoor);
        objects.add(couch);
        objects.add(interactableCouch);
        objects.add(bed);
    }

    
    public void update(){
        if(objects.size() > 0){
            for(GameObject obj : objects){
                obj.update(objects);
            }
        }
      
    }
    public ArrayList<GameObject> getObjects(){
        return objects;
    }

    public Key getKey(){
        return bedroomKey;
    }
    public Door getDoor(){
        return bedroomDoor;
    }
    public GameObject removeKey(){
        objects.remove(bedroomKey);
        return bedroomKey;
    }
}
