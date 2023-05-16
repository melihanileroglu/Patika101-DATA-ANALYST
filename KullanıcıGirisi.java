
        String dogruSifre = "123456"; // Örnek olarak doğru şifre "123456" olarak belirlendi

        System.out.print("Şifrenizi giriniz: ");
        String girilenSifre = scanner.nextLine();

        if (girilenSifre.equals(dogruSifre)) {
            System.out.print("Şifrenizi sıfırlamak istiyor musunuz? (E/H): ");
            String cevap = scanner.nextLine();

            if (cevap.equalsIgnoreCase("E")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                String yeniSifre = scanner.nextLine();

                if (!yeniSifre.equals(girilenSifre)) {
                    System.out.println("Şifre oluşturuldu.");
                } else {
                    System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                }
            } else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }
        } else {
            System.out.println("Girilen şifre yanlış.");
        }
    }
}
