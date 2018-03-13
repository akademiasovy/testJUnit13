package sk.akademiasovy.test.unit;

/**
 * Created by BousH on 13.3.2018.
 */
public class TestPlease {
    public String checkName(String name){
        // peter -> Peter,  IVAn -> Ivan, ""->""  , null -> null
        if(name==null)
            return null;
        if(name.length()==0)
            return "";
        name=name.toLowerCase();
        char[] poleznakov=name.toCharArray();

        poleznakov[0]=Character.toUpperCase(poleznakov[0]);
        return String.valueOf(poleznakov);
    }

    public int triangle(int a, int b, int c){
        if(a<=0 || b<=0 || c<=0)
             return -1;
        else
            return a+b+c;
    }
}
