package ar.com.marcelogore.cerradura;

import org.hamcrest.Matchers;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CerraduraTest {

    private static Cerradura cerradura;
    
    @Test
    public void deberiaCrearUnaCerraduraConClaveYNumeroDeIntentos() {
        
        System.out.println("deberiaCrearUnaCerraduraConClaveYNumeroDeIntentos");
        Assert.assertThat("Creó la cerradura con clave y numero de intentos", cerradura, Matchers.notNullValue());
    }

    @Test
    public void deberiaAbrirSiLaClaveEsCorrecta() {

        System.out.println("deberiaAbrirSiLaClaveEsCorrecta");
        
        // Ejecución
        int claveDeIngreso = 1234;
        boolean abrio = cerradura.abrio(claveDeIngreso);
        
        // Verificación
        Assert.assertThat("Abrio porque la clave es correcta", abrio, Matchers.is(true));
    }

    @Test
    public void deberiaNoAbrirSiLaClaveEsIncorrecta() {
        
        System.out.println("deberiaNoAbrirSiLaClaveEsIncorrecta");
        
        // Ejecución
        int claveDeIngreso = 1235;
        boolean abrio = cerradura.abrio(claveDeIngreso);
        
        // Verificación
        Assert.assertThat("No abrio porque la clave es incorrecta", abrio, Matchers.is(false));
    }

    @BeforeClass
    public static void crearCerradura() {
        System.out.println("Creando nueva cerradura");
        
        int clave = 1234;
        int numeroDeIntentos = 3;
        cerradura = new Cerradura(clave, numeroDeIntentos);
    }
    
    @AfterClass
    public static void eliminaCerradura() {
        
        System.out.println("Eliminando cerradura");
        cerradura = null;
    }
}

