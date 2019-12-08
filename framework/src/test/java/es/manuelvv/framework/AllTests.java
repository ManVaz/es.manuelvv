package es.manuelvv.framework;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({TestEncriptacion.class, 
			  TestMail.class,
			  TestValidacionesUtil.class,
			  TestFicheros.class})

public class AllTests {

}
