public abstract class MatHang{
    protected double gia_Ban ;
    protected String ten_matHang;
    public MatHang(double gia_Ban,String ten_matHang )
    {
        this.gia_Ban = gia_Ban;
        this.ten_matHang = ten_matHang ;
    }
    public double TinhGia()
    {
        return gia_Ban*2 ;
    }
}