class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return ans;

        int srow = 0;
        int erow = matrix.length - 1;
        int scol = 0;
        int ecol = matrix[0].length - 1;

        while (srow <= erow && scol <= ecol) {
            // 1. Traverse Right across the top remaining row
            for (int j = scol; j <= ecol; j++) {
                ans.add(matrix[srow][j]);
            }
            srow++; // Move top boundary down

            // 2. Traverse Down along the rightmost remaining column
            for (int i = srow; i <= erow; i++) {
                ans.add(matrix[i][ecol]);
            }
            ecol--; // Move right boundary left

            // 3. Traverse Left across the bottom remaining row (if still valid)
            if (srow <= erow) {
                for (int j = ecol; j >= scol; j--) {
                    ans.add(matrix[erow][j]);
                }
                erow--; // Move bottom boundary up
            }

            // 4. Traverse Up along the leftmost remaining column (if still valid)
            if (scol <= ecol) {
                for (int i = erow; i >= srow; i--) {
                    ans.add(matrix[i][scol]);
                }
                scol++; // Move left boundary right
            }
        }

        return ans;
    }
}