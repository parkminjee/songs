package songs;

public class SongsApp {
	public static void main(String[] args) {
//		Songs songs = new Songs();
		
//		songs.setArtist("아이유");
//		songs.setAlbum("Real");
//		songs.setComposer("이민수");
//		songs.setTitle("좋은날");
//		songs.setTrack(3);
//		songs.setYear(2010);
		
		Songs songs = new Songs("좋은날", "Real", "아이유", "이민수", 3,2010);
		
		songs.show();
	}
}
