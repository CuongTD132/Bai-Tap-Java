package org.example;

import java.util.Scanner;

public class BaiTap2_2Sao {
    public static boolean kiemTraDoiXung(String chuoi) {
        String chuoiThuong = chuoi.toLowerCase();
        int doDai = chuoiThuong.length();

        for (int i = 0; i < doDai / 2; i++) {
            if (chuoiThuong.charAt(i) != chuoiThuong.charAt(doDai - 1 - i)) {
                return false; // Nếu có cặp ký tự không khớp, không phải chuỗi đối xứng
            }
        }
        return true; // Nếu duyệt hết mà không có cặp nào không khớp thì là chuỗi đối xứng
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi để kiểm tra đối xứng: ");
        String inputString = scanner.nextLine();
        boolean laDoiXung = kiemTraDoiXung(inputString);
        if (laDoiXung) {
            System.out.println("True ");
        } else {
            System.out.println("False");
        }
    }
    }
