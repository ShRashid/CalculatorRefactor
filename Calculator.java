import java.util.List;

public class Calculator {
    public double sum(List<? extends Number> array) {
        double result = 0;
        for (int i = 0; i < array.size(); i++) {
            result += array.get(i).doubleValue();
        }
        return result;
    }

    public double multiply(List<? extends Number> array) {
        double result = array.get(0).doubleValue();
        for (int i = 1; i < array.size(); i++) {
            result *= array.get(i).doubleValue();
        }
        return result;
    }

    public double division(List<? extends Number> array) {
        double result = array.get(0).doubleValue();
        for (int i = 1; i < array.size(); i++) {
            result /= array.get(i).doubleValue();
        }
        return result;
    }

    public String convertToBinaryStr(String value) {
        int intValue = Integer.parseInt(value);
        return Integer.toBinaryString(intValue);
    }

    public String convertToBinaryInt(int value) {
        return Integer.toBinaryString(value);
    }

    public String DoubleToBinary(double number) {       
        long rawBits = Double.doubleToLongBits(number);      
        return Long.toBinaryString(rawBits); 
    }

    public String FloatToBinary(float number){        
        int rawBits = Float.floatToIntBits(number); 
        return Integer.toBinaryString(rawBits); 
    }

}