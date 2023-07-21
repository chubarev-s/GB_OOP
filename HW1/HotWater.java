package HW1;

public class HotWater extends BottleOfWater {
    
    private int temp; 
    
    public HotWater(String name, double cost, int volume, int temp){
        super(name, cost, volume);
        this.temp = temp;
    }

    public int getTemp() {
        return temp;
    }
    public void setTemp(int temp) {
        this.temp = temp;
    }
    
    @Override
    public String toString() {
        return "BottleOfWater{" +
               "name = '" + super.getName() + '\'' +
               "volume = '" + super.getVolume() + '\'' +
               ", cost = " + super.getCost() + '\'' +
               "temp = " + this.temp +
               '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HotWater)) {
            return false;
        }

        HotWater that = (HotWater) o;

        return super.getName().equalsIgnoreCase(that.getName())
               && super.getCost() == that.getCost()
               && super.getVolume() == that.getVolume()
               && getTemp() == that.getTemp();
    }
}
