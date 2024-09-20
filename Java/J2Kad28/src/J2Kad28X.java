/*
	�ۑ薼�FJ2Kad28X�u�̂ё��������ς��I�v
	�쐬���F2023/1/30
	�쐬�ҁF�c�����Y
*/
import java.util.ArrayList;
import java.util.Scanner;

public class J2Kad28X {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("���L�x�ȃR���e���c��ECC�r�f�I�̎����o�^�����܂��I��");
        ECCVideo eccVideo = new ECCVideo();
        while(true) {
            System.out.print("�N��o�^���܂����H�i0�F�̂ё��A1�F�������A2�F�X�l�v�A3�F�W���C�A���A-1�F����ł����j��");
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
                System.out.println(s + "��o�^���܂����I");
            }
            System.out.println();
        }
        System.out.println();

        eccVideo.execute();
    }
}
// �z�M
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
        System.out.println("���悤�����I�L�x�ȃR���e���c��ECC�r�f�I�ցI�I��");
        while(true) {
            System.out.print("�������܂����H�i0�F�h��������A1�F�|�P�����A2�F�A���p���}���A-1�F�����������j��");
            int n = Integer.parseInt(in.next());
            if (n < 0) break;

            VideoContent video;
            switch(n) {
                case 0:     video = new DoraVideo();    break;
                case 1:     video = new PokeVideo();    break;
                case 2:     video = new AnpanVideo();   break;
                default:    video = new VideoContent(); break;
            }
            System.out.println("��" + video + "��z�M���܂��I��");
            notifySubscribers(video);
            System.out.println();
        }
    }
}
// �r�f�I�R���e���c
class VideoContent {
    public String toString() { return "�����̓���R���e���c"; }
}
class DoraVideo extends VideoContent {
    public String toString() { return "�h��������"; }
}
class PokeVideo extends VideoContent {
    public String toString() { return "�|�P�b�g�����X�^�["; }
}
class AnpanVideo extends VideoContent {
    public String toString() { return "�A���p���}��"; }
}
// �T�u�X�N���C�o�[
interface Subscriber {
    void update(VideoContent video);
}
class Nobita implements Subscriber {
    public void update(VideoContent video) {
        System.out.println("�̂ё��F�ڂ��S���D������I");
    }
    public String toString() { return "�̂ё�"; }
}
class Sizuka implements Subscriber {
    public void update(VideoContent video) {
        if (video instanceof DoraVideo) {
            System.out.println("�������F�����Ԍ����������́I");
        } else {
            System.out.println("�������F�ǂ���y������I");
        }
    }
    public String toString() { return "������"; }
}
class Suneo implements Subscriber {
    public void update(VideoContent video) {
        if (video instanceof AnpanVideo) {
            System.out.println("�X�l�v�F���̓h�L�������A�D���Ȃ񂾁I");
        } else {
            System.out.println("�X�l�v�F����`�ǂ���ǂ��ł��Ă�ˁ`�I");
        }
    }
    public String toString() { return "�X�l�v"; }
}
class Jaian implements Subscriber {
    public void update(VideoContent video) {
        if (video instanceof PokeVideo) {
            System.out.println("�W���C�A���F�s�J�`���E�I�S�̗F��I�I");
        } else {
            System.out.println("�W���C�A���F���Ԃ����̂�Y��邺�I");
        }
    }
    public String toString() { return "�W���C�A��"; }
}
