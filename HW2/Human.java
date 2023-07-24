package HW2;

public class Human extends Actor {
    
    public Human(String name){
        super(name);
    }

    @Override
    public void setMakeOrder(boolean status){
    
    }
    @Override
    public void setTakeOrder(boolean status){

    }
    @Override
    public boolean isMakeOrder(){
        return false;
    }
    @Override
    public boolean isTakeOrder(){
        return false;
    }
    @Override
    String getName(){
        return super.getName();
    }
 
}
