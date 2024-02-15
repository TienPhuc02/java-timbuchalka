import java.text.DecimalFormat;

public class Account {
    //classes challenge exercise
    private int soTaiKhoan;
    private int soDu;
    private String tenKhachHang;
    private String email;
    private String soDienThoai;
    public  void guiTienVaoTaiKhoan(int tienGuiVao){
        this.soDu+=tienGuiVao;
        DecimalFormat formatter = new DecimalFormat("###,###,###"); // Định dạng số
        String formattedAmount = formatter.format(tienGuiVao);
        String formattedBalance = formatter.format(this.soDu);
        System.out.println("Giao dịch thành công, số tiền gửi vào: " + formattedAmount + ". Số dư mới: " + formattedBalance);
    }
    public void rutTienKhoiTaiKhoan(int tienRutRa){
        if(this.soDu-tienRutRa<0){
            System.out.println("Số dư của bạn không đủ để thanh toán.");
        }else{
            this.soDu-=tienRutRa;
            DecimalFormat formatter = new DecimalFormat("###,###,###"); // Định dạng số
            String formattedAmount = formatter.format(tienRutRa);
            String formattedBalance = formatter.format(this.soDu);
            System.out.println("Giao dịch thành công, số tiền gửi vào: " + formattedAmount + ". Số dư mới: " + formattedBalance);
        }
    }
    public int getSoTaiKhoan() {
        return soTaiKhoan;
    }

    public int getSoDu() {
        return soDu;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public String getEmail() {
        return email;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoTaiKhoan(int soTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
    }

    public void setSoDu(int soDu) {
        this.soDu = soDu;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }
}
