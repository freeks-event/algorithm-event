package omikuji;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ReadImage{

	public void Image(String sb) {
		GameWindow gw = new GameWindow("テストウィンドウ",1000,700);
		DrawCanvas dc = new DrawCanvas(sb);
		gw.add(dc);
		gw.setVisible(true);
	}
}

class GameWindow extends JFrame{

	public GameWindow(String title, int width, int height) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(width,height);
		setLocationRelativeTo(null);
	}
}

class DrawCanvas extends JPanel{

	private String sb;

	DrawCanvas(String sb){
		this.sb = sb;
	}

	public void paintComponent(Graphics g) {
		Image img = Toolkit.getDefaultToolkit().getImage("./omikuji_jmage/" + sb);
		super.paintComponent(g);
		//画像の表示
		g.drawImage(img, 0, 0, 1000, 700, this);
//		(x=0,y=0) の位置に幅 1000, 高さ 700 の大きさで img を表示する。
	}
}
