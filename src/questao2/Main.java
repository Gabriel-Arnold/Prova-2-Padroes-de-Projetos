package questao2;

public class Main {

    public static void main(String[] args) {
        Tiquete tiquete = new Tiquete("ABCDF", new Rotativo(), 60);

        System.out.println("Valor a cobrar: " + tiquete.executeStrategy());

        Tiquete tiquete2 = new Tiquete("ABCDF", new Rotativo(), 62);

        System.out.println("Valor a cobrar: " + tiquete2.executeStrategy());

        tiquete2.setSTRATEGY(new Mensalista());

        System.out.println("Valor a cobrar: " + tiquete2.executeStrategy());

        Tiquete tiquete3 = new Tiquete("ABCDF", new Conveniado(), 25);
        System.out.println("Valor a cobrar: " + tiquete3.executeStrategy());

        tiquete3.tempoDePermanencia = 52;
        System.out.println("Valor a cobrar: " + tiquete3.executeStrategy());
    }
}
