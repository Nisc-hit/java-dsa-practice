import java.util.*;
public class DependencyCycle {
    // 0 = unvisited, 1 = visiting, 2 = visited
    static boolean hasCycle(
            String module,
            Map<String, List<String>> dependencies,
            Map<String, Integer> state) {
        state.put(module, 1); // visiting
        for (String dependency :
                dependencies.getOrDefault(module, new ArrayList<>())) {
            int s = state.getOrDefault(dependency, 0);
            if (s == 1) {
                return true; // Back edge -> cycle
            }
            if (s == 0 && hasCycle(dependency, dependencies, state)) {
                return true;
            }
        }
        state.put(module, 2); // completely processed
        return false;
    }
    static boolean hasCircularDependency(
            Map<String, List<String>> dependencies) {
        Map<String, Integer> state = new HashMap<>();
        for (String module : dependencies.keySet()) {
            if (state.getOrDefault(module, 0) == 0) {
                if (hasCycle(module, dependencies, state)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Map<String, List<String>> deps = new HashMap<>();
        deps.put("A", Arrays.asList("B"));
        deps.put("B", Arrays.asList("C"));
        deps.put("C", Arrays.asList("A"));
        System.out.println(hasCircularDependency(deps));
    }
}