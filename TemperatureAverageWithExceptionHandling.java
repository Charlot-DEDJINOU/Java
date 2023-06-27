import java.util.ArrayList;
import java.util.List;

public class TemperatureAverageWithExceptionHandling {


    public static void main(String[] args) {

        try {
            List<Integer> recordedTemperaturesInDegreesCelcius = new ArrayList<Integer>();
            // remplissez la liste à partir des valeurs fournies comme arguments en ligne de
            // commande
            for (String stringRepresentationOfTemperature : args) {
                int temperature = Integer.parseInt(stringRepresentationOfTemperature);
                recordedTemperaturesInDegreesCelcius.add(temperature);
            }
            // calculez et affichez la température moyenne
            int averageTemperature = SimpleMaths.calculateAverage(recordedTemperaturesInDegreesCelcius);
            System.out.println("The average temperature is " + averageTemperature);
        } catch (NumberFormatException e) {
            System.out.println("All arguments should be provided as numbers");
            System.exit(-1);
        } catch (ArithmeticException e) {
            System.out.println("At least one temperature should be provided");
            System.exit(-1);
        }

    }

}
