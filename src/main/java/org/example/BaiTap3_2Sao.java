package org.example;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class BaiTap3_2Sao {
    public static String xoaKyTuLapLaiTrongChuoi(String chuoi) {
        Set<Character> kyTuDuyNhat = new LinkedHashSet<>();
        StringBuilder chuoiMoi = new StringBuilder();

        for (char kyTu : chuoi.toCharArray()) {
            // Nếu ký tự chưa có trong Set, thêm nó vào Set và thêm vào chuỗi mới
            if (kyTuDuyNhat.add(kyTu)) {
                chuoiMoi.append(kyTu);
            }
        }
        return chuoiMoi.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một chuỗi để xóa ký tự lặp lại: ");
        String inputString = scanner.nextLine();
        String chuoiSauKhiXoa = xoaKyTuLapLaiTrongChuoi(inputString);
        System.out.println("Chuỗi sau khi xóa ký tự lặp lại: " + chuoiSauKhiXoa);
    }
}
