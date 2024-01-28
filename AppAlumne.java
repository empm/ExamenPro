package ExamenB;

/* ------ b ------ */
    /**
     * Realitzar una aplicació de nom AppAlumne que utilitzant la classe Alumne
     * definida anteriorment:
     * 
     * • (0.5p) Instàncie dos objectes de la classe Alumne les dades del qual se
     * sol·liciten a l'usuari
     * • (0.5p) Mostre les dades de l'alumne amb nota mitjana més alta
     */
    public class AppAlumne {
        public static void main(String[] args) {
            Alumne jose = new Alumne(934562, "José");
            Alumne maria = new Alumne(123456, "María");
            Alumne aTest = new Alumne(12345, "");
            Alumne test2 = new Alumne("test");
            Alumne test3 = new Alumne("Test 3");
            Alumne test4 = new Alumne("Test 4");
            
            jose.setNotes(5.6, 6d, 4.6);
            maria.setNotes(8.3, 7.9, 9.3);
            aTest.setNotes(11, -1, 15);



            System.out.println(jose.toString());
            System.out.println();
            System.out.println(maria.toString());
            System.out.println();
            System.out.println(aTest.toString());
            System.out.println();
            System.out.println(test2.toString());
            System.out.println();
            System.out.println(test3.toString());
            System.out.println();
            System.out.println(test4.toString());
        }
    }
    /* ------ b ------ */