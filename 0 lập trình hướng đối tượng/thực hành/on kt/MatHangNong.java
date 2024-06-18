 public  class MatHangNong extends MatHang{
  
    public MatHangNong(double gia_Ban,String ten_matHang )
    {
       super(gia_Ban , ten_matHang); 
    }
    public double soTien()
    {
        return super.gia_Ban;
    }
    public double TinhGia()
    {   double giaban =super.TinhGia();
        return giaban ;
    }
    public String toString()
    {

        return ","+ TinhGia();
    }
}