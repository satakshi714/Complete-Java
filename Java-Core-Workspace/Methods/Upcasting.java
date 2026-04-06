public class Upcasting{
    public static void main(String[] args){
        Google g1 = new Youtube("Satakshi", "qwerty123");
        Google g2 = new Youtube("namjsd", "dfghj6");

        g1.checkCredentials();
        g2.checkCredentials();
    }
}

class Google{
    private String username;
    private String password;
    Google(String username, String password){
        this.username = username;
        this.password = password;
    }
    public boolean checkCredentials(){
        return username.equals("Satakshi") && password.equals("qwerty123");
    }
    
}
class Youtube extends Google{
    Youtube(String username, String password){
        super(username, password);
    }
    public void loginYoutube(String username, String password){
        if(checkCredentials()){
            System.out.println("Login Successful!");
        }else{
            System.out.println("Invalid credentials");
        }
    }
}

class Gmail extends Google{
    Gmail(String username, String password){
        super(username, password);
    }
    public void loginGmail(String username, String password){
        if(checkCredentials()){
            System.out.println("Login Successful!");
        }else{
            System.out.println("Invalid credentials");
        }
    }
}

class Drive extends Google{
    Drive(String username, String password){
        super(username, password);
    }
    public void loginDrive(String username, String password){
        if(checkCredentials()){
            System.out.println("Login Successful!");
        }else{
            System.out.println("Invalid credentials");
        }
    }
}