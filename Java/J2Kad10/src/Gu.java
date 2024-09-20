public class Gu extends Hand {
    public Gu() { super("グー");}

    // vsHandを追加

//    @Override
//    public Janken.Result vsHand(Hand other) {
//        if(other instanceof Gu){
//            return Janken.results[0][0];
//        }else if (other instanceof Choki){
//            return Janken.results[0][1];
//        }else if (other instanceof Pa){
//            return Janken.results[0][2];
//        }
//        return null;
//    }

    @Override
    public Janken.Result vsHand(Hand other) {
        return other.vsGu();
    }

    @Override
    public Janken.Result vsGu() {
        return Janken.Result.DRAW;
    }

    @Override
    public Janken.Result vsChoki() {
        return Janken.Result.LOSE;
    }

    @Override
    public Janken.Result vsPa() {
        return Janken.Result.WIN;
    }


}
