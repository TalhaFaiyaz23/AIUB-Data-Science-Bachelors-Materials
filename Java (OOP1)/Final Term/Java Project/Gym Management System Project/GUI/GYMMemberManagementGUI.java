package GUI;
import Entity.*;
import File.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GYMMemberManagementGUI extends JFrame implements ActionListener {

    Font font25 = new Font("Times New Roman", Font.BOLD , 25);
    Font font22 = new Font("Times New Roman", Font.BOLD , 22);
    Font font18 = new Font("Times New Roman", Font.BOLD , 18);
    Font font15 = new Font("Times New Roman" ,Font.BOLD , 15);
    JTextArea screen;
    JLabel background, title1 ,title2,title3, memberID , name ,age , phoneNumber , payment , trainerName , removeMembership ,gender,shift;
    JTextField textFieldMemberID, textFieldName , textFieldPhoneNumber , textFieldAge, textFieldPayment, searchMember, textFieldTrainerName,textFieldEnterMamberID, removeMember ;
    JButton resister, clear1 ,clear2,update, remove, show,search,hide,dark,light;
    Cursor cursor ;
    JScrollPane scroll;
    JRadioButton male , female;
    ButtonGroup bGroup;
    JComboBox comboBox;
    String[] selectShift = {"6:00AM - 8:00PM", "8:00AM - 10:00AM" , "10:00AM - 12:00PM" ,"4:00PM - 6:00PM","6:00PM - 8:00PM","8:00PM - 10:00PM" };
    ImageIcon  bg,searchImage,hideImage,showImage,registerImage,updateImage,removeImage,clearImage,lightImage,darkImage;

    public GYMMemberManagementGUI(){

        setSize(1000,700);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("GYM Membership Management");
        setResizable(false);
        this.setIconImage(new ImageIcon(getClass().getResource("/Images/icon.png")).getImage());
        setLayout(null);
        creatTextArea();

        //Jlabels
        title1 = creatJLabelTitle(400,10,160,30 ,"ICONIC GYM");
        title1.setForeground(Color.RED);
        title2 = creatJLabelTitle(10,50,240,30 ,"Resister New Member ");
        memberID = creatJLabel(10 ,90 , 140 , 30, "Member ID:" );
        name = creatJLabel(10 ,130 , 140 , 30, "Name:" );
        age = creatJLabel(10 ,170 , 140 , 30, "Age:" );
        phoneNumber = creatJLabel(10 ,210 , 140 , 30, "Phone Number:" );
        payment = creatJLabel(10 ,250 , 140 , 30, "Payment:" );
        gender = creatJLabel(10 ,290 , 140 , 30, "Select Gender:" );
        shift = creatJLabel(10 ,330 , 140 , 30, "Set Shift:" );
        title3 = creatJLabelTitle(10 ,410 , 170 , 30, "Assign Trainer" );
        memberID = creatJLabel(10 ,450 , 140 , 30, "Member ID:" );
        trainerName = creatJLabel(10 ,490 , 140 , 30, "Trainer Name:" );
        removeMembership = creatJLabelTitle(10 ,570 , 230 , 30, "Remove Membership" );
        memberID = creatJLabel(10 ,610 , 140 , 30, "Member ID:" );

        //JTextField
        textFieldMemberID = createTextField(180,90,140,30 );
        searchMember = createTextField(790,50,140,30 );
        textFieldName = createTextField(180,130,140,30 );
        textFieldAge = createTextField(180,170,140,30 );
        textFieldPhoneNumber = createTextField(180,210,140,30 );
        textFieldPayment = createTextField(180,250,140,30 );
        textFieldEnterMamberID = createTextField(180,450,140,30);
        textFieldTrainerName = createTextField(180,490,140,30);
        removeMember = createTextField(180,610,140,30 );

        //JButton
        search = creatJButton(940 , 50 , 30 ,30 , "");
        searchImage = new ImageIcon(getClass().getResource("/Images/search.png"));
        search.setIcon(searchImage);
        resister = creatJButton(180 , 370 , 140 ,30 , "");
        registerImage = new ImageIcon(getClass().getResource("/Images/register.png"));
        resister.setIcon(registerImage);
        clear1 = creatJButton(10 , 370 , 80 ,30 , "");
        clearImage = new ImageIcon(getClass().getResource("/Images/clear.png"));
        clear1.setIcon(clearImage);
        clear2 = creatJButton(10 , 530 , 80 ,30 , "");
        clearImage = new ImageIcon(getClass().getResource("/Images/clear.png"));
        clear2.setIcon(clearImage);
        update = creatJButton(180 , 530 , 140 ,30 , "");
        updateImage = new ImageIcon(getClass().getResource("/Images/update.png"));
        update.setIcon(updateImage);
        remove = creatJButton(350 , 610 , 100 ,30 , "");
        removeImage = new ImageIcon(getClass().getResource("/Images/remove.png"));
        remove.setIcon(removeImage);
        show = creatJButton(500 , 610 , 100 ,30 , "");
        showImage = new ImageIcon(getClass().getResource("/Images/show.png"));
        show.setIcon(showImage);
        hide = creatJButton(610 , 610 , 40 ,30 , "");
        hideImage = new ImageIcon(getClass().getResource("/Images/hide.png"));
        hide.setIcon(hideImage);
        light = creatJButton(900 , 610 , 30 ,30 , "");
        lightImage = new ImageIcon(getClass().getResource("/Images/light.png"));
        light.setIcon(lightImage);
        dark = creatJButton(940 , 610 , 30 ,30 , "");
        darkImage = new ImageIcon(getClass().getResource("/Images/dark.png"));
        dark.setIcon(darkImage);

        //radio buttom
        bGroup = new ButtonGroup();
        male = creatRadioButton(180,289,62,30,"Male");
        female = creatRadioButton(240,289,80,30,"Female");

        //cursor
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        search.setCursor(cursor);
        resister.setCursor(cursor);
        clear1.setCursor(cursor);
        clear2.setCursor(cursor);
        remove.setCursor(cursor);
        male.setCursor(cursor);
        female.setCursor(cursor);
        hide.setCursor(cursor);
        show.setCursor(cursor);

        //combobox
        creatingComboBox();

        //background image
        bg = new ImageIcon(getClass().getResource("/Images/background.jpg"));
        background = new JLabel(bg);
        background.setBounds(0,0,1000,700);
        background.setOpaque(false);
        this.add(background);

        screen.setText(FileIO.readAllMembers());
        setVisible(true);
    }

    //JTextArea
    public void creatTextArea(){
        screen = new JTextArea();
        screen.setEditable(false);
        this.add(screen);
        screen.setBackground(new Color(34,40,49));
        screen.setForeground(Color.WHITE);
        screen.setFont(font22);
        scroll = new JScrollPane(screen);
        scroll.setBounds(350,90,620,510);
        this.add(scroll);
    }
    //JLabel method
    public JLabel creatJLabel (int x, int y, int w,int h, String text){
        JLabel label = new JLabel(text);
        label.setBounds(x,y,w,h);
//        label.setOpaque(true);
//        label.setBackground(Color.RED);
        label.setFont(font18);
        label.setForeground(Color.WHITE);
        this.add(label);
        return label;
    }
    //JLabelTitle
    public JLabel creatJLabelTitle (int x, int y, int w,int h, String text){
        JLabel label = new JLabel(text);
        label.setBounds(x,y,w,h);
//        label.setOpaque(true);
//        label.setBackground(Color.RED);
        label.setFont(font25);
        label.setForeground(new Color(240,255,66));
        this.add(label);
        return label;
    }

    //jTextField method
    public JTextField createTextField(int x, int y, int w,int h){
        JTextField textField = new JTextField();
        textField.setBounds(x,y,w,h);
        this.add(textField);
        textField.setFont(font15);
        textField.setBackground(new Color(34,40,49));
        textField.setForeground(Color.WHITE);
        return textField;
    }

    //JButton Method
    public JButton creatJButton (int x, int y, int w,int h, String text){
        JButton button = new JButton(text);
        button.setBounds(x,y,w,h);
        this.add(button);
        button.addActionListener(this);
        return button;
    }

    //Radio Button method
    public JRadioButton creatRadioButton(int x,int y,int w,int h,String text){
        JRadioButton radioButton = new JRadioButton(text);
        radioButton.setBounds(x,y,w,h);
//        radioButton.setOpaque(true);
//        radioButton.setBackground(Color.BLUE);
        radioButton.setFont(font15);
        bGroup.add(radioButton);
        radioButton.setBackground(new Color(34,40,49));
        radioButton.setForeground(Color.WHITE);
        this.add(radioButton);
        return radioButton;

    }

    //ComboBox method
    public void creatingComboBox(){
        comboBox = new JComboBox(selectShift);
        comboBox.setBounds(180,330,140,30);
        comboBox.setEditable(false);
        comboBox.setBackground(new Color(34,40,49));
        comboBox.setForeground(Color.WHITE);
        this.add(comboBox);
    }

    public static void main(String[] args) {
        GYMMemberManagementGUI frame = new GYMMemberManagementGUI();
    }

    //ActionListener
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == resister){
            if (e.getSource() == resister) {
                String id = textFieldMemberID.getText();
                String name = textFieldName.getText();
                String phone = textFieldPhoneNumber.getText();
                String ageText = textFieldAge.getText();
                String paymentText = textFieldPayment.getText();
                String gender = male.isSelected() ? "Male" : (female.isSelected() ? "Female" : "");
                String shift = (String) comboBox.getSelectedItem();

                if (id.isEmpty() || name.isEmpty() || phone.isEmpty() || ageText.isEmpty() || paymentText.isEmpty() || gender.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Please fill all fields.");
                    return;
                }
                try {
                    int age = Integer.parseInt(ageText);
                    double payment = Double.parseDouble(paymentText);

                    Member member = new Member(id, name, age, phone, gender, shift, payment);
                    System.out.println("Register button clicked. Saving member...");
                    FileIO.saveMember(member);

                    screen.append("Member Registered:\n" + member.getDetails() + "\n\n");

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Invalid age or payment format.");
                }
            }

        }else if(e.getSource() == clear1){
            textFieldMemberID.setText("");
            textFieldName.setText("");
            textFieldPhoneNumber.setText("");
            textFieldAge.setText("");
            textFieldPayment.setText("");
        }else if(e.getSource() == clear2){
            textFieldEnterMamberID.setText("");
            textFieldTrainerName.setText("");
        }else if (e.getSource() == remove) {
            String memberId = removeMember.getText();

            if (memberId.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a Member ID to remove.");
                return;
            }
            boolean removed = FileIO.removeMemberById(memberId);

            if (removed) {
                screen.append("Member with ID " + memberId + " has been removed.\n\n");
                removeMember.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Member ID not found.");
            }
        }else if (e.getSource() == search) {
            String memberId = searchMember.getText();

            if (memberId.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter a Member ID to search.");
                return;
            }

            String result = FileIO.searchMemberById(memberId);
            screen.setText(result);
            searchMember.setText("");
    }else if(e.getSource() == hide){
            screen.setText("");
        }else if(e.getSource() == light){
            screen.setBackground(Color.WHITE);
            textFieldMemberID.setBackground(Color.WHITE);
            textFieldName.setBackground(Color.WHITE);
            textFieldPhoneNumber.setBackground(Color.WHITE);
            textFieldAge.setBackground(Color.WHITE);
            textFieldPayment.setBackground(Color.WHITE);
            searchMember.setBackground(Color.WHITE);
            textFieldTrainerName.setBackground(Color.WHITE);
            textFieldEnterMamberID.setBackground(Color.WHITE);
            removeMember.setBackground(Color.WHITE);
            comboBox.setBackground(Color.WHITE);
            male.setBackground(Color.WHITE);
            female.setBackground(Color.WHITE);

            screen.setForeground(Color.BLACK);
            textFieldMemberID.setForeground(Color.BLACK);
            textFieldName.setForeground(Color.BLACK);
            textFieldPhoneNumber.setForeground(Color.BLACK);
            textFieldAge.setForeground(Color.BLACK);
            textFieldPayment.setForeground(Color.BLACK);
            searchMember.setForeground(Color.BLACK);
            textFieldTrainerName.setForeground(Color.BLACK);
            textFieldEnterMamberID.setForeground(Color.BLACK);
            removeMember.setForeground(Color.BLACK);
            comboBox.setForeground(Color.BLACK);
            male.setForeground(Color.BLACK);
            female.setForeground(Color.BLACK);

        }else if(e.getSource() == dark){
            screen.setBackground(new Color(34,40,49));
            textFieldMemberID.setBackground(new Color(34,40,49));
            textFieldName.setBackground(new Color(34,40,49));
            textFieldPhoneNumber.setBackground(new Color(34,40,49));
            textFieldAge.setBackground(new Color(34,40,49));
            textFieldPayment.setBackground(new Color(34,40,49));
            searchMember.setBackground(new Color(34,40,49));
            textFieldTrainerName.setBackground(new Color(34,40,49));
            textFieldEnterMamberID.setBackground(new Color(34,40,49));
            removeMember.setBackground(new Color(34,40,49));
            comboBox.setBackground(new Color(34,40,49));
            male.setBackground(new Color(34,40,49));
            female.setBackground(new Color(34,40,49));

            screen.setForeground(Color.WHITE);
            textFieldMemberID.setForeground(Color.WHITE);
            textFieldName.setForeground(Color.WHITE);
            textFieldPhoneNumber.setForeground(Color.WHITE);
            textFieldAge.setForeground(Color.WHITE);
            textFieldPayment.setForeground(Color.WHITE);
            searchMember.setForeground(Color.WHITE);
            textFieldTrainerName.setForeground(Color.WHITE);
            textFieldEnterMamberID.setForeground(Color.WHITE);
            removeMember.setForeground(Color.WHITE);
            comboBox.setForeground(Color.WHITE);
            male.setForeground(Color.WHITE);
            female.setForeground(Color.WHITE);
        }else if(e.getSource() == show){
            screen.setText(FileIO.readAllMembers());
        }else if (e.getSource() == update) {
            String memberId = textFieldEnterMamberID.getText();
            String trainerName = textFieldTrainerName.getText();

            if (memberId.isEmpty() || trainerName.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please enter both Member ID and Trainer Name.");
                return;
            }

            boolean success = FileIO.assignTrainerToMember(memberId, trainerName);

            if (success) {
                screen.append("Trainer '" + trainerName + "' assigned to Member ID: " + memberId + "\n\n");
            } else {
                JOptionPane.showMessageDialog(this, "Member ID not found.");
            }
        }
    }
}
