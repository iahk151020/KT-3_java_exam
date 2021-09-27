public class IntegerProcessing{
    private int n;
    
    public IntegerProcessing(){}

    public void setN(){
        System.out.println("Nhập số nguyên n:");
        this.n = Main.sc.nextInt();
    }

    public int getN(){
        return this.n;
    }

    public void inTongChuSo(){
        int sum = 0;
        int x = this.n;
        while (x > 0){
            sum += x%10;
            x /= 10;
        }
        System.out.println(sum);
    }

    public void soThuanNghich(){
        boolean ok = true;
        String N = String.valueOf(this.n);
        for(int i=0; i<=N.length()/2; i++)
            if (N.charAt(i) != N.charAt(N.length()-1-i)){
                ok = false;
                break;
            }
        if (ok){
            System.out.println(this.n + " là số thuận nghịch");
        } else {
            System.out.println(this.n + " không phải số thuận nghịch");
        }
    }

}