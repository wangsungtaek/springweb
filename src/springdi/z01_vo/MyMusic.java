package springdi.z01_vo;

import java.util.ArrayList;

public class MyMusic {
	private String artist;
	private ArrayList<String> mlist;
	
	public MyMusic() {
		// TODO Auto-generated constructor stub
	}

	public MyMusic(String artist) {
		super();
		this.artist = artist;
		this.mlist = new ArrayList<String>();
	}
	public void showMusicList() {
		System.out.println(artist + "의 음악리스트");
		if(mlist.size()>0) {
			for(String music : mlist)
				System.out.println(music);
		}
	}
	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setMlist(ArrayList<String> mlist) {
		this.mlist = mlist;
	}
}
