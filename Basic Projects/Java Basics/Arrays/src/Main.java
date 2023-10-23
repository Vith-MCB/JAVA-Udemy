public class Main {
    public static void main(String[] args) {
        // Arrays

        // Declaration and initialization of a one-dimensional array
        int[] numbers = new int[5]; // An integer array with 5 elements
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;

        // Accessing and printing array elements
        System.out.println("One-Dimensional Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Two-Dimensional Arrays

        // Declaration and initialization of a two-dimensional array
        int[][] matrix = new int[3][3]; // A 3x3 integer matrix

        // Assigning values to the elements
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;

        // Accessing and printing the two-dimensional array
        System.out.println("\nTwo-Dimensional Array (Matrix):");
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println(); // Move to the next row
        }

        // Multidimensional Arrays

        // Declaration and initialization of a three-dimensional array
        String[][][] cube = new String[2][2][2]; // A 2x2x2 three-dimensional array

        // Assigning values to the elements
        cube[0][0][0] = "Front-Top-Left";
        cube[0][0][1] = "Front-Top-Right";
        cube[0][1][0] = "Front-Bottom-Left";
        cube[0][1][1] = "Front-Bottom-Right";
        cube[1][0][0] = "Back-Top-Left";
        cube[1][0][1] = "Back-Top-Right";
        cube[1][1][0] = "Back-Bottom-Left";
        cube[1][1][1] = "Back-Bottom-Right";

        // Accessing and printing the three-dimensional array
        System.out.println("\nThree-Dimensional Array (Cube):");
        for (int x = 0; x < cube.length; x++) {
            for (int y = 0; y < cube[x].length; y++) {
                for (int z = 0; z < cube[x][y].length; z++) {
                    System.out.println("Cube[" + x + "][" + y + "][" + z + "]: " + cube[x][y][z]);
                }
            }
        }
    }
}