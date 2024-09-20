/*
	課題名：J2Kad28X「のび太がいっぱい！」
	作成日：2023/1/30
	作成者：田中太郎
*/
import java.util.ArrayList;
import java.util.Scanner;

public class J2Kad28X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("★豊富なコンテンツのECCビデオの視聴登録をします！★");
        ECCVideo eccVideo = new ECCVideo();
        while(true) {
            System.out.print("誰を登録しますか？（0：のび太、1：しずか、2：スネ夫、3：ジャイアン、-1：これでいい）＞");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;

            Subscriber s = null;
            switch(n) {
                case 0: s = new Nobita();   break;
                case 1: s = new Sizuka();   break;
                case 2: s = new Suneo();    break;
                case 3: s = new Jaian();    break;
            }
            if (s != null) {
                eccVideo.addSubscriber(s);
                System.out.println(s + "を登録しました！");
            }
            System.out.println();
        }
        System.out.println();

        eccVideo.execute();
    }
}
// 配信
class ECCVideo {
    private ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();
    public void addSubscriber(Subscriber s) { subscribers.add(s); }
    private void notifySubscribers(VideoContent video) {
        for (var s : subscribers) {
            s.update(video);
        }
    }
    public void execute() {
        Scanner in = new Scanner(System.in);
        System.out.println("＊ようこそ！豊富なコンテンツのECCビデオへ！！＊");
        while(true) {
            System.out.print("何を見ますか？（0：ドラえもん、1：ポケモン、2：アンパンマン、-1：もうあきた）＞");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;

            VideoContent video;
            switch(n) {
                case 0:     video = new DoraVideo();    break;
                case 1:     video = new PokeVideo();    break;
                case 2:     video = new AnpanVideo();   break;
                default:    video = new VideoContent(); break;
            }
            System.out.println("＊" + video + "を配信します！＊");
            notifySubscribers(video);
            System.out.println();
        }
    }
}
// ビデオコンテンツ
class VideoContent {
    public String toString() { return "何かの動画コンテンツ"; }
}
class DoraVideo extends VideoContent {
    public String toString() { return "ドラえもん"; }
}
class PokeVideo extends VideoContent {
    public String toString() { return "ポケットモンスター"; }
}
class AnpanVideo extends VideoContent {
    public String toString() { return "アンパンマン"; }
}
// サブスクライバー
interface Subscriber {
    void update(VideoContent video);
}
class Nobita implements Subscriber {
    public void update(VideoContent video) {
        System.out.println("のび太：ぼく全部好きだよ！");
    }
    public String toString() { return "のび太"; }
}
class Sizuka implements Subscriber {
    public void update(VideoContent video) {
        if (video instanceof DoraVideo) {
            System.out.println("しずか：これ一番見たかったの！");
        } else {
            System.out.println("しずか：どれも楽しいわ！");
        }
    }
    public String toString() { return "しずか"; }
}
class Suneo implements Subscriber {
    public void update(VideoContent video) {
        if (video instanceof AnpanVideo) {
            System.out.println("スネ夫：実はドキンちゃん、好きなんだ！");
        } else {
            System.out.println("スネ夫：いや～どれも良くできてるね～！");
        }
    }
    public String toString() { return "スネ夫"; }
}
class Jaian implements Subscriber {
    public void update(VideoContent video) {
        if (video instanceof PokeVideo) {
            System.out.println("ジャイアン：ピカチュウ！心の友よ！！");
        } else {
            System.out.println("ジャイアン：時間がたつのを忘れるぜ！");
        }
    }
    public String toString() { return "ジャイアン"; }
}
