package _01_IntroToArrayLists;

import java.awt.Button;
import java.awt.TrayIcon.MessageType;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;



//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	ArrayList<Song> songs = new ArrayList<Song>();
	Song demoSong = new Song("demo.mp3");
	Song cheerfulSong = new Song("secondSong.mp3");
	Song lieSong = new Song("thirdSong.mp3");
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
				
				/*Song song = new Song("demo.mp3");
				song.setDuration(10);
				song.play();
				*/
			
				
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
		
		songs.add(demoSong);
		songs.add(cheerfulSong);
		songs.add(lieSong);
			JFrame frame = new JFrame();
			JPanel panel = new JPanel();
			JButton button = new JButton("click for suprise");
			panel.add(button);
			frame.add(panel);
			frame.setSize(300,300);
			frame.setVisible(true);
			button.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
			
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		demoSong.stop();
		cheerfulSong.stop();
		lieSong.stop();
		Random rand = new Random();
		int  n = rand.nextInt(3) + 1;
		System.out.println(n);
		if(n==1) {
			demoSong.play();
		}
		if(n==2) {
			cheerfulSong.play();
		}
		if(n==3) {
			lieSong.play();
		}
		
	}
}