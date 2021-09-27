public class SquareMatixProcessing {
    private int n = -1;
    private int[][] matrixA, matrixB;
    

    public SquareMatixProcessing(){}

    public void setN(int n){
        this.n = n;
    }

    public void setMatrix(){
        System.out.println("Nhập n");
        setN(Main.sc.nextInt());
        matrixA = new int[this.n][this.n];
        System.out.println("Nhập ma trận vuông");
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                matrixA[i][j] = Main.sc.nextInt();
    }

    public void tongCacHang(){
        for(int i=0; i<n; i++){
            int row_i = 0;
            for(int j=0; j<n; j++){
                row_i += matrixA[i][j];
            }
                
            System.out.println();
            System.out.println("tổng hàng " + (i+1) + " là: " + row_i);
        }
    }

    public void det(){
        int det=1, index, num1, num2, total = 1;
        int temp[] = new int[n+1];
        for(int i=0; i<n; i++){
            index = i;
            while(matrixA[index][i] == 0 && index < n) index ++;

            if (index == n) continue;

            if (index != i){
                for(int j=0; j<n; j++){
                    int tem = matrixA[i][j];
                    matrixA[i][j] = matrixA[index][j];
                    matrixA[index][j] = tem;
                }
                det = (int)(det * Math.pow(-1, index-i));
            }

            for(int j=0; j<n; j++){
                temp[j] = matrixA[i][j];
            }

            for(int j=i+1; j<n; j++){
                num1 = temp[i];
                num2 = matrixA[j][i];
                for(int k=0; k<n; k++){
                    matrixA[j][k] = (num1 * matrixA[j][k]) - (num2 * temp[k]);
                }
                total = total * num1;

            }
        }
        for(int i=0; i<n; i++) 
            det = det * matrixA[i][i];
        
            det /= total;

        System.out.println("Định thức của ma trận = " + det);
    }

    public void hieuHaiMaTran(){
        System.out.println("Nhập ma trận B kích thước " + this.n + " x " + this.n);
        matrixB = new int[this.n][this.n];
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                matrixB[i][j] = Main.sc.nextInt();
        
        int[][] hieu = new int[this.n][this.n];
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                hieu[i][j] = matrixA[i][j] - matrixB[i][j];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++)
                System.out.print(hieu[i][j] + " ");
            System.out.println();
        }
        
    }
}
