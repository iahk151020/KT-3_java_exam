import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    

    public static void main(String[] args) throws Exception {
        DoubleProcessing dp = new DoubleProcessing();
        IntegerProcessing ip = new IntegerProcessing();
        SquareMatixProcessing smp = new SquareMatixProcessing();
        while(true){
            System.out.println("MENU");
            System.out.println("1. Nhập vào 2 số thực x và epsilon");
            System.out.println("2. Tính sinx = x - x^3/3! + x^5/5! + ... + (-1)^n(x^(2n+1)/(2n+1)!)");
            System.out.println("3. Nhập vào 1 số nguyên");
            System.out.println("4. Viết ra tổng các chữ số của số nguyên n");
            System.out.println("5. Kiểm tra xem có phải số thuận nghịch không");
            System.out.println("6. Nhập vào ma trận vuông A");
            System.out.println("7. Đưa ra tổng các hàng của ma trận A");
            System.out.println("8. Đưa ra hiệu của 2 ma trận A-B");
            System.out.println("9. Tính định thức của ma trận A");
            System.out.println("0. EXIT");
            System.out.println("Nhập lệnh của bạn: "); 
            int n = sc.nextInt();
            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    dp.nhapXvaEp();
                    break;

                case 2:

                case 3:
                    ip.setN();
                    break;
                case 4: 
                    ip.inTongChuSo();
                    break;
                case 5: 
                    ip.soThuanNghich();
                    break;
                case 6:
                    smp.setMatrix();
                    break;
                case 7: 
                    smp.tongCacHang();
                    break;
                case 8:
                    smp.hieuHaiMaTran();
                    break;
                case 9:
                    smp.det();
                    break;
                default:
                    break;
            }
            
        }
      
    }

    
}
