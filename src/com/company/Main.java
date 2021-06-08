package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName, password,newpassword;
        System.out.print("Kullanıcı Adınızı Giriniz : ");
        userName=scanner.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        password=scanner.nextLine();
        if (userName.equals("patika") && password.equals("java101")) {
            System.out.println("Giriş Yaptınız ! ");
        }
        else {
            System.out.println("Bilgileriniz Yanlış ! ");
            System.out.print("Lütfen Yeni Şifrenizi Belirleyiniz : ");
            newpassword=scanner.nextLine();
            if (newpassword.equals("java101")){
                System.out.println("Şifre Oluşturulamadı Lütfen Başka Şifre Giriiniz.");
            }
            else {
                System.out.println("Şifre Oluşturuldu");
            }

        }

    }
}
