public class WaterBottle {
    private int volume;

    public WaterBottle(int volume){
        this.volume = volume;
    }

    public int Drink(){
        return volume - 10;
    }

    public int Empty() {
        return volume = 0;
    }

    public int Fill() {
        return volume = 100;
    }

    public int Volume() {
        return this.volume;
    }
}
