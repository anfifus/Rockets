import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String FIRST_ROCKET = "32WESSDS";
    private static final String SECOND_ROCKET = "LDSFJA32";

    public static void main(String[] args) {
        try
        {
            List<Rocket> rocketList = createAllRocket();
            showRockets(rocketList);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void showRockets(List<Rocket> rocketList) {
        for (Rocket currentRocket:rocketList) {
            System.out.println("The code of the rocket is: "+currentRocket.getCode()+" and the number of propellant is: "+currentRocket.getNumOfPropellant());
        }

    }

    private static List<Rocket> createAllRocket() throws Exception{
        List<Rocket> rocketList = new ArrayList<>();
        Rocket firstRocket = createRocket(FIRST_ROCKET,3);
        Rocket secondRocket = createRocket(SECOND_ROCKET,6);
        rocketList.add(firstRocket);
        rocketList.add(secondRocket);
        return rocketList;
    }

    private static Rocket createRocket(String code, int numPropellant) throws Exception {
        return  new Rocket(code,numPropellant);
    }
}
