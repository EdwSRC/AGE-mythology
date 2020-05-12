import java.util.Scanner;

public class juego{

public static void main(String[] args) {

    String nombre,pelo,cuerpo,ojos,piel;
    int op;

    SeleccionMitologia a=new SeleccionMitologia();
    Personaje b=new Personaje();
    Scanner tec=new Scanner(System.in);
    String nl = System.getProperty("line.separator");
        System.out.println("---Bienvenido---");
        System.out.println("Por favor ingrese su ID");
        nombre=tec.nextLine();
        b.setNombre(nombre);
        System.out.println("Escriba el color de pelo del personaje");
        pelo=tec.nextLine();
        b.setPelo(pelo);
        System.out.println("Escriba el tipo de cuerpo para su personaje");
        cuerpo=tec.nextLine();
        b.setCuerpo(cuerpo);
        System.out.println("Escriba el color de ojos para su personaje");
        ojos=tec.nextLine();
        b.setOjo(ojos);
        System.out.println("Escriba el color de piel para su personaje");
        piel=tec.nextLine();
        b.setPiel(piel);
        System.out.println("Elija una de las siguientes mitologÃ­as");
        System.out.println("1.Griega"+nl+"2.Japonesa"+nl+"3.China"+nl+"4.Precolombina"+nl+"5.Egipcia"+nl+"6.NÃ³rdica");
        op=tec.nextInt();
        a.setMitologia(op);
        b.Mostrar();
        a.Elegir();


    }

}
