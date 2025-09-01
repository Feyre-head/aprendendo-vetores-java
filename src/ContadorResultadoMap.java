import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContadorResultadoMap {

    public static void main(String[] args) {

        List<Map<String, Integer>> listaPlacares = new ArrayList<>();

        Map<String, Integer> placarJogo1 = new HashMap<>();
        placarJogo1.put("Vitorias", 10);
        placarJogo1.put("Derrotas", 3);
        placarJogo1.put("Empates", 2);

        listaPlacares.add(placarJogo1);

        Map<String, Integer> placarJogo2 = new HashMap<>();
        placarJogo2.put("Vitorias", 5);
        placarJogo2.put("Derrotas", 5);
        placarJogo2.put("Empates", 1);

        listaPlacares.add(placarJogo2);

        Map<String, Integer> placarJogo3 = new HashMap<>();
        placarJogo3.put("Vitorias", 8);
        placarJogo3.put("Derrotas", 1);
        placarJogo3.put("Empates", 4);

        listaPlacares.add(placarJogo3);

        for (int i = 0; i < listaPlacares.size(); i++) {
            Map<String, Integer> placarAtual = listaPlacares.get(i);

            System.out.println("\nPlacar do Jogo " + (i + 1) + ":");
            System.out.println("Vitórias: " + placarAtual.get("Vitorias"));
            System.out.println("Derrotas: " + placarAtual.get("Derrotas"));
            System.out.println("Empates: " + placarAtual.get("Empates"));
        }
    }
}