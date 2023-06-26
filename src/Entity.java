abstract class Entity{
    public String name;
    public int hp = 100;
    public boolean destroyed;

    Entity(String name){
        this.name = name;
    }

    protected void damage(int dhp){
        hp -= dhp;
        if (hp < 0){
            destroyed = true;
            System.out.println("Entity " + name + " was destroyed");
        }
    }
    public boolean isDestroyed(){
        return destroyed;
    }

}
