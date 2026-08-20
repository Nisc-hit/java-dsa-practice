public class ImmutableStudent {
    private final String name;
    private final int rollNumber;
    ImmutableStudent(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }
    public String getName() { return name; }
    public int getRollNumber() { return rollNumber; }
    // No setters exist - once created, this object can NEVER be changed
    public static void main(String[] args) {
        ImmutableStudent s = new ImmutableStudent("Nischit", 101);
        System.out.println(s.getName() + " - " + s.getRollNumber());
        // s.name = "Someone Else";  // Compile error - final fields can't be reassigned
    }
}