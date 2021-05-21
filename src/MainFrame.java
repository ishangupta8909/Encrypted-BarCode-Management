
import com.google.zxing.BarcodeFormat;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.Code128Writer;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Date;
import java.util.Properties;
import java.util.Random;
import java.util.Vector;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;


public class MainFrame extends javax.swing.JFrame {

    
    public MainFrame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        Home = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        AdminLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        AdminHome = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        addSecurityManager = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        SMLogin = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        SMHome = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        addItem = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel23 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jLabel24 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        searchItem = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        updateitem = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jTextField11 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jButton28 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jTextField13 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 460));
        getContentPane().setLayout(new java.awt.CardLayout());

        Home.setBackground(new java.awt.Color(0, 153, 255));
        Home.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Home.setMinimumSize(new java.awt.Dimension(610, 420));
        Home.setLayout(null);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/header.jpg"))); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(0, 0, 610, 110);

        Home.add(jPanel2);
        jPanel2.setBounds(0, 0, 610, 110);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setOpaque(true);
        jPanel3.add(jLabel4);
        jLabel4.setBounds(0, 0, 390, 300);

        Home.add(jPanel3);
        jPanel3.setBounds(0, 120, 390, 300);

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(null);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton1.setText("Admin");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1);
        jButton1.setBounds(30, 30, 170, 50);

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton2.setText("Security Manager");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2);
        jButton2.setBounds(30, 100, 170, 50);

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton3.setText("Get Info");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton3);
        jButton3.setBounds(30, 170, 170, 50);

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jButton4.setText("Exit");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton4);
        jButton4.setBounds(30, 240, 170, 50);

        Home.add(jPanel4);
        jPanel4.setBounds(400, 120, 210, 300);

        getContentPane().add(Home, "card2");

        AdminLogin.setBackground(new java.awt.Color(0, 153, 255));
        AdminLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AdminLogin.setMinimumSize(new java.awt.Dimension(620, 389));
        AdminLogin.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Barcode Security");
        AdminLogin.add(jLabel1);
        jLabel1.setBounds(250, 10, 140, 30);

        jTextField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        AdminLogin.add(jTextField1);
        jTextField1.setBounds(150, 180, 340, 30);

        jPasswordField1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });
        AdminLogin.add(jPasswordField1);
        jPasswordField1.setBounds(150, 250, 340, 30);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login_button.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        AdminLogin.add(jButton5);
        jButton5.setBounds(360, 300, 120, 30);

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        AdminLogin.add(jButton6);
        jButton6.setBounds(510, 50, 90, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        AdminLogin.add(jLabel5);
        jLabel5.setBounds(10, 40, 590, 310);

        getContentPane().add(AdminLogin, "card3");

        AdminHome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        AdminHome.setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/headerBanner.jpg"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 610, 110);

        AdminHome.add(jPanel1);
        jPanel1.setBounds(0, -1, 610, 110);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/02.jpg"))); // NOI18N
        jPanel5.add(jLabel6);
        jLabel6.setBounds(0, 0, 380, 310);

        AdminHome.add(jPanel5);
        jPanel5.setBounds(0, 110, 380, 310);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(null);

        jButton7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton7.setText("Add Security Manager");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton7);
        jButton7.setBounds(20, 10, 180, 40);

        jButton8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton8.setText("View Security Manager");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton8);
        jButton8.setBounds(20, 60, 180, 40);

        jButton9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton9.setText("Search Security Manager");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton9);
        jButton9.setBounds(20, 160, 180, 40);

        jButton10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton10.setText("Change Password");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10);
        jButton10.setBounds(20, 210, 180, 40);

        jButton11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton11.setText("Logout");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton11);
        jButton11.setBounds(20, 260, 180, 40);

        jButton12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton12.setText("Remove Security Manager");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton12);
        jButton12.setBounds(20, 110, 180, 40);

        AdminHome.add(jPanel6);
        jPanel6.setBounds(390, 110, 220, 310);

        getContentPane().add(AdminHome, "card4");

        addSecurityManager.setBackground(new java.awt.Color(0, 153, 255));
        addSecurityManager.setLayout(null);

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/headerBanner.jpg"))); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel7.add(jLabel7);
        jLabel7.setBounds(0, 0, 610, 110);

        addSecurityManager.add(jPanel7);
        jPanel7.setBounds(0, 0, 610, 110);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel8.setText("Add Security Manager");
        jPanel8.add(jLabel8);
        jLabel8.setBounds(110, 10, 180, 23);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Name");
        jPanel8.add(jLabel9);
        jLabel9.setBounds(10, 40, 40, 20);

        jTextField2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel8.add(jTextField2);
        jTextField2.setBounds(100, 40, 240, 23);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setText("Gender");
        jPanel8.add(jLabel10);
        jLabel10.setBounds(10, 70, 50, 20);

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButton1.setText("Male");
        jPanel8.add(jRadioButton1);
        jRadioButton1.setBounds(100, 70, 60, 25);

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jRadioButton2.setText("Female");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel8.add(jRadioButton2);
        jRadioButton2.setBounds(170, 70, 93, 25);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setText("DOB");
        jPanel8.add(jLabel11);
        jLabel11.setBounds(10, 110, 30, 20);

        jTextField3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel8.add(jTextField3);
        jTextField3.setBounds(100, 110, 240, 23);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel12.setText("Contact");
        jPanel8.add(jLabel12);
        jLabel12.setBounds(10, 150, 50, 20);

        jTextField4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel8.add(jTextField4);
        jTextField4.setBounds(100, 150, 240, 23);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setText("Email ID");
        jPanel8.add(jLabel13);
        jLabel13.setBounds(10, 190, 60, 20);

        jTextField5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel8.add(jTextField5);
        jTextField5.setBounds(100, 190, 240, 23);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel14.setText("Address");
        jPanel8.add(jLabel14);
        jLabel14.setBounds(10, 220, 50, 20);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel8.add(jScrollPane1);
        jScrollPane1.setBounds(100, 220, 240, 50);

        jButton13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton13.setText("GO");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton13);
        jButton13.setBounds(100, 280, 100, 25);

        jButton14.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton14.setText("Exit");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel8.add(jButton14);
        jButton14.setBounds(230, 280, 110, 25);

        addSecurityManager.add(jPanel8);
        jPanel8.setBounds(120, 110, 400, 310);

        getContentPane().add(addSecurityManager, "card5");

        SMLogin.setBackground(new java.awt.Color(0, 125, 255));
        SMLogin.setLayout(null);

        jTextField6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SMLogin.add(jTextField6);
        jTextField6.setBounds(150, 200, 340, 30);

        jPasswordField2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        SMLogin.add(jPasswordField2);
        jPasswordField2.setBounds(150, 270, 340, 30);

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login_button.png"))); // NOI18N
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        SMLogin.add(jButton15);
        jButton15.setBounds(370, 320, 110, 20);

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        jButton16.setText("jButton16");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        SMLogin.add(jButton16);
        jButton16.setBounds(520, 70, 80, 30);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login.png"))); // NOI18N
        jLabel17.setText("jLabel17");
        SMLogin.add(jLabel17);
        jLabel17.setBounds(10, 70, 590, 290);

        getContentPane().add(SMLogin, "card6");

        SMHome.setLayout(null);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setLayout(null);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/headerBanner.jpg"))); // NOI18N
        jPanel9.add(jLabel15);
        jLabel15.setBounds(0, 4, 610, 110);

        SMHome.add(jPanel9);
        jPanel9.setBounds(0, 0, 610, 110);

        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setLayout(null);

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/02.jpg"))); // NOI18N
        jPanel10.add(jLabel16);
        jLabel16.setBounds(0, 0, 360, 310);

        SMHome.add(jPanel10);
        jPanel10.setBounds(0, 110, 360, 310);

        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setLayout(null);

        jButton17.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton17.setText("Generate Barcode");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton17);
        jButton17.setBounds(30, 10, 190, 40);

        jButton18.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton18.setText("Search Barcode");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton18);
        jButton18.setBounds(30, 60, 190, 40);

        jButton19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton19.setText("Update");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton19);
        jButton19.setBounds(30, 110, 190, 40);

        jButton20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton20.setText("Delete");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton20);
        jButton20.setBounds(30, 160, 190, 40);

        jButton21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton21.setText("Change Password");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton21);
        jButton21.setBounds(30, 210, 190, 40);

        jButton22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton22.setText("Logout");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel11.add(jButton22);
        jButton22.setBounds(30, 260, 190, 40);

        SMHome.add(jPanel11);
        jPanel11.setBounds(360, 110, 250, 310);

        getContentPane().add(SMHome, "card7");

        addItem.setBackground(new java.awt.Color(0, 125, 255));
        addItem.setLayout(null);

        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setLayout(null);

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/headerBanner.jpg"))); // NOI18N
        jPanel12.add(jLabel18);
        jLabel18.setBounds(0, 0, 610, 100);

        addItem.add(jPanel12);
        jPanel12.setBounds(0, 0, 610, 100);

        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel13.setLayout(null);

        jLabel19.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel19.setText("Item");
        jPanel13.add(jLabel19);
        jLabel19.setBounds(20, 10, 40, 20);

        jTextField7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel13.add(jTextField7);
        jTextField7.setBounds(130, 10, 190, 23);

        jLabel20.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel20.setText("Quantity");
        jPanel13.add(jLabel20);
        jLabel20.setBounds(20, 50, 60, 17);

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel21.setText("Return Date");
        jPanel13.add(jLabel21);
        jLabel21.setBounds(20, 160, 80, 17);

        jLabel22.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel22.setText("Status");
        jPanel13.add(jLabel22);
        jLabel22.setBounds(20, 90, 50, 20);

        buttonGroup2.add(jCheckBox1);
        jCheckBox1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCheckBox1.setText("IN");
        jPanel13.add(jCheckBox1);
        jCheckBox1.setBounds(130, 90, 50, 25);

        buttonGroup2.add(jCheckBox2);
        jCheckBox2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCheckBox2.setText("OUT");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jPanel13.add(jCheckBox2);
        jCheckBox2.setBounds(240, 90, 60, 25);

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel23.setText("State");
        jPanel13.add(jLabel23);
        jLabel23.setBounds(20, 120, 40, 17);

        buttonGroup3.add(jCheckBox3);
        jCheckBox3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCheckBox3.setText("Temp");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        jPanel13.add(jCheckBox3);
        jCheckBox3.setBounds(130, 120, 60, 25);

        buttonGroup3.add(jCheckBox4);
        jCheckBox4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jCheckBox4.setText("Permanent");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jPanel13.add(jCheckBox4);
        jCheckBox4.setBounds(240, 120, 100, 25);

        jLabel24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel24.setText("Owner");
        jPanel13.add(jLabel24);
        jLabel24.setBounds(20, 200, 50, 20);

        jTextField8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel13.add(jTextField8);
        jTextField8.setBounds(130, 50, 190, 23);

        jTextField9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel13.add(jTextField9);
        jTextField9.setBounds(130, 200, 190, 23);

        jButton23.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton23.setText("Add");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton23);
        jButton23.setBounds(130, 250, 60, 25);

        jButton24.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton24.setText("Exit");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel13.add(jButton24);
        jButton24.setBounds(250, 250, 60, 25);
        jPanel13.add(jTextField12);
        jTextField12.setBounds(130, 160, 190, 22);

        addItem.add(jPanel13);
        jPanel13.setBounds(80, 100, 420, 320);

        getContentPane().add(addItem, "card8");

        searchItem.setBackground(new java.awt.Color(0, 125, 255));
        searchItem.setLayout(null);

        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel14.setLayout(null);

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/headerBanner.jpg"))); // NOI18N
        jPanel14.add(jLabel25);
        jLabel25.setBounds(0, -6, 610, 110);

        searchItem.add(jPanel14);
        jPanel14.setBounds(0, 0, 610, 100);

        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setLayout(null);

        jLabel26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel26.setText("Scan & Search Barcode");
        jPanel15.add(jLabel26);
        jLabel26.setBounds(110, 30, 210, 22);
        jPanel15.add(jTextField10);
        jTextField10.setBounds(40, 80, 330, 30);

        jButton25.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton25.setText("Search");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton25);
        jButton25.setBounds(160, 140, 110, 50);

        jButton26.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton26.setText("<<");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton26);
        jButton26.setBounds(10, 230, 60, 25);

        searchItem.add(jPanel15);
        jPanel15.setBounds(110, 130, 410, 260);

        getContentPane().add(searchItem, "card9");

        updateitem.setBackground(new java.awt.Color(0, 125, 255));
        updateitem.setLayout(null);

        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.setLayout(null);

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/headerBanner.jpg"))); // NOI18N
        jPanel17.add(jLabel27);
        jLabel27.setBounds(0, 0, 610, 100);

        updateitem.add(jPanel17);
        jPanel17.setBounds(0, 0, 610, 100);

        jPanel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel18.setLayout(null);
        jPanel18.add(jTextField11);
        jTextField11.setBounds(200, 60, 240, 30);

        jLabel28.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel28.setText("Barcode");
        jPanel18.add(jLabel28);
        jLabel28.setBounds(90, 60, 70, 17);

        jLabel29.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel29.setText("Status");
        jPanel18.add(jLabel29);
        jLabel29.setBounds(90, 100, 50, 17);

        jLabel30.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel30.setText("State");
        jPanel18.add(jLabel30);
        jLabel30.setBounds(90, 130, 40, 17);

        jLabel31.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel31.setText("Return Date");
        jPanel18.add(jLabel31);
        jLabel31.setBounds(80, 200, 80, 20);

        jButton27.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton27.setText("UPDATE");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton27);
        jButton27.setBounds(210, 250, 180, 40);

        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setText("Update Entry");
        jPanel18.add(jLabel32);
        jLabel32.setBounds(210, 10, 170, 30);

        jButton28.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton28.setText("<<");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel18.add(jButton28);
        jButton28.setBounds(0, 300, 60, 20);

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "IN", "OUT" }));
        jPanel18.add(jComboBox1);
        jComboBox1.setBounds(200, 100, 240, 23);

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "TEMP", "PERMANENT" }));
        jPanel18.add(jComboBox2);
        jComboBox2.setBounds(200, 130, 240, 23);
        jPanel18.add(jTextField13);
        jTextField13.setBounds(200, 192, 240, 30);

        updateitem.add(jPanel18);
        jPanel18.setBounds(40, 100, 520, 320);

        getContentPane().add(updateitem, "card10");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Home.setVisible(false);
        AdminLogin.setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

        AdminLogin.setVisible(false);
        Home.setVisible(true);
        
        
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        String id=jTextField1.getText();
        String password=jPasswordField1.getText();
        try {
           Class.forName("com.mysql.jdbc.Driver");
            Connection con=   DriverManager.getConnection("jdbc:mysql://localhost:3306/barcodeSecurity","root","");
              Statement stmt=  con.createStatement();
               ResultSet rs=  stmt.executeQuery("select * from admin");   
            boolean valid=false;
               while(rs.next())
            {
            if(rs.getString(1).equalsIgnoreCase(id) && rs.getString(2).equals(password))
            {
            valid=true;
            }
            
            }
            if(valid==true)
            {
            Home.setVisible(false);
            AdminLogin.setVisible(false);
            AdminHome.setVisible(true);
            
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid User");
                jTextField1.setText("");
                jPasswordField1.setText("");
            }
            
        } catch (Exception e) {
      
            JOptionPane.showMessageDialog(null,e.getMessage());
            jTextField1.setText("");
                jPasswordField1.setText("");
            
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        jTextField1.setText("");
        jPasswordField1.setText("");
        
       AdminHome.setVisible(false);
        AdminLogin.setVisible(false);
        Home.setVisible(true);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        
        
        String cpass=JOptionPane.showInputDialog("Enter Current Password");
        
        try{
         Class.forName("com.mysql.jdbc.Driver");
            Connection con=   DriverManager.getConnection("jdbc:mysql://localhost:3306/barcodeSecurity","root","");
              Statement stmt=  con.createStatement();
               ResultSet rs=  stmt.executeQuery("select * from admin where id='admin'");   
          boolean valid=false;
          while(rs.next())
          {
          if(cpass.equals(rs.getString(2)))
          {
          valid=true;
          }
          }
          if(valid==true)
          {
          String npass=JOptionPane.showInputDialog("Enter New Password");
          stmt.executeUpdate("update admin set password='"+npass+"' where id='admin'");
          JOptionPane.showMessageDialog(null, "Password Changed");
          }
        else
          {
          JOptionPane.showMessageDialog(null, "Invalid Password");
          }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        System.exit(1);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

         AdminHome.setVisible(false);
        AdminLogin.setVisible(false);
        Home.setVisible(false);
        addSecurityManager.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed

         AdminHome.setVisible(true);
        AdminLogin.setVisible(false);
        Home.setVisible(false);
        addSecurityManager.setVisible(false);
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
String name=jTextField2.getText();
String gender=null;
if(jRadioButton1.isSelected()==true)
{
gender="Male";
}
if(jRadioButton2.isSelected()==true)
{
gender="Female";
}

        Random r=new Random();
     int password=   r.nextInt(10000);

  String dob=jTextField3.getText();
  String contact =jTextField4.getText();
  String email=jTextField5.getText();
  String address=jTextArea1.getText();
     Boolean done=false;   
try{

   Class.forName("com.mysql.jdbc.Driver");
            Connection con=   DriverManager.getConnection("jdbc:mysql://localhost:3306/barcodeSecurity","root","");
              Statement stmt=  con.createStatement();
          stmt.executeUpdate("insert into securitymanager(name,gender,dob,contact,email,address,password) values('"+name+"','"+gender+"','"+dob+"','"+contact+"','"+email+"','"+address+"','"+password+"')");
done=true;
          
jTextField2.setText("");
jTextField3.setText("");
jTextField4.setText("");
jTextField5.setText("");
jTextArea1.setText("");


}
catch(Exception e)
{
JOptionPane.showMessageDialog(null, e.getMessage());
}
        if(done==true)
        {
            String uid=null;
        try{
        
        
   Class.forName("com.mysql.jdbc.Driver");
            Connection con=   DriverManager.getConnection("jdbc:mysql://localhost:3306/barcodeSecurity","root","");
              Statement stmt=  con.createStatement();
       ResultSet rs=stmt.executeQuery("select id from securitymanager where email='"+email+"'");
    while(rs.next())
    {
    uid=rs.getString(1);
    }
        
        }
        catch(Exception e)
        {}
        
		final String Ausername = "ishangupta8909@gmail.com";
		final String Apassword = "ishan08092000";
 
		Properties props = new Properties();
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
 
 
 
 Authenticator auth=new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(Ausername, Apassword);
			}
 };
 

 
 
		Session session = Session.getInstance(props,auth);
		try {
 
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("AUsername"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(email));
			message.setSubject("Welcome InBarcode Security");
			message.setText("Dear '"+name+"',"
				+ "\n\n Congo , Now You Are Employee Of Barcode Security"+"\n"+
                                "Authentication Info "+"\n"+
                                "User ID = '"+uid+"'"+" \n"+
                                "Password ='"+password+"'"+"\n"
                                +"Regards,"+"\n"+
                                "Barcode Security Team.");
 
			Transport.send(message);
 JOptionPane.showMessageDialog(null, "Security Manager Created, Mail has been sent to Security Manager");
			System.out.println("Done");
 
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
        
        
        
        }
        
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

         try {
            Vector column=new Vector();
            Vector data=new Vector();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/barcodesecurity","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from securitymanager");
            ResultSetMetaData md=rs.getMetaData();
            int noc=md.getColumnCount();
            for(int i=1;i<=noc;i++)
            {
                column.add(md.getColumnName(i));
            }
            while(rs.next())
            {
                Vector row=new Vector();
                for(int i=1;i<=noc;i++)
                {
                    row.add(rs.getString(i));
                }
                data.add(row);
                
            }
            JTable tb=new JTable(data,column);
            tb.setEnabled(false);
            JScrollPane pane=new JScrollPane(tb);
            JFrame f=new JFrame();
            f.add(pane);
            f.pack();
            f.setVisible(true);
        }
        
             catch (Exception e) {
       JOptionPane.showMessageDialog(null, e.getMessage());
        
             }
        
        
        
        
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed

        String id=JOptionPane.showInputDialog("Enter SM_Id");
        try{
       Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/barcodesecurity","root","");
            Statement stmt=con.createStatement();
            stmt.executeUpdate("delete from securitymanager where id='"+id+"'");
        JOptionPane.showMessageDialog(null, "Deleted");
        
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

        String id=JOptionPane.showInputDialog( "Enter ID");
           try {
            Vector column=new Vector();
            Vector data=new Vector();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/barcodesecurity","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from securitymanager where id='"+id+"'");
            ResultSetMetaData md=rs.getMetaData();
            int noc=md.getColumnCount();
            for(int i=1;i<=noc;i++)
            {
                column.add(md.getColumnName(i));
            }
            while(rs.next())
            {
                Vector row=new Vector();
                for(int i=1;i<=noc;i++)
                {
                    row.add(rs.getString(i));
                }
                data.add(row);
                
            }
            JTable tb=new JTable(data,column);
            tb.setEnabled(false);
            JScrollPane pane=new JScrollPane(tb);
            JFrame f=new JFrame();
            f.add(pane);
            f.pack();
            f.setVisible(true);
        }
        
             catch (Exception e) {
       JOptionPane.showMessageDialog(null, e.getMessage());
        
             }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed

    
         AdminHome.setVisible(false);
        AdminLogin.setVisible(false);
        Home.setVisible(true);
        addSecurityManager.setVisible(false);
        SMLogin.setVisible(false);
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton16ActionPerformed
String smid=null;
    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed

        
      
        String id=jTextField6.getText();
        String password=jPasswordField2.getText();
        try {
           Class.forName("com.mysql.jdbc.Driver");
            Connection con=   DriverManager.getConnection("jdbc:mysql://localhost:3306/barcodeSecurity","root","");
              Statement stmt=  con.createStatement();
               ResultSet rs=  stmt.executeQuery("select id,password from securitymanager");   
            boolean valid=false;
               while(rs.next())
            {
            if(rs.getString(1).equalsIgnoreCase(id) && rs.getString(2).equals(password))
            {
                smid=rs.getString(1);
            valid=true;
            }
            
            }
            if(valid==true)
            {
         AdminHome.setVisible(false);
        AdminLogin.setVisible(false);
        Home.setVisible(false);
        addSecurityManager.setVisible(false);
        SMLogin.setVisible(false);
        SMHome.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid User");
            }
            
        } catch (Exception e) {
      
            JOptionPane.showMessageDialog(null,e.getMessage());
            
        }

        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

           AdminHome.setVisible(false);
        AdminLogin.setVisible(false);
        Home.setVisible(false);
        addSecurityManager.setVisible(false);
        SMLogin.setVisible(true);
        SMHome.setVisible(false);
      
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
smid=null;
           AdminHome.setVisible(false);
        AdminLogin.setVisible(false);
        Home.setVisible(true);
        addSecurityManager.setVisible(false);
        SMLogin.setVisible(false);
        SMHome.setVisible(false);
      
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed

       
        
        
        String cpass=JOptionPane.showInputDialog("Enter Current Password");
        
        try{
         Class.forName("com.mysql.jdbc.Driver");
            Connection con=   DriverManager.getConnection("jdbc:mysql://localhost:3306/barcodeSecurity","root","");
              Statement stmt=  con.createStatement();
               ResultSet rs=  stmt.executeQuery("select password from securitymanager where id='"+smid+"'");   
          boolean valid=false;
          while(rs.next())
          {
          if(cpass.equals(rs.getString(1)))
          {
          valid=true;
          }
          }
          if(valid==true)
          {
          String npass=JOptionPane.showInputDialog("Enter New Password");
          stmt.executeUpdate("update securitymanager set password='"+npass+"' where id='"+smid+"'");
          JOptionPane.showMessageDialog(null, "Password Changed");
          }
        else
          {
          JOptionPane.showMessageDialog(null, "Invalid Password");
          }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed

           AdminHome.setVisible(false);
        AdminLogin.setVisible(false);
        Home.setVisible(false);
        addSecurityManager.setVisible(false);
        SMLogin.setVisible(false);
        SMHome.setVisible(false);
      addItem.setVisible(true);
        
    
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
AdminHome.setVisible(false);
        AdminLogin.setVisible(false);
        Home.setVisible(false);
        addSecurityManager.setVisible(false);
        SMLogin.setVisible(false);
        SMHome.setVisible(false);
      addItem.setVisible(false);
        searchItem.setVisible(true);
    
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed

        String barcode=JOptionPane.showInputDialog("Enter Barcode");
        try{
         Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/barcodesecurity","root","");
            Statement stmt=con.createStatement();
     stmt.executeUpdate("delete from item where barcode='"+barcode+"'");
        JOptionPane.showMessageDialog(null,"Deleted");
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed

        if(jCheckBox4.isSelected()==true)
        {
        jTextField12.setEnabled(false);
        
        }
                if(jCheckBox4.isSelected()!=true)
        {
        jTextField12.setEnabled(true);
        
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
  AdminHome.setVisible(false);
        AdminLogin.setVisible(false);
        Home.setVisible(false);
        addSecurityManager.setVisible(false);
        SMLogin.setVisible(false);
        SMHome.setVisible(true);
      addItem.setVisible(false);
             
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
JLabel l=null;
         class opr implements Printable, ActionListener
        {

        @Override
        public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void actionPerformed(ActionEvent e) {
       
            PrinterJob pj=PrinterJob.getPrinterJob();
            pj.setPrintable(this);
              boolean ok=  pj.printDialog();
            if(ok)
            {
            try{
           
            
            }
            catch(Exception ee)
            {
            
            JOptionPane.showMessageDialog(null, ee.getMessage());
            
            }
            
            }
        
        }
        
        
        }
        opr ob=new opr();
        String item=jTextField7.getText();
String quantity=jTextField8.getText();
String status=null;
if(jCheckBox1.isSelected()==true)
{
status="IN";
}
if(jCheckBox2.isSelected()==true)
{
status="OUT";
}
   String state=null;
   if(jCheckBox3.isSelected()==true)
   {
   
   state="TEMP";
   }
   if(jCheckBox4.isSelected()==true)
   {
   
   state="PERMANENT";
   }     
   String rdate=jTextField12.getText();
   if(rdate==null)
   {
   rdate="N/A";
   }
   String owner=jTextField9.getText();
   Date d=new Date();
     String tdate= d.getDate()+"/"+d.getMonth()+"/"+d.getYear();
Random r=new Random();
  int b=  r.nextInt(9999);
String barcode=Integer.toString(b);
        try{
   Class.forName("com.mysql.jdbc.Driver");
            Connection con=   DriverManager.getConnection("jdbc:mysql://localhost:3306/barcodeSecurity","root","");
          String q="insert into item(name,quantity,status,state,tdate,rdate,owner,barcode) values(?,?,?,?,?,?,?,?)";
             PreparedStatement ps= con.prepareStatement(q);
          ps.setString(1, item);
           ps.setString(2, quantity);
           ps.setString(3, status);
           ps.setString(4, state);
           ps.setString(5, tdate);
           ps.setString(6, rdate);
           ps.setString(7, owner);
           ps.setString(8, barcode);
           ps.executeUpdate();
          
            BitMatrix bit=new Code128Writer().encode(barcode, BarcodeFormat.CODE_128, 150, 80,null);
            MatrixToImageWriter.writeToStream(bit,"png",new FileOutputStream("Temp.png"));
           JFrame frame=new JFrame("Barcode");
           l=new JLabel(new ImageIcon("Temp.png"));
        JButton b1=new JButton("Print");
        
        b1.addActionListener(ob);
          
           frame.add(l);
        frame.pack();
        frame.setVisible(true);
       
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
   if(jCheckBox3.isSelected()==true)
        {
        jTextField12.setEnabled(true);
        
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed

        String barcode=jTextField10.getText();
try {
            Vector column=new Vector();
            Vector data=new Vector();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/barcodesecurity","root","");
            Statement stmt=con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from item where barcode='"+barcode+"'");
            ResultSetMetaData md=rs.getMetaData();
            int noc=md.getColumnCount();
            for(int i=1;i<=noc;i++)
            {
                column.add(md.getColumnName(i));
            }
            while(rs.next())
            {
                Vector row=new Vector();
                for(int i=1;i<=noc;i++)
                {
                    row.add(rs.getString(i));
                }
                data.add(row);
                
            }
            JTable tb=new JTable(data,column);
            tb.setEnabled(false);
            JScrollPane pane=new JScrollPane(tb);
            JFrame f=new JFrame();
            f.add(pane);
            f.pack();
            f.setVisible(true);
            jTextField10.setText("");
            
        }
        
             catch (Exception e) {
       JOptionPane.showMessageDialog(null, e.getMessage());
        jTextField10.setText("");
            
        
             }        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
AdminHome.setVisible(false);
        AdminLogin.setVisible(false);
        Home.setVisible(false);
        addSecurityManager.setVisible(false);
        SMLogin.setVisible(false);
        SMHome.setVisible(true);
      addItem.setVisible(false);
      searchItem.setVisible(false);
        
    
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
AdminHome.setVisible(false);
        AdminLogin.setVisible(false);
        Home.setVisible(false);
        addSecurityManager.setVisible(false);
        SMLogin.setVisible(false);
        SMHome.setVisible(false);
      addItem.setVisible(false);
        updateitem.setVisible(true);
    
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed

        AdminHome.setVisible(false);
        AdminLogin.setVisible(false);
        Home.setVisible(false);
        addSecurityManager.setVisible(false);
        SMLogin.setVisible(false);
        SMHome.setVisible(true);
      addItem.setVisible(false);
        updateitem.setVisible(false);
    
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed

        String barcode=jTextField11.getText();
String status=(String)jComboBox1.getSelectedItem();
String state=(String)jComboBox2.getSelectedItem();
String rdate=jTextField13.getText();
try{
 Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/barcodesecurity","root","");
            Statement stmt=con.createStatement();
           stmt.executeUpdate("update item set status='"+status+"',state='"+state+"',rdate='"+rdate+"' where barcode='"+barcode+"'");
           JOptionPane.showMessageDialog(null, "Updated");
jTextField11.setText("");


jTextField13.setText("");
}
catch(Exception e)
{
JOptionPane.showMessageDialog(null, e);
jTextField11.setText("");


jTextField13.setText("");
}
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AdminHome.setVisible(false);
        AdminLogin.setVisible(false);
        Home.setVisible(false);
        getInfo.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AdminHome;
    private javax.swing.JPanel AdminLogin;
    private javax.swing.JPanel Home;
    private javax.swing.JPanel SMHome;
    private javax.swing.JPanel SMLogin;
    private javax.swing.JPanel addItem;
    private javax.swing.JPanel addSecurityManager;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JPanel searchItem;
    private javax.swing.JPanel updateitem;
    // End of variables declaration//GEN-END:variables
}
