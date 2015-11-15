public class IsItASquare {

  public String isSquare(int[] x, int[] y) {

    boolean square = false;
    double[] sides = {distance(x[0],y[0],x[1],y[1]), distance(x[0],y[0],x[2],y[2]), distance(x[0],y[0],x[3],y[3])};

    int e1 = -1;
    int e2 = -1;
    int unequalSide = -1;

    if (sides[0] == sides[1]) {
      if (sides[0] != sides[2]) {
        e1 = 0;
        e2 = 1;
        unequalSide = 2;
      }
    } else if (sides[1] == sides[2]) {
      if (sides[1] != sides[0]) {
        e1 = 1;
        e2 = 2; 
        unequalSide = 0;
      }
    } else if (sides[0] == sides[2]) {
      if (sides[0] != sides[1]) {
        e1 = 0;
        e2 = 2;
        unequalSide = 1;
      }
    }

    if (e1 != -1) {
      double opposing = 0;
      switch (unequalSide) {
        case 0:
          opposing = distance(x[2], y[2], x[3], y[3]);
          break;
        case 1:
          opposing = distance(x[1], y[1], x[3], y[3]);
          break;
        case 2:
          opposing = distance(x[1], y[1], x[2], y[2]);
          break;
        default:
          break;
      }

      if (opposing == sides[unequalSide]) {
        double diagonal = opposing;
        double adjacent = sides[e1];
        boolean isGood = true;

        for (int i = 0; i < 4; i++) {
          int diagonalCount = 0;
          int adjacentCount = 0;
          for (int j = 0; j < 4; j++) {
            if (i != j) {
              double dist = distance(x[i], y[i], x[j], y[j]);
              if (dist == diagonal) {
                diagonalCount++;
              }
              else if (dist == adjacent) {
                              adjacentCount++;
                          }
                      }
                  }

                   if (!(diagonalCount == 1 && adjacentCount == 2)){
                      isGood = false;
                      break;
                  }
              }//for loop for diags and adj

              if (isGood) {
                  square = true;
              }
          }
      }

    return square ? "It's a square" : "Not a square";
  }

  public double distance( double x1, double y1, double x2, double y2 ) {
    return Math.sqrt( Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) );
  }

}
