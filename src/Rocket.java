import java.util.ArrayList;
import java.util.List;

public class Rocket {
    private String code;
    private List<Propellant>propellantList = new ArrayList<>();
    public Rocket(String code) throws Exception {
        checkProblems(code);
        this.code = code;
    }

    private void checkProblems(String code) throws Exception {
        checkCode(code);
    }

    private void checkPropellant(int numOfPropellant) throws Exception{
        if(numOfPropellant<=0) throw new Exception("The rocket must have propellant");
    }

    private void checkCode(String code) throws Exception{
        if(code.length() != 8) throw new Exception("The format of the code is incorrect");
    }

    public String getCode() {
        return code;
    }

    public String getNumOfPropellant() {
        StringBuilder resultToShow = new StringBuilder();
        int counter = 0;
        for (Propellant currentPropellant:propellantList) {
            resultToShow.append(currentPropellant.getPower()).append(" ");
        }
        return resultToShow.toString();
    }

    public void addPropellant(int[] propellant)throws Exception {
        for (int currentPropellantPotency:propellant) {
            propellantList.add(new Propellant(currentPropellantPotency));
        }

    }
}
