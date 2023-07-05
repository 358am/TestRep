package JUnitExample;

import org.junit.jupiter.api.*;

class DemoTest {

    @BeforeEach
    void beforeEach() {
        System.out.println("Before test");
    }
    @AfterEach
    void afterEach () {
        System.out.println("After test");
        }
    @BeforeAll
    static void beforAll(){
        System.out.println("Before all test");
    }
    @AfterAll
    static void afterAll(){
        System.out.println("After all test");
    }




        @Test
        void firstTest () {
            System.out.println("Vovremya testa");
        }

        @Test
        void secondTest () {
            System.out.println("Vovremya testa2");
        }
    }

