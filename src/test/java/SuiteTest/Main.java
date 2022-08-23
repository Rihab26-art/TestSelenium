package SuiteTest;

import Connexion.Connection;
import Page.PageAccueil;
import org.testng.annotations.Test;

public class Main extends Connection {

    @Test
    public void run()
    {
        PageAccueil page=new PageAccueil(driver);
        page.verifierTitre();
    }
}
