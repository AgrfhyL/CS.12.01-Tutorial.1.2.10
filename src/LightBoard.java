public class LightBoard {
    private boolean[][] lights;

    public LightBoard(int numRows, int numCols) {
        lights = new boolean[numRows][numCols];
        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {
                double rand = Math.random();
                if (rand <= 0.4) {
                    lights[r][c] = true;
                }
            }
        }
    }

    public void setLights(boolean[][] l) {
        lights = l;
    }

    public boolean[][] getLights() {
        return lights;
    }

    public boolean evaluateLight(int row, int col) {
        int count = 0;
        boolean stat = lights[row][col];
        for (int i = 0; i < lights.length; i++) {
            if (lights[i][col]) {
                count++;
            }
        }
        if (stat) {
            if (count % 2 == 0) {
                return false;
            } else {
                return stat;
            }
        } else {
            if (count % 3 == 0) {
                return true;
            } else {
                return stat;
            }
        }
    }


}
