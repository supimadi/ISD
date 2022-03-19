package ac.tellu;

public class Song {
    private String name;
    private String artist;

    public Song(String name, String artist) {
        this.name = name;
        this.artist = artist;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Song(name=" + this.name + ", artist=" + this.artist + ")";
    }


}
