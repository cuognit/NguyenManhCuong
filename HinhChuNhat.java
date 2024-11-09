public class HinhChuNhat {
      float chieuDai;
      float chieuRong;

public HinhChuNhat(){
      this.chieuDai=chieuDai;
      this.chieuRong=chieuRong;
}

      public void getChieuDai() {
            System.out.println(chieuDai);
            System.out.println(chieuRong);
      }

      public float dienTich(float chieuDai, float chieuRong){
               float S = chieuDai*chieuRong;
               return S;
      }
      public float chuVi(float chieuDai, float chieuRong){
               float C = (chieuDai+chieuRong)/2;
               return C;
      }

      @Override
      public String toString() {
            return
                    "chieuDai= " + chieuDai +
                    ", chieuRong= " + chieuRong +
                            ", có S= " + dienTich(chieuDai,chieuRong) + ", có C= " + chuVi(chieuDai,chieuRong);
      }
}
