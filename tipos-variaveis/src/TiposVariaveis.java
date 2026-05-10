public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double salarioMinimo = 2500.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal; -> Não iria funcionar, pois o número normal é um int e o número curto é um short, e o Java não tem como adivinhar se o número normal vai caber dentro do número curto. Para resolver isso, precisamos fazer um cast, ou seja, dizer para o Java que temos a certeza que o número normal vai caber dentro do número curto. 
        short numeroCurto2 = (short) numeroNormal;
    }
}
