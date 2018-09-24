package week2.task3;

public class Task3 {
}     
  class Hinhchunhat {// class mô tả về hình vuông
        private
        int chieudai;
        int chieurong;
        int chuvi;
        int dientich;
        boolean kt=true;

        public int getChieudai() {
            return chieudai;
        }

        public void setChieudai(int chieudai) {
            this.chieudai = chieudai;
        }

        public int getChieurong() {
            return chieurong;
        }

        public void setChieurong(int chieurong) {
            this.chieurong = chieurong;
        }

        public int getChuvi() {
            return chuvi;
        }

        public void setChuvi(int chuvi) {
            this.chuvi = chuvi;
        }

        public int getDientich() {
            return dientich;
        }

        public void setDientich(int dientich) {
            this.dientich = dientich;
        }

        public boolean isKt() {
            return kt;
        }

        public void setKt(boolean kt) {
            this.kt = kt;
        }

        public Hinhchunhat(int chieudai, int chieurong) {
            this.chieudai = chieudai;
            this.chieurong = chieurong;
        }


        public boolean check() {// kiem tra xem co là hinh vuong khong
            if (chieurong==chieudai) {
                System.out.println("Hinh can tinh là hinh vuong");
                return true;
            } else {
                System.out.println("Hinh can tinh là hinh chu nhat");
                return false;
            }
        }

        public int tinhP(int chieurong, int chieudai) {// tich chu vi
            return 2 * (chieurong + chieudai);
        }

        public int tinhS(int chieurong, int chieudai) {// tinh dien tich
            return chieudai * chieurong;
        }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Hinhchunhat square = new Hinhchunhat(Integer.parseInt(input.nextLine()), Integer.parseInt(input.nextLine()));
            square.check();
            /*if (check() == true) {
                System.out.println("Chu vi của hinh vuong là: ");
                square.tinhP();
                System.out.println("Dien tich của hinh vuong là: ");
                square.tinhS();
            } else {*/
                System.out.println("Chu vi của hinh chu nhat là: "+
                2*(square.chieurong+ square.chieudai)+" dơn vi do dai");
                System.out.println("Dien tich của hinh chu nhat là: "+
                square.tinhS(square.chieurong,square.chieudai)+"don vị dien tich");
            }
        }
    class  Market{// class mua hàng
        private
        String name;
        int giaban;
        int tongtien;
        int tientra;
        int tienthoi;
        int them;
        boolean du;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getGiaban() {
            return giaban;
        }

        public void setGiaban(int giaban) {
            this.giaban = giaban;
        }

        public int getTongtien() {
            return tongtien;
        }

        public void setTongtien(int tongtien) {
            this.tongtien = tongtien;
        }

        public int getTientra() {
            return tientra;
        }

        public void setTientra(int tientra) {
            this.tientra = tientra;
        }

        public int getTienthoi() {
            return tienthoi;
        }

        public void setTienthoi(int tienthoi) {
            this.tienthoi = tienthoi;
        }

        public int getThem() {
            return them;
        }

        public void setThem(int them) {
            this.them = them;
        }

        public boolean isDu() {
            return du;
        }

        public void setDu(boolean du) {
            this.du = du;
        }
        public Market(String name, int giaban){
            this.name= name;
            this.giaban=giaban;

        }
        public Market(int tongtien, int tientra){
            this.tongtien= tongtien;
            this.tientra= tientra;
        }
        public Market(int tongtien,int tientra, int tienthoi){
            this.tientra = tientra;
            this.tienthoi= tienthoi;
            this.tongtien = tongtien;
        }
        public void du(int tientra, int k) {
            if (tientra == k) {
                System.out.println("bạn da thanh toan du so tien");
            }
            else {
                if (tientra < k) {
                    System.out.println("bạn còn thieu " + (k - tientra) + " dong");
                }
                else {
                    System.out.println("Ban nhan lai " + (tientra - k) + " dong");
                }
            }
        }
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            Market mon1=new Market("mi goi", 7000);
            Market mon2 =new Market("notebook",14000);
            Market tong = new Market(mon1.giaban+mon2.giaban, Integer.parseInt(input.nextLine()));

            tong.du(tong.tientra,tong.tongtien);
        }
    }
    class grap{
        private
        String adress1;// nơi đi
        String adress2;// nơi đến
        String nameOfDriver1;
        //String nameOfDriver2;
        int far;// khoang cách hai noi
        int far2;//kc grap den noi di
        int pay;//so tien can trả
        int time;// tg grap cách bạn



        public String getAdress1() {
            return adress1;
        }

        public void setAdress1(String adress1) {
            this.adress1 = adress1;
        }

        public String getAdress2() {
            return adress2;
        }

        public void setAdress2(String adress2) {
            this.adress2 = adress2;
        }

        public String getNameOfDriver() {
            return nameOfDriver1;
        }

        public void setNameOfDriver(String nameOfDriver) {
            this.nameOfDriver1 = nameOfDriver;
        }

        public int getFar() {
            return far;
        }

        public void setFar(int far) {
            this.far = far;
        }

        public int getFar2() {
            return far2;
        }

        public void setFar2(int far2) {
            this.far2 = far2;
        }

        public int getPay() {
            return pay;
        }

        public void setPay(int pay) {
            this.pay = pay;
        }
        public int getTime() {
            return time;
        }

        public void setTime(int time) {
            this.time = time;
        }
        public grap(String adress1, String adress2, int far, int pay){
            this.adress1 =adress1;
            this.adress2 = adress2;
            this.far= far;
            this.pay =pay;
        }
        public  grap(String nameOfDriver1, int far2, int time ){
            this.nameOfDriver1= nameOfDriver1;
            this.far2=far2;
            this.time= time;

        }


        public static void main(String[] args ){
            grap chuyendi= new grap("Cau Giay","Bach Khoa",13, 70000);
            System.out.println(" chuyen di cua ban tu "+chuyendi.adress1+" den "+chuyendi.adress2);
            System.out.println("Tong quang duong: "+chuyendi.far+"km");
            System.out.println("so tien phai tra: "+chuyendi.pay+" dong " );
            grap driver1= new grap("29A1659",100,1);
            grap driver2 = new grap("29B6798",500,5);
            System.out.println("Tai xe xe "+ driver1.nameOfDriver1+ "hien dang cach ban "+ driver1.far2+ "m nữa trong " +driver1.time+ " phut");
            System.out.println("Tai xe xe "+ driver2.nameOfDriver1+ "hien dang cach ban "+ driver2.far2+ "m nữa trong " +driver2.time+ " phut");
            System.out.println("Moi ban chon tai xe: 1 Or 2.");
            Scanner input = new Scanner(System.in);
            int a = Integer.parseInt(input.nextLine());
            if(a==1)System.out.println("Tai xe cach ban con "+driver1.time+" phut nua");
            else System.out.println("Tai xe cach ban con "+driver2.time+" phut nua");
        }
    }

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
