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
    Temperature(char i){}
    Temperature(float v, char i){}


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

    public void ConvertC(Temperature t){

    }
}
