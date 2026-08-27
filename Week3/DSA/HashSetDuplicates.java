import java.util.HashSet;
class HashSetDuplicates {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(20);
        System.out.println(set);
    }
}