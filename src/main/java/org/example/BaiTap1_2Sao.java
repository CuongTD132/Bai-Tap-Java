package org.example;

import java.util.Scanner;

public class BaiTap1_2Sao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tổng thu nhập hàng năm (VND): ");
        double tongThuNhap = scanner.nextDouble();
        double tongThuePhaiTra = 0;

        if (tongThuNhap > 0) {
            double thuNhapMuc1 = Math.min(tongThuNhap, 5000000);
            double thueMuc1 = thuNhapMuc1 * 0.05;
            System.out.println("Thuế phải trả cho mức 0 - 5 triệu đồng (5%): " + thueMuc1 + " VND");
            tongThuePhaiTra += thueMuc1;
            tongThuePhaiTra += thueMuc1;
        }
        if (tongThuNhap > 5000000) {
            double thuNhapTinhThueTuMuc2 = tongThuNhap - 5000000;
            double thuNhapMuc2 = Math.min(thuNhapTinhThueTuMuc2, 5000000);
            double thueMuc2 = thuNhapMuc2 * 0.10;
            System.out.println("Thuế phải trả cho mức 5 - 10 triệu đồng (10%): " + thueMuc2 + " VND");
            tongThuePhaiTra += thueMuc2;
        }
        if (tongThuNhap > 10000000) {
            double thuNhapTinhThueTuMuc3 = tongThuNhap - 10000000;
            double thuNhapMuc3 = Math.min(thuNhapTinhThueTuMuc3, 8000000);
            double thueMuc3 = thuNhapMuc3 * 0.15;
            System.out.println("Thuế phải trả cho mức 10 - 18 triệu đồng (15%): " + thueMuc3 + " VND");
            tongThuePhaiTra += thueMuc3;
        }
        if (tongThuNhap > 18000000) {
            double thuNhapTinhThueTuMuc4 = tongThuNhap - 18000000;
            double thuNhapMuc4 = Math.min(thuNhapTinhThueTuMuc4, 14000000);
            double thueMuc4 = thuNhapMuc4 * 0.20;
            System.out.println("Thuế phải trả cho mức 18 - 32 triệu đồng (20%): " + thueMuc4 + " VND");
            tongThuePhaiTra += thueMuc4;
        }
        if (tongThuNhap > 32000000) {
            double thuNhapTinhThueTuMuc5 = tongThuNhap - 32000000;
            double thuNhapMuc5 = Math.min(thuNhapTinhThueTuMuc5, 20000000);
            double thueMuc5 = thuNhapMuc5 * 0.25;
            System.out.println("Thuế phải trả cho mức 32 - 52 triệu đồng (25%): " + thueMuc5 + " VND");
            tongThuePhaiTra += thueMuc5;
        }
        if (tongThuNhap > 52000000) {
            double thuNhapTinhThueTuMuc6 = tongThuNhap - 52000000;
            double thuNhapMuc6 = Math.min(thuNhapTinhThueTuMuc6, 28000000);
            double thueMuc6 = thuNhapMuc6 * 0.30;
            System.out.println("Thuế phải trả cho mức 52 - 80 triệu đồng (30%): " + thueMuc6 + " VND");
            tongThuePhaiTra += thueMuc6;
        }

        if (tongThuNhap > 80000000) {
            double thuNhapMuc7 = tongThuNhap - 80000000;
            double thueMuc7 = thuNhapMuc7 * 0.35;
            System.out.println("Thuế phải trả cho mức trên 80 triệu đồng (35%): " + thueMuc7 + " VND");
            tongThuePhaiTra += thueMuc7;
        }

        System.out.println("Tổng số thuế thu nhập cá nhân bạn phải trả: " + String.format("%.0f", tongThuePhaiTra) + " VND");

    }
}
