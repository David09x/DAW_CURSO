package org.example.JunitRepaso;

import jdk.jfr.Enabled;
import org.example.exceptions.saldoNegatiu;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
class CompteTest {
    Compte compte;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Iniciando los casos de prueba");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("finaliza los casos de prueba");
    }

    @BeforeEach
    void initMethodTest(){
        this.compte = new Compte("David",new BigDecimal("3000.00"));
        System.out.println("iniciamos el metodo");
    }

    @AfterEach
    void afterCadaMethod(){
        System.out.println("finaliza el metodo de prueba");
    }


    @Nested
    class pruebasAdicionales{

        @Test
        @DisplayName("Diferente a null")
        void diferenteNull(){
            compte = new Compte("David",new BigDecimal("2222.00"),"123456789012345678901234");
            assertNotNull(compte.getIBAN(),()-> "no es null");
            compte = new Compte("David",new BigDecimal("2222.00"));
            assertNull(compte.getIBAN(), ()-> "es null");
        }

        @Test
        @DisplayName("Mismos numeros Cuenta")
        void mismosNumerosCuenta(){
            compte = new Compte("David",new BigDecimal("2222.00"),"123456789012345678901234");
           Compte compte2 = new Compte("Jose",new BigDecimal("2222.00"),"123456789012345678901234");

           String s = compte.getIBAN().substring(5,9);
           String s2 = compte2.getIBAN().substring(5,9);

           assertEquals(s,s2,()-> "No son iguales");

        }

        @Test
        @DisplayName("Longitud 24")
        void longitudCuneta(){
            compte = new Compte("David",new BigDecimal("2222.00"),"123456789012345678901234");
            assertEquals(24,compte.getIBAN().length(),() -> "no son 24");
        }

        @Test
        @DisplayName("No son iguales")
        void cuentasIguales(){
            compte = new Compte("David",new BigDecimal("2222.00"),"123456789012345678901234");
            Compte compte2 = new Compte("Jose",new BigDecimal("2222.00"),"1234567890123456789012345");

            assertNotEquals(compte.getIBAN(),compte2.getIBAN(),() -> "son iguales y no deberian");
        }

    }

    @Nested
   class testCompteBancario{
       @Test
       @DisplayName("Prueba del nombre")
       void testNomCompte(TestInfo testInfo, TestReporter testReporter){
           //Compte compteTest = new Compte("David",new BigDecimal("3000.0"));
           //compteTest.setPersona("David");

           System.out.println(" Ejecutamos: " + testInfo.getDisplayName() + " " + testInfo.getTestMethod().get().getName());
           String valorEsperat = "David";
           String valorReal = compte.getPersona();
           assertNotNull(valorReal,()-> "el compte bancario no puede ser null");
           Assertions.assertEquals(valorEsperat,valorReal,() -> "el nombre del compte no es el que esperabamos");
           assertTrue(valorReal.equals("David"));
           assertFalse(valorReal.equals("Sergi"));
       }

       @Test
       @DisplayName("Prueba del Saldo")
       void testSaldoCompte(){
           //Compte compte =  new Compte("David",new BigDecimal("3000.00"));
           assertEquals(3000.00,compte.getSaldo().doubleValue());
           assertFalse(compte.getSaldo().compareTo(BigDecimal.ZERO)<0);
           assertTrue(compte.getSaldo().compareTo(BigDecimal.ZERO)>0);
       }

       @Test
       @DisplayName("Prueba del compte")
       void compareComptes() {
           Compte compte = new Compte("Manolo",new BigDecimal("333.9090"));
           Compte compte2 = new Compte("Manolo",new BigDecimal("333.9090"));

           assertEquals(compte,compte2);
           //assertNotEquals(compte,compte2);
       }

       @Test
       @DisplayName("Prueba del Cargo")
       void testCarrecCompte() {
           //Compte compte = new Compte("Jose",new BigDecimal("1234.5678"));
           compte.carrec(new BigDecimal("100"));
           assertNotNull(compte.getSaldo());
           assertEquals(new BigDecimal("2900.00"),compte.getSaldo());
       }

       @Test
       @DisplayName("Prueba de abonar")
       void testAbonamentCompte() {
           //Compte compte = new Compte("Jose",new BigDecimal("1234.5678"));
           compte.abonament(new BigDecimal("100"));
           assertNotNull(compte.getSaldo());
           assertEquals(3100.00,compte.getSaldo().doubleValue());
       }

       @Test
       @DisplayName("Prueba del SaldoNegativo")
       void SaldoNegatiu()  {
           //Compte compte = new Compte("David",new BigDecimal("1030.5678"));
           Exception exception = assertThrows(saldoNegatiu.class,()->{
               compte.carrec(new BigDecimal("3500"));
           });
           String messageException = exception.getMessage();
           String messageEsperat = "Saldo negatiu";
           assertEquals(messageEsperat,messageException);
       }

       @Test
       @DisplayName("Prueba de transferir")
       void testTransferirDineroComptes(){
           Compte compte1 = new Compte("David", new BigDecimal("2500.54321"));
           Compte compte2 = new Compte("Andres", new BigDecimal("1000.12345"));

           Banc banc = new Banc();
           banc.setNom("Banc pichincha");
           banc.transferir(compte1,compte2,new BigDecimal("1000"));
           assertEquals(1500.54321,compte1.getSaldo().doubleValue());
           assertEquals(new BigDecimal("2000.12345"),compte2.getSaldo());
       }

       @Test
       @DisplayName("Prueba del compte Bancos")
       void testComptesBancs() {
           Compte compte1 = new Compte("David", new BigDecimal("2500.54321"));
           Compte compte2 = new Compte("Andres", new BigDecimal("1000.12345"));

           Banc banc = new Banc();
           banc.setNom("cajamar");

           banc.setCompte_lista(compte1);
           banc.setCompte_lista(compte2);

           banc.transferir(compte1,compte2,new BigDecimal("1000"));
           assertAll(()->{assertEquals(1500.54321,compte1.getSaldo().doubleValue(), ()-> "el saldo no es el esperado");},
                   ()-> {assertEquals(new BigDecimal("2000.12345"),compte2.getSaldo(), "El saldo no es el que esperabamos");},
                   ()-> {assertEquals(2,banc.getComptes().size(),() -> "El numero de compte de la lista no es correcto");},
                   ()-> {assertEquals("cajamar",compte1.getBanc().getNom(), () -> "El nombre del banco no es el correcto");},
                   ()-> {assertTrue(banc.getComptes().stream().anyMatch(c -> c.getPersona().equals("Andres")));});
       }
   }


    @Nested
    class testSistemaOperativos{

        @Test
        @EnabledOnOs(OS.WINDOWS)
        void testParaWindows(){
            System.out.println("se ejecutara");
        }

        @Test
        @EnabledOnOs({OS.LINUX,OS.MAC})
        void testParaLinuxYMac(){
            System.out.println("no se ejecuatara");
        }

        @Test
        @DisabledOnOs({OS.LINUX,OS.MAC})
        void testParaLinuxYmac2(){
            System.out.println("no se ejecutara");
        }
    }

    @Nested
    class testVersionesJava{
        @Test
        @EnabledOnJre(JRE.JAVA_8)
        void java(){
            System.out.println("solo java8");
        }

        @Test
        @EnabledOnJre(JRE.JAVA_19)
        void java19(){
            Properties properties = System.getProperties();
            properties.forEach((k,v) -> System.out.println(k+":"+v));
        }


    }

    @Nested
    class testVaraiblesEntorn{

        @Test
        void imprimirVariablesEntorno() {
            Map<String,String> getEnv = System.getenv();
            getEnv.forEach((k,v)-> System.out.println(k + " = " + v));
        }

        @Test
        @EnabledIfEnvironmentVariable(named = "JAVA_HOME", matches =".*jdk-8*.*")
        void testJavaHome(){

        }

        @Test
        @EnabledIfEnvironmentVariable(named = "NUMBER_OF_PROCESSORS", matches = "4")
        void numeroDeProcesadoresHome(){

        }

        @Test
        @EnabledIfEnvironmentVariable(named = "ENVIROMENT", matches = "dev")
        void testEnviromentDev(){

        }

        @Test
        @DisabledIfEnvironmentVariable(named = "ENVIROMENT", matches ="prod")
        void testEnviromentProd(){

        }



    }


    @Nested
    @Tag("param")
    class testParametrizados{

        @Test
        @DisplayName("prueba saldo del compte")
        void testSaldoCompteDev(){

            boolean esDev = "dev".equals(System.getProperty("ENV"));
            assumeTrue(esDev);

            assertEquals(3000.00,compte.getSaldo().doubleValue());
            assertFalse(compte.getSaldo().compareTo(BigDecimal.ZERO)<0);
            assertTrue(compte.getSaldo().compareTo(BigDecimal.ZERO)>0);
        }

        @RepeatedTest(value = 5 ,  name = "numero de reptecion:{currentRepetition} de {totalRepetition}")
        @DisplayName("Prueba del Cargo repetir 5 veces")
        void testCarrecCompte2(RepetitionInfo info) {
            //Compte compte = new Compte("Jose",new BigDecimal("1234.5678"));
            if(info.getCurrentRepetition() ==3){
                System.out.println("es la repticion tres");
            }
            compte.carrec(new BigDecimal("100"));
            assertNotNull(compte.getSaldo());
            assertEquals(new BigDecimal("2900.00"),compte.getSaldo());
        }

        @ParameterizedTest
        @ValueSource(strings = {"180","200","300","400","500","600","700","800","900","1000"})
        void testCarrecCompteParametrizados(String valor) {

            compte.carrec(new BigDecimal(valor));
            assertNotNull(compte.getSaldo());
            System.out.println("vamos hacer un cargo por valor de: " + valor);
            System.out.println("en la cuenta quedan " + compte.getSaldo());
            assertTrue(compte.getSaldo().compareTo(BigDecimal.ZERO)>0);
        }

        @ParameterizedTest
        @CsvFileSource(resources = "/data.csv")
        void testCSVCarrecCompteParametrizados(String saldo,String valor) {
            compte.setSaldo(new BigDecimal(saldo));
            compte.carrec(new BigDecimal(valor));
            assertNotNull(compte.getSaldo());
            System.out.println(saldo + "Vamos hacer un cargo " + valor);
            System.out.println("en la cuenta quedan " + compte.getSaldo());
            assertTrue(compte.getSaldo().compareTo(BigDecimal.ZERO)>0);
        }

        @ParameterizedTest
        @MethodSource("valorsList")
        void testMethodCarrecCompteParametrizados(String valor) {

            compte.carrec(new BigDecimal(valor));
            assertNotNull(compte.getSaldo());
            System.out.println("Vamos hacer un cargo " + valor);
            System.out.println("en la cuenta quedan " + compte.getSaldo());
            assertTrue(compte.getSaldo().compareTo(BigDecimal.ZERO)>0);
        }

        private static @NotNull List<String> valorsList(){
            ArrayList<String> lista = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                lista.add(String.valueOf(Math.random()*1000));

            }
            return lista;
        }

    }

}