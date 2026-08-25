package question16_17and18;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UtilityReport {

    private Map<String, Double> m;

    public UtilityReport() {
        m = new HashMap<>();
    }

    public void showReport(List<Student> list) {

        for (Student s : list) {
            m.put(s.getName(), s.getPercentage());
        }

        System.out.println("\n----- Student Report -----");

        for (Map.Entry<String, Double> entry : m.entrySet()) {

            System.out.println(
                    entry.getKey()
                    + " --> "
                    + entry.getValue()
            );
        }
    }
}
