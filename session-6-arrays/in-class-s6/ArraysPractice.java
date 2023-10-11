public class ArraysPractice {
    private String name;

    public ArraysPractice(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        // Assume studentNames 
        String[] studentNames = {"Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace", "Harry", "Ivy", "Jack", "Kelly", "Liam"};

        ArraysPractice[][] groups = new ArraysPractice[3][4];  // 3 groups, each with 4 students

        int x = 0;
        for (int i = 0; i < groups.length; i++) {
            for (int j = 0; j < groups[i].length; j++) {
                String name = studentNames[x];
                groups[i][j] = new ArraysPractice(name);
                x++;
            }
        }

        // Printing the names of students in each group
        for (int i = 0; i < groups.length; i++) {
            System.out.println("Group " + (i + 1) + ":");
            for (int j = 0; j < groups[i].length; j++) {
                System.out.println("    " + groups[i][j].getName());
            }
        }
    }
}
