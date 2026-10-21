import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> itinerario = new ArrayList<>();

        itinerario.add("Curitiba");
        itinerario.add("Paris");
        itinerario.add("Roma");
        itinerario.add("Lisboa");
        itinerario.add("Londres");

        // Remove a segunda cidade (índice 1 -> Paris)
        itinerario.remove(1);

        // Agora a lista é [Curitiba, Roma, Lisboa, Londres]
        // A terceira cidade atual (índice 2) é Lisboa -> vira Tóquio
        itinerario.set(2, "Tóquio");

        for (int i = 0; i < itinerario.size(); i++) {
            System.out.println("[" + i + "] - " + itinerario.get(i));
        }
    }
}
