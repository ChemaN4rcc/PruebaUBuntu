public class Modulo {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        saludo();
        menu();
        mensaje("Hola");;
    }

    public static void saludo() {
        System.out.println("Holaaaaaaaaaaaaaaaaaaaaaa");
    }

    public static void menu(){
        System.out.println("MENU");
        System.out.println("OPTION 1 ");
        System.out.println("OPTION 2 ");
        System.out.println("OPTION 3 ");
        System.out.println("OPTION 4 ");
    }
    public static void mensaje (String texto){
        System.out.println("El mensaje es: "+ texto);
    }
}