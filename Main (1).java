
public class Main {
    public static void main(String[] args) {
        char[] vertices = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int n = vertices.length;
        int[][] matrix = {
            {0, 1, 1, 1, 1, 1, 1},
            {1, 0, 1, 1, 1, 1, 1},
            {1, 1, 0, 1, 1, 1, 1},
            {1, 1, 1, 0, 1, 1, 1},
            {1, 1, 1, 1, 0, 1, 1},
            {1, 1, 1, 1, 1, 0, 1},
            {1, 1, 1, 1, 1, 1, 0}
        };

        System.out.print("  ");
        for (int i = 0; i < n; i++) {
            System.out.print(vertices[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(vertices[i] + " ");
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
