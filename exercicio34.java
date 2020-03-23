
public class exercicio34
{
    public static void main(String[] args) {
        System.out.println("Os números que foram sorteados são: ");
        for (int cont = 1; cont<51; cont++){
            int sorts = ((int)(Math.random()*100)) + 1;
            System.out.println("" +cont+ "  -  " +sorts+ "");
        }
    }
}

