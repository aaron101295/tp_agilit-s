import cucumber.api.cli.Main;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;



@SpringBootApplication
public class AutomatedTestingEntryPoint {

public static void main (String [] args){
    int rc = 1;

    try{
        rc = Main.run(args, Thread.currentThread().getContextClassLoader());
    }catch(IOException e){
        e.printStackTrace();
    }
}
}
