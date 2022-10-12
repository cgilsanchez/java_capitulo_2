public class Ejercicio6 {
    public static void main(String[] args){
        double baseImponible = 80.00;
        System.out.println("Base Imponible %8.2f",baseImponible);
        System.out.println("IVA            %8.2f", (baseImponible*0.21));
        System.out.println("------------------------");
        System.out.println( "Total          %8.2f", (baseImponible*1.21));
    }
}
