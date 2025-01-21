package lecture_5.sun_system;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class SolutionL_5_1 {
    private List<String> planets;

    public SolutionL_5_1() {
        planets = new ArrayList<>();
        addPlanets();
    }

    private void addPlanets(){
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Сатурн");
        planets.add("Уран");
        planets.add("Нептун");
    }

    public void print(){
        for(int i = 0; i < planets.size(); i++){
            System.out.printf("%s - %d-я планета от солнца\n", planets.get(i), i + 1);
        }
        System.out.println("_____________________________________________________");
    }

    public void createNewPlanet(String name, String afterWitchPlanet){
        int index = planets.indexOf(afterWitchPlanet);
        planets.add(index + 1, name );

    }
}
