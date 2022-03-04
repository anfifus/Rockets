public class Propellant {
    private final int maxPower;

    public Propellant(int maxPower) throws Exception {
        checkPower(maxPower);
        this.maxPower = maxPower;
    }

    private void checkPower(int power) throws  Exception{
        if(power <= 0) throw new Exception("The propellant must have power");
    }

    public int getMaxPower() {
        return maxPower;
    }
}
