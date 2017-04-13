/**
 * Created by jzaman on 4/13/2017.
 */
public class Temperature {

    private float value;
    private char scale;
    private char m;

    Temperature(){
        value = 0;
        scale = 'C';
        m = 'M';
    }

    Temperature(float v){
        this();
    }
    Temperature(char i){ this(); }
    Temperature(float v, char s){}


    public void setValue(float y){
        value = y;
    }

    public float getValue(){
        return value;
    }

    public void setScale(char scaleType){
        scale = scaleType;
    }

    public char getScale(){
        return scale;
    }

    public void ConvertF(Temperature t){

    }

    public float getTempF(){
        if (scale == 'C'){
            return 9*(value/5)+32;
        }else if(scale == 'F'){
            return value;
        }
        return 0;
    }

    public float getTempC(){
        if (scale == 'F'){
            return 5*(value - 32)/9;
        }else if(scale == 'C'){
            return value;
        }
        return 0;
    }

    public static int compare(Temperature A, Temperature B){
        if (A.getScale() == 'C' && B.getScale() == 'C'){
            System.out.println("They are both C.");
            if (A.getValue() == B.getValue()){
                System.out.println("0 - two temps are equal.");
            }
            else if (A.getValue() > B.getValue()){
                System.out.println("1 - first temp is higher than second.");
            }
            else if (A.getValue() < B.getValue()){
                System.out.println("-1 - first temp is lower than second.");
            }
        }
        if (A.getScale() == 'F' && B.getScale() == 'F'){
            System.out.println("They are both F.");
            if (A.getValue() == B.getValue()){
                System.out.println("0 - two temps are equal.");
            }
            else if (A.getValue() > B.getValue()){
                System.out.println("1 - first temp is higher than second.");
            }
            else if (A.getValue() < B.getValue()){
                System.out.println("-1 - first temp is lower than second.");
            }
        }
        return 0;
    }
}
