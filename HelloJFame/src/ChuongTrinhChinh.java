import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class ChuongTrinhChinh {
	public static void main(String args) {
		JFrame f = new JFrame();
		f.setTitle("Vi du JFrame");
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(300, 200);
		
		//Qui định loại bố cục (Layout)
		f.setLayout(new FlowLayout());
		
		//Tạo một nút bấm
		JButton btnOK = new JButton("Nhấn tôi đi");
		
		//Tạo tai nghe
		BoLangNgheOK ok = new BoLangNgheOK();
		//Gắn vào cho nút OK
		btnOK.addActionListener((ActionListener) ok);
		
		JButton btnKhac = new JButton("Nhấn em đi");
		//Gắn lên form
		f.add(btnOK);
		
		f.add(btnKhac);
		
		//Chạy thử thì Em đã hết đề lên Tôi
		//Hiện form/frame
		f.show();  //Hiện cửa sổ
		
	}
	
	//Tạo bộ lắng nghe (hữu danh) và xử lý cho nút OK
	private static class BoLangNgheOK implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			//Mã xử lý khi user click chuột ở đây
			JDialog dialog = new JDialog();
			dialog.setTitle("Thông báo gì đó");
			dialog.setSize(220, 120);
			dialog.show();
			}
		}

}