package FlyWeight;
import java.util.HashMap;
import java.util.Map;

// Фабрика легковесов
public class TreeFactory {
    private Map<String, TreeType> trees = new HashMap<>();

    public TreeType getTree(String color, String type) {
        String key = color + ":" + type;
        if (!trees.containsKey(key)) {
            trees.put(key, new Tree(color, type));
        }
        return trees.get(key);
    }
}

