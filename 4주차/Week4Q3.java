class Song {
    private String title;
    private String artist;
    private int year;
    private String country;

    Song(String title, String artist, int year, String country) {
        this.title = title;
        this.artist = artist;
        this.year = year;
        this.country = country;
    }

    public void show() {
        System.out.println(this.year + "년 " + this.country + "국적의 " + this.artist + "가 부른 " + this.title);
    }

}

public class Week4Q3 {
    public static void main(String[] args) {
        Song sSong = new Song("Dancing Queen", "ABBA",1987, "스웨덴");
        sSong.show();

    }
}
