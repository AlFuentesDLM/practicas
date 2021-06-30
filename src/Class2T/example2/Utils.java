package Class2T.example2;

import java.util.ArrayList;

public class Utils {
    public static ArrayList<GeometricFigure> figures = new ArrayList<>();

    public static double averageArea() {
        double accumulative = 0;
        for (GeometricFigure figure : figures) {
            accumulative += figure.area();
        }
        return accumulative/figures.size();
    }
}
