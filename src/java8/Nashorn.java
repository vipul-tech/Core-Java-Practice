package java8;

import javax.script.*;
import java.io.*;

public class Nashorn {
    public static void main(String[] args){
        try {
            ScriptEngineManager mgr = new ScriptEngineManager();
            ScriptEngine engine = mgr.getEngineByName("nashorn");
            engine.eval(new FileReader("Abc.js"));
            engine.eval(new FileReader("Xyz.js"));
            Invocable inv = (Invocable)engine;
            inv.invokeFunction("abc");
            inv.invokeFunction("abc", 10, 25);
            String str = (String)inv.invokeFunction("greet","Vipul","Kumar");
            System.out.println(str);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
