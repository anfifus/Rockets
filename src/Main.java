import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final String FIRST_ROCKET = "32WESSDS";
    private static final String SECOND_ROCKET = "LDSFJA32";

    public static void main(String[] args) {
        try
        {
            List<Rocket> rocketList = createAllRocket();
            createPropellant(rocketList);
            showRockets(rocketList);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    private static void createPropellant(List<Rocket> rocketList) throws Exception{
        int[] propellantListPower = {10,30,80};
        int[] propellantListPower2 = {30,40,50,50,30,10};
        rocketList.get(0).addPropellant(propellantListPower);
        rocketList.get(1).addPropellant(propellantListPower2);
    }

    private static void showRockets(List<Rocket> rocketList) {
        for (Rocket currentRocket:rocketList) {
            System.out.println(currentRocket.getCode()+": "+currentRocket.getNumOfPropellant());
        }
    }



    private static List<Rocket> createAllRocket() throws Exception{
        List<Rocket> rocketList = new ArrayList<>();
        Rocket firstRocket = createRocket(FIRST_ROCKET);
        Rocket secondRocket = createRocket(SECOND_ROCKET);
        rocketList.add(firstRocket);
        rocketList.add(secondRocket);
        return rocketList;
    }

    private static Rocket createRocket(String code) throws Exception {
        return  new Rocket(code);
    }
}
