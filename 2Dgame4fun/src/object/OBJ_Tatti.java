package object;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;

public class OBJ_Tatti extends SuperObject{

    public OBJ_Tatti() {
        name = "Tatti";
        try{
            image = ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("objects/tatti.png")));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

}
