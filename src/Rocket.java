import java.util.ArrayList;
import java.util.List;

public class Rocket {
    private final String code;
    private List<Propellant>propellantList = new ArrayList<>();
    public Rocket(String code) throws Exception {
        checkCode(code);
        this.code = code;
    }

    private void checkCode(String code) throws Exception{
        if(code.length() != 8) throw new Exception("The format of the code is incorrect");
    }

    public String getCode() {
        return code;
    }

    public String getNumOfPropellant() {
        StringBuilder resultToShow = new StringBuilder();
        for (Propellant currentPropellant:propellantList) {
            resultToShow.append(currentPropellant.getMaxPower()).append(" ");
        }
        return resultToShow.toString();
    }

    public void addPropellant(int[] propellant)throws Exception {
        for (int currentPropellantPower:propellant) {
            propellantList.add(new Propellant(currentPropellantPower));
        }

    }
}
