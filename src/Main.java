
import java.util.ArrayList;
import java.util.List;
class Videojuego {
    private String nombre;
    private int añoLanzamiento;

    public Videojuego(String nombre, int añoLanzamiento) {
        this.nombre = nombre;
        this.añoLanzamiento = añoLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }
}

class JuegoAccion extends Videojuego {
    private String juego_de_plataforma;

    public JuegoAccion(String nombre, int añoLanzamiento, String juego_de_plataforma) {
        super(nombre, añoLanzamiento);
        this.juego_de_plataforma = juego_de_plataforma;
    }

    public String getJuego_de_plataforma() {
        return juego_de_plataforma;
    }
}



class JuegoShooter extends JuegoAccion {
    private String modoMultijugador;

    public JuegoShooter(String nombre, int añoLanzamiento, String juego_de_plataforma, String modoMultijugador) {
        super(nombre, añoLanzamiento, juego_de_plataforma);
        this.modoMultijugador = modoMultijugador;
    }

    public String getModoMultijugador() {
        return modoMultijugador;
    }
}

public class Main {
    public static void main(String[] args) {

        JuegoShooter juego1 = new JuegoShooter("Call of Duty", 2003, "PC", "Online");
        JuegoAccion juego2 = new JuegoAccion("Assassin's Creed", 2007, "PlayStation");
        Videojuego juego3 = new Videojuego("Tetris", 1984);

        List<Videojuego> listaVideojuegos = new ArrayList<>();
        listaVideojuegos.add(juego1);
        listaVideojuegos.add(juego2);
        listaVideojuegos.add(juego3);


        for (Videojuego juego : listaVideojuegos) {
            System.out.println("Nombre: " + juego.getNombre());
            System.out.println("Año de lanzamiento: " + juego.getAñoLanzamiento());

            if (juego instanceof JuegoAccion) {
                JuegoAccion juegoAccion = (JuegoAccion) juego;
                System.out.println("Plataforma: " + juegoAccion.getJuego_de_plataforma());
            }

            if (juego instanceof JuegoShooter) {
                JuegoShooter juegoShooter = (JuegoShooter) juego;
                System.out.println("Modo multijugador: " + juegoShooter.getModoMultijugador());
            }

            System.out.println("--------------------");
        }
    }
}