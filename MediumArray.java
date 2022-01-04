package ArrayFirst;

public class MediumArray {
    public static void main(String[] args) {
        double [] patientsTemperature = new double[30];
        double middleTemperature = 0;
        int normalTemperature = 0;
        for (int i = 0; i < patientsTemperature.length; i++)
        {
            double value = 32 + Math.random()*8;
            patientsTemperature[i] = value;
            middleTemperature += patientsTemperature[i];
            if (patientsTemperature [i] < 37.00 && patientsTemperature [i] > 36.00)
            {
               normalTemperature++;
            }
            System.out.print(patientsTemperature[i] + ", ");
        }
        System.out.println();
        System.out.println(middleTemperature/patientsTemperature.length);
        System.out.println(normalTemperature);
    }
}
