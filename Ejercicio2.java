package ExamenB;

public class Ejercicio2 {
    /* ------ a ------ */
    /**
     * Implementar la classe Alumne que ha de complir les següents especificacions:
     * 
     * Els atributs privats:
     * Número de matrícula – Sencer
     * Nom – Alfanumèric
     * Tres notes de l'alumne – Reals
     */

    public class Alumne {
        private int numMatricula;
        private String nombre;
        private double nota1, nota2, nota3;

        /**
         * El constructor admet com a arguments el número de matrícula i el nom de
         * l'alumne i emmagatzemarà aquestes dades en els corresponents atributs.
         * 
         * Ha de comprovar que el nom de l'alumne no està en blanc
         * i que el número de matrícula és un enter positiu de 6 xifres.
         * 
         * En cas de no complir-se algun dels requisits anteriors a l'objecte creat
         * se li assignaran les dades: “Ningú” per al nom
         * i 999999 per al número de matrícula.
         */

        public Alumne(int nimMatricula, String nombre) {
            if (nombre.isEmpty())
                this.nombre = "Ningú";
            else
                this.nombre = nombre;

            if (numMatricula > 99_999 && numMatricula < 1_000_000)
                this.numMatricula = numMatricula;
            else
                this.numMatricula = 999999;

        }

        /**
         * mètode setNotes() amb 3 arguments de tipus double
         * que corresponen a les 3 notes d'un examen.
         * 
         * El mètode ha de comprovar que les notes introduïdes estan entre 0 i 10.
         * Només en aquest cas les emmagatzemarà en els atributs corresponents.
         */
        public void setNotes(double nota1, double nota2, double nota3) {
            if (nota1 >= 0 && nota1 <= 10)
                this.nota1 = nota1;
            if (nota2 >= 0 && nota2 <= 10)
                this.nota2 = nota2;
            if (nota3 >= 0 && nota3 <= 10)
                this.nota3 = nota3;
        }

        /**
         * mètode getMitjana() retorna la mitjana de les tres notes emmagatzemades.
         */
        public double getMitjana() {
            return (nota1 + nota2 + nota3) / 3;
        }

        /**
         * mètode toString() retorna un alfanumèric amb la descripció de l'alumne
         * que consistirà en el número de matrícula, el nom i la nota mitjana.
         */
        @Override
        public String toString() {
            return "Número de matrícula: " + numMatricula
                    + "\nNombre: " + nombre
                    + "\nNota media: " + getMitjana();
        }

        /**
         * mètode comparaNotes() rep com a paràmetre un Alumne i retorna:
         * 
         * 0 si tots dos alumnes tenen la mateixa nota mitjana
         * -1 si la nota mitjana de l'alumne passat com a paràmetre és menor
         * +1 si la nota mitjana de l'alumne passat com a paràmetre és major
         */

        public void comparaNotes(Alumne a) {
            // eperez: duda - hay un metodo compareTo (devuelve 0, 1 y -1)

        }

    }

    
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
            
        }
     }
     
}




