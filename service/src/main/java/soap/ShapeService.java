package soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class ShapeService {
    @WebMethod
    public String helloWord(){
        return "HelloWord";
    }
}
