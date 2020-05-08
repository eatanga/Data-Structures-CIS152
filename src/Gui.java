
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Gui extends JPanel implements ActionListener  {
    private JButton okButton;
    private JButton exitButton;
    private JButton checkButton;
    private JTextField txtName;
    private JTextField txtPhone;
    private JTextField txtPple;
    private JLabel lblName;
    private JLabel lblPhone;
    private JLabel jcomp9;
    private JLabel lblTime;
    private JLabel lblHeader;
    private JButton cancelButton;
    private JButton statusButton;
    private JComboBox comboTime;

    public Gui() {
        //construct preComponents
        String[] comboTimeItems = {"10:00 AM", "11:00 AM", "12:00 PM", "01:00 PM", "02:00 PM", "03:00 PM", "04:00 PM", "05:00 PM", "06:00 PM", "07:00 PM", "08:00 PM", "09:00 PM", "10:00 PM"};

        //construct components
        okButton = new JButton ("Ok");
        exitButton = new JButton ("Exit");
        checkButton = new JButton ("Check Reservation");
        txtName = new JTextField (5);
        txtPhone = new JTextField (5);
        txtPple = new JTextField (5);
        lblName = new JLabel ("Name:");
        lblPhone = new JLabel ("Phone:");
        jcomp9 = new JLabel ("Number of People:");
        lblTime = new JLabel ("Time:");
        lblHeader = new JLabel ("Welcome! Make A Reservation");
        cancelButton = new JButton ("Cancel Reservation");
        statusButton = new JButton ("Seats Availability");
        comboTime = new JComboBox (comboTimeItems);

        //set components properties
        txtName.setToolTipText ("e.g John Doe");
        txtPhone.setToolTipText ("e.g 555-555-5555");
        txtPple.setToolTipText ("1-5");
        comboTime.setToolTipText ("select time");

        //adjust size and set layout
        setPreferredSize (new Dimension (752, 437));
        setLayout (null);

        //add components
        add (okButton);
        add (exitButton);
        add (checkButton);
        add (txtName);
        add (txtPhone);
        add (txtPple);
        add (lblName);
        add (lblPhone);
        add (jcomp9);
        add (lblTime);
        add (lblHeader);
        add (cancelButton);
        add (statusButton);
        add (comboTime);
        
        okButton.addActionListener(this);
        exitButton.addActionListener(this);
        

        //set component bounds (only needed by Absolute Positioning)
        okButton.setBounds (400, 110, 160, 50);
        exitButton.setBounds (400, 175, 160, 50);
        checkButton.setBounds (400, 245, 160, 50);
        txtName.setBounds (150, 110, 235, 30);
        txtPhone.setBounds (150, 155, 235, 30);
        txtPple.setBounds (150, 200, 235, 30);
        lblName.setBounds (100, 110, 100, 25);
        lblPhone.setBounds (95, 155, 100, 25);
        jcomp9.setBounds (30, 205, 110, 20);
        lblTime.setBounds (105, 245, 100, 25);
        lblHeader.setBounds (215, 50, 180, 30);
        cancelButton.setBounds (155, 295, 230, 45);
        statusButton.setBounds (155, 350, 230, 50);
        comboTime.setBounds (150, 245, 235, 30);
    }


    public static void main (String[] args) {
        JFrame frame = new JFrame ("Gui");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new Gui());
        frame.pack();
        frame.setVisible (true);
    }
    @Override
    public void actionPerformed(ActionEvent evt) {
       Customer c = new Customer();
       c.setName(txtName.getText());
       c.setPhone(txtPhone.getText());
       Reservation r = new Reservation();
      int sT= comboTime.getSelectedIndex();
       Table t = new Table();
       int size = Integer.parseInt(txtPple.getText());
       ReservationSystem rs = new ReservationSystem();
       rs.makeReservation(c,sT,size);
    }
    
}
