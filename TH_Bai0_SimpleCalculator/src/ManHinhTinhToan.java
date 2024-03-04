import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKetQua;

	
	public ManHinhTinhToan() {
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập số thứ nhất (a)");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(20, 34, 155, 38);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNhpSTh = new JLabel("Nhập số thứ nhất (b)");
		lblNhpSTh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpSTh.setBounds(20, 99, 155, 38);
		getContentPane().add(lblNhpSTh);
		
		txtA = new JTextField();
		txtA.setBounds(185, 34, 279, 31);
		getContentPane().add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setColumns(10);
		txtB.setBounds(185, 99, 279, 31);
		getContentPane().add(txtB);
		
		JButton tbnCong = new JButton("CỘNG ");
		tbnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xu ly cong
				//Viết lệnh lên một thủ tục/hàm, rồi gọi ở đây
				HamXuLyCong();
			}
		});
		tbnCong.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tbnCong.setBounds(31, 163, 80, 31);
		getContentPane().add(tbnCong);
		
		JButton btnTru = new JButton("TRỪ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xu ly tru
				HamXuLyTru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTru.setBounds(149, 163, 80, 31);
		getContentPane().add(btnTru);
		
		JButton btnNhan = new JButton("NHÂN");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xu ly nhan
				HamXuLyNhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNhan.setBounds(267, 163, 80, 31);
		getContentPane().add(btnNhan);
		
		JButton btnChia = new JButton("CHIA");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Code xu ly chia
				HamXuLyChia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnChia.setBounds(376, 163, 74, 31);
		getContentPane().add(btnChia);
		
		JLabel lblKtQu = new JLabel("KẾT QUẢ");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQu.setBounds(55, 233, 120, 38);
		getContentPane().add(lblKtQu);
		
		txtKetQua = new JTextField();
		txtKetQua.setEditable(false);
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(185, 239, 279, 31);
		getContentPane().add(txtKetQua);
	}//Hết hàm xử lý
	
	void HamXuLyCong(){
		//Lấy dữ liệu từ điều khiển
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		//Chuyển kiểu 
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		//Tinh toán
		double tong = soA + soB;
		// Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(tong));
		
		
	}
	
    void HamXuLyTru(){
    	//Lấy dữ liệu từ điều khiển
    			String str_soA = txtA.getText();
    			String str_soB = txtB.getText();
    			//Chuyển kiểu 
    			double soA = Double.parseDouble(str_soA);
    			double soB = Double.parseDouble(str_soB);
    			//Tinh toán
    			double tong = soA - soB;
    			// Đưa ra hiển thị lên điều khiển
    			txtKetQua.setText(String.valueOf(tong));
		
	}
    
    void HamXuLyNhan(){
    	//Lấy dữ liệu từ điều khiển
    			String str_soA = txtA.getText();
    			String str_soB = txtB.getText();
    			//Chuyển kiểu 
    			double soA = Double.parseDouble(str_soA);
    			double soB = Double.parseDouble(str_soB);
    			//Tinh toán
    			double tong = soA * soB;
    			// Đưa ra hiển thị lên điều khiển
    			txtKetQua.setText(String.valueOf(tong));
		
	}
    
    void HamXuLyChia(){
    	//Lấy dữ liệu từ điều khiển
    			String str_soA = txtA.getText();
    			String str_soB = txtB.getText();
    			//Chuyển kiểu 
    			double soA = Double.parseDouble(str_soA);
    			double soB = Double.parseDouble(str_soB);
    			//Tinh toán
    			double tong = soA / soB;
    			// Đưa ra hiển thị lên điều khiển
    			txtKetQua.setText(String.valueOf(tong));
		
	}
	
}
