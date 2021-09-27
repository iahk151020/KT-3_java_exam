public class DoubleProcessing{
    private double x, ep;

    public DoubleProcessing(){}

    public void setX(double x){
        this.x = x;
    }

    public void setEp(double ep){
        this.ep = ep;
    }

    public double getX(){
        return this.x;
    }

    public double getEp(){
        return this.ep;
    }

   public void nhapXvaEp(){
       System.out.println("Nhập x:");
       this.x = Main.sc.nextDouble();
       System.out.println("Nhập epsilon");
       this.ep = Main.sc.nextDouble();
   }



}