public class Choki extends Hand {
    public Choki() { super("チョキ"); }

//    @Override
//    public Janken.Result vsHand(Hand other) {
//        if(other instanceof Gu){
//            return Janken.results[1][0];
//        }else if (other instanceof Choki){
//            return Janken.results[1][1];
//        }else if (other instanceof Pa){
//            return Janken.results[1][2];
//        }
//        return null;
//    }
    @Override
    public Janken.Result vsHand(Hand other) {
        return other.vsChoki();
    }

    @Override
    public Janken.Result vsGu() {
        return Janken.Result.WIN;
    }

    @Override
    public Janken.Result vsChoki() {
        return Janken.Result.DRAW;
    }

    @Override
    public Janken.Result vsPa() {return Janken.Result.LOSE;}

    // vsHandを追加

}
