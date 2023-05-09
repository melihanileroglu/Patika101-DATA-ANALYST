    public static void main(String[] args) {
        // değişkenlerini oluşturulması
        int a,b,c,e,u;
        double d;


        //kullanıcıdan verileri alma

        Scanner input=new Scanner(System.in);

        System.out.println("Üçgenin bir Kenarını Girin: ");
        a = input.nextInt();

        System.out.println("Üçgenin bir Kenarını Girin:" );
        b = input.nextInt();

        System.out.println("Üçgenin bir Kenarını Girin:");
        c= input.nextInt();
        
        // üçgen alan formülü
        u=(a+b+c)/2;
        e= 2*u;
        d=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı:  "+ d);
        
    }

}
