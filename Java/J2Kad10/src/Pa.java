public class Pa extends Hand {
    public Pa() { super("パー"); }

    //S
    // đọan override này dùng khi không có Janken.Result vsGu()... ở dưới
//    @Override
//    public Janken.Result vsHand(Hand other) {
//        if(other instanceof Gu){
//            return Janken.results[2][0];
//        }else if (other instanceof Choki){
//            return Janken.results[2][1];
//        }else if (other instanceof Pa){
//            return Janken.results[2][2];
//        }
//        return null;
//    }

    @Override
    public Janken.Result vsHand(Hand other) {
        return other.vsPa();
    }

    @Override
    public Janken.Result vsGu() {
        return Janken.Result.LOSE;
    }

    @Override
    public Janken.Result vsChoki() {
        return Janken.Result.WIN;
    }

    @Override
    public Janken.Result vsPa() {
        return Janken.Result.DRAW;
    }

    // vsHandを追加

}
