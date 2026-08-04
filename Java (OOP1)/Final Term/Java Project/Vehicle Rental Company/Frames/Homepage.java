package Frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Entities.*;

public class Homepage extends JFrame implements ActionListener
{

    JLabel namelbl1, bgLabel, rawIcon ;
    JButton backbtn, btnUpdate, btnDelete;
    JPanel panel;
    FrameIntro f1;
	Account account;

    // Extra buttons
    JButton btnBookCar;
    JButton btnViewProfile;
    JButton btnLogout;
	ImageIcon appIcon;

    public Homepage(Account account,FrameIntro f1)
    {
        super("Homepage");
        this.setSize(800,450);
        this.setLocationRelativeTo(null);
		
		ImageIcon appIcon = new ImageIcon("images/VehicleLogo.png");
		this.setIconImage(appIcon.getImage());
		
	
        this.f1 = f1;
		this.account = account;
        panel = new JPanel();
		panel.setBackground(new Color(182,213,182));
        panel.setLayout(null);

        namelbl1 = new JLabel("Welcome, " + account.getName());
        namelbl1.setBounds(50,30,300,40);
        namelbl1.setFont(new Font("Arial", Font.BOLD, 20));
        panel.add(namelbl1);

        ImageIcon rawIcon = new ImageIcon("./images/Homepage.png");  
		JLabel bgLabel = new JLabel(rawIcon);
		bgLabel.setBounds(0, 0, 800, 450);

        // New action buttons
        btnBookCar = new JButton("Book a Vehicle");
        btnBookCar.setBounds(40,80,150,40);
        btnBookCar.addActionListener(this);
        panel.add(btnBookCar);

        btnViewProfile = new JButton("View Profile");
        btnViewProfile.setBounds(40,140,150,40);
        btnViewProfile.addActionListener(this);
        panel.add(btnViewProfile);
		
		//(Talha) Update/Delete
		btnUpdate = new JButton("Update Info");
		btnUpdate.setBounds(40,220,150,40);
		btnUpdate.addActionListener(this);
		panel.add(btnUpdate);

		btnDelete = new JButton("Delete Account");
		btnDelete.setBounds(40,280,150,40);
		btnDelete.addActionListener(this);
		panel.add(btnDelete);

        btnLogout = new JButton("Logout");
        btnLogout.setBounds(650,300,100,40);
        btnLogout.addActionListener(this);
        panel.add(btnLogout);
	
		panel.add(bgLabel);
        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource() == backbtn)
        {
            // Back to login
            this.setVisible(false);
            FrameIntro f1 = new FrameIntro();
            f1.setVisible(true);
        }
        else if(ae.getSource() == btnBookCar)
        {
            JOptionPane.showMessageDialog(this,
                "Booking page coming soon.\nHere you will select vehicles, dates and confirm booking.");
        }		
		
		//(Talha) View Profile Details
        else if(ae.getSource() == btnViewProfile)
		{
        String details =
              "Name: " + account.getName()
            + "\nEmail: " + account.getEmail()
            + "\nPassword: " + account.getPass()
            + "\nRegistered Vehicle: " + account.getVehicle();

        JOptionPane.showMessageDialog(this, details, "Profile Details",
                                      JOptionPane.INFORMATION_MESSAGE);
		}
        else if(ae.getSource() == btnLogout)
        {
            this.setVisible(false);
            FrameIntro f1 = new FrameIntro();
            f1.setVisible(true);
        }
		
		//(Talha) Update/Delete
		else if(ae.getSource() == backbtn)
		{
			this.setVisible(false);
			FrameIntro f1 = new FrameIntro();
			f1.setVisible(true);
		}
		else if(ae.getSource() == btnViewProfile)
		{
			String details =
				  "Name: " + account.getName()
				+ "\nEmail: " + account.getEmail()
				+ "\nPassword: " + account.getPass()
				+ "\nRegistered Vehicle: " + account.getVehicle();

			JOptionPane.showMessageDialog(this, details, "Profile Details",
										  JOptionPane.INFORMATION_MESSAGE);
		}
		else if(ae.getSource() == btnUpdate)
		{
			
			String newEmail = JOptionPane.showInputDialog(this, "Enter new email:", account.getEmail());
			if(newEmail == null) return; 
			String newVehicle = JOptionPane.showInputDialog(this, "Enter new vehicle:", account.getVehicle());
			if(newVehicle == null) return;

			
			String oldName = account.getName();
			String oldPass = account.getPass();

			
			account.setEmail(newEmail);
			account.setVehicle(newVehicle);

			if(account.updateAccount(oldName, oldPass))
			{
				JOptionPane.showMessageDialog(this, "Data updated successfully.");
			}
			else
			{
				JOptionPane.showMessageDialog(this, "Update failed.");
			}
		}
		else if(ae.getSource() == btnDelete)
		{
			int opt = JOptionPane.showConfirmDialog(this,
					"Are you sure you want to delete this account?",
					"Confirm Delete", JOptionPane.YES_NO_OPTION);

			if(opt == JOptionPane.YES_OPTION)
			{
				if(account.deleteAccount(account.getName(), account.getPass()))
				{
					JOptionPane.showMessageDialog(this, "Account deleted.");
					this.setVisible(false);
					FrameIntro f1 = new FrameIntro();
					f1.setVisible(true);
				}
				else
				{
					JOptionPane.showMessageDialog(this, "Delete failed.");
				}
			}
		}
	}
    
}
