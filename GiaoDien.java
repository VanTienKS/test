// package FontEnd.GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu.Separator;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

public class GiaoDien implements MouseListener {
	final int WIDTH = 1400, HEIGHT = 800;
	private JFrame jframe;
	private JPanel jpheader;
	private JPanel jpmenu;
	private JPanel jplContent;
	private Font font = new Font("Bahnschrift", Font.PLAIN, 16);
	private Color defaultColor = new Color(100, 200, 200);

	private JButton btnLogout;
	private JButton btnSettingUser;
	private JButton btnMinimize;
	private JButton jbtClose;
	private JButton btnNewButton;
	private JSeparator separator;

	public GiaoDien() {
		init();
	}

	public void init() {
		jframe = new JFrame();
		jframe.setSize(WIDTH, HEIGHT);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		jframe.setUndecorated(true);
		jframe.setLocationRelativeTo(null);

		header();
		scrollMenu();
		plContent();

		jframe.setVisible(true);
	}

	public void header() {
		int headerHeight = 50;
		int headerWidht = jframe.getWidth();
		jpheader = new JPanel();

		String[] iconName = { "icons8_angle_down_30px.png", "icons8_settings_30px_1.png", "icons8_angle_down_30px.png",
				"icons8_shutdown_30px_1.png" };

		JLabel headerTitle = new JLabel("QUẢN LÝ SIÊU THỊ");
		headerTitle.setFont(new Font("Bahnschrift", Font.PLAIN, 24));
		headerTitle.setHorizontalAlignment(SwingConstants.CENTER);
		headerTitle.setPreferredSize(new Dimension((int) (headerWidht * 0.68), headerHeight));

		btnLogout = new JButton("Tên đăng nhập", new ImageIcon("src\\Image\\ImageGui\\icons8_angle_down_30px.png"));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSettingUser = new JButton(new ImageIcon("src\\Image\\ImageGui\\icons8_settings_30px_1.png"));
		btnMinimize = new JButton(new ImageIcon("src\\Image\\ImageGui\\icons8_angle_down_30px.png"));
		jbtClose = new JButton(new ImageIcon("src\\Image\\ImageGui\\icons8_shutdown_30px_1.png"));

		btnLogout.setFont(font);

		btnLogout.setFocusable(false);
		btnSettingUser.setFocusable(false);
		btnMinimize.setFocusable(false);
		jbtClose.setFocusable(false);

		btnLogout.setToolTipText("Đăng xuất");
		btnSettingUser.setToolTipText("Tài khoản");
		btnMinimize.setToolTipText("Thoát");
		jbtClose.setToolTipText("Thu nhỏ");

		btnLogout.setBackground(defaultColor);
		btnSettingUser.setBackground(defaultColor);
		btnMinimize.setBackground(defaultColor);
		jbtClose.setBackground(defaultColor);

		btnLogout.setPreferredSize(new Dimension((int) (headerWidht * 0.15), headerHeight));
		btnSettingUser.setPreferredSize(new Dimension((int) (headerWidht * 0.05), headerHeight));
		btnMinimize.setPreferredSize(new Dimension((int) (headerWidht * 0.05), headerHeight));
		jbtClose.setPreferredSize(new Dimension((int) (headerWidht * 0.05), headerHeight));

		btnLogout.setBorder(BorderFactory.createLineBorder(defaultColor));
		btnSettingUser.setBorder(BorderFactory.createLineBorder(defaultColor));
		btnMinimize.setBorder(BorderFactory.createLineBorder(defaultColor));
		jbtClose.setBorder(BorderFactory.createLineBorder(defaultColor));

		jpheader.setBackground(new Color(100, 200, 200));
		jpheader.setPreferredSize(new Dimension(jframe.getWidth(), headerHeight));
		jpheader.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

		jpheader.add(btnLogout);
		jpheader.add(btnSettingUser);
		jpheader.add(headerTitle);
		jpheader.add(btnMinimize);
		jpheader.add(jbtClose);

		jframe.getContentPane().add(jpheader, BorderLayout.NORTH);
	}

	public void scrollMenu() {
		int menuW = 250;
		int menuH = 0;
		String[][] itemInfo = { { "seperate", "2", "", "" },
				{ "Bán hàng", "icons8_small_business_30px_3.png", "qlBanHang", "qlBanHang" },
				{ "Nhập hàng", "icons8_downloads_30px.png", "qlNhapHang", "qlNhapHang" }, { "seperate", "2", "", "" },
				{ "Sản phẩm", "icons8_multiple_smartphones_30px.png", "xemSanPham", "qlSanPham" },
				{ "Loại sản phẩm", "icons8_dossier_folder_30px.png", "xemLoaiSanPham", "qlLoaiSanPham" },
				{ "Hóa đơn", "icons8_agreement_30px.png", "xemHoaDon", "qlHoaDon" },
				{ "Phiếu nhập", "icons8_truck_30px.png", "xemPheuNhap", "qlPhieuNhap" },
				{ "Khuyến mãi", "icons8_gift_30px.png", "xemKhuyenMai", "qlKhuyenMai" }, { "seperate", "1", "", "" },
				{ "Nhân viên", "icons8_assistant_30px.png", "xemNhanVien", "qlNhanVien" },
				{ "Khách hàng", "icons8_user_30px.png", "xemKhachHang", "qlKhachHang" },
				{ "Nhà cung cấp", "icons8_company_30px.png", "xemNCC", "qlNCC" }, { "seperate", "1", "", "" },
				{ "Tài khoản", "icons8_key_30px.png", "xemTaiKhoan", "qlTaiKhoan" },
				{ "Quyền", "icons8_police_badge_30px.png", "xemQuyen", "qlQuyen" }, { "seperate", "1", "", "" },
				{ "Thống kê", "icons8_bar_chart_30px.png", "", "" },
				{ "Công cụ", "icons8_maintenance_30px.png", "", "" },
				{ "Cài đặt", "icons8_settings_30px.png", "", "" } };

		jpmenu = new JPanel();
		jpmenu.setLayout(new BoxLayout(jpmenu, BoxLayout.Y_AXIS));

		for (int i = 0; i < itemInfo.length; i++) {
			if (itemInfo[i][0].equals("seperate")) {
				Separator separator = new Separator();
				separator.setBackground(Color.orange);
				separator.setForeground(Color.orange);
				separator.setMaximumSize(new Dimension(menuW * 2, 5));
				jpmenu.add(separator);

			} else {

//                String chitietquyen = LoginForm.quyenLogin.getChiTietQuyen();
				String chitietquyen = "qlBanHang qlNhapHang qlSanPham qlLoaiSanPham qlHoaDon qlKhuyenMai qlNhanVien qlKhachHang qlPhieuNhap qlNCC qlTaiKhoan qlQuyen";
				if (chitietquyen.contains(itemInfo[i][2]) || chitietquyen.contains(itemInfo[i][3])) {
					JButton jbtn = new JButton(itemInfo[i][0],
							new ImageIcon("src\\Image\\ImageGui\\" + itemInfo[i][1]));
					jbtn.setHorizontalAlignment(SwingConstants.LEFT);
					jbtn.setMaximumSize(new Dimension(menuW, 70));
					jbtn.setFocusable(false);
					jbtn.setBackground(defaultColor);
					jbtn.addMouseListener(this);
					menuH += 60;
					jpmenu.add(jbtn);
				}
			}
		}
		JScrollPane scrollMenu = new JScrollPane(jpmenu, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jpmenu.setAutoscrolls(true);
		jpmenu.setPreferredSize(new Dimension(menuW, menuH + 100));
		scrollMenu.setPreferredSize(new Dimension(menuW, 800));
		scrollMenu.setBorder(BorderFactory.createEmptyBorder());
		scrollMenu.getVerticalScrollBar().setUnitIncrement(5);

		jframe.getContentPane().add(scrollMenu, BorderLayout.WEST);

	}

	public void plContent() {
		jplContent = new JPanel();

		jframe.getContentPane().add(jplContent, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new GiaoDien();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
