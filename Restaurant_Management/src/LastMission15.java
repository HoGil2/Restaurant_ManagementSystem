import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.util.*;
import java.io.*;
import java.text.*;

public class LastMission15 extends JFrame {
	String Stringtxt [] = new String[10];
	int Stringnum =0;
	int surveycount = 0;
	int tablesell = 0;
	int moneysum = 0;
	int tablecount= 0;
	int select = 0;
	int thisluck;
	int lucknum[] = new int[12];
	int ran;
	int todaysell = 0;
	
	int money[] = new int[12];
	String mon1, mon2, mon3, mon4, mon5, mon6, mon7, mon8, mon9, mon10, mon11, mon12;
	int num[] = new int[12];
	
	JButton endbtn = new JButton("�ֹ� �Ϸ�");
	JLabel stkpic = new JLabel(new ImageIcon("images/background.jpg"));
	JLabel pstpic = new JLabel(new ImageIcon("images/background.jpg"));
	JLabel pizpic = new JLabel(new ImageIcon("images/background.jpg"));
	JLabel pilpic = new JLabel(new ImageIcon("images/background.jpg"));
	JLabel sidepic = new JLabel(new ImageIcon("images/background.jpg"));
	JLabel drinkpic = new JLabel(new ImageIcon("images/background.jpg"));
	JLabel aa1 = new JLabel(new ImageIcon("images/beauty.jpg"));
	JLabel aa2 = new JLabel(new ImageIcon("images/����.jpg"));
	JLabel aa3 = new JLabel(new ImageIcon("images/���̸�.jpg"));
	JLabel aa4 = new JLabel(new ImageIcon("images/������.jpg"));
	JLabel timelabel1 = new JLabel(); JLabel timelabel2 = new JLabel();
	JLabel ������� = new JLabel("�ȳ��Ͻʴϱ�. JUNG KII & COOK �Դϴ�. �츮 ������ �湮���ֽ� ��� ���Ե鲲 ����帳�ϴ�. �׻� ���� ���� ���񽺸� ���ؼ� ������ ����ϰڽ��ϴ�.");
	
	JLabel steaklabel[] = new JLabel[7];
	JLabel pizzalabel[] = new JLabel[9];
	JLabel pzname[] = new JLabel[9];
	JLabel pilaflabel[] = new JLabel[4];
	JLabel pilname[] = new JLabel[4];
	JButton pzorder[] = new JButton[9];
	JButton pilorder[] = new JButton[4];
	JLabel stname[] = new JLabel[7];
	JButton order[] = new JButton[7];
	JLabel pastalabel[] = new JLabel[11];
	JLabel psname[] = new JLabel[11];
	JButton psorder[] = new JButton[11];
	JLabel sidelabel[] = new JLabel[6];
	JLabel sdname[] = new JLabel[6];
	JButton sdorder[] = new JButton[6];
	JLabel drinklabel[] = new JLabel[11];
	JLabel dkname[] = new JLabel[11];
	JButton dkorder[] = new JButton[11];
	String t1info[] = new String[20];
	String t2info[] = new String[20];
	String t3info[] = new String[20];
	String t4info[] = new String[20];
	String t5info[] = new String[20];
	String t6info[] = new String[20];
	String t7info[] = new String[20];
	String t8info[] = new String[20];
	String t9info[] = new String[20];
	String t10info[] = new String[20];
	String t11info[] = new String[20];
	String t12info[] = new String[20];
	JLabel t1money[] = new JLabel[20];
	JLabel t2money[] = new JLabel[20];
	JLabel t3money[] = new JLabel[20];
	JLabel t4money[] = new JLabel[20];
	JLabel t5money[] = new JLabel[20];
	JLabel t6money[] = new JLabel[20];
	JLabel t7money[] = new JLabel[20];
	JLabel t8money[] = new JLabel[20];
	JLabel t9money[] = new JLabel[20];
	JLabel t10money[] = new JLabel[20];
	JLabel t11money[] = new JLabel[20];
	JLabel t12money[] = new JLabel[20];
	ImageIcon tableimg = new ImageIcon("images/go.jpg");
	ImageIcon btn = new ImageIcon("images/btnimg.jpg");
	JMenuBar menubar1 = new JMenuBar();
	JMenu menu1 = new JMenu("�������");
	JMenuBar tablebar = new JMenuBar();
	JMenuItem tbinfo = new JMenuItem(" Table ����");
	JMenu menu2 = new JMenu("Table ����");
	JLabel label = new JLabel(tableimg);
	JButton tbtn[] = new JButton[18]; // ���̺� ��ư
	JButton Clickbtn1, Clickbtn2, Clickbtn3;
	JLabel tblabel[] = new JLabel[12]; // ���̺� ��ư JLabel
	JLabel tblabel2[] = new JLabel[12]; // ���̺� ��ư JLabel
	JButton steak = new JButton(new ImageIcon("menu/steaksalad.jpg"));
	JButton pasta = new JButton(new ImageIcon("menu/pasta.jpg"));
	JButton pilaf = new JButton(new ImageIcon("menu/pilaf.jpg"));
	JButton pizza = new JButton(new ImageIcon("menu/pizza.jpg"));
	JButton side = new JButton(new ImageIcon("menu/sidedish.jpg"));
	JButton drink = new JButton(new ImageIcon("menu/beverage.jpg"));
	ImageIcon orderimg = new ImageIcon("menu/orderimg.png");
	
	// Reservation �ʵ�
	String t1name, t1birth, t1main = "", t1side = "", t1person, t1phone, t1num, t1time, t2name, t2birth, t2main = "",
			t2side = "", t2person, t2phone, t2num, t2time, t3name, t3birth, t3main = "", t3side = "", t3person, t3phone,
			t3num, t3time, t4name, t4birth, t4main = "", t4side = "", t4person, t4phone, t4num, t4time, t5name, t5birth,
			t5main = "", t5side = "", t5person, t5phone, t5num, t5time, t6name, t6birth, t6main = "", t6side = "",
			t6person, t6phone, t6num, t6time, t7name, t7birth, t7main = "", t7side = "", t7person, t7phone, t7num,
			t7time, t8name, t8birth, t8main = "", t8side = "", t8person, t8phone, t8num, t8time, t9name, t9birth,
			t9main = "", t9side = "", t9person, t9phone, t9num, t9time, t10name, t10birth, t10main = "", t10side = "",
			t10person, t10phone, t10num, t10time, t11name, t11birth, t11main = "", t11side = "", t11person, t11phone,
			t11num, t11time, t12name, t12birth, t12main = "", t12side = "", t12person, t12phone, t12num, t12time,
			nowDate;

	JMenuBar menubar = new JMenuBar();
	JMenu menu = new JMenu("V I P");
	JMenuItem mn1, mn2, mn3, mn4, mn5, mn6;
	JTextField namefield, birthfield, hpfield1, hpfield2, hpfield3, timefield;
	JLabel name, phone, mainmenu, sidemenu, birth, time, person, a, sum, danger, led, ttable;
	JPanel jyp;
	JButton ok, cancel;
	JRadioButton man, woman;
	ButtonGroup g;
	JLabel manofwoman, myperson, la = new JLabel("��Ȯ�� ���������� �Է����ֽñ� �ٶ��ϴ�.");;
	JComboBox combox, timebox, mainbox, sidebox, tablebox;
	String ea[] = { "�ο�����", "   1 ��", "   2 ��", "   3 ��", "   4 ��", "   5 ��", "   6 ��", "   7 ��", "   8 ��" };
	String ea2[] = { "�ð�����", " 9 ��  ", "   10 ��", "   11 ��", "   12 ��", "   13��", "   14 ��", "   15 ��", "   16 ",
			"   17 ��", " 18 ��" };
	String menuString[] = { " Main Select ", " ��� ������ũ ������ ", " �Ͼ� �丶�� �Ľ�Ÿ ", " ������ �Ľ�Ÿ ", " ������ ������� ",
			" �� �����̽� �ع� �Ľ�Ÿ ", " ���Ͳܰ��� �ʶ��� ", " ������ ũ�� ������ ", " ���� �ʶ��� " };
	String sideString[] = { " Side Select ", " ����ġ ������ ", " ���� �극�� ", " ���� ������ ", " ġŲ �ٴ� ������ " };
	String tablenum[] = { " 1��  ", " 2��  ", " 3��  ", " 4��  ", " 5��  ", " 6��  ", " 7��  ", " 8��  ", " 9��  ", " 10��  ",
			" 11��  ", " 12��  " };
	ImageIcon image1 = new ImageIcon("images/man.jpg");
	ImageIcon image2 = new ImageIcon("images/woman.jpg");
	String info[] = new String[10];
	String info2[] = new String[10];
	int numm = 0, numm2 = 0;
	Container contentpane;
	JLabel t_name = new JLabel("�� ��");
	JLabel t_birth = new JLabel("�������");
	JLabel t_main = new JLabel("Main Dish");
	JLabel t_side = new JLabel("Side Dish");
	JLabel t_person = new JLabel("�� ��");
	JLabel t_phone = new JLabel("��ȭ��ȣ");
	JLabel t_num = new JLabel("�� ��");
	JLabel t_time = new JLabel("�� ��");

	String t1price[] = new String[20];
	String t2price[] = new String[20];
	String t3price[] = new String[20];
	String t4price[] = new String[20];
	String t5price[] = new String[20];
	String t6price[] = new String[20];
	String t7price[] = new String[20];
	String t8price[] = new String[20];
	String t9price[] = new String[20];
	String t10price[] = new String[20];
	String t11price[] = new String[20];
	String t12price[] = new String[20];
	// Ŭ���� ����
	FoodMenu fdmenu;
	Click0 clk;
	SteakPanel stp;
	PastaPanel psp;
	PilafPanel plp;
	PizzaPanel pzp;
	SidePanel sdp;
	DrinkPanel dkp;
	OrderInfo od;
	SignPanel spsp;
	Payment pay;
	Survey sv;
	SurveyWindow sw;
	MyThird aaa;
	Reservation reser;
	Event event;
	MySubject sub;

	ImageIcon cardimg = new ImageIcon("images/ī�����.jpg");
	ImageIcon cashimg = new ImageIcon("images/���ݰ���.jpg");
	JButton paybtn1 = new JButton(cashimg), paybtn2 = new JButton(cardimg);
	JButton surveyok = new JButton("�ҷ���");
	JButton surveycancel = new JButton("�� �ҷ���");
	JTextField surveytxt[] = new JTextField[5];
	JLabel monitor1 = new JLabel("�ܿ� Table ");
	JButton sellinfo = new JButton(new ImageIcon("images/����.jpg"));
	JButton sale = new JButton (new ImageIcon("images/���.jpg"));
	JLabel mainsign = new JLabel(new ImageIcon("images/mainsign.jpg"));
	JButton subject = new JButton(new ImageIcon("images/�����ǥ.png"));
	
	JLabel foodinfo[] = new JLabel[20];
	JLabel north = new JLabel("< �� �� �� ��  >", JLabel.CENTER);
	JLabel south = new JLabel();
	JSlider slider = new JSlider(JSlider.HORIZONTAL,0,500,250);
	Scanner sc;
	
	public LastMission15() throws FileNotFoundException {	
		super("JUNG KII & COOK");
		
		
		for(int i=0; i<12; i++){
			money[i] = 0;
			num[i] = 0;
		}
		menu2.add(tbinfo); // Click class �� ����
		tablebar.add(menu2); // Click class �� ����
		fdmenu = new FoodMenu();
		sw = new SurveyWindow();
		spsp = new SignPanel();
		clk = new Click0();
		stp = new SteakPanel();
		psp = new PastaPanel();
		plp = new PilafPanel();
		pzp = new PizzaPanel();
		sdp = new SidePanel();
		dkp = new DrinkPanel();
		reser = new Reservation();
		event = new Event();
		pay = new Payment();
		sub = new MySubject();
		
		thisluck = (int)(Math.random()*10);
		
		getContentPane();
		getContentPane().setBackground(Color.YELLOW);
		setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel aa = new JLabel("1 ��");
		JLabel aa2 = new JLabel("2 ��");
		for (int i = 0; i < 12; i++) {
			tblabel[i] = new JLabel((i + 1) + " ��");
			tblabel2[i] = new JLabel("", JLabel.CENTER);
			tbtn[i] = new JButton("�Լ� ����");
			tbtn[i].setLayout(new GridLayout(2, 1));
			tbtn[i].add(tblabel[i]);
			tbtn[i].add(tblabel2[i]);
			label.add(tbtn[i]);
			tbtn[i].addActionListener(new MyActionListener());
			tbtn[i].setBackground(Color.WHITE);
			tbtn[i].addMouseListener(new MyMouseListener());
		}
		for (int j = 0; j < 4; j++) {
			tbtn[j].setBounds(37 + (j * 251), 45, 174, 83);
			tbtn[j + 4].setBounds(37 + (j * 251), 220, 174, 83);
			tbtn[j + 8].setBounds(37 + (j * 251), 395, 174, 83);
		}
		add(sellinfo);
		sellinfo.setContentAreaFilled(false);
		sellinfo.setBounds(1040,160, 122, 109);
		sellinfo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println("���� ������� : "+moneysum+" �Դϴ�.");
				System.out.println("�Ǹ��� Table���� "+tablesell+" �Դϴ�");
			}
		});
		sale.setBounds(1040, 310, 122, 109);
		subject.setBounds(1040, 450, 122, 38);
		label.setBounds(0,154, 1000, 526);
		mainsign.setBounds(0, 0, 1200, 154);
		timelabel1.setBounds(1020, 530, 200, 40);
		timelabel2.setBounds(1010, 590, 200, 40);
		timelabel1.setFont(new Font("Bold",Font.BOLD, 25));
		timelabel2.setFont(new Font("Bold",Font.BOLD, 35));
		�������.setFont(new Font("Bold",Font.BOLD, 40));
		add(timelabel1);
		add(timelabel2);
		add(�������);
		add(label);
		add(sale);
		add(subject);
		add(mainsign);
		sale.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				int result = JOptionPane.showConfirmDialog(null, "������ �մϴ�",  // �̼� 15 JOptionPane Ȱ��
						"Confirm", JOptionPane.YES_NO_OPTION);
				if(result == JOptionPane.YES_OPTION){
					System.out.println("�Ϸ� ������� : "+moneysum+"�̰�,");
					System.out.println(moneysum+" ���� �ݰ� ����Ǿ����ϴ�.");
					moneysum = 0;
					tablesell = 0;
				}	
				System.exit(0);
			}	
		});
		subject.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				sub.setVisible(true);
			}
		});
		setResizable(false);
		setSize(1200, 800);
		setLocation(165,100);
		setVisible(true);
	}
	class SignPanel extends JFrame{ 
		BufferedImage image	= new BufferedImage(500,500, BufferedImage.TYPE_INT_RGB);
		Graphics graphics = image.createGraphics();
		JButton yesbtn = new JButton("����"); 
		Point stpoint = null, epoint = null;
		JPanel signpanel = new JPanel();
		JPanel southpanel = new JPanel();
		SignPanel(){
			setTitle("Your Sign Plz");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			southpanel.setLayout(new FlowLayout());
			southpanel.add(yesbtn);

			add(southpanel,BorderLayout.SOUTH);
			add(signpanel, BorderLayout.CENTER);
			signpanel.addMouseListener(new MyMouseAdapter());
			signpanel.addMouseMotionListener(new MyMouseMotion());
			yesbtn.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					try { 
						File file = new File("����"+ran+".jpeg");
						ImageIO.write(image, "jpeg", file);
					} 
					catch (Exception e1)
					{
						e1.printStackTrace(); 
					} 
					setVisible(false);
				}
			});
			setResizable(false);
			setSize(400,400);
		}
		class MyMouseAdapter extends MouseAdapter{   // �̼� 3 ���콺 �̺�Ʈ
			public void mousePressed(MouseEvent e){		
				stpoint = e.getPoint();
			}
			public void mouseReleased(MouseEvent e){
				epoint  = e.getPoint();					
				repaint();
			}
		} 
		class MyMouseMotion extends MouseMotionAdapter{ // �̼� 5 ���콺 ��� ����Ʈ
			public void mouseDragged(MouseEvent e){
				epoint = e.getPoint();
				repaint();
			}
		}

		public void paint(Graphics g){
			if(stpoint != null && epoint != null) {
				g.drawLine(stpoint.x, stpoint.y, epoint.x, epoint.y);
				graphics.drawLine(stpoint.x, stpoint.y, epoint.x, epoint.y);
				stpoint = epoint;
			}
		}
	}
	class SurveyWindow extends JDialog{
		JLabel la2 = new JLabel(new ImageIcon("images/5%����.jpg"));
		SurveyWindow(){
			getContentPane();
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setLayout(new FlowLayout(FlowLayout.CENTER,5,20));
			JLabel la = new JLabel("  ������ �����Ͻø� �������� 5%���� �ص帳�ϴ�.  ");
			add(la);
			add(surveyok);
			add(surveycancel);
			add(la2);
			surveyok.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					setModal(false);
					new Survey();
					setVisible(false);
				}
			});
			surveycancel.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					setModal(false);
					setVisible(false);
				}
			});
			setResizable(false);
			setSize(370,300);
		}
	}
	class Survey extends JDialog{
		JButton go = new JButton("�����ϱ�");
		JLabel sv1 = new JLabel("1. �������� ���񽺴� ��̽��ϱ� ?",JLabel.LEFT);
		JLabel sv2 = new JLabel("2. ������ ���� ��̽��ϱ� ?",JLabel.LEFT);
		JLabel sv3 = new JLabel("3. ������ ���� �����̽��ϱ� ?",JLabel.LEFT);
		JLabel sv4 = new JLabel("4. ������� �ǰ��� ������ �ּ���.",JLabel.LEFT);
		Survey(){
			setTitle("���� ��");
			getContentPane();
			setLayout(new GridLayout(10,1));
			setModal(true);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			sv1.setFont(new Font("���ü", Font.BOLD, 16));
			sv2.setFont(new Font("���ü", Font.BOLD, 16));
			sv3.setFont(new Font("���ü", Font.BOLD, 16));
			sv4.setFont(new Font("���ü", Font.BOLD, 16));
			for(int i=0; i<5; i++)
				surveytxt[i] = new JTextField(40);
			add(sv1);
			add(surveytxt[0]);
			add(sv2);
			add(surveytxt[1]);
			add(sv3);
			add(surveytxt[2]);
			add(sv4);
			add(surveytxt[3]);
			add(go);
			go.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					setVisible(false);
					System.out.println("");
					new SurveyWrite();
				}
			});
			setSize(500,600);
			setResizable(false);
			setVisible(true);
		}
	}
	class OrderInfo extends JDialog {
		JLabel foodinfo[] = new JLabel[20];
		JLabel north = new JLabel("< �� �� �� ��  >", JLabel.CENTER);
		JLabel south;

		OrderInfo() {
			setTitle("�ֹ� ����");
			getContentPane();
			getContentPane().setBackground(Color.YELLOW);
			setLayout(null);
			setModal(true);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			north.setBounds(10, 10, 360, 25);
			add(north);
			if (select == 1) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t1info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t1money[i] = new JLabel(t1price[i]);
					t1money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t1money[i]);
					south = new JLabel("< �� �� �� ��  > : " + money[0] + " ���Դϴ�.", JLabel.CENTER);
				}
			} else if (select == 2) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t2info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t2money[i] = new JLabel(t2price[i]);
					t2money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t2money[i]);
					south = new JLabel("< �� �� �� ��  > : " + money[1] + " ���Դϴ�.", JLabel.CENTER);
				}
			}
			if (select == 3) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t3info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t3money[i] = new JLabel(t3price[i]);
					t3money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t3money[i]);
					south = new JLabel("< �� �� �� ��  > : " + money[2] + " ���Դϴ�.", JLabel.CENTER);
				}
			}
			if (select == 4) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t4info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t4money[i] = new JLabel(t4price[i]);
					t4money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t4money[i]);
					south = new JLabel("< �� �� �� ��  > : " + money[3] + " ���Դϴ�.", JLabel.CENTER);
				}
			}
			if (select == 5) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t5info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t5money[i] = new JLabel(t5price[i]);
					t5money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t5money[i]);
					south = new JLabel("< �� �� �� ��  > : " + money[4] + " ���Դϴ�.", JLabel.CENTER);
				}
			}
			if (select == 6) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t6info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t6money[i] = new JLabel(t6price[i]);
					t6money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t6money[i]);
					south = new JLabel("< �� �� �� ��  > : " + money[5] + " ���Դϴ�.", JLabel.CENTER);
				}
			}
			if (select == 7) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t7info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t7money[i] = new JLabel(t7price[i]);
					t7money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t7money[i]);
					south = new JLabel("< �� �� �� ��  > : " + money[6] + " ���Դϴ�.", JLabel.CENTER);
				}
			}
			if (select == 8) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t8info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t8money[i] = new JLabel(t8price[i]);
					t8money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t8money[i]);
					south = new JLabel("< �� �� �� ��  > : " + money[7] + " ���Դϴ�.", JLabel.CENTER);
				}
			}
			if (select == 9) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t9info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t9money[i] = new JLabel(t9price[i]);
					t9money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t9money[i]);
					south = new JLabel("< �� �� �� ��  > : " + money[8] + " ���Դϴ�.", JLabel.CENTER);
				}
			}
			if (select == 10) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t10info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t10money[i] = new JLabel(t10price[i]);
					t10money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t10money[i]);
					south = new JLabel("< �� �� �� ��  > : " + money[9] + " ���Դϴ�.", JLabel.CENTER);
				}
			}
			if (select == 11) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t11info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t11money[i] = new JLabel(t11price[i]);
					t11money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t11money[i]);
					south = new JLabel("< �� �� �� ��  > : " + money[10] + " ���Դϴ�.", JLabel.CENTER);
				}
			}
			if (select == 12) {
				for (int i = 0; i < 20; i++) {
					foodinfo[i] = new JLabel(t12info[i]);
					foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
					t12money[i] = new JLabel(t12price[i]);
					t12money[i].setBounds(195, 40 + (i * 30), 100, 25);
					add(t12money[i]);
					south = new JLabel("< �� �� �� ��  > : " + money[11] + " ���Դϴ�.", JLabel.CENTER);
				}
			}
			for (int i = 0; i < 20; i++)
				add(foodinfo[i]);
			south.setBounds(100, 300, 300, 30);
			add(south);
			setSize(400, 500);
			setVisible(true);
		}
	}
	class MySubject extends JFrame{
		JLabel lol = new JLabel(new ImageIcon("images/������.jpg"));
		JButton ok = new JButton("�� ��");
		JLabel mny = new JLabel("(����)");
		MySubject(){
			getContentPane().setLayout(null);
		
			lol.setBounds(0, -30, 450, 400);
			slider.setBounds(15, 190, 400, 60);
			mny.setBounds(390, 245, 50, 30);
			ok.setBounds(180, 260, 70, 40);
			slider.setPaintLabels(true);
			slider.setPaintTicks(true);
			slider.setMajorTickSpacing(50);
			slider.setMinorTickSpacing(10);
			slider.setBackground(Color.ORANGE);
			slider.setFont(new Font("",Font.BOLD, 15));
			slider.setValue(500);
			lol.add(ok);
			lol.add(mny);
			lol.add(slider);
			add(lol);
			slider.addChangeListener(new ChangeListener(){
				public void stateChanged(ChangeEvent e) {
					todaysell = slider.getValue()*10000;
				}
			});
			ok.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					setVisible(false);
					System.out.println("�����ǥ�� "+todaysell+" ������ �����Ǿ����ϴ�.");
				}
			});		
			setSize(450,330);
			setLocation(800,300);
			setResizable(false);
			setVisible(false);
		}
	}
	class Payment extends JFrame{
		Payment() {
			for(int i=0; i<20; i++)
				foodinfo[i] = new JLabel();
			setTitle("INIPAY 3.0");
			getContentPane();
			getContentPane().setBackground(Color.YELLOW);
			setLayout(null);
			setBackground(Color.WHITE);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			north.setBounds(10, 10, 360, 25);
			add(north);
			for (int i = 0; i < 20; i++){
				foodinfo[i].setBounds(40, 40 + (i * 30), 150, 25);
				add(foodinfo[i]);
			}
			paybtn1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					setVisible(false);
					for(int i=0; i<20; i++)
						foodinfo[i].setText("");
					if (select == 1) {
						num[0] = 0;
						moneysum += money[0];
						tablesell += 1;
						System.out.println("1�� ���̺��� "+money[0]+" ���� ���Ǿ����ϴ�.");
						tbtn[0].setText("�Լ� ����");
						tbtn[0].setBackground(Color.WHITE);
						tblabel2[0].setText("");
						money[0] = 0;
						for (int i = 0; i < 20; i++){
							t1money[i].setText("");
							t1info[i] = "";
							t1price[i] = "";
						}
					} 
					else if (select == 2) {
						num[1] = 0;
						moneysum += money[1];
						tablesell += 1;
						System.out.println("2�� ���̺��� "+money[1]+" ���� ���Ǿ����ϴ�.");
						tbtn[1].setText("�Լ� ����");
						tbtn[1].setBackground(Color.WHITE);
						tblabel2[1].setText("");
						money[1] = 0;
						for (int i = 0; i < 20; i++){
							t2money[i].setText("");
							t2info[i] = "";
							t2price[i] = "";
						}
					}
					else if (select == 3) {
						num[2] = 0;
						moneysum += money[2];
						tablesell += 1;
						System.out.println("3�� ���̺��� "+money[2]+" ���� ���Ǿ����ϴ�.");
						tbtn[2].setText("�Լ� ����");
						tbtn[2].setBackground(Color.WHITE);
						tblabel2[2].setText("");
						money[2] = 0;
						for (int i = 0; i < 20; i++){
							t3money[i].setText("");
							t3info[i] = "";
							t3price[i] = "";
						}
					}
					else if (select == 4) {
						num[3] = 0;
						moneysum += money[3];
						tablesell += 1;
						System.out.println("4�� ���̺��� "+money[3]+" ���� ���Ǿ����ϴ�.");
						tbtn[3].setText("�Լ� ����");
						tbtn[3].setBackground(Color.WHITE);
						tblabel2[3].setText("");
						money[3] = 0;
						for (int i = 0; i < 20; i++) {
							t4money[i].setText("");
							t4info[i] = "";
							t4price[i] = "";
						}
					}
					else if (select == 5) {
						num[4] = 0;
						moneysum += money[4];
						tablesell += 1;
						System.out.println("5�� ���̺��� "+money[4]+" ���� ���Ǿ����ϴ�.");
						tbtn[4].setText("�Լ� ����");
						tbtn[4].setBackground(Color.WHITE);
						tblabel2[4].setText("");
						money[4] = 0;
						for (int i = 0; i < 20; i++){
							t5money[i].setText("");
							t5info[i] = "";
							t5price[i] = "";
						}
					}
					else if (select == 6) {
						num[5] = 0;
						moneysum += money[5];
						tablesell += 1;
						System.out.println("6�� ���̺��� "+money[5]+" ���� ���Ǿ����ϴ�.");
						tbtn[5].setText("�Լ� ����");
						tbtn[5].setBackground(Color.WHITE);
						tblabel2[5].setText("");
						money[5] = 0;
						for (int i = 0; i < 20; i++){
							t6money[i].setText("");
							t6info[i] = "";
							t6price[i] = "";
						}
					}
					else if (select == 7) {
						num[6] = 7;
						moneysum += money[6];
						tablesell += 1;
						System.out.println("7�� ���̺��� "+money[6]+" ���� ���Ǿ����ϴ�.");
						tbtn[6].setText("�Լ� ����");
						tbtn[6].setBackground(Color.WHITE);
						tblabel2[6].setText("");
						money[6] = 0;
						for (int i = 0; i < 20; i++) {
							t7money[i].setText("");
							t7info[i] = "";
							t7price[i] = "";
						}
					}
					else if (select == 8) {
						num[7] = 0;
						moneysum += money[7];
						tablesell += 1;
						System.out.println("8�� ���̺��� "+money[7]+" ���� ���Ǿ����ϴ�.");
						tbtn[7].setText("�Լ� ����");
						tbtn[7].setBackground(Color.WHITE);
						tblabel2[7].setText("");
						money[7] = 0;
						for (int i = 0; i < 20; i++){
							t8money[i].setText("");
							t8info[i] = "";
							t8price[i] = "";
						}
					}
					else if (select == 9) {
						num[8] = 0;
						moneysum += money[8];
						tablesell += 1;
						System.out.println("9�� ���̺��� "+money[8]+" ���� ���Ǿ����ϴ�.");
						tbtn[8].setText("�Լ� ����");
						tbtn[8].setBackground(Color.WHITE);
						tblabel2[8].setText("");
						money[8] = 0;
						for (int i = 0; i < 20; i++) {
							t9money[i].setText("");
							t9info[i] = "";
							t9price[i] = "";
						}
					}
					else if (select == 10) {
						num[9] = 10;
						moneysum += money[9];
						tablesell += 1;
						System.out.println("10�� ���̺��� "+money[9]+" ���� ���Ǿ����ϴ�.");
						tbtn[9].setText("�Լ� ����");
						tbtn[9].setBackground(Color.WHITE);
						tblabel2[9].setText("");
						money[9] = 0;
						for (int i = 0; i < 20; i++){
							t10money[i].setText("");
							t10info[i] = "";
							t10price[i] = "";
						}
					}
					else if (select == 11) {
						num[10] = 0;
						moneysum += money[10];
						tablesell += 1;
						System.out.println("11�� ���̺��� "+money[10]+" ���� ���Ǿ����ϴ�.");
						tbtn[10].setText("�Լ� ����");
						tbtn[10].setBackground(Color.WHITE);
						tblabel2[10].setText("");
						money[10] = 0;
						for (int i = 0; i < 20; i++){
							t11money[i].setText("");
							t11info[i] = "";
							t11price[i] = "";
						}
					}
					else if (select == 12) {
						num[11] = 0;
						moneysum += money[11];
						tablesell += 1;
						System.out.println("12�� ���̺��� "+money[11]+" ���� ���Ǿ����ϴ�.");
						tbtn[11].setText("�Լ� ����");
						tbtn[11].setBackground(Color.WHITE);
						tblabel2[11].setText("");
						money[11] = 0;
						for (int i = 0; i < 20; i++){
							t12money[i].setText("");
							t12info[i] = "";
							t12price[i] = "";
						}
					}		
					sw.setVisible(true);
					tablecount++;
					if(moneysum > todaysell){
						System.out.println("�Ϸ� ��ǥ ������� �����߽��ϴ� !!");
					}
				}
			});
			paybtn2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					setVisible(false);
					spsp.setVisible(true);
					for(int i=0; i<20; i++)
						foodinfo[i].setText("");
					if (select == 1) {
						num[0] = 0;
						moneysum += money[0];
						tablesell += 1;
						System.out.println("1�� ���̺��� "+money[0]+" ���� ���Ǿ����ϴ�.");
						tbtn[0].setText("�Լ� ����");
						tbtn[0].setBackground(Color.WHITE);
						tblabel2[0].setText("");
						money[0] = 0;
						for (int i = 0; i < 20; i++){
							t1money[i].setText("");
							t1info[i] = "";
							t1price[i] = "";
						}
					} 
					else if (select == 2) {
						num[1] = 0;
						moneysum += money[1];
						tablesell += 1;
						System.out.println("2�� ���̺��� "+money[1]+" ���� ���Ǿ����ϴ�.");
						tbtn[1].setText("�Լ� ����");
						tbtn[1].setBackground(Color.WHITE);
						tblabel2[1].setText("");
						money[1] = 0;
						for (int i = 0; i < 20; i++){
							t2money[i].setText("");
							t2info[i] = "";
							t2price[i] = "";
						}
					}
					else if (select == 3) {
						num[2] = 0;
						moneysum += money[2];
						tablesell += 1;
						System.out.println("3�� ���̺��� "+money[2]+" ���� ���Ǿ����ϴ�.");
						tbtn[2].setText("�Լ� ����");
						tbtn[2].setBackground(Color.WHITE);
						tblabel2[2].setText("");
						money[2] = 0;
						for (int i = 0; i < 20; i++){
							t3money[i].setText("");
							t3info[i] = "";
							t3price[i] = "";
						}
					}
					else if (select == 4) {
						num[3] = 0;
						moneysum += money[3];
						tablesell += 1;
						System.out.println("4�� ���̺��� "+money[3]+" ���� ���Ǿ����ϴ�.");
						tbtn[3].setText("�Լ� ����");
						tbtn[3].setBackground(Color.WHITE);
						tblabel2[3].setText("");
						money[3] = 0;
						for (int i = 0; i < 20; i++) {
							t4money[i].setText("");
							t4info[i] = "";
							t4price[i] = "";
						}
					}
					else if (select == 5) {
						num[4] = 0;
						moneysum += money[4];
						tablesell += 1;
						System.out.println("5�� ���̺��� "+money[4]+" ���� ���Ǿ����ϴ�.");
						tbtn[4].setText("�Լ� ����");
						tbtn[4].setBackground(Color.WHITE);
						tblabel2[4].setText("");
						money[4] = 0;
						for (int i = 0; i < 20; i++){
							t5money[i].setText("");
							t5info[i] = "";
							t5price[i] = "";
						}
					}
					else if (select == 6) {
						num[5] = 0;
						moneysum += money[5];
						tablesell += 1;
						System.out.println("6�� ���̺��� "+money[5]+" ���� ���Ǿ����ϴ�.");
						tbtn[5].setText("�Լ� ����");
						tbtn[5].setBackground(Color.WHITE);
						tblabel2[5].setText("");
						money[5] = 0;
						for (int i = 0; i < 20; i++){
							t6money[i].setText("");
							t6info[i] = "";
							t6price[i] = "";
						}
					}
					else if (select == 7) {
						num[6] = 7;
						moneysum += money[6];
						tablesell += 1;
						System.out.println("7�� ���̺��� "+money[6]+" ���� ���Ǿ����ϴ�.");
						tbtn[6].setText("�Լ� ����");
						tbtn[6].setBackground(Color.WHITE);
						tblabel2[6].setText("");
						money[6] = 0;
						for (int i = 0; i < 20; i++) {
							t7money[i].setText("");
							t7info[i] = "";
							t7price[i] = "";
						}
					}
					else if (select == 8) {
						num[7] = 0;
						moneysum += money[7];
						tablesell += 1;
						System.out.println("8�� ���̺��� "+money[7]+" ���� ���Ǿ����ϴ�.");
						tbtn[7].setText("�Լ� ����");
						tbtn[7].setBackground(Color.WHITE);
						tblabel2[7].setText("");
						money[7] = 0;
						for (int i = 0; i < 20; i++){
							t8money[i].setText("");
							t8info[i] = "";
							t8price[i] = "";
						}
					}
					else if (select == 9) {
						num[8] = 0;
						moneysum += money[8];
						tablesell += 1;
						System.out.println("9�� ���̺��� "+money[8]+" ���� ���Ǿ����ϴ�.");
						tbtn[8].setText("�Լ� ����");
						tbtn[8].setBackground(Color.WHITE);
						tblabel2[8].setText("");
						money[8] = 0;
						for (int i = 0; i < 20; i++) {
							t9money[i].setText("");
							t9info[i] = "";
							t9price[i] = "";
						}
					}
					else if (select == 10) {
						num[9] = 10;
						moneysum += money[9];
						tablesell += 1;
						System.out.println("10�� ���̺��� "+money[9]+" ���� ���Ǿ����ϴ�.");
						tbtn[9].setText("�Լ� ����");
						tbtn[9].setBackground(Color.WHITE);
						tblabel2[9].setText("");
						money[9] = 0;
						for (int i = 0; i < 20; i++){
							t10money[i].setText("");
							t10info[i] = "";
							t10price[i] = "";
						}
					}
					else if (select == 11) {
						num[10] = 0;
						moneysum += money[10];
						tablesell += 1;
						System.out.println("11�� ���̺��� "+money[10]+" ���� ���Ǿ����ϴ�.");
						tbtn[10].setText("�Լ� ����");
						tbtn[10].setBackground(Color.WHITE);
						tblabel2[10].setText("");
						money[10] = 0;
						for (int i = 0; i < 20; i++){
							t11money[i].setText("");
							t11info[i] = "";
							t11price[i] = "";
						}
					}
					else if (select == 12) {
						num[11] = 0;
						moneysum += money[11];
						tablesell += 1;
						System.out.println("12�� ���̺��� "+money[11]+" ���� ���Ǿ����ϴ�.");
						tbtn[11].setText("�Լ� ����");
						tbtn[11].setBackground(Color.WHITE);
						tblabel2[11].setText("");
						money[11] = 0;
						for (int i = 0; i < 20; i++){
							t12money[i].setText("");
							t12info[i] = "";
							t12price[i] = "";
						}
					}
				}
			});
			
			south.setBounds(30, 435, 400, 30);
			paybtn1.setBounds(60, 480, 117, 104);
			paybtn2.setBounds(190, 480, 117, 104);
			south.setFont(new Font("GOOD", Font.BOLD, 16));
			add(south);
			add(paybtn1); 
			add(paybtn2);
			paybtn1.setVisible(true);
			paybtn2.setVisible(true);
			setResizable(false);
			setSize(400, 650);
			setVisible(false);
		}
	}
	class SteakPanel extends JDialog {
		SteakPanel() {
			setTitle("STEAK");
			getContentPane();
			setLayout(null);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setModal(true);
			steaklabel[0] = new JLabel(new ImageIcon("steak/�߰����߽�����ũ.jpg"));
			steaklabel[1] = new JLabel(new ImageIcon("steak/��콺����ũ������.jpg"));
			steaklabel[2] = new JLabel(new ImageIcon("steak/��ɽ�����ũ2.jpg"));
			steaklabel[3] = new JLabel(new ImageIcon("steak/work22.jpg"));
			steaklabel[4] = new JLabel(new ImageIcon("steak/�����̽�������ũ.jpg"));
			steaklabel[5] = new JLabel(new ImageIcon("steak/���������ߴٸ�������ũ.jpg"));
			steaklabel[6] = new JLabel(new ImageIcon("steak/����������ũ.jpg"));

			stname[0] = new JLabel("ĥ��������ũ ������ -19.800", JLabel.CENTER);
			stname[1] = new JLabel("�߰����콺����ũ ������  -19.800", JLabel.CENTER);
			stname[2] = new JLabel("��� ������ũ -19.800", JLabel.CENTER);
			stname[3] = new JLabel("������ ������ũ -19.800", JLabel.CENTER);
			stname[4] = new JLabel("�����̽� ������ũ ������ -19.800", JLabel.CENTER);
			stname[5] = new JLabel("�������� �ߴٸ� ������ũ -19.800", JLabel.CENTER);
			stname[6] = new JLabel("���� ������ũ -19.800", JLabel.CENTER);
			
			for(int i=0; i<7; i++){
				order[i] = new JButton(orderimg);
				stname[i].setForeground(Color.WHITE);
				order[i].addActionListener(new SteakAction());
				stkpic.add(steaklabel[i]);
				stkpic.add(stname[i]);
				stkpic.add(order[i]);
				
			}
			steaklabel[0].setBounds(10, 50, 196, 126); 
			steaklabel[1].setBounds(260, 50, 196, 126);
			steaklabel[2].setBounds(510, 50, 196, 126);
			steaklabel[3].setBounds(10, 260, 196, 126);
			steaklabel[4].setBounds(260, 260, 196, 126);
			steaklabel[5].setBounds(510, 260, 196, 126);
			steaklabel[6].setBounds(10, 470, 196, 126);

			stname[0].setBounds(10, 190, 196, 20); 
			stname[1].setBounds(260, 190, 196, 20); 
			stname[2].setBounds(510, 190, 196, 20); 
			stname[3].setBounds(10, 400, 196, 20); 
			stname[4].setBounds(260, 400, 196, 20);
			stname[5].setBounds(510, 400, 196, 20);
			stname[6].setBounds(10, 610, 196, 20);

			order[0].setBounds(50, 212, 116, 35); 
			order[1].setBounds(300, 212, 116, 35);
			order[2].setBounds(550, 212, 116, 35);
			order[3].setBounds(50, 422, 116, 35);
			order[4].setBounds(300, 422, 116, 35);
			order[5].setBounds(550, 422, 116, 35);
			order[6].setBounds(50, 632, 116, 35);
			stkpic.setBounds(0, 0, 750, 690);
			add(stkpic);
		
			setSize(750, 730);
			setLocation(165, 100);
			setResizable(false);
			setVisible(false);
		}

		class SteakAction implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == order[0]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "ĥ��������ũ ������";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "ĥ��������ũ ������";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "ĥ��������ũ ������";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "ĥ��������ũ ������";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "ĥ��������ũ ������";
						t1price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "ĥ��������ũ ������";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[0] += 19800;
						t7info[num[6]] = "ĥ��������ũ ������";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "ĥ��������ũ ������";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "ĥ��������ũ ������";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "ĥ��������ũ ������";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "ĥ��������ũ ������";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "ĥ��������ũ ������";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == order[1]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "��콺����ũ������";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "��콺����ũ������";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "��콺����ũ������";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "��콺����ũ������";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[0]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "��콺����ũ������";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "��콺����ũ������";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "��콺����ũ������";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[0]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t1info[num[7]] = "��콺����ũ������";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "��콺����ũ������";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "��콺����ũ������";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "��콺����ũ������";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "��콺����ũ������";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == order[2]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "��� ������ũ";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					}
					if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "��� ������ũ";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					}
					if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "��� ������ũ";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					}
					if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "��� ������ũ";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					}
					if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "��� ������ũ";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					}
					if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "��� ������ũ";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					}
					if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "��� ������ũ";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					}
					if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "��� ������ũ";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					}
					if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "��� ������ũ";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					}
					if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "��� ������ũ";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					}
					if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "��� ������ũ";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					}
					if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "��� ������ũ";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == order[3]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "������ ������ũ";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "������ ������ũ";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "������ ������ũ";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "������ ������ũ";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "������ ������ũ";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "������ ������ũ";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "������ ������ũ";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "������ ������ũ";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[8]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "������ ������ũ";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "������ ������ũ";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[0]] = "������ ������ũ";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "������ ������ũ";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == order[4]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "�����̽� ������ũ ������";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "�����̽� ������ũ ������";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "�����̽� ������ũ ������";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "�����̽� ������ũ ������";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "�����̽� ������ũ ������";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "�����̽� ������ũ ������";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "�����̽� ������ũ ������";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "�����̽� ������ũ ������";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "�����̽� ������ũ ������";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "�����̽� ������ũ ������";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "�����̽� ������ũ ������";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t1info[num[11]] = "�����̽� ������ũ ������";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == order[5]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "�������� �ߴٸ� ������ũ";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "�������� �ߴٸ� ������ũ";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "�������� �ߴٸ� ������ũ";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "�������� �ߴٸ� ������ũ";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "�������� �ߴٸ� ������ũ";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "�������� �ߴٸ� ������ũ";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "�������� �ߴٸ� ������ũ";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "�������� �ߴٸ� ������ũ";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "�������� �ߴٸ� ������ũ";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "�������� �ߴٸ� ������ũ";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "�������� �ߴٸ� ������ũ";

						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "�������� �ߴٸ� ������ũ";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == order[6]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "���� ������ũ";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "���� ������ũ";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "���� ������ũ";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "���� ������ũ";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "���� ������ũ";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "���� ������ũ";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "���� ������ũ";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "���� ������ũ";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "���� ������ũ";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "���� ������ũ";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "���� ������ũ";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "���� ������ũ";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				}
			}
		}
	}

	class PastaPanel extends JDialog {
		PastaPanel() {
			setTitle("PASTA");
			getContentPane();
			setLayout(null);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setModal(true);
			pastalabel[0] = new JLabel(new ImageIcon("pasta/�ӽ���ġŲ.jpg"));
			pastalabel[1] = new JLabel(new ImageIcon("pasta/�ӽ����ػ깰.jpg"));
			pastalabel[2] = new JLabel(new ImageIcon("pasta/��Ʈ�丶��.jpg"));
			pastalabel[3] = new JLabel(new ImageIcon("pasta/�������������.jpg"));
			pastalabel[4] = new JLabel(new ImageIcon("pasta/������ũ��.jpg"));
			pastalabel[5] = new JLabel(new ImageIcon("pasta/������ �Ľ�Ÿ.jpg"));
			pastalabel[6] = new JLabel(new ImageIcon("pasta/�ֽ����̽��ع��Ľ�Ÿ.jpg"));
			pastalabel[7] = new JLabel(new ImageIcon("pasta/�ع��丶��.jpg"));
			pastalabel[8] = new JLabel(new ImageIcon("pasta/�ػ깰�ø���.jpg"));
			pastalabel[9] = new JLabel(new ImageIcon("pasta/�ػ깰ũ��.jpg"));
			pastalabel[10] = new JLabel(new ImageIcon("pasta/�ػ깰�丶��.jpg"));
			psname[0] = new JLabel("�ӽ��� ġŲ �Ľ�Ÿ - 19.800", JLabel.CENTER);
			psname[1] = new JLabel("�ӽ��� �ػ깰 �Ľ�Ÿ - 19.800", JLabel.CENTER);
			psname[2] = new JLabel("��Ʈ �丶�� �Ľ�Ÿ - 19.800", JLabel.CENTER);
			psname[3] = new JLabel("������� �Ľ�Ÿ - 19.800", JLabel.CENTER);
			psname[4] = new JLabel("������ ũ�� �Ľ�Ÿ - 19.800", JLabel.CENTER);
			psname[5] = new JLabel("������ �Ľ�Ÿ - 19.800", JLabel.CENTER);
			psname[6] = new JLabel("�����̽� �ع� �Ľ�Ÿ - 19.800", JLabel.CENTER);
			psname[7] = new JLabel("�ع� �丶�� �Ľ�Ÿ - 19.800", JLabel.CENTER);
			psname[8] = new JLabel("�ػ깰 �ø��� �Ľ�Ÿ - 19.800", JLabel.CENTER);
			psname[9] = new JLabel("�ػ깰 ũ�� �Ľ�Ÿ - 19.800", JLabel.CENTER);
			psname[10] = new JLabel("�ػ깰 �丶�� �Ľ�Ÿ - 19.800", JLabel.CENTER);
			
			for(int i=0; i<11; i++){
				psorder[i] = new JButton(orderimg);
				psname[i].setForeground(Color.white);
				pstpic.add(pastalabel[i]);
				pstpic.add(psname[i]);
				pstpic.add(psorder[i]);
				psorder[i].addActionListener(new PastaAction());
			}
			pastalabel[0].setBounds(10, 50, 168, 108);
			pastalabel[1].setBounds(195, 50, 168, 108);
			pastalabel[2].setBounds(375, 50, 168, 108);
			pastalabel[3].setBounds(555, 50, 168, 108);
			pastalabel[4].setBounds(10, 250, 168, 108);
			pastalabel[5].setBounds(195, 250, 168, 108);
			pastalabel[6].setBounds(375, 250, 168, 108);
			pastalabel[7].setBounds(555, 250, 168, 108);
			pastalabel[8].setBounds(10, 460, 168, 108);
			pastalabel[9].setBounds(195, 460, 168, 108);
			pastalabel[10].setBounds(375, 460, 168, 108);

			psname[0].setBounds(10, 160, 175, 20); 
			psname[1].setBounds(195, 160, 175, 20); 
			psname[2].setBounds(375, 160, 175, 20); 
			psname[3].setBounds(555, 160, 175, 20);
			psname[4].setBounds(10, 360, 175, 20);
			psname[5].setBounds(195, 360, 175, 20);
			psname[6].setBounds(375, 360, 175, 20); 
			psname[7].setBounds(555, 360, 175, 20); 
			psname[8].setBounds(10, 570, 175, 20);
			psname[9].setBounds(195, 570, 175, 20);
			psname[10].setBounds(375, 570, 175, 20); 

			psorder[0].setBounds(40, 190, 116, 30);
			psorder[1].setBounds(220, 190, 116, 30);
			psorder[2].setBounds(400, 190, 116, 30);
			psorder[3].setBounds(585, 190, 116, 30);
			psorder[4].setBounds(40, 390, 116, 30);
			psorder[5].setBounds(220, 390, 116, 30);
			psorder[6].setBounds(400, 390, 116, 30);
			psorder[7].setBounds(585, 390, 116, 30);
			psorder[8].setBounds(40, 600, 116, 30);
			psorder[9].setBounds(220, 600, 116, 30);
			psorder[10].setBounds(400, 600, 116, 30);
			
			pstpic.setBounds(0, 0, 750, 690);
			add(pstpic);

			setLocation(165, 100);
			setSize(750, 690);
			setResizable(false);
			setVisible(false);
		}

		class PastaAction implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == psorder[0]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "�ӽ��� ġŲ �Ľ�Ÿ";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "�ӽ��� ġŲ �Ľ�Ÿ";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "�ӽ��� ġŲ �Ľ�Ÿ";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "�ӽ��� ġŲ �Ľ�Ÿ";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "�ӽ��� ġŲ �Ľ�Ÿ";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "�ӽ��� ġŲ �Ľ�Ÿ";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "�ӽ��� ġŲ �Ľ�Ÿ";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "�ӽ��� ġŲ �Ľ�Ÿ";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "�ӽ��� ġŲ �Ľ�Ÿ";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "�ӽ��� ġŲ �Ľ�Ÿ";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "�ӽ��� ġŲ �Ľ�Ÿ";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "�ӽ��� ġŲ �Ľ�Ÿ";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == psorder[1]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "�ӽ��� �ػ깰 �Ľ�Ÿ";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "�ӽ��� �ػ깰 �Ľ�Ÿ";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "�ӽ��� �ػ깰 �Ľ�Ÿ";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "�ӽ��� �ػ깰 �Ľ�Ÿ";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "�ӽ��� �ػ깰 �Ľ�Ÿ";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "�ӽ��� �ػ깰 �Ľ�Ÿ";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "�ӽ��� �ػ깰 �Ľ�Ÿ";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "�ӽ��� �ػ깰 �Ľ�Ÿ";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "�ӽ��� �ػ깰 �Ľ�Ÿ";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "�ӽ��� �ػ깰 �Ľ�Ÿ";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "�ӽ��� �ػ깰 �Ľ�Ÿ";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "�ӽ��� �ػ깰 �Ľ�Ÿ";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == psorder[2]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "��Ʈ �丶�� �Ľ�Ÿ";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "��Ʈ �丶�� �Ľ�Ÿ";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "��Ʈ �丶�� �Ľ�Ÿ";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "��Ʈ �丶�� �Ľ�Ÿ";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "��Ʈ �丶�� �Ľ�Ÿ";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "��Ʈ �丶�� �Ľ�Ÿ";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "��Ʈ �丶�� �Ľ�Ÿ";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "��Ʈ �丶�� �Ľ�Ÿ";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "��Ʈ �丶�� �Ľ�Ÿ";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "��Ʈ �丶�� �Ľ�Ÿ";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "��Ʈ �丶�� �Ľ�Ÿ";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "��Ʈ �丶�� �Ľ�Ÿ";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == psorder[3]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "������� �Ľ�Ÿ";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "������� �Ľ�Ÿ";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "������� �Ľ�Ÿ";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "������� �Ľ�Ÿ";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "������� �Ľ�Ÿ";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "������� �Ľ�Ÿ";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "������� �Ľ�Ÿ";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "������� �Ľ�Ÿ";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "������� �Ľ�Ÿ";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "������� �Ľ�Ÿ";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "������� �Ľ�Ÿ";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "������� �Ľ�Ÿ";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == psorder[4]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "������ ũ�� �Ľ�Ÿ";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "������ ũ�� �Ľ�Ÿ";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "������ ũ�� �Ľ�Ÿ";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "������ ũ�� �Ľ�Ÿ";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "������ ũ�� �Ľ�Ÿ";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "������ ũ�� �Ľ�Ÿ";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "������ ũ�� �Ľ�Ÿ";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "������ ũ�� �Ľ�Ÿ";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "������ ũ�� �Ľ�Ÿ";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "������ ũ�� �Ľ�Ÿ";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "������ ũ�� �Ľ�Ÿ";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "������ ũ�� �Ľ�Ÿ";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == psorder[5]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "������ �Ľ�Ÿ";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "������ �Ľ�Ÿ";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "������ �Ľ�Ÿ";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "������ �Ľ�Ÿ";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "������ �Ľ�Ÿ";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "������ �Ľ�Ÿ";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "������ �Ľ�Ÿ";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "������ �Ľ�Ÿ";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "������ �Ľ�Ÿ";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "������ �Ľ�Ÿ";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "������ �Ľ�Ÿ";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "������ �Ľ�Ÿ";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == psorder[6]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "�����̽� �ع� �Ľ�Ÿ";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "�����̽� �ع� �Ľ�Ÿ";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "�����̽� �ع� �Ľ�Ÿ";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "�����̽� �ع� �Ľ�Ÿ";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "�����̽� �ع� �Ľ�Ÿ";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "�����̽� �ع� �Ľ�Ÿ";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "�����̽� �ع� �Ľ�Ÿ";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "�����̽� �ع� �Ľ�Ÿ";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "�����̽� �ع� �Ľ�Ÿ";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "�����̽� �ع� �Ľ�Ÿ";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "�����̽� �ع� �Ľ�Ÿ";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "�����̽� �ع� �Ľ�Ÿ";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == psorder[7]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "�ع� �丶�� �Ľ�Ÿ";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "�ع� �丶�� �Ľ�Ÿ";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "�ع� �丶�� �Ľ�Ÿ";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "�ع� �丶�� �Ľ�Ÿ";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "�ع� �丶�� �Ľ�Ÿ";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "�ع� �丶�� �Ľ�Ÿ";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "�ع� �丶�� �Ľ�Ÿ";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "�ع� �丶�� �Ľ�Ÿ";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "�ع� �丶�� �Ľ�Ÿ";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "�ع� �丶�� �Ľ�Ÿ";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "�ع� �丶�� �Ľ�Ÿ";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "�ع� �丶�� �Ľ�Ÿ";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == psorder[8]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "�ػ깰 �ø��� �Ľ�Ÿ";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "�ػ깰 �ø��� �Ľ�Ÿ";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "�ػ깰 �ø��� �Ľ�Ÿ";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "�ػ깰 �ø��� �Ľ�Ÿ";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "�ػ깰 �ø��� �Ľ�Ÿ";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "�ػ깰 �ø��� �Ľ�Ÿ";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "�ػ깰 �ø��� �Ľ�Ÿ";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "�ػ깰 �ø��� �Ľ�Ÿ";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "�ع� �丶�� �Ľ�Ÿ";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "�ػ깰 �ø��� �Ľ�Ÿ";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "�ػ깰 �ø��� �Ľ�Ÿ";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "�ػ깰 �ø��� �Ľ�Ÿ";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == psorder[9]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "�ػ깰 ũ�� �Ľ�Ÿ";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "�ػ깰 ũ�� �Ľ�Ÿ";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "�ػ깰 ũ�� �Ľ�Ÿ";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "�ػ깰 ũ�� �Ľ�Ÿ";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "�ػ깰 ũ�� �Ľ�Ÿ";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "�ػ깰 ũ�� �Ľ�Ÿ";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "�ػ깰 ũ�� �Ľ�Ÿ";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "�ػ깰 ũ�� �Ľ�Ÿ";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "�ػ깰 ũ�� �Ľ�Ÿ";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "�ػ깰 ũ�� �Ľ�Ÿ";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "�ػ깰 ũ�� �Ľ�Ÿ";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "�ػ깰 ũ�� �Ľ�Ÿ";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == psorder[10]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "�ػ깰 �丶�� �Ľ�Ÿ";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "�ػ깰 �丶�� �Ľ�Ÿ";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "�ػ깰 �丶�� �Ľ�Ÿ";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "�ػ깰 �丶�� �Ľ�Ÿ";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "�ػ깰 �丶�� �Ľ�Ÿ";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "�ػ깰 �丶�� �Ľ�Ÿ";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "�ػ깰 �丶�� �Ľ�Ÿ";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "�ػ깰 �丶�� �Ľ�Ÿ";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "�ػ깰 �丶�� �Ľ�Ÿ";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "�ػ깰 �丶�� �Ľ�Ÿ";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "�ػ깰 �丶�� �Ľ�Ÿ";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "�ػ깰 �丶�� �Ľ�Ÿ";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				}
			}
		}
	}

	class PilafPanel extends JDialog {
		PilafPanel() {
			setTitle("PILAF");
			getContentPane();
			setLayout(null);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setModal(true);
			pilaflabel[0] = new JLabel(new ImageIcon("pilaf/��ġ�ʶ���.jpg"));
			pilaflabel[1] = new JLabel(new ImageIcon("pilaf/����ʶ���.jpg"));
			pilaflabel[2] = new JLabel(new ImageIcon("pilaf/�������ʶ���.jpg"));
			pilaflabel[3] = new JLabel(new ImageIcon("pilaf/�����ʶ���.jpg"));
			pilname[0] = new JLabel("��ġ �ʶ��� - 19.800", JLabel.CENTER);
			pilname[1] = new JLabel("��� �ʶ��� - 19.800", JLabel.CENTER);
			pilname[2] = new JLabel("������ �ʶ��� - 19.800", JLabel.CENTER);
			pilname[3] = new JLabel("���� �ʶ��� - 19.800", JLabel.CENTER);
			for(int i=0; i<4; i++){
				pilorder[i] = new JButton(orderimg);
				pilname[i].setForeground(Color.white);
				pilpic.add(pilaflabel[i]);
				pilpic.add(pilname[i]);
				pilpic.add(pilorder[i]);
				pilorder[i].addActionListener(new PilafAction());
			}
			pilaflabel[0].setBounds(10, 50, 168, 108);
			pilaflabel[1].setBounds(195, 50, 168, 108);
			pilaflabel[2].setBounds(375, 50, 168, 108);
			pilaflabel[3].setBounds(555, 50, 168, 108);

			pilname[0].setBounds(10, 160, 175, 20); 
			pilname[1].setBounds(195, 160, 175, 20); 
			pilname[2].setBounds(375, 160, 175, 20); 
			pilname[3].setBounds(555, 160, 175, 20);

			pilorder[0].setBounds(40, 190, 116, 30);
			pilorder[1].setBounds(220, 190, 116, 30);
			pilorder[2].setBounds(400, 190, 116, 30);
			pilorder[3].setBounds(580, 190, 116, 30);
			pilpic.setBounds(0, 0, 750, 690);
			add(pilpic);

			setLocation(165, 100);
			setResizable(false);
			setSize(750, 690);
			setVisible(false);
		}

		class PilafAction implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == pilorder[0]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "��ġ �ʶ���";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "��ġ �ʶ���";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "��ġ �ʶ���";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "��ġ �ʶ���";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "��ġ �ʶ���";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "��ġ �ʶ���";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "��ġ �ʶ���";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "��ġ �ʶ���";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "��ġ �ʶ���";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "��ġ �ʶ���";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "��ġ �ʶ���";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "��ġ �ʶ���";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == pilorder[1]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "��� �ʶ���";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "��� �ʶ���";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "��� �ʶ���";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "��� �ʶ���";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "��� �ʶ���";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "��� �ʶ���";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "��� �ʶ���";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "��� �ʶ���";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "��� �ʶ���";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "��� �ʶ���";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "��� �ʶ���";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "��� �ʶ���";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == pilorder[2]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "������ �ʶ���";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "������ �ʶ���";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "������ �ʶ���";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "������ �ʶ���";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "������ �ʶ���";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "������ �ʶ���";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "������ �ʶ���";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "������ �ʶ���";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "������ �ʶ���";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "������ �ʶ���";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "������ �ʶ���";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "������ �ʶ���";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == pilorder[3]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "���� �ʶ���";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "���� �ʶ���";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "���� �ʶ���";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "���� �ʶ���";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "���� �ʶ���";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "���� �ʶ���";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "���� �ʶ���";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "���� �ʶ���";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "���� �ʶ���";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "���� �ʶ���";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "���� �ʶ���";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "���� �ʶ���";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				}
			}
		}
	}

	class PizzaPanel extends JDialog {
		PizzaPanel() {
			setTitle("PIZZA");
			getContentPane();
			setLayout(null);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setModal(true);
			pizzalabel[0] = new JLabel(new ImageIcon("pizza/������������.jpg"));
			pizzalabel[1] = new JLabel(new ImageIcon("pizza/���ް�������.jpg"));
			pizzalabel[2] = new JLabel(new ImageIcon("pizza/�����Ʈ����.jpg"));
			pizzalabel[3] = new JLabel(new ImageIcon("pizza/����������������.jpg"));
			pizzalabel[4] = new JLabel(new ImageIcon("pizza/�Ұ�������.jpg"));
			pizzalabel[5] = new JLabel(new ImageIcon("pizza/������ũ����������.jpg"));
			pizzalabel[6] = new JLabel(new ImageIcon("pizza/���ڶ�����.jpg"));
			pizzalabel[7] = new JLabel(new ImageIcon("pizza/���ýó�������.jpg"));
			pizzalabel[8] = new JLabel(new ImageIcon("pizza/�丶��̵�����.png"));

			pzname[0] = new JLabel("�������� ���� -9.800", JLabel.CENTER);
			pzname[1] = new JLabel("���ް��� ����  -19.800", JLabel.CENTER);
			pzname[2] = new JLabel("�����Ʈ ���� -14.800", JLabel.CENTER);
			pzname[3] = new JLabel("������������ ���� -14.800", JLabel.CENTER);
			pzname[4] = new JLabel("�Ұ��� ���� -19.800", JLabel.CENTER);
			pzname[5] = new JLabel("������ũ������ ���� -14.800", JLabel.CENTER);
			pzname[6] = new JLabel("���ڶ� ���� -13.800", JLabel.CENTER);
			pzname[7] = new JLabel("���ýó��� ���� -14.800", JLabel.CENTER);
			pzname[8] = new JLabel("�丶��̵� ���� -19.800", JLabel.CENTER);
			
			for(int i=0; i<9; i++){
				pzorder[i] = new JButton(orderimg);
				pzname[i].setForeground(Color.white);
				pzorder[i].addActionListener(new PizzaAction());
				pizpic.add(pizzalabel[i]);
				pizpic.add(pzname[i]);
				pizpic.add(pzorder[i]);
			}

			pizzalabel[0].setBounds(10, 50, 196, 126);
			pizzalabel[1].setBounds(260, 50, 196, 126);
			pizzalabel[2].setBounds(510, 50, 196, 126);
			pizzalabel[3].setBounds(10, 260, 196, 126);
			pizzalabel[4].setBounds(260, 260, 196, 126);
			pizzalabel[5].setBounds(510, 260, 196, 126);
			pizzalabel[6].setBounds(10, 470, 196, 126);
			pizzalabel[7].setBounds(260, 470, 196, 126);
			pizzalabel[8].setBounds(510, 470, 196, 126);

			pzname[0].setBounds(10, 190, 196, 20); 
			pzname[1].setBounds(260, 190, 196, 20); 
			pzname[2].setBounds(510, 190, 196, 20); 
			pzname[3].setBounds(10, 400, 196, 20); 
			pzname[4].setBounds(260, 400, 196, 20); 
			pzname[5].setBounds(510, 400, 196, 20);
			pzname[6].setBounds(10, 610, 196, 20); 
			pzname[7].setBounds(260, 610, 196, 20);
			pzname[8].setBounds(510, 610, 196, 20); 

			pzorder[0].setBounds(50, 212, 116, 35);
			pzorder[1].setBounds(300, 212, 116, 35);
			pzorder[2].setBounds(550, 212, 116, 35);
			pzorder[3].setBounds(50, 422, 116, 35);
			pzorder[4].setBounds(300, 422, 116, 35);
			pzorder[5].setBounds(550, 422, 116, 35);
			pzorder[6].setBounds(50, 632, 116, 35);
			pzorder[7].setBounds(300, 632, 116, 35);
			pzorder[8].setBounds(550, 632, 116, 35);
			
			pizpic.setBounds(0, 0, 750, 690);
			add(pizpic);		
			setSize(750, 750);
			setLocation(165, 100);
			setResizable(false);
			setVisible(false);
		}

		class PizzaAction implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == pzorder[0]) {
					if (select == 1) {
						money[0] += 9800;
						t1info[num[0]] = "�������� ����";
						t1price[num[0]] = " 9.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 9800;
						t2info[num[1]] = "�������� ����";
						t2price[num[1]] = " 9.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 9800;
						t3info[num[2]] = "�������� ����";
						t3price[num[2]] = " 9.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 9800;
						t4info[num[3]] = "�������� ����";
						t4price[num[3]] = " 9.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 9800;
						t5info[num[4]] = "�������� ����";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 9800;
						t6info[num[5]] = "�������� ����";
						t6price[num[5]] = " 9.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 9800;
						t7info[num[6]] = "�������� ����";
						t7price[num[6]] = " 9.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 9800;
						t8info[num[7]] = "�������� ����";
						t8price[num[7]] = " 9.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 9800;
						t9info[num[8]] = "�������� ����";
						t9price[num[8]] = " 9.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 9800;
						t10info[num[9]] = "�������� ����";
						t10price[num[9]] = " 9.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 9800;
						t11info[num[10]] = "�������� ����";
						t11price[num[10]] = " 9.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 9800;
						t12info[num[11]] = "�������� ����";
						t12price[num[11]] = " 9.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == pzorder[1]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "���ް��� ����";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "���ް��� ����";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "���ް��� ����";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "���ް��� ����";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "���ް��� ����";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "���ް��� ����";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "���ް��� ����";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "���ް��� ����";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "���ް��� ����";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "���ް��� ����";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "���ް��� ����";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "���ް��� ����";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == pzorder[2]) {
					if (select == 1) {
						money[0] += 14800;
						t1info[num[0]] = "�����Ʈ ����";
						t1price[num[0]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 14800;
						t2info[num[1]] = "�����Ʈ ����";
						t2price[num[1]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 14800;
						t3info[num[2]] = "�����Ʈ ����";
						t3price[num[2]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 14800;
						t4info[num[3]] = "�����Ʈ ����";
						t4price[num[3]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 14800;
						t5info[num[4]] = "�����Ʈ ����";
						t5price[num[4]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 14800;
						t6info[num[5]] = "�����Ʈ ����";
						t6price[num[5]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 14800;
						t7info[num[6]] = "�����Ʈ ����";
						t7price[num[6]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 14800;
						t8info[num[7]] = "�����Ʈ ����";
						t8price[num[7]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 14800;
						t9info[num[8]] = "�����Ʈ ����";
						t9price[num[8]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 14800;
						t10info[num[9]] = "�����Ʈ ����";
						t10price[num[9]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 14800;
						t11info[num[10]] = "�����Ʈ ����";
						t11price[num[10]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 14800;
						t12info[num[11]] = "�����Ʈ ����";
						t12price[num[11]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == pzorder[3]) {
					if (select == 1) {
						money[0] += 14800;
						t1info[num[0]] = "������������ ����";
						t1price[num[0]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 14800;
						t2info[num[1]] = "������������ ����";
						t2price[num[1]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 14800;
						t3info[num[2]] = "������������ ����";
						t3price[num[2]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 14800;
						t4info[num[3]] = "������������ ����";
						t4price[num[3]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 14800;
						t5info[num[4]] = "������������ ����";
						t5price[num[4]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 14800;
						t6info[num[5]] = "������������ ����";
						t6price[num[5]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 14800;
						t7info[num[6]] = "������������ ����";
						t7price[num[6]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 14800;
						t8info[num[7]] = "������������ ����";
						t8price[num[7]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 14800;
						t9info[num[8]] = "������������ ����";
						t9price[num[8]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 14800;
						t10info[num[9]] = "������������ ����";
						t10price[num[9]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 14800;
						t11info[num[10]] = "������������ ����";
						t11price[num[10]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 14800;
						t12info[num[11]] = "������������ ����";
						t12price[num[11]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == pzorder[4]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "�Ұ��� ����";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "�Ұ��� ����";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "�Ұ��� ����";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "�Ұ��� ����";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "�Ұ��� ����";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "�Ұ��� ����";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "�Ұ��� ����";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "�Ұ��� ����";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "�Ұ��� ����";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "�Ұ��� ����";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "�Ұ��� ����";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "�Ұ��� ����";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == pzorder[5]) {
					if (select == 1) {
						money[0] += 14800;
						t1info[num[0]] = "������ũ������ ����";
						t1price[num[0]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 14800;
						t2info[num[1]] = "������ũ������ ����";
						t2price[num[1]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 14800;
						t3info[num[2]] = "������ũ������ ����";
						t3price[num[2]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 14800;
						t4info[num[3]] = "������ũ������ ����";
						t4price[num[3]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 14800;
						t5info[num[4]] = "������ũ������ ����";
						t5price[num[4]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 14800;
						t6info[num[5]] = "������ũ������ ����";
						t6price[num[5]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 14800;
						t7info[num[6]] = "������ũ������ ����";
						t7price[num[6]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 14800;
						t8info[num[7]] = "������ũ������ ����";
						t8price[num[7]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 14800;
						t9info[num[8]] = "������ũ������ ����";
						t9price[num[8]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 14800;
						t10info[num[9]] = "������ũ������ ����";
						t10price[num[9]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 14800;
						t11info[num[10]] = "������ũ������ ����";
						t11price[num[10]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 14800;
						t12info[num[11]] = "������ũ������ ����";
						t12price[num[11]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == pzorder[6]) {
					if (select == 1) {
						money[0] += 13800;
						t1info[num[0]] = "���ڶ� ����";
						t1price[num[0]] = " 13.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 13800;
						t2info[num[1]] = "���ڶ� ����";
						t2price[num[1]] = " 13.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 13800;
						t3info[num[2]] = "���ڶ� ����";
						t3price[num[2]] = " 13.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 13800;
						t4info[num[3]] = "���ڶ� ����";
						t4price[num[3]] = " 13.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 13800;
						t5info[num[4]] = "���ڶ� ����";
						t5price[num[4]] = " 13.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 13800;
						t6info[num[5]] = "���ڶ� ����";
						t6price[num[5]] = " 13.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 13800;
						t7info[num[6]] = "���ڶ� ����";
						t7price[num[6]] = " 13.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 13800;
						t8info[num[7]] = "���ڶ� ����";
						t8price[num[7]] = " 13.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 13800;
						t9info[num[8]] = "���ڶ� ����";
						t9price[num[8]] = " 13.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 13800;
						t10info[num[9]] = "���ڶ� ����";
						t10price[num[9]] = " 13.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 13800;
						t11info[num[10]] = "���ڶ� ����";
						t11price[num[10]] = " 13.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 13800;
						t12info[num[11]] = "���ڶ� ����";
						t12price[num[11]] = " 13.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == pzorder[7]) {
					if (select == 1) {
						money[0] += 14800;
						t1info[num[0]] = "���ýó��� ����";
						t1price[num[0]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 14800;
						t2info[num[1]] = "���ýó��� ����";
						t2price[num[1]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 14800;
						t3info[num[2]] = "���ýó��� ����";
						t3price[num[2]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 14800;
						t4info[num[3]] = "���ýó��� ����";
						t4price[num[3]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 14800;
						t5info[num[4]] = "���ýó��� ����";
						t5price[num[4]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 14800;
						t6info[num[5]] = "���ýó��� ����";
						t6price[num[5]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 14800;
						t7info[num[6]] = "���ýó��� ����";
						t7price[num[6]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 14800;
						t8info[num[7]] = "���ýó��� ����";
						t8price[num[7]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 14800;
						t9info[num[8]] = "���ýó��� ����";
						t9price[num[8]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 14800;
						t10info[num[9]] = "���ýó��� ����";
						t10price[num[9]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 14800;
						t11info[num[10]] = "���ýó��� ����";
						t11price[num[10]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 14800;
						t12info[num[11]] = "���ýó��� ����";
						t12price[num[11]] = " 14.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == pzorder[8]) {
					if (select == 1) {
						money[0] += 19800;
						t1info[num[0]] = "�丶��̵� ����";
						t1price[num[0]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 19800;
						t2info[num[1]] = "�丶��̵� ����";
						t2price[num[1]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 19800;
						t3info[num[2]] = "�丶��̵� ����";
						t3price[num[2]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 19800;
						t4info[num[3]] = "�丶��̵� ����";
						t4price[num[3]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 19800;
						t5info[num[4]] = "�丶��̵� ����";
						t5price[num[4]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 19800;
						t6info[num[5]] = "�丶��̵� ����";
						t6price[num[5]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 19800;
						t7info[num[6]] = "�丶��̵� ����";
						t7price[num[6]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 19800;
						t8info[num[7]] = "�丶��̵� ����";
						t8price[num[7]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 19800;
						t9info[num[8]] = "�丶��̵� ����";
						t9price[num[8]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 19800;
						t10info[num[9]] = "�丶��̵� ����";
						t10price[num[9]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 19800;
						t11info[num[10]] = "�丶��̵� ����";
						t11price[num[10]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 19800;
						t12info[num[11]] = "�丶��̵� ����";
						t12price[num[11]] = " 19.800";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				}
			}
		}
	}

	class SidePanel extends JDialog {
		SidePanel() {
			setTitle("SIDE MENU");
			getContentPane();
			setLayout(null);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setModal(true);
			sidelabel[0] = new JLabel(new ImageIcon("side/�����극��.jpg"));
			sidelabel[1] = new JLabel(new ImageIcon("side/����Ÿ�׸�������.jpg"));
			sidelabel[2] = new JLabel(new ImageIcon("side/���������.jpg"));
			sidelabel[3] = new JLabel(new ImageIcon("side/ġŲ�ٴ�������.jpg"));
			sidelabel[4] = new JLabel(new ImageIcon("side/ĥ������������.jpg"));
			sidelabel[5] = new JLabel(new ImageIcon("side/����ġ������.jpg"));

			sdname[0] = new JLabel("���� �극��(2EA) -1.000", JLabel.CENTER);
			sdname[1] = new JLabel("����Ÿ �׸� ������  -12.000", JLabel.CENTER);
			sdname[2] = new JLabel("���� ������ -12.000", JLabel.CENTER);
			sdname[3] = new JLabel("ġŲ�ٴ� ������ -12.000", JLabel.CENTER);
			sdname[4] = new JLabel("ĥ������ ������ -12.000", JLabel.CENTER);
			sdname[5] = new JLabel("����ġ ������ -4.000", JLabel.CENTER);
			
			for(int i=0; i<6; i++){
				sdorder[i] = new JButton(orderimg);
				sdname[i].setForeground(Color.WHITE);
				sdorder[i].addActionListener(new SideAction());
				sidepic.add(sidelabel[i]);
				sidepic.add(sdname[i]);
				sidepic.add(sdorder[i]);
			}
			
			sidelabel[0].setBounds(10, 50, 196, 126);
			sidelabel[1].setBounds(260, 50, 196, 126);
			sidelabel[2].setBounds(510, 50, 196, 126);
			sidelabel[3].setBounds(10, 260, 196, 126);
			sidelabel[4].setBounds(260, 260, 196, 126);
			sidelabel[5].setBounds(510, 260, 196, 126);

			sdname[0].setBounds(10, 190, 196, 20); 
			sdname[1].setBounds(260, 190, 196, 20); 
			sdname[2].setBounds(510, 190, 196, 20); 
			sdname[3].setBounds(10, 400, 196, 20);
			sdname[4].setBounds(260, 400, 196, 20); 
			sdname[5].setBounds(510, 400, 196, 20);

			sdorder[0].setBounds(50, 212, 116, 35);
			sdorder[1].setBounds(300, 212, 116, 35);
			sdorder[2].setBounds(550, 212, 116, 35);
			sdorder[3].setBounds(50, 422, 116, 35);
			sdorder[4].setBounds(300, 422, 116, 35);
			sdorder[5].setBounds(550, 422, 116, 35);
			
			sidepic.setBounds(0, 0, 750, 690);
			add(sidepic);

			setSize(750, 690);
			setResizable(false);
			setLocation(165, 100);
			setVisible(false);
		}

		class SideAction implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == sdorder[0]) {
					if (select == 1) {
						money[0] += 1000;
						t1info[num[0]] = "���� �극��(2EA)";
						t1price[num[0]] = " 1.000";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 1000;
						t2info[num[1]] = "���� �극��(2EA)";
						t2price[num[1]] = " 1.000";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 1000;
						t3info[num[2]] = "���� �극��(2EA)";
						t3price[num[2]] = " 1.000";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 1000;
						t4info[num[3]] = "���� �극��(2EA)";
						t4price[num[3]] = " 1.000";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 1000;
						t5info[num[4]] = "���� �극��(2EA)";
						t5price[num[4]] = " 1.000";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 1000;
						t6info[num[5]] = "���� �극��(2EA)";
						t6price[num[5]] = " 1.000";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 1000;
						t7info[num[6]] = "���� �극��(2EA)";
						t7price[num[6]] = " 1.000";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 1000;
						t8info[num[7]] = "���� �극��(2EA)";
						t8price[num[7]] = " 1.000";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 1000;
						t9info[num[8]] = "���� �극��(2EA)";
						t9price[num[8]] = " 1.000";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 1000;
						t10info[num[9]] = "���� �극��(2EA)";
						t10price[num[9]] = " 1.000";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 1000;
						t11info[num[10]] = "���� �극��(2EA)";
						t11price[num[10]] = " 1.000";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 1000;
						t12info[num[11]] = "���� �극��(2EA)";
						t12price[num[11]] = " 1.000";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == sdorder[1]) {
					if (select == 1) {
						money[0] += 12000;
						t1info[num[0]] = "����Ÿ �׸� ������";
						t1price[num[0]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 12000;
						t2info[num[1]] = "����Ÿ �׸� ������";
						t2price[num[1]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 12000;
						t3info[num[2]] = "����Ÿ �׸� ������";
						t3price[num[2]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 12000;
						t4info[num[3]] = "����Ÿ �׸� ������";
						t4price[num[3]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 12000;
						t5info[num[4]] = "����Ÿ �׸� ������";
						t5price[num[4]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 12000;
						t6info[num[5]] = "����Ÿ �׸� ������";
						t6price[num[5]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 12000;
						t7info[num[6]] = "����Ÿ �׸� ������";
						t7price[num[6]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 12000;
						t8info[num[7]] = "����Ÿ �׸� ������";
						t8price[num[7]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 12000;
						t9info[num[8]] = "����Ÿ �׸� ������";
						t9price[num[8]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 12000;
						t10info[num[9]] = "����Ÿ �׸� ������";
						t10price[num[9]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 12000;
						t11info[num[10]] = "����Ÿ �׸� ������";
						t11price[num[10]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 12000;
						t12info[num[11]] = "����Ÿ �׸� ������";
						t12price[num[11]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == sdorder[2]) {
					if (select == 1) {
						money[0] += 12000;
						t1info[num[0]] = "���� ������";
						t1price[num[0]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 12000;
						t2info[num[1]] = "���� ������";
						t2price[num[1]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 12000;
						t3info[num[2]] = "���� ������";
						t3price[num[2]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 12000;
						t4info[num[3]] = "���� ������";
						t4price[num[3]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 12000;
						t5info[num[4]] = "���� ������";
						t5price[num[4]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 12000;
						t6info[num[5]] = "���� ������";
						t6price[num[5]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 12000;
						t7info[num[6]] = "���� ������";
						t7price[num[6]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 12000;
						t8info[num[7]] = "���� ������";
						t8price[num[7]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 12000;
						t9info[num[8]] = "���� ������";
						t9price[num[8]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 12000;
						t10info[num[9]] = "���� ������";
						t10price[num[9]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 12000;
						t11info[num[10]] = "���� ������";
						t11price[num[10]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 12000;
						t12info[num[11]] = "���� ������";
						t12price[num[11]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == sdorder[3]) {
					if (select == 1) {
						money[0] += 12000;
						t1info[num[0]] = "ġŲ�ٴ� ������";
						t1price[num[0]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 12000;
						t2info[num[1]] = "ġŲ�ٴ� ������";
						t2price[num[1]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 12000;
						t3info[num[2]] = "ġŲ�ٴ� ������";
						t3price[num[2]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 12000;
						t4info[num[3]] = "ġŲ�ٴ� ������";
						t4price[num[3]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 12000;
						t5info[num[4]] = "ġŲ�ٴ� ������";
						t5price[num[4]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 12000;
						t6info[num[5]] = "ġŲ�ٴ� ������";
						t6price[num[5]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 12000;
						t7info[num[6]] = "ġŲ�ٴ� ������";
						t7price[num[6]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 12000;
						t8info[num[7]] = "ġŲ�ٴ� ������";
						t8price[num[7]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 12000;
						t9info[num[8]] = "ġŲ�ٴ� ������";
						t9price[num[8]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 12000;
						t10info[num[9]] = "ġŲ�ٴ� ������";
						t10price[num[9]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 12000;
						t11info[num[10]] = "ġŲ�ٴ� ������";
						t11price[num[10]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 12000;
						t12info[num[11]] = "ġŲ�ٴ� ������";
						t12price[num[11]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == sdorder[4]) {
					if (select == 1) {
						money[0] += 12000;
						t1info[num[0]] = "ĥ������ ������";
						t1price[num[0]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 12000;
						t2info[num[1]] = "ĥ������ ������";
						t2price[num[1]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 12000;
						t3info[num[2]] = "ĥ������ ������";
						t3price[num[2]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 12000;
						t4info[num[3]] = "ĥ������ ������";
						t4price[num[3]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 12000;
						t5info[num[4]] = "ĥ������ ������";
						t5price[num[4]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 12000;
						t6info[num[5]] = "ĥ������ ������";
						t6price[num[5]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 12000;
						t7info[num[6]] = "ĥ������ ������";
						t7price[num[6]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 12000;
						t8info[num[7]] = "ĥ������ ������";
						t8price[num[7]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 12000;
						t9info[num[8]] = "ĥ������ ������";
						t9price[num[8]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 12000;
						t10info[num[9]] = "ĥ������ ������";
						t10price[num[9]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 12000;
						t11info[num[10]] = "ĥ������ ������";
						t11price[num[10]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 12000;
						t12info[num[11]] = "ĥ������ ������";
						t12price[num[11]] = " 12.000";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == sdorder[5]) {
					if (select == 1) {
						money[0] += 4000;
						t1info[num[0]] = "����ġ ������";
						t1price[num[0]] = " 4.000";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 4000;
						t2info[num[1]] = "����ġ ������";
						t2price[num[1]] = " 4.000";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 4000;
						t3info[num[2]] = "����ġ ������";
						t3price[num[2]] = " 4.000";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 4000;
						t4info[num[3]] = "����ġ ������";
						t4price[num[3]] = " 4.000";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 4000;
						t5info[num[4]] = "����ġ ������";
						t5price[num[4]] = " 4.000";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 4000;
						t6info[num[5]] = "����ġ ������";
						t6price[num[5]] = " 4.000";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 4000;
						t7info[num[6]] = "����ġ ������";
						t7price[num[6]] = " 4.000";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 4000;
						t8info[num[7]] = "����ġ ������";
						t8price[num[7]] = " 4.000";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 4000;
						t9info[num[8]] = "����ġ ������";
						t9price[num[8]] = " 4.000";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 4000;
						t10info[num[9]] = "����ġ ������";
						t10price[num[9]] = " 4.000";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 4000;
						t11info[num[10]] = "����ġ ������";
						t11price[num[10]] = " 4.000";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 4000;
						t12info[num[11]] = "����ġ ������";
						t12price[num[11]] = " 4.000";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				}
			}
		}
	}

	class DrinkPanel extends JDialog {
		DrinkPanel() {
			setTitle("BEVERAGE");
			getContentPane();
			setLayout(null);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setModal(true);
			drinklabel[0] = new JLabel(new ImageIcon("drink/���⿡�̵�.jpg"));
			drinklabel[1] = new JLabel(new ImageIcon("drink/��������̵�.jpg"));
			drinklabel[2] = new JLabel(new ImageIcon("drink/������̵�.jpg"));
			drinklabel[3] = new JLabel(new ImageIcon("drink/�����̵�.jpg"));
			drinklabel[4] = new JLabel(new ImageIcon("drink/�Ѷ�����̵�.jpg"));
			drinklabel[5] = new JLabel(new ImageIcon("drink/�ڸ����̵�.jpg"));
			drinklabel[6] = new JLabel(new ImageIcon("drink/û��û����.jpg"));
			drinklabel[7] = new JLabel(new ImageIcon("drink/ü�����̵�.jpg"));
			drinklabel[8] = new JLabel(new ImageIcon("drink/�ݶ�.jpg"));
			drinklabel[9] = new JLabel(new ImageIcon("drink/���̴�.jpg"));
			drinklabel[10] = new JLabel(new ImageIcon("drink/ȯŸ����.jpg"));
			dkname[0] = new JLabel("���� ���̵� - 7.000", JLabel.CENTER);
			dkname[1] = new JLabel("����� ���̵� - 7.000", JLabel.CENTER);
			dkname[2] = new JLabel("������̵� - 7.000", JLabel.CENTER);
			dkname[3] = new JLabel("���� ���̵� - 7.000", JLabel.CENTER);
			dkname[4] = new JLabel("�Ѷ�� ���̵� - 7.000", JLabel.CENTER);
			dkname[5] = new JLabel("�ڸ����̵� - 7.000", JLabel.CENTER);
			dkname[6] = new JLabel("û���� ���̵� - 7.000", JLabel.CENTER);
			dkname[7] = new JLabel("ü�� ���̵� - 7.000", JLabel.CENTER);
			dkname[8] = new JLabel("�ݶ� - 2.000", JLabel.CENTER);
			dkname[9] = new JLabel("���̴� - 2.000", JLabel.CENTER);
			dkname[10] = new JLabel("ȯŸ (����) - 2.000", JLabel.CENTER);
			
			for(int i=0; i<11; i++){
				dkorder[i] = new JButton(orderimg);
				dkname[i].setForeground(Color.WHITE);
				dkorder[i].addActionListener(new DrinkAction());
				drinkpic.add(drinklabel[i]);
				drinkpic.add(dkname[i]);
				drinkpic.add(dkorder[i]);
			}

			drinklabel[0].setBounds(10, 50, 168, 108);
			drinklabel[1].setBounds(195, 50, 168, 108);
			drinklabel[2].setBounds(375, 50, 168, 108);
			drinklabel[3].setBounds(555, 50, 168, 108);
			drinklabel[4].setBounds(10, 250, 168, 108);
			drinklabel[5].setBounds(195, 250, 168, 108);
			drinklabel[6].setBounds(375, 250, 168, 108);
			drinklabel[7].setBounds(555, 250, 168, 108);
			drinklabel[8].setBounds(10, 460, 168, 108);
			drinklabel[9].setBounds(195, 460, 168, 108);
			drinklabel[10].setBounds(375, 460, 168, 108);

			dkname[0].setBounds(10, 160, 175, 20); 
			dkname[1].setBounds(195, 160, 175, 20); 
			dkname[2].setBounds(375, 160, 175, 20); 
			dkname[3].setBounds(555, 160, 175, 20); 
			dkname[4].setBounds(10, 360, 175, 20); 
			dkname[5].setBounds(195, 360, 175, 20); 
			dkname[6].setBounds(375, 360, 175, 20); 
			dkname[7].setBounds(555, 360, 175, 20);
			dkname[8].setBounds(10, 570, 175, 20); 
			dkname[9].setBounds(195, 570, 175, 20); 
			dkname[10].setBounds(375, 570, 175, 20); 

			dkorder[0].setBounds(40, 190, 116, 30);
			dkorder[1].setBounds(220, 190, 116, 30);
			dkorder[2].setBounds(400, 190, 116, 30);
			dkorder[3].setBounds(585, 190, 116, 30);
			dkorder[4].setBounds(40, 390, 116, 30);
			dkorder[5].setBounds(220, 390, 116, 30);
			dkorder[6].setBounds(400, 390, 116, 30);
			dkorder[7].setBounds(585, 390, 116, 30);
			dkorder[8].setBounds(40, 600, 116, 30);
			dkorder[9].setBounds(220, 600, 116, 30);
			dkorder[10].setBounds(400, 600, 116, 30);
			
			drinkpic.setBounds(0, 0, 750, 690);
			add(drinkpic);

			setLocation(165, 100);
			setResizable(false);
			setSize(750, 690);
			setVisible(false);
		}

		class DrinkAction implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == dkorder[0]) {
					if (select == 1) {
						money[0] += 7000;
						t1info[num[0]] = "���� ���̵�";
						t1price[num[0]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 7000;
						t2info[num[1]] = "���� ���̵�";
						t2price[num[1]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 7000;
						t3info[num[2]] = "���� ���̵�";
						t3price[num[2]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 7000;
						t4info[num[3]] = "���� ���̵�";
						t4price[num[3]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 7000;
						t5info[num[4]] = "���� ���̵�";
						t5price[num[4]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 7000;
						t6info[num[5]] = "���� ���̵�";
						t6price[num[5]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 7000;
						t7info[num[6]] = "���� ���̵�";
						t7price[num[6]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 7000;
						t8info[num[7]] = "���� ���̵�";
						t8price[num[7]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 7000;
						t9info[num[8]] = "���� ���̵�";
						t9price[num[8]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 7000;
						t10info[num[9]] = "���� ���̵�";
						t10price[num[9]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 7000;
						t11info[num[10]] = "���� ���̵�";
						t11price[num[10]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 7000;
						t12info[num[11]] = "���� ���̵�";
						t12price[num[11]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == dkorder[1]) {
					if (select == 1) {
						money[0] += 7000;
						t1info[num[0]] = "����� ���̵�";
						t1price[num[0]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 7000;
						t2info[num[1]] = "����� ���̵�";
						t2price[num[1]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 7000;
						t3info[num[2]] = "����� ���̵�";
						t3price[num[2]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 7000;
						t4info[num[3]] = "����� ���̵�";
						t4price[num[3]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 7000;
						t5info[num[4]] = "����� ���̵�";
						t5price[num[4]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 7000;
						t6info[num[5]] = "����� ���̵�";
						t6price[num[5]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 7000;
						t7info[num[6]] = "����� ���̵�";
						t7price[num[6]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 7000;
						t8info[num[7]] = "����� ���̵�";
						t8price[num[7]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 7000;
						t9info[num[8]] = "����� ���̵�";
						t9price[num[8]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 7000;
						t10info[num[9]] = "����� ���̵�";
						t10price[num[9]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 7000;
						t11info[num[10]] = "����� ���̵�";
						t11price[num[10]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 7000;
						t12info[num[11]] = "����� ���̵�";
						t12price[num[11]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == dkorder[2]) {
					if (select == 1) {
						money[0] += 7000;
						t1info[num[0]] = "������̵�";
						t1price[num[0]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 7000;
						t2info[num[1]] = "������̵�";
						t2price[num[1]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 7000;
						t3info[num[2]] = "������̵�";
						t3price[num[2]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 7000;
						t4info[num[3]] = "������̵�";
						t4price[num[3]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 7000;
						t5info[num[4]] = "������̵�";
						t5price[num[4]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 7000;
						t6info[num[5]] = "������̵�";
						t6price[num[5]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 7000;
						t7info[num[6]] = "������̵�";
						t7price[num[6]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 7000;
						t8info[num[7]] = "������̵�";
						t8price[num[7]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 7000;
						t9info[num[8]] = "������̵�";
						t9price[num[8]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 7000;
						t10info[num[9]] = "������̵�";
						t10price[num[9]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 7000;
						t11info[num[10]] = "������̵�";
						t11price[num[10]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 7000;
						t12info[num[11]] = "������̵�";
						t12price[num[11]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == dkorder[3]) {
					if (select == 1) {
						money[0] += 7000;
						t1info[num[0]] = "���� ���̵�";
						t1price[num[0]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 7000;
						t2info[num[1]] = "���� ���̵�";
						t2price[num[1]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 7000;
						t3info[num[2]] = "���� ���̵�";
						t3price[num[2]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 7000;
						t4info[num[3]] = "���� ���̵�";
						t4price[num[3]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 7000;
						t5info[num[4]] = "���� ���̵�";
						t5price[num[4]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 7000;
						t6info[num[5]] = "���� ���̵�";
						t6price[num[5]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 7000;
						t7info[num[6]] = "���� ���̵�";
						t7price[num[6]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 7000;
						t8info[num[7]] = "���� ���̵�";
						t8price[num[7]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 7000;
						t9info[num[8]] = "���� ���̵�";
						t9price[num[8]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 7000;
						t10info[num[9]] = "���� ���̵�";
						t10price[num[9]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 7000;
						t11info[num[10]] = "���� ���̵�";
						t11price[num[10]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 7000;
						t12info[num[11]] = "���� ���̵�";
						t12price[num[11]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == dkorder[4]) {
					if (select == 1) {
						money[0] += 7000;
						t1info[num[0]] = "�Ѷ�� ���̵�";
						t1price[num[0]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 7000;
						t2info[num[1]] = "�Ѷ�� ���̵�";
						t2price[num[1]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 7000;
						t3info[num[2]] = "�Ѷ�� ���̵�";
						t3price[num[2]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 7000;
						t4info[num[3]] = "�Ѷ�� ���̵�";
						t4price[num[3]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 7000;
						t5info[num[4]] = "�Ѷ�� ���̵�";
						t5price[num[4]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 7000;
						t6info[num[5]] = "�Ѷ�� ���̵�";
						t6price[num[5]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 7000;
						t7info[num[6]] = "�Ѷ�� ���̵�";
						t7price[num[6]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 7000;
						t8info[num[7]] = "�Ѷ�� ���̵�";
						t8price[num[7]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 7000;
						t9info[num[8]] = "�Ѷ�� ���̵�";
						t9price[num[8]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 7000;
						t10info[num[9]] = "�Ѷ�� ���̵�";
						t10price[num[9]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 7000;
						t11info[num[10]] = "�Ѷ�� ���̵�";
						t11price[num[10]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 7000;
						t12info[num[11]] = "�Ѷ�� ���̵�";
						t12price[num[11]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == dkorder[5]) {
					if (select == 1) {
						money[0] += 7000;
						t1info[num[0]] = "�ڸ����̵�";
						t1price[num[0]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 7000;
						t2info[num[1]] = "�ڸ����̵�";
						t2price[num[1]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 7000;
						t3info[num[2]] = "�ڸ����̵�";
						t3price[num[2]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 7000;
						t4info[num[3]] = "�ڸ����̵�";
						t4price[num[3]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 7000;
						t5info[num[4]] = "�ڸ����̵�";
						t5price[num[4]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 7000;
						t6info[num[5]] = "�ڸ����̵�";
						t6price[num[5]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 7000;
						t7info[num[6]] = "�ڸ����̵�";
						t7price[num[6]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 7000;
						t8info[num[7]] = "�ڸ����̵�";
						t8price[num[7]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 7000;
						t9info[num[8]] = "�ڸ����̵�";
						t9price[num[8]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 7000;
						t10info[num[9]] = "�ڸ����̵�";
						t10price[num[9]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 7000;
						t11info[num[10]] = "�ڸ����̵�";
						t11price[num[10]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 7000;
						t12info[num[11]] = "�ڸ����̵�";
						t12price[num[11]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == dkorder[6]) {
					if (select == 1) {
						money[0] += 7000;
						t1info[num[0]] = "û���� ���̵�";
						t1price[num[0]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 7000;
						t2info[num[1]] = "û���� ���̵�";
						t2price[num[1]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 7000;
						t3info[num[2]] = "û���� ���̵�";
						t3price[num[2]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 7000;
						t4info[num[3]] = "û���� ���̵�";
						t4price[num[3]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 7000;
						t5info[num[4]] = "û���� ���̵�";
						t5price[num[4]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 7000;
						t6info[num[5]] = "û���� ���̵�";
						t6price[num[5]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 7000;
						t7info[num[6]] = "û���� ���̵�";
						t7price[num[6]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 7000;
						t8info[num[7]] = "û���� ���̵�";
						t8price[num[7]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 7000;
						t9info[num[8]] = "û���� ���̵�";
						t9price[num[8]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 7000;
						t10info[num[9]] = "û���� ���̵�";
						t10price[num[9]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 7000;
						t11info[num[10]] = "û���� ���̵�";
						t11price[num[10]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 7000;
						t12info[num[11]] = "û���� ���̵�";
						t12price[num[11]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == dkorder[7]) {
					if (select == 1) {
						money[0] += 7000;
						t1info[num[0]] = "ü�� ���̵�";
						t1price[num[0]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 7000;
						t2info[num[1]] = "ü�� ���̵�";
						t2price[num[1]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 7000;
						t3info[num[2]] = "ü�� ���̵�";
						t3price[num[2]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 7000;
						t4info[num[3]] = "ü�� ���̵�";
						t4price[num[3]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 7000;
						t5info[num[4]] = "ü�� ���̵�";
						t5price[num[4]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 7000;
						t6info[num[5]] = "ü�� ���̵�";
						t6price[num[5]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 7000;
						t7info[num[6]] = "ü�� ���̵�";
						t7price[num[6]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 7000;
						t8info[num[7]] = "ü�� ���̵�";
						t8price[num[7]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 7000;
						t9info[num[8]] = "ü�� ���̵�";
						t9price[num[8]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 7000;
						t10info[num[9]] = "ü�� ���̵�";
						t10price[num[9]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 7000;
						t11info[num[10]] = "ü�� ���̵�";
						t11price[num[10]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 7000;
						t12info[num[11]] = "ü�� ���̵�";
						t12price[num[11]] = " 7.000";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == dkorder[8]) {
					if (select == 1) {
						money[0] += 2000;
						t1info[num[0]] = "�ݶ�";
						t1price[num[0]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 2000;
						t2info[num[1]] = "�ݶ�";
						t2price[num[1]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 2000;
						t3info[num[2]] = "�ݶ�";
						t3price[num[2]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 2000;
						t4info[num[3]] = "�ݶ�";
						t4price[num[3]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 2000;
						t5info[num[4]] = "�ݶ�";
						t5price[num[4]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 2000;
						t6info[num[5]] = "�ݶ�";
						t6price[num[5]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 2000;
						t7info[num[6]] = "�ݶ�";
						t7price[num[6]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 2000;
						t8info[num[7]] = "�ݶ�";
						t8price[num[7]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 2000;
						t9info[num[8]] = "�ݶ�";
						t9price[num[8]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 2000;
						t10info[num[9]] = "�ݶ�";
						t10price[num[9]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 2000;
						t11info[num[10]] = "�ݶ�";
						t11price[num[10]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 2000;
						t12info[num[11]] = "�ݶ�";
						t12price[num[11]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == dkorder[9]) {
					if (select == 1) {
						money[0] += 2000;
						t1info[num[0]] = "���̴�";
						t1price[num[0]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 2000;
						t2info[num[1]] = "���̴�";
						t2price[num[1]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 2000;
						t3info[num[2]] = "���̴�";
						t3price[num[2]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 2000;
						t4info[num[3]] = "���̴�";
						t4price[num[3]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 2000;
						t5info[num[4]] = "���̴�";
						t5price[num[4]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 2000;
						t6info[num[5]] = "���̴�";
						t6price[num[5]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 2000;
						t7info[num[6]] = "���̴�";
						t7price[num[6]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 2000;
						t8info[num[7]] = "���̴�";
						t8price[num[7]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 2000;
						t9info[num[8]] = "���̴�";
						t9price[num[8]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 2000;
						t10info[num[9]] = "���̴�";
						t10price[num[9]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 2000;
						t11info[num[10]] = "���̴�";
						t11price[num[10]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 2000;
						t12info[num[11]] = "���̴�";
						t12price[num[11]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				} else if (e.getSource() == dkorder[10]) {
					if (select == 1) {
						money[0] += 2000;
						t1info[num[0]] = "ȯŸ (����)";
						t1price[num[0]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t1info[num[0]] + " �հ�ݾ� : " + money[0]);
						num[0]++;
					} else if (select == 2) {
						money[1] += 2000;
						t2info[num[1]] = "ȯŸ (����)";
						t2price[num[1]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t2info[num[1]] + " �հ�ݾ� : " + money[1]);
						num[1]++;
					} else if (select == 3) {
						money[2] += 2000;
						t3info[num[2]] = "ȯŸ (����)";
						t3price[num[2]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t3info[num[2]] + " �հ�ݾ� : " + money[2]);
						num[2]++;
					} else if (select == 4) {
						money[3] += 2000;
						t4info[num[3]] = "ȯŸ (����)";
						t4price[num[3]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t4info[num[3]] + " �հ�ݾ� : " + money[3]);
						num[3]++;
					} else if (select == 5) {
						money[4] += 2000;
						t5info[num[4]] = "ȯŸ (����)";
						t5price[num[4]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t5info[num[4]] + " �հ�ݾ� : " + money[4]);
						num[4]++;
					} else if (select == 6) {
						money[5] += 2000;
						t6info[num[5]] = "ȯŸ (����)";
						t6price[num[5]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t6info[num[5]] + " �հ�ݾ� : " + money[5]);
						num[5]++;
					} else if (select == 7) {
						money[6] += 2000;
						t7info[num[6]] = "ȯŸ (����)";
						t7price[num[6]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t7info[num[6]] + " �հ�ݾ� : " + money[6]);
						num[6]++;
					} else if (select == 8) {
						money[7] += 2000;
						t8info[num[7]] = "ȯŸ (����)";
						t8price[num[7]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t8info[num[7]] + " �հ�ݾ� : " + money[7]);
						num[7]++;
					} else if (select == 9) {
						money[8] += 2000;
						t9info[num[8]] = "ȯŸ (����)";
						t9price[num[8]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t9info[num[8]] + " �հ�ݾ� : " + money[8]);
						num[8]++;
					} else if (select == 10) {
						money[9] += 2000;
						t10info[num[9]] = "ȯŸ (����)";
						t10price[num[9]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t10info[num[9]] + " �հ�ݾ� : " + money[9]);
						num[9]++;
					} else if (select == 11) {
						money[10] += 2000;
						t11info[num[10]] = "ȯŸ (����)";
						t11price[num[10]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t11info[num[10]] + " �հ�ݾ� : " + money[10]);
						num[10]++;
					} else if (select == 12) {
						money[11] += 2000;
						t12info[num[11]] = "ȯŸ (����)";
						t12price[num[11]] = " 2.000";
						System.out.println("�ֹ� ���� : " + t12info[num[11]] + " �հ�ݾ� : " + money[11]);
						num[11]++;
					}
				}
			}
		}
	}

	class FoodMenu extends JDialog {
		JPanel menupanel = new JPanel();
		JLabel menull = new JLabel(new ImageIcon("menu/menu.jpg"));

		FoodMenu() {
			steak.setContentAreaFilled(false);
			pasta.setContentAreaFilled(false);
			pilaf.setContentAreaFilled(false);
			pizza.setContentAreaFilled(false);
			side.setContentAreaFilled(false);
			drink.setContentAreaFilled(false);
			endbtn.setContentAreaFilled(false);
			steak.addActionListener(new FoodAction());
			pasta.addActionListener(new FoodAction());
			pilaf.addActionListener(new FoodAction());
			pizza.addActionListener(new FoodAction());
			side.addActionListener(new FoodAction());
			drink.addActionListener(new FoodAction());
			endbtn.addActionListener(new FoodAction());
			getContentPane();
			setLayout(null);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			menupanel.setSize(160, 600);
			menupanel.setBackground(Color.WHITE);
			menupanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 10));
			menupanel.add(menull);
			menupanel.add(steak);
			menupanel.add(pasta);
			menupanel.add(pilaf);
			menupanel.add(pizza);
			menupanel.add(side);
			menupanel.add(drink);
			menupanel.add(endbtn);
			add(menupanel);
			endbtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (select == 1) {
						if(money[0] > 0){
							lucknum[0] = (int)(Math.random()*10);
							tbtn[0].setBackground(Color.GREEN);
							tbtn[0].setForeground(Color.BLACK);
							mon1 = "�ݾ�: " + Integer.toString(money[0]) + " ��";
							tbtn[0].setText(mon1);
							tblabel2[0].setText("�ð�: " + nowDate);
						}						
					} else if (select == 2) {
						if(money[1] > 0){
							lucknum[1] = (int)(Math.random()*10);
							tbtn[1].setBackground(Color.GREEN);
							tbtn[1].setForeground(Color.BLACK);
							mon2 = "�ݾ�: " + Integer.toString(money[1]) + " ��";
							tbtn[1].setText(mon2);
							tblabel2[1].setText("�ð�: " + nowDate);
						}
					} else if (select == 3) {
						if(money[2] > 0){
							lucknum[2] = (int)(Math.random()*10);
							tbtn[2].setBackground(Color.GREEN);
							tbtn[2].setForeground(Color.BLACK);
							mon3 = "�ݾ�: " + Integer.toString(money[2]) + " ��";
							tbtn[2].setText(mon3);
							tblabel2[2].setText("�ð�: " + nowDate);
						}
					} else if (select == 4) {
						if(money[3] > 0){
							lucknum[3] = (int)(Math.random()*10);
							tbtn[3].setBackground(Color.GREEN);
							tbtn[3].setForeground(Color.BLACK);
							mon4 = "�ݾ�: " + Integer.toString(money[3]) + " ��";
							tbtn[3].setText(mon4);
							tblabel2[3].setText("�ð�: " + nowDate);
						}
					} else if (select == 5) {
						if(money[4] > 0){
							lucknum[4] = (int)(Math.random()*10);
							tbtn[4].setBackground(Color.GREEN);
							tbtn[4].setForeground(Color.BLACK);
							mon5 = "�ݾ�: " + Integer.toString(money[4]) + " ��";
							tbtn[4].setText(mon5);
							tblabel2[4].setText("�ð�: " + nowDate);
						}
					} else if (select == 6) {
						if(money[5] > 0){
							lucknum[5] = (int)(Math.random()*10);
							tbtn[5].setBackground(Color.GREEN);
							tbtn[5].setForeground(Color.BLACK);
							mon6 = "�ݾ�: " + Integer.toString(money[5]) + " ��";
							tbtn[5].setText(mon6);
							tblabel2[5].setText("�ð�: " + nowDate);
						}
					} else if (select == 7) {
						if(money[6] > 0){
							lucknum[6] = (int)(Math.random()*10);
							tbtn[6].setBackground(Color.GREEN);
							tbtn[6].setForeground(Color.BLACK);
							mon7 = "�ݾ�: " + Integer.toString(money[6]) + " ��";
							tbtn[6].setText(mon7);
							tblabel2[6].setText("�ð�: " + nowDate);
						}
					} else if (select == 8) {
						if(money[7] > 0){
							lucknum[7] = (int)(Math.random()*10);
							tbtn[7].setBackground(Color.GREEN);
							tbtn[7].setForeground(Color.BLACK);
							mon8 = "�ݾ�: " + Integer.toString(money[7]) + " ��";
							tbtn[7].setText(mon8);
							tblabel2[7].setText("�ð�: " + nowDate);
						}
					} else if (select == 9) {
						if(money[8] > 0){
							lucknum[8] = (int)(Math.random()*10);
							tbtn[8].setBackground(Color.GREEN);
							tbtn[8].setForeground(Color.BLACK);
							mon9 = "�ݾ�: " + Integer.toString(money[8]) + " ��";
							tbtn[8].setText(mon9);
							tblabel2[8].setText("�ð�: " + nowDate);
						}
					} else if (select == 10) {
						if(money[9] > 0){
							lucknum[9] = (int)(Math.random()*10);
							tbtn[9].setBackground(Color.GREEN);
							tbtn[9].setForeground(Color.BLACK);
							mon10 = "�ݾ�: " + Integer.toString(money[9]) + " ��";
							tbtn[9].setText(mon10);
							tblabel2[9].setText("�ð�: " + nowDate);
						}
					} else if (select == 11) {
						if(money[10] > 0){
							lucknum[10] = (int)(Math.random()*10);
							tbtn[10].setBackground(Color.GREEN);
							tbtn[10].setForeground(Color.BLACK);
							mon11 = "�ݾ�: " + Integer.toString(money[10]) + " ��";
							tbtn[10].setText(mon11);
							tblabel2[10].setText("�ð�: " + nowDate);
						}
					} else if (select == 12) {
						if(money[11] > 0){
							lucknum[11] = (int)(Math.random()*10);
							tbtn[11].setBackground(Color.GREEN);
							tbtn[11].setForeground(Color.BLACK);
							mon12 = "�ݾ�: " + Integer.toString(money[11]) + " ��";
							tbtn[11].setText(mon12);
							tblabel2[11].setText("�ð�: " + nowDate);
						}
					}
					setVisible(false);
				}
			});
			setSize(160, 450);
			setLocation(0, 100);
			setResizable(false);
		}
		class FoodAction implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == steak)
					stp.setVisible(true);
				else if (e.getSource() == pasta)
					psp.setVisible(true);
				else if (e.getSource() == pilaf)
					plp.setVisible(true);
				else if (e.getSource() == pizza)
					pzp.setVisible(true);
				else if (e.getSource() == side)
					sdp.setVisible(true);
				else if (e.getSource() == drink)
					dkp.setVisible(true);
			}
		}
	}
	class Click0 extends JDialog {
		ImageIcon a1 = new ImageIcon("click/�ֹ�.jpg");
		ImageIcon a2 = new ImageIcon("click/����.jpg");
		ImageIcon a3 = new ImageIcon("click/���.jpg");

		Click0() {
			getContentPane();
			setTitle("�ֹ� / ���  / ����");
			setLayout(new GridLayout(1, 3));
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setModal(true);
			Clickbtn1 = new JButton("�ֹ�", a1);
			Clickbtn2 = new JButton("���", a3);
			Clickbtn3 = new JButton("����", a2);
			add(Clickbtn1);
			add(Clickbtn2);
			add(Clickbtn3);
			Clickbtn2.setEnabled(false);
			Clickbtn1.setSize(134, 108);
			Clickbtn2.setSize(134, 108);
			Clickbtn3.setSize(134, 108);
			Clickbtn1.addActionListener(new ClickAction());
			Clickbtn2.addActionListener(new ClickAction());
			Clickbtn3.addActionListener(new ClickAction());
			setJMenuBar(tablebar);
			tbinfo.addActionListener(new ClickAction());
			setSize(385, 165);
			setLocation(500, 300);
			setResizable(false);
			setVisible(false);
		}

		class Table1 extends JFrame {
			JLabel name = new JLabel(t1name);
			JLabel birth = new JLabel(t1birth);
			JLabel main = new JLabel(t1main);
			JLabel side = new JLabel(t1side);
			JLabel person = new JLabel(t1person);
			JLabel phone = new JLabel(t1phone);
			JLabel num = new JLabel(t1num);
			JLabel time = new JLabel(t1num);

			public Table1() {
				setTitle("Table 1");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(450, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class Table2 extends JFrame {
			JLabel name = new JLabel(t1name);
			JLabel birth = new JLabel(t1birth);
			JLabel main = new JLabel(t1main);
			JLabel side = new JLabel(t1side);
			JLabel person = new JLabel(t1person);
			JLabel phone = new JLabel(t1phone);
			JLabel num = new JLabel(t1num);
			JLabel time = new JLabel(t1time);

			public Table2() {
				setTitle("Table 2");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(600, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class Table3 extends JFrame {
			JLabel name = new JLabel(t3name);
			JLabel birth = new JLabel(t3birth);
			JLabel main = new JLabel(t3main);
			JLabel side = new JLabel(t3side);
			JLabel person = new JLabel(t3person);
			JLabel phone = new JLabel(t3phone);
			JLabel num = new JLabel(t3num);
			JLabel time = new JLabel(t3time);

			public Table3() {
				setTitle("Table 3");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(600, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class Table4 extends JFrame {
			JLabel name = new JLabel(t4name);
			JLabel birth = new JLabel(t4birth);
			JLabel main = new JLabel(t4main);
			JLabel side = new JLabel(t4side);
			JLabel person = new JLabel(t4person);
			JLabel phone = new JLabel(t4phone);
			JLabel num = new JLabel(t4num);
			JLabel time = new JLabel(t4time);

			public Table4() {
				setTitle("Table 4");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(600, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class Table5 extends JFrame {
			JLabel name = new JLabel(t5name);
			JLabel birth = new JLabel(t5birth);
			JLabel main = new JLabel(t5main);
			JLabel side = new JLabel(t5side);
			JLabel person = new JLabel(t5person);
			JLabel phone = new JLabel(t5phone);
			JLabel num = new JLabel(t5num);
			JLabel time = new JLabel(t5time);

			public Table5() {
				setTitle("Table 5");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(600, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class Table6 extends JFrame {
			JLabel name = new JLabel(t6name);
			JLabel birth = new JLabel(t6birth);
			JLabel main = new JLabel(t6main);
			JLabel side = new JLabel(t6side);
			JLabel person = new JLabel(t6person);
			JLabel phone = new JLabel(t6phone);
			JLabel num = new JLabel(t6num);
			JLabel time = new JLabel(t6time);

			public Table6() {
				setTitle("Table 6");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(600, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class Table7 extends JFrame {
			JLabel name = new JLabel(t7name);
			JLabel birth = new JLabel(t7birth);
			JLabel main = new JLabel(t7main);
			JLabel side = new JLabel(t7side);
			JLabel person = new JLabel(t7person);
			JLabel phone = new JLabel(t7phone);
			JLabel num = new JLabel(t7num);
			JLabel time = new JLabel(t7time);

			public Table7() {
				setTitle("Table 2");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(600, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class Table8 extends JFrame {
			JLabel name = new JLabel(t8name);
			JLabel birth = new JLabel(t8birth);
			JLabel main = new JLabel(t8main);
			JLabel side = new JLabel(t8side);
			JLabel person = new JLabel(t8person);
			JLabel phone = new JLabel(t8phone);
			JLabel num = new JLabel(t8num);
			JLabel time = new JLabel(t8time);

			public Table8() {
				setTitle("Table 8");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(600, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class Table9 extends JFrame {
			JLabel name = new JLabel(t9name);
			JLabel birth = new JLabel(t9birth);
			JLabel main = new JLabel(t9main);
			JLabel side = new JLabel(t9side);
			JLabel person = new JLabel(t9person);
			JLabel phone = new JLabel(t9phone);
			JLabel num = new JLabel(t9num);
			JLabel time = new JLabel(t9time);

			public Table9() {
				setTitle("Table 9");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(600, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class Table10 extends JFrame {
			JLabel name = new JLabel(t10name);
			JLabel birth = new JLabel(t10birth);
			JLabel main = new JLabel(t10main);
			JLabel side = new JLabel(t10side);
			JLabel person = new JLabel(t10person);
			JLabel phone = new JLabel(t10phone);
			JLabel num = new JLabel(t10num);
			JLabel time = new JLabel(t10time);

			public Table10() {
				setTitle("Table 10");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(600, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class Table11 extends JFrame {
			JLabel name = new JLabel(t11name);
			JLabel birth = new JLabel(t11birth);
			JLabel main = new JLabel(t11main);
			JLabel side = new JLabel(t11side);
			JLabel person = new JLabel(t11person);
			JLabel phone = new JLabel(t11phone);
			JLabel num = new JLabel(t11num);
			JLabel time = new JLabel(t11time);

			public Table11() {
				setTitle("Table 11");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(600, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class Table12 extends JFrame {
			JLabel name = new JLabel(t12name);
			JLabel birth = new JLabel(t12birth);
			JLabel main = new JLabel(t12main);
			JLabel side = new JLabel(t12side);
			JLabel person = new JLabel(t12person);
			JLabel phone = new JLabel(t12phone);
			JLabel num = new JLabel(t12num);
			JLabel time = new JLabel(t12time);

			public Table12() {
				setTitle("Table 12");
				getContentPane();
				setLayout(null);
				setModal(true);
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				t_name.setBounds(30, 20, 100, 30);
				t_birth.setBounds(30, 60, 100, 30);
				t_main.setBounds(30, 100, 100, 30);
				t_side.setBounds(30, 140, 100, 30);
				t_person.setBounds(30, 180, 100, 30);
				t_phone.setBounds(30, 220, 100, 30);
				t_num.setBounds(30, 260, 100, 30);
				t_time.setBounds(30, 300, 100, 30);

				name.setBounds(150, 20, 100, 30);
				birth.setBounds(150, 60, 100, 30);
				main.setBounds(150, 100, 600, 30);
				side.setBounds(150, 140, 600, 30);
				person.setBounds(150, 180, 100, 30);
				phone.setBounds(150, 220, 100, 30);
				num.setBounds(150, 260, 100, 30);
				time.setBounds(150, 300, 100, 30);

				add(t_name);
				add(t_birth);
				add(t_main);
				add(t_side);
				add(t_person);
				add(t_phone);
				add(t_num);
				add(t_time);
				add(name);
				add(birth);
				add(main);
				add(side);
				add(person);
				add(phone);
				add(num);
				add(time);
				setSize(600, 400);
				setResizable(false);
				setVisible(true);
			}
		}

		class ClickAction implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == Clickbtn1) {
					setModal(false);
					setVisible(false);
					fdmenu.setVisible(true);
				} 
				else if(e.getSource() == Clickbtn2){
					setModal(false);
					setVisible(false);
					if (select == 1) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t1info[i]);
							t1money[i] = new JLabel(t1price[i]);
							t1money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t1money[i]);
							south = new JLabel("< �� �� �� ��  > : " + money[0] + " ���Դϴ�.", JLabel.CENTER);
						}
						pay.setVisible(true);
					} else if (select == 2) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t2info[i]);
							t2money[i] = new JLabel(t2price[i]);
							t2money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t2money[i]);
							south = new JLabel("< �� �� �� ��  > : " + money[1] + " ���Դϴ�.", JLabel.CENTER);
						}
						pay.setVisible(true);
					}
					else if (select == 3) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t3info[i]);
							t3money[i] = new JLabel(t3price[i]);
							t3money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t3money[i]);
							south = new JLabel("< �� �� �� ��  > : " + money[2] + " ���Դϴ�.", JLabel.CENTER);
						}
						pay.setVisible(true);
					}
					else if (select == 4) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t4info[i]);
							t4money[i] = new JLabel(t4price[i]);
							t4money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t4money[i]);
							south = new JLabel("< �� �� �� ��  > : " + money[3] + " ���Դϴ�.", JLabel.CENTER);
						}
						pay.setVisible(true);
					}
					else if (select == 5) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t5info[i]);
							t5money[i] = new JLabel(t5price[i]);
							t5money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t5money[i]);
							south = new JLabel("< �� �� �� ��  > : " + money[4] + " ���Դϴ�.", JLabel.CENTER);
						}
						pay.setVisible(true);
					}
					else if (select == 6) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t6info[i]);
							t6money[i] = new JLabel(t6price[i]);
							t6money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t6money[i]);
							south = new JLabel("< �� �� �� ��  > : " + money[5] + " ���Դϴ�.", JLabel.CENTER); 
						}
						pay.setVisible(true);
					}
					else if (select == 7) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t7info[i]);
							t7money[i] = new JLabel(t7price[i]);
							t7money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t7money[i]);
							south = new JLabel("< �� �� �� ��  > : " + money[6] + " ���Դϴ�.", JLabel.CENTER);
						}
						pay.setVisible(true);
					}
					else if (select == 8) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t8info[i]);
							t8money[i] = new JLabel(t8price[i]);
							t8money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t8money[i]);
							south = new JLabel("< �� �� �� ��  > : " + money[7] + " ���Դϴ�.", JLabel.CENTER);
						}
						pay.setVisible(true);
					}
					else if (select == 9) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t9info[i]);
							t9money[i] = new JLabel(t9price[i]);
							t9money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t9money[i]);
							south = new JLabel("< �� �� �� ��  > : " + money[8] + " ���Դϴ�.", JLabel.CENTER);
						}
						pay.setVisible(true);
					}
					else if (select == 10) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t10info[i]);
							t10money[i] = new JLabel(t10price[i]);
							t10money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t10money[i]);
							south = new JLabel("< �� �� �� ��  > : " + money[9] + " ���Դϴ�.", JLabel.CENTER);
						}
						pay.setVisible(true);
					}
					else if (select == 11) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t11info[i]);
							t11money[i] = new JLabel(t11price[i]);
							t11money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t11money[i]);
							south = new JLabel("< �� �� �� ��  > : " + money[10] + " ���Դϴ�.", JLabel.CENTER);
						}
						pay.setVisible(true);
					}
					else if (select == 12) {
						for (int i = 0; i < 20; i++) {
							foodinfo[i].setText(t12info[i]);
							t12money[i] = new JLabel(t12price[i]);
							t12money[i].setBounds(195, 40 + (i * 30), 100, 25);
							pay.add(t12money[i]);
							south = new JLabel("< �� �� �� ��  > : " + money[11] + " ���Դϴ�.", JLabel.CENTER);
						}
						pay.setVisible(true);
					}
					else if(select == 1 & lucknum[0] == thisluck){
						num[0] = 0;
						tablesell += 1;
						System.out.println("1�� ���̺��� ���� �Ļ縦 �Ͽ����ϴ�.");
						tbtn[0].setText("�Լ� ����");
						tbtn[0].setBackground(Color.WHITE);
						tblabel2[0].setText("");
						money[0] = 0;
						for (int i = 0; i < 20; i++){
							t1money[i] = new JLabel("");
							t1info[i] = "";
							t1price[i] = "";
						}
						event.setVisible(true);
					}
					else if(select == 2 & lucknum[1] == thisluck){
						num[1] = 0;
						tablesell += 1;
						System.out.println("2�� ���̺��� ���� �Ļ縦 �Ͽ����ϴ�.");
						tbtn[1].setText("�Լ� ����");
						tbtn[1].setBackground(Color.WHITE);
						tblabel2[1].setText("");
						money[1] = 0;
						for (int i = 0; i < 20; i++){
							t2money[i] = new JLabel("");
							t2info[i] = "";
							t2price[i] = "";
						}
						event.setVisible(true);
					}
					else if(select == 3 & lucknum[2] == thisluck){
						System.out.println(lucknum[2] +""+ thisluck);
						num[2] = 0;
						tablesell += 1;
						System.out.println("3�� ���̺��� ���� �Ļ縦 �Ͽ����ϴ�.");
						tbtn[2].setText("�Լ� ����");
						tbtn[2].setBackground(Color.WHITE);
						tblabel2[2].setText("");
						money[2] = 0;
						for (int i = 0; i < 20; i++){
							t3money[i] = new JLabel("");
							t3info[i] = "";
							t3price[i] = "";
						}
						event.setVisible(true);
					}
					else if(select == 4 & lucknum[3] == thisluck){
						num[3] = 0;
						tablesell += 1;
						System.out.println("4�� ���̺��� ���� �Ļ縦 �Ͽ����ϴ�.");
						tbtn[3].setText("�Լ� ����");
						tbtn[3].setBackground(Color.WHITE);
						tblabel2[3].setText("");
						money[3] = 0;
						for (int i = 0; i < 20; i++){
							t4money[i] = new JLabel("");
							t4info[i] = "";
							t4price[i] = "";
						}
						event.setVisible(true);
					}
					else if(select == 5 & lucknum[4] == thisluck){
						num[4] = 0;
						tablesell += 1;
						System.out.println("5�� ���̺��� ���� �Ļ縦 �Ͽ����ϴ�.");
						tbtn[4].setText("�Լ� ����");
						tbtn[4].setBackground(Color.WHITE);
						tblabel2[4].setText("");
						money[4] = 0;
						for (int i = 0; i < 20; i++){
							t5money[i] = new JLabel("");
							t5info[i] = "";
							t5price[i] = "";
						}
						event.setVisible(true);
					}
					else if(select == 6 & lucknum[5] == thisluck){
						num[5] = 0;
						tablesell += 1;
						System.out.println("6�� ���̺��� ���� �Ļ縦 �Ͽ����ϴ�.");
						tbtn[5].setText("�Լ� ����");
						tbtn[5].setBackground(Color.WHITE);
						tblabel2[5].setText("");
						money[5] = 0;
						for (int i = 0; i < 20; i++){
							t6money[i] = new JLabel("");
							t6info[i] = "";
							t6price[i] = "";
						}
						event.setVisible(true);
					}
					else if(select == 7 & lucknum[6] == thisluck){
						num[6] = 0;
						tablesell += 1;
						System.out.println("7�� ���̺��� ���� �Ļ縦 �Ͽ����ϴ�.");
						tbtn[6].setText("�Լ� ����");
						tbtn[6].setBackground(Color.WHITE);
						tblabel2[6].setText("");
						money[6] = 0;
						for (int i = 0; i < 20; i++){
							t7money[i] = new JLabel();
							t7info[i] = "";
							t7price[i] = "";
						}
						event.setVisible(true);
					}
					else if(select == 8 & lucknum[7] == thisluck){
						num[7] = 0;
						tablesell += 1;
						System.out.println("8�� ���̺��� ���� �Ļ縦 �Ͽ����ϴ�.");
						tbtn[7].setText("�Լ� ����");
						tbtn[7].setBackground(Color.WHITE);
						tblabel2[7].setText("");
						money[7] = 0;
						for (int i = 0; i < 20; i++){
							t8money[i] = new JLabel("");
							t8info[i] = "";
							t8price[i] = "";
						}
						event.setVisible(true);
					}
					else if(select == 9 & lucknum[8] == thisluck){
						num[8] = 0;
						tablesell += 1;
						System.out.println("9�� ���̺��� ���� �Ļ縦 �Ͽ����ϴ�.");
						tbtn[8].setText("�Լ� ����");
						tbtn[8].setBackground(Color.WHITE);
						tblabel2[8].setText("");
						money[8] = 0;
						for (int i = 0; i < 20; i++){
							t9money[i] = new JLabel("");
							t9info[i] = "";
							t9price[i] = "";
						}
						event.setVisible(true);
					}
					else if(select == 10 & lucknum[9] == thisluck){
						num[9] = 0;
						tablesell += 1;
						System.out.println("10�� ���̺��� ���� �Ļ縦 �Ͽ����ϴ�.");
						tbtn[9].setText("�Լ� ����");
						tbtn[9].setBackground(Color.WHITE);
						tblabel2[9].setText("");
						money[9] = 0;
						for (int i = 0; i < 20; i++){
							t10money[i] = new JLabel("");
							t10info[i] = "";
							t10price[i] = "";
						}
						event.setVisible(true);
					}
					else if(select == 11 & lucknum[10] == thisluck){
						num[10] = 0;
						tablesell += 1;
						System.out.println("11�� ���̺��� ���� �Ļ縦 �Ͽ����ϴ�.");
						tbtn[10].setText("�Լ� ����");
						tbtn[10].setBackground(Color.WHITE);
						tblabel2[10].setText("");
						money[10] = 0;
						for (int i = 0; i < 20; i++){
							t11money[i] = new JLabel("");
							t11info[i] = "";
							t11price[i] = "";
						}
						event.setVisible(true);
					}
					else if(select == 12 & lucknum[11] == thisluck){
						num[11] = 0;
						tablesell += 1;
						System.out.println("12�� ���̺��� ���� �Ļ縦 �Ͽ����ϴ�.");
						tbtn[11].setText("�Լ� ����");
						tbtn[11].setBackground(Color.WHITE);
						tblabel2[11].setText("");
						money[11] = 0;
						for (int i = 0; i < 20; i++){
							t12money[i] = new JLabel("");
							t12info[i] = "";
							t12price[i] = "";
						}
						event.setVisible(true);
					}	
				}
				else if (e.getSource() == Clickbtn3) {
					setModal(false);
					setVisible(false);
					int result = JOptionPane.showConfirmDialog(null, "�����Ͻðڽ��ϱ� ?",   // �̼� 15 JOptionPane
							"Confirm", JOptionPane.YES_NO_OPTION);
					if(result == JOptionPane.YES_OPTION){
						setVisible(false);
						namefield.setText("");
						birthfield.setText("");
						man.setSelected(false);
						hpfield1.setText("");
						hpfield2.setText("");
						hpfield3.setText("");
						timefield.setText("");
						reser.setVisible(true);
					}	
				}
				if (e.getSource() == tbinfo) {
					if (select == 1) {
						if (tbtn[0].getBackground() == Color.YELLOW)
							new Table1();
						else if (tbtn[0].getBackground() == Color.GREEN)
							new OrderInfo();
					} else if (select == 2) {
						if (tbtn[1].getBackground() == Color.YELLOW)
							new Table2();
						else
							new OrderInfo();
					} else if (select == 3) {
						if (tbtn[2].getBackground() == Color.YELLOW)
							new Table3();
						else
							new OrderInfo();
					} else if (select == 4) {
						if (tbtn[3].getBackground() == Color.YELLOW)
							new Table4();
						else
							new OrderInfo();
					} else if (select == 5) {
						if (tbtn[4].getBackground() == Color.YELLOW)
							new Table5();
						else
							new OrderInfo();
					} else if (select == 6) {
						if (tbtn[5].getBackground() == Color.YELLOW)
							new Table6();
						else
							new OrderInfo();
					} else if (select == 7) {
						if (tbtn[6].getBackground() == Color.YELLOW)
							new Table7();
						else
							new OrderInfo();
					} else if (select == 8) {
						if (tbtn[7].getBackground() == Color.YELLOW)
							new Table8();
						else
							new OrderInfo();
					} else if (select == 9) {
						if (tbtn[8].getBackground() == Color.YELLOW)
							new Table9();
						else
							new OrderInfo();
					} else if (select == 10) {
						if (tbtn[9].getBackground() == Color.YELLOW)
							new Table10();
						else
							new OrderInfo();
					} else if (select == 11) {
						if (tbtn[10].getBackground() == Color.YELLOW)
							new Table1();
						else
							new OrderInfo();
					} else if (select == 12) {
						if (tbtn[11].getBackground() == Color.YELLOW)
							new Table12();
						else
							new OrderInfo();
					}
				}
			}
		}
	}
	class SurveyWrite {
		SurveyWrite(){
			String fileName = "��������"+ran+".txt";
			try{            
				File file = new File(fileName) ;           
				FileWriter fw = new FileWriter(file) ;
				for(int i=0; i<5; i++)
					fw.write(surveytxt[i].getText()+"  ");
				fw.flush();
				fw.close();        
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	class Event extends JDialog {
		Event(){
			setTitle("����Ʈ ���");
			getContentPane();
			setModal(true);
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			setSize(700,500);
			setVisible(false);
		}
		public void paint(Graphics g){
			ImageIcon icon = new ImageIcon("images/�̺�Ʈ��÷.jpg");
			Image img = icon.getImage();
			g.drawImage(img, 0, 0, getWidth(),getHeight(), this);
		}
	}
	class Reservation extends JDialog {
		Reservation() throws FileNotFoundException {
			setTitle("���� ���� �ý���");
			setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			mn1 = new JMenuItem("�� �� ��");
			mn2 = new JMenuItem("�� ��");
			mn3 = new JMenuItem("�� �� ��");
			mn4 = new JMenuItem("�� �� ��");
			mn5 = new JMenuItem("�ʱ�ȭ");
			mn6 = new JMenuItem("Close");
			
			Stringnum = 0;
			File file6 = new File("������.txt");
			sc = new Scanner(file6);
			while(sc.hasNext()){
				Stringtxt[Stringnum] = sc.nextLine();
				Stringnum++;
				System.out.println(Stringtxt[Stringnum]);
			}
			
			menu.add(mn1);
			menu.add(mn2);
			menu.add(mn3);
			menu.add(mn4);
			menu.add(mn5);
			menu.add(mn6);
			menubar.add(menu);
			setJMenuBar(menubar);
			mn1.addActionListener(new MyActionListener());
			mn2.addActionListener(new MyActionListener());
			mn3.addActionListener(new MyActionListener());
			mn4.addActionListener(new MyActionListener());
			mn5.addActionListener(new MyActionListener());
			mn6.addActionListener(new MyActionListener());
			menu.addActionListener(new MyActionListener());

			contentpane = getContentPane();
			contentpane.setLayout(new BorderLayout());
			
			add(new SouthPanel(), BorderLayout.SOUTH);
			add(new NorthPanel(), BorderLayout.NORTH);
			add(new CenterPanel(), BorderLayout.CENTER);
			
			setSize(420, 600);
			setLocation(1365,100);
			setResizable(false);
			setVisible(false);

			la.requestFocus();
			la.setFocusable(true);
		}

		class SouthPanel extends JPanel {
			SouthPanel() {
				getContentPane();
				setBackground(Color.LIGHT_GRAY);
				ImageIcon Icon1 = new ImageIcon("images/phone1.jpg");
				ImageIcon Icon2 = new ImageIcon("images/ex.jpg");

				ok = new JButton("����", Icon1);
				ok.addActionListener(new MyActionListener());
				add(ok);
				ok.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {

					}
				});
				cancel = new JButton("�������", Icon2);
				cancel.addActionListener(new MyActionListener());
				add(cancel);
			}
		}

		class NorthPanel extends JPanel {
			NorthPanel() {
				getContentPane();
				add(la);
				la.addMouseMotionListener(new MyMouseAdapter());
			}

			class MyChangeListener implements ChangeListener {
				public void stateChanged(ChangeEvent e) {
					Font f = name.getFont();
					int size = f.getSize();

					la.setBackground(Color.RED);
				}
			}

			class MyKeyListener extends KeyAdapter { //�̼� 4 Ű���� �̺�Ʈ
				public void keyPressed(KeyEvent e) {
					JLabel j2 = new JLabel();
					char keyChar = e.getKeyChar();
					la.setText(Character.toString(keyChar));
				}

				public void keyReleased(KeyEvent e) {
					System.out.println("key released");
				}

				public void keyTyped(KeyEvent e) {
					System.out.println("key typed");
				}
			}
		}

		class CenterPanel extends JPanel {
			public CenterPanel() {
				
				getContentPane();
				setLayout(null);
				setBackground(Color.orange);
				MyActionListener ls = new MyActionListener();
				MyMouseAdapter ls2 = new MyMouseAdapter();
				MyItemListener mi = new MyItemListener();

				ImageIcon Icon1 = new ImageIcon("images/phone1.jpg");
				manofwoman = new JLabel();
				myperson = new JLabel();

				name = new JLabel("�� ��");
				birth = new JLabel("�������");
				mainmenu = new JLabel("MAIN DISH");
				sidemenu = new JLabel("SIDE DISH");
				person = new JLabel("�� ��");
				phone = new JLabel("�޴���");
				time = new JLabel("�湮�ð�");
				sum = new JLabel("�ο���");
				a = new JLabel(Icon1);
				led = new JLabel("������ �������ּ���.");
				ttable = new JLabel("Table");
				led.setBackground(Color.orange);

				name.setFont(new Font("���ü", Font.BOLD, 15));
				birth.setFont(new Font("���ü", Font.BOLD, 15));
				phone.setFont(new Font("���ü", Font.BOLD, 15));
				mainmenu.setFont(new Font("���ü", Font.BOLD, 15));
				sidemenu.setFont(new Font("���ü", Font.BOLD, 15));
				person.setFont(new Font("���ü", Font.BOLD, 15));
				time.setFont(new Font("���ü", Font.BOLD, 15));
				sum.setFont(new Font("���ü", Font.BOLD, 15));
				led.setFont(new Font("���ü", Font.BOLD, 15));
				ttable.setFont(new Font("���ü", Font.BOLD, 15));

				jyp = new JPanel(new FlowLayout(FlowLayout.LEFT));
				jyp.setBackground(Color.orange);

				g = new ButtonGroup();
				man = new JRadioButton("����");
				woman = new JRadioButton("����");
				g.add(man);
				g.add(woman);
				man.setFont(new Font("", Font.BOLD, 12));
				woman.setFont(new Font("", Font.BOLD, 12));
				man.addItemListener(mi);
				woman.addItemListener(mi);
				
				namefield = new JTextField(Stringtxt[0]);
				birthfield = new JTextField(Stringtxt[1]);
				namefield.addActionListener(ls);
				birthfield.addActionListener(ls);
				hpfield1 = new JTextField(Stringtxt[2]);
				hpfield2 = new JTextField(Stringtxt[3]);
				hpfield3 = new JTextField(Stringtxt[4]);
				timefield = new JTextField("");
				JLabel hipon = new JLabel("-");
				JLabel hipon2 = new JLabel("-");
				combox = new JComboBox(ea);
				combox.addActionListener(ls);
				timebox = new JComboBox(ea2);
				mainbox = new JComboBox(menuString);
				sidebox = new JComboBox(sideString);
				tablebox = new JComboBox(tablenum);
				mainbox.addActionListener(ls);
				sidebox.addActionListener(ls);

				man.setBackground(Color.orange);
				woman.setBackground(Color.orange);
				name.setBounds(20, 25, 100, 20);
				birth.setBounds(20, 65, 100, 20);
				mainmenu.setBounds(20, 105, 100, 20);
				sidemenu.setBounds(20, 145, 100, 20);
				person.setBounds(20, 185, 100, 20);
				phone.setBounds(20, 305, 100, 20); // 20,220,100,20
				sum.setBounds(20, 345, 100, 20);
				time.setBounds(20, 385, 100, 20);
				ttable.setBounds(20, 425, 100, 20);

				namefield.setBounds(120, 20, 100, 30);
				birthfield.setBounds(120, 60, 100, 30);
				mainbox.setBounds(120, 100, 200, 30);
				sidebox.setBounds(120, 140, 200, 30);
				man.setBounds(120, 180, 100, 30);
				woman.setBounds(120, 210, 100, 30);
				led.setBounds(120, 240, 150, 30);
				manofwoman.setBounds(270, 180, 100, 100);
				hpfield1.setBounds(120, 300, 50, 30);
				hipon.setBounds(179, 300, 10, 30);
				hpfield2.setBounds(190, 300, 50, 30);
				hipon2.setBounds(249, 300, 10, 30);
				hpfield3.setBounds(260, 300, 50, 30);
				combox.setBounds(120, 340, 100, 30);
				myperson.setBounds(180, 340, 100, 30);
				timebox.setBounds(120, 380, 100, 30);
				tablebox.setBounds(120, 420, 100, 30);
				// 1��
				add(name);
				add(birth);
				add(phone);
				add(mainmenu);
				add(sidemenu);
				add(time);
				add(person);
				add(jyp);
				add(sum);
				// 2��
				add(namefield);
				add(birthfield);
				add(mainbox);
				add(sidebox);
				add(hpfield1);
				add(hpfield2);
				add(hpfield3);
				add(combox);
				add(timebox);
				add(hipon);
				add(hipon2);
				add(manofwoman);
				add(tablebox);
				add(led);
				add(man);
				add(woman);
				add(myperson);
		//		add(mainbtn);
		//		add(sidebtn);
				add(ttable);
				
			}
		}

		class MyActionListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				File file2 = new File("������.txt");
				File file3 = new File("����.txt");
				File file4 = new File("���̸�.txt");
				File file5 = new File("������.txt");

				if (e.getSource() == mn1) {
					Stringnum = 0;
					try {
						sc = new Scanner(file2);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
					while(sc.hasNext()){
						Stringtxt[Stringnum] = sc.nextLine();
						Stringnum++;
					}
					namefield.setText(Stringtxt[0]);
					birthfield.setText(Stringtxt[1]);
					hpfield1.setText(Stringtxt[2]);
					hpfield2.setText(Stringtxt[3]);
					hpfield3.setText(Stringtxt[4]);
					man.setSelected(true);
				} else if (e.getSource() == mn2) {
					Stringnum = 0;
					try {
						sc = new Scanner(file3);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
					while(sc.hasNext()){
						Stringtxt[Stringnum] = sc.nextLine();
						Stringnum++;
					}
					MyThird aaa = new MyThird();
					aaa.add(aa2);
					led.setOpaque(true);
					man.setSelected(true);
				} else if (e.getSource() == mn3) {
					Stringnum = 0;
					try {
						sc = new Scanner(file4);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
					while(sc.hasNext()){
						Stringtxt[Stringnum] = sc.nextLine();
						Stringnum++;
					}
					MyThird aaa = new MyThird();
					aaa.add(aa3);
					led.setOpaque(true);
					woman.setSelected(true);
					namefield.setText(Stringtxt[0]);
					birthfield.setText(Stringtxt[1]);
					hpfield1.setText(Stringtxt[2]);
					hpfield2.setText(Stringtxt[3]);
					hpfield3.setText(Stringtxt[4]);
				} else if (e.getSource() == mn4) {
					Stringnum = 0;
					try {
						sc = new Scanner(file5);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
					while(sc.hasNext()){
						Stringtxt[Stringnum] = sc.nextLine();
						Stringnum++;
					}
					MyThird aaa = new MyThird();
					aaa.add(aa1);
					led.setOpaque(true);
					man.setSelected(true);
					namefield.setText(Stringtxt[0]);
					birthfield.setText(Stringtxt[1]);
					hpfield1.setText(Stringtxt[2]);
					hpfield2.setText(Stringtxt[3]);
					hpfield3.setText(Stringtxt[4]);
				} else if (e.getSource() == mn5) {
					namefield.setText("");
					birthfield.setText("");
					man.setSelected(false);
					hpfield1.setText("");
					hpfield2.setText("");
					hpfield3.setText("");
					timefield.setText("");
					setBackground(Color.ORANGE);
					jyp.setBackground(Color.ORANGE);
				}
				else if(e.getSource() == mn6 || e.getSource() == cancel){
					reser.setVisible(false);
					namefield.setText("");
					birthfield.setText("");
					man.setSelected(false);
					hpfield1.setText("");
					hpfield2.setText("");
					hpfield3.setText("");
					timefield.setText("");
					setBackground(Color.ORANGE);
					jyp.setBackground(Color.ORANGE);
				}
		/*		if (e.getSource() == ok) {
					ok.setBackground(Color.GREEN);
					cancel.setVisible(false);
				}*/
				if (e.getSource() == mainbox) {
					int result = JOptionPane.showConfirmDialog(null, "���ðڽ��ϱ� ?","", JOptionPane.YES_NO_OPTION);//�̼� 15 JOptionPane
					if(result == JOptionPane.YES_OPTION){
						String b = (String) mainbox.getSelectedItem();
						if (!mainbox.getSelectedItem().equals(" Main Dish ")) {
							info[numm] = b;
							numm++;
							System.out.println(b);
						}
					}	

				} else if (e.getSource() == sidebox) {
					int result = JOptionPane.showConfirmDialog(null, "���ðڽ��ϱ� ?","", JOptionPane.YES_NO_OPTION);//�̼� 15 JOptionPane
					String b = (String) sidebox.getSelectedItem();
					if (!sidebox.getSelectedItem().equals(" Side Dish ")) {
						info2[numm2] = b;
						numm2++;
						System.out.println(b);
					}
				}
				if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 1��  ")) {
					if (tbtn[0].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "�̹� ����� �ڸ��Դϴ�.", "", JOptionPane.ERROR_MESSAGE);//�̼� 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[0].setBackground(Color.YELLOW);
						tbtn[0].setForeground(Color.GREEN);
						tbtn[0].setText("<����> " + namefield.getText());
						t1name = namefield.getText();
						t1birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t1main += info[i];
						if (man.isSelected() == true)
							t1person = man.getText();
						else if (woman.isSelected() == true)
							t1person = woman.getText();
						t1phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t1num = (String) combox.getSelectedItem();
						t1time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				} else if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 2��  ")) {
					if (tbtn[1].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "�̹� ����� �ڸ��Դϴ�.", "Message", JOptionPane.ERROR_MESSAGE);//�̼� 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[1].setBackground(Color.YELLOW);
						tbtn[1].setForeground(Color.GREEN);
						tbtn[1].setText("<����> " + namefield.getText());
						t2name = namefield.getText();
						t2birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t2main += info[i];
						if (man.isSelected() == true)
							t2person = man.getText();
						else if (woman.isSelected() == true)
							t2person = woman.getText();
						t2phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t2num = (String) combox.getSelectedItem();
						t2time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				} else if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 3��  ")) {
					if (tbtn[2].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "�̹� ����� �ڸ��Դϴ�.", "Message", JOptionPane.ERROR_MESSAGE);//�̼� 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[2].setForeground(Color.BLACK);
						tbtn[2].setBackground(Color.YELLOW);
						tbtn[2].setText("<����> " + namefield.getText());
						t3name = namefield.getText();
						t3birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t3main += info[i];
						if (man.isSelected() == true)
							t3person = man.getText();
						else if (woman.isSelected() == true)
							t3person = woman.getText();
						t3phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t3num = (String) combox.getSelectedItem();
						t3time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				} else if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 4��  ")) {
					if (tbtn[3].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "�̹� ����� �ڸ��Դϴ�.", "Message", JOptionPane.ERROR_MESSAGE);//�̼� 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[3].setForeground(Color.BLACK);
						tbtn[3].setBackground(Color.YELLOW);
						tbtn[3].setText("<����> " + namefield.getText());
						t4name = namefield.getText();
						t4birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t4main += info[i];
						if (man.isSelected() == true)
							t4person = man.getText();
						else if (woman.isSelected() == true)
							t4person = woman.getText();
						t4phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t4num = (String) combox.getSelectedItem();
						t4time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				} else if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 5��  ")) {
					if (tbtn[0].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "�̹� ����� �ڸ��Դϴ�.", "Message", JOptionPane.ERROR_MESSAGE);//�̼� 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[4].setForeground(Color.BLACK);
						tbtn[4].setBackground(Color.YELLOW);
						tbtn[4].setText("<����> " + namefield.getText());
						t5name = namefield.getText();
						t5birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t5main += info[i];
						if (man.isSelected() == true)
							t5person = man.getText();
						else if (woman.isSelected() == true)
							t5person = woman.getText();
						t5phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t5num = (String) combox.getSelectedItem();
						t5time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				} else if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 6��  ")) {
					if (tbtn[0].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "�̹� ����� �ڸ��Դϴ�.", "Message", JOptionPane.ERROR_MESSAGE);//�̼� 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[5].setForeground(Color.BLACK);
						tbtn[5].setBackground(Color.YELLOW);
						tbtn[5].setText("<����> " + namefield.getText());
						t6name = namefield.getText();
						t6birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t6main += info[i];
						if (man.isSelected() == true)
							t6person = man.getText();
						else if (woman.isSelected() == true)
							t6person = woman.getText();
						t6phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t6num = (String) combox.getSelectedItem();
						t6time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				} else if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 7��  ")) {
					if (tbtn[0].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "�̹� ����� �ڸ��Դϴ�.", "Message", JOptionPane.ERROR_MESSAGE);//�̼� 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[6].setForeground(Color.BLACK);
						tbtn[6].setBackground(Color.YELLOW);
						tbtn[6].setText("<����> " + namefield.getText());
						t7name = namefield.getText();
						t7birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t7main += info[i];
						if (man.isSelected() == true)
							t7person = man.getText();
						else if (woman.isSelected() == true)
							t7person = woman.getText();
						t7phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t7num = (String) combox.getSelectedItem();
						t7time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				} else if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 8��  ")) {
					if (tbtn[0].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "�̹� ����� �ڸ��Դϴ�.", "Message", JOptionPane.ERROR_MESSAGE);//�̼� 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[7].setForeground(Color.BLACK);
						tbtn[7].setBackground(Color.YELLOW);
						tbtn[7].setText("<����> " + namefield.getText());
						t8name = namefield.getText();
						t8birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t8main += info[i];
						if (man.isSelected() == true)
							t8person = man.getText();
						else if (woman.isSelected() == true)
							t8person = woman.getText();
						t8phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t8num = (String) combox.getSelectedItem();
						t8time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				} else if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 9��  ")) {
					if (tbtn[0].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "�̹� ����� �ڸ��Դϴ�.", "Message", JOptionPane.ERROR_MESSAGE);//�̼� 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[8].setForeground(Color.BLACK);
						tbtn[8].setBackground(Color.YELLOW);
						tbtn[8].setText("<����> " + namefield.getText());
						t9name = namefield.getText();
						t9birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t9main += info[i];
						if (man.isSelected() == true)
							t9person = man.getText();
						else if (woman.isSelected() == true)
							t9person = woman.getText();
						t9phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t9num = (String) combox.getSelectedItem();
						t9time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				} else if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 10��  ")) {
					if (tbtn[0].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "�̹� ����� �ڸ��Դϴ�.", "Message", JOptionPane.ERROR_MESSAGE);//�̼� 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[9].setForeground(Color.BLACK);
						tbtn[9].setBackground(Color.YELLOW);
						tbtn[9].setText("<����> " + namefield.getText());
						t10name = namefield.getText();
						t10birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t10main += info[i];
						if (man.isSelected() == true)
							t10person = man.getText();
						else if (woman.isSelected() == true)
							t10person = woman.getText();
						t10phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t10num = (String) combox.getSelectedItem();
						t10time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				} else if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 11��  ")) {
					if (tbtn[0].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "�̹� ����� �ڸ��Դϴ�.", "Message", JOptionPane.ERROR_MESSAGE);//�̼� 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[10].setForeground(Color.BLACK);
						tbtn[10].setBackground(Color.YELLOW);
						tbtn[10].setText("<����> " + namefield.getText());
						t11name = namefield.getText();
						t11birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t11main += info[i];
						if (man.isSelected() == true)
							t11person = man.getText();
						else if (woman.isSelected() == true)
							t11person = woman.getText();
						t11phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t11num = (String) combox.getSelectedItem();
						t11time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				} else if (e.getSource() == ok && tablebox.getSelectedItem().equals(" 12��  ")) {
					if (tbtn[0].getBackground() == Color.YELLOW) {
						JOptionPane.showMessageDialog(null, "�̹� ����� �ڸ��Դϴ�.", "Message", JOptionPane.ERROR_MESSAGE);//�̼� 15 JOptionPane
						ok.setBackground(Color.WHITE);
						cancel.setVisible(true);
					} else {
						tbtn[11].setForeground(Color.BLACK);
						tbtn[11].setBackground(Color.YELLOW);
						tbtn[11].setText("<����> " + namefield.getText());
						t12name = namefield.getText();
						t12birth = birthfield.getText();
						for (int i = 0; i < numm; i++)
							t12main += info[i];
						if (man.isSelected() == true)
							t12person = man.getText();
						else if (woman.isSelected() == true)
							t12person = woman.getText();
						t12phone = hpfield1.getText() + "-" + hpfield2.getText() + "-" + hpfield3.getText();
						t12num = (String) combox.getSelectedItem();
						t12time = (String) timebox.getSelectedItem();
						setVisible(false);
					}
				}
			}
		}
		class MyMouseAdapter extends MouseAdapter implements MouseMotionListener {  // �̼� 3 ���콺 �̺�Ʈ // �̼� 5 ���콺 ��� ������
			public void mouseDragged(MouseEvent e) {
				la.setText("���� ��Ȯ�� ���������� �Է��� �ּ���. (" + e.getX() + ", " + e.getY() + ")");
			}
			public void mouseMoved(MouseEvent e) {
				la.setText(" ���������� Ÿ����� ������ �ʽ��ϴ�.");
			}
		}
		public class MyItemListener implements ItemListener {
			public void itemStateChanged(ItemEvent e) {
				if (e.getItem() == man)
					led.setText("�����Դϴ�.");
				else if (e.getItem() == woman)
					led.setText("�����Դϴ�");
				if (man.isSelected())
					manofwoman.setIcon(image1);
				else if (woman.isSelected())
					manofwoman.setIcon(image2);
			}
		}
	}
	class MyThird extends JDialog {
		MyThird() {
			setTitle("�ܰ�մ� ����");
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setSize(300, 400);
			setLocation(1050, 0);
			setVisible(true);
		}
	}
	class MyMouseListener extends MouseAdapter {  // �̼� 3 ���콺 �̺�Ʈ
		public void mouseEntered(MouseEvent e){
			for(int i=0; i<12; i++)
				if(e.getSource() == tbtn[i] && tbtn[i].getBackground() == Color.WHITE)
					tbtn[i].setBackground(Color.LIGHT_GRAY);
		}
		public void mouseExited(MouseEvent e){
			for(int i=0; i<12; i++)
				if(e.getSource() == tbtn[i] && tbtn[i].getBackground() == Color.LIGHT_GRAY)
					tbtn[i].setBackground(Color.WHITE);
		}
	}
	class MyActionListener implements ActionListener { // �̼� 2 ��ư �̺�Ʈ ó�� ActionListener // ���� ��� �̺�Ʈó�� �Ϸ�
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == tbtn[0]) {
				if(tbtn[0].getBackground() == Color.LIGHT_GRAY || tbtn[0].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[0].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}			
				select = 1;
			} else if (e.getSource() == tbtn[1]) {
				if(tbtn[1].getBackground() == Color.LIGHT_GRAY || tbtn[1].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[1].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}
				select = 2;
			} else if (e.getSource() == tbtn[2]) {
				if(tbtn[2].getBackground() == Color.LIGHT_GRAY || tbtn[2].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[2].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}
				select = 3;
			} else if (e.getSource() == tbtn[3]) {
				if(tbtn[3].getBackground() == Color.LIGHT_GRAY || tbtn[3].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[3].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}
				select = 4;
			} else if (e.getSource() == tbtn[4]) {
				if(tbtn[4].getBackground() == Color.LIGHT_GRAY || tbtn[4].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[4].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}
				select = 5;
			} else if (e.getSource() == tbtn[5]) {
				if(tbtn[5].getBackground() == Color.LIGHT_GRAY || tbtn[5].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[5].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}
				select = 6;
			} else if (e.getSource() == tbtn[6]) {
				if(tbtn[6].getBackground() == Color.LIGHT_GRAY || tbtn[6].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[6].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}
				select = 7;
			} else if (e.getSource() == tbtn[7]) {
				if(tbtn[7].getBackground() == Color.LIGHT_GRAY || tbtn[7].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[7].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}
				select = 8;
			} else if (e.getSource() == tbtn[8]) {
				if(tbtn[8].getBackground() == Color.LIGHT_GRAY || tbtn[8].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[8].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}
				select = 9;
			} else if (e.getSource() == tbtn[9]) {
				if(tbtn[9].getBackground() == Color.LIGHT_GRAY || tbtn[9].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[9].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}
				select = 10;
			} else if (e.getSource() == tbtn[10]) {
				if(tbtn[10].getBackground() == Color.LIGHT_GRAY || tbtn[10].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[10].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}
				select = 11;
			} else if (e.getSource() == tbtn[11]) {
				if(tbtn[11].getBackground() == Color.LIGHT_GRAY || tbtn[11].getBackground() == Color.YELLOW){
					Clickbtn2.setEnabled(false);
					clk.setVisible(true);
				}
				else if(tbtn[11].getBackground() == Color.GREEN){
					Clickbtn2.setEnabled(true);
					clk.setVisible(true);
				}
				select = 12;
			}
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		new LastMission15();
	}
}