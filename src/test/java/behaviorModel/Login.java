package behaviorModel;


import appManager.AuthPropertyReader;
import generators.Randoms;
import pageModel.AuthPage;

public class Login extends AuthPage {
   private AuthPropertyReader authPropertyReader = new AuthPropertyReader();

    public  void login(String user, String password){
        openstartpage();
        setloginvalue(user, password);
        clikloginbotton();
    }

    public void loginUncorrectly(){
        Randoms rnd = new Randoms();
        openstartpage();
        setloginvalue(rnd.correctstring(50),rnd.correctstring(50));
        clikloginbotton();
    }
    public void loginAsClient(){
        openstartpage();
        setloginvalue( authPropertyReader.getClientusername(),authPropertyReader.getClientpassword());
        clikloginbotton();
    }
    public void loginAsBank(){
        openstartpage();
        setloginvalue(authPropertyReader.getBankusername(),authPropertyReader.getBankpassword());
        clikloginbotton();
    }

}
