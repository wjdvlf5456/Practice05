package com.javaex.ex03;

public class Song {
	
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private String year;
	private int track;
	
	//생성자
	
	public Song() {
		System.out.println("Song(파라미터0개)");	
	}
	
	public Song(String title, String artist, String album, String composer, String year) {
		this.title=title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		System. out.println("Song(파라미터5개)");
	}

	public Song(String title, String artist, String album, String composer, String year, int track) {
		this(title, artist, album, composer, year);
		this.track = track;
		System.out.println("Song(파라미터6개)");
	}
	//예상: SongApp에 있는 파라미터는 6개짜리여서 파라미터6개가 들어간 생성자만 만족하므로
	// "좋은날", "아이유", "Real", "이민수", "2010", 3이 한 줄만 나올 것이다.
	
	//결과: "Song(파라미터5개)" 와 "Song(파라미터6개)" 가 적용되었다.
	
	
	//메소드 - gs
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public String getAlbum() {
		return album;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public String getComposer() {
		return composer;
	}
	
	public void setComposer(String composer) {
		this.composer = composer;
	}
	
	public String getYear() {
		return year;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
	
	public int getTrack() {
		return track;
	}
	
	public void setTrack(int track) {
		this.track = track;
	}
	
	//메소드 일반
	public void showInfo() {
	}
	
}



