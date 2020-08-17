import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Jose");
        nomes.add("Joao");
        nomes.add("Maria");
        nomes.add("Paula");

        nomes.remove("Maria");
        for(int i = 0; i < nomes.size(); i++)
            System.out.println(nomes.get(i));
    }
}