import java.util.HashMap;

public class IdAndPassword {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    IdAndPassword(){

        logininfo.put("haha", "hehe");
        logininfo.put("Ranee", "mylove");
        logininfo.put("Admin", "jared");

    }

    protected HashMap getLoginInfo() {
        return logininfo;
    }
}
