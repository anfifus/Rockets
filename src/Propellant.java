public class Propellant {
    private int power;

    public Propellant(int power) throws Exception {
        checkPower(power);
        this.power = power;
    }

    private void checkPower(int power) throws  Exception{
        if(power <= 0) throw new Exception("The propellant must have power");
    }

    public int getPower() {
        return power;
    }
}
