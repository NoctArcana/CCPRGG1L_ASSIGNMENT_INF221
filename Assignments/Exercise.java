public class Exercise {
    public static void main(String[] args) throws Exception {

        char [][] mdArray = {{'1','1','1'},{'1','1','1'},{'1','1','1'}, {'1', '1', '1'}};
    

        // PATTERN 1
        System.out.println("1. PATTERN 1");
        for (char rows = 0; rows < mdArray.length; rows++) {
            System.out.println("");

            for (char columns = 0; columns < 3; columns++) {
                if (rows%2!=0) {
                    System.out.print(mdArray[rows][columns]);
                }
            }
        }
        System.out.println("");
        // PATTERN 2
        System.out.println("2. PATTERN 2");
        for (char rows = 0; rows < mdArray.length; rows++) {
            System.out.println("");

            for (char columns = 0; columns < 3; columns++) {
                if (rows%2==0) {
                    System.out.print(mdArray[rows][columns]);
                }
            }
        }
        System.out.println("");
        // PATTERN 3
        System.out.println("3. PATTERN 3");
        for (char rows = 0; rows < mdArray.length; rows++) {
            System.out.println("");
            
            for (char columns = 0; columns < 3; columns++) {
                System.out.print("");
                
                if(rows == 0 || rows == 3) {
                    System.out.print(mdArray[rows][columns]);
                }
                
                    if(rows == 1 || rows == 2) {
                        if(columns == 0 || columns == 2) {
                        System.out.print(" ");
                        } else {
                            System.out.print(mdArray[rows][columns]);
                    }
                }
            }
        }
        System.out.println("");
        // PATTERN 4
        System.out.println("4. PATTERN 4");
        for (char rows = 0; rows<mdArray.length; rows++) {
            System.out.println("");
            
            for (char columns = 0; columns<3; columns++) {
                System.out.print("");
                
                if(rows == 1 || rows == 3) {
                    System.out.print(mdArray[rows][columns]);
                }
                
                    if(rows == 0 || rows == 2) {
                        if(columns == 0 || columns == 2) {
                        System.out.print(" ");
                        } else {
                            System.out.print(mdArray[rows][columns]);
                    }
                }
            }
        }
        System.out.println("");
        // Get the SUM
        System.out.println("5. SUM");
        int [][] TotalArray = {{1,1,1},{1,1,1},{1,1,1}, {1, 1, 1}};
        int sumArray = 0;
        for (int rows = 0; rows < TotalArray.length; rows++) {
            System.out.println("");
            for (int columns = 0; columns < 3; columns++) {
                sumArray += TotalArray[rows][columns];
            }
        }
        System.out.println(sumArray);
    }   
}
