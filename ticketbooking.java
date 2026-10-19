// F1 TICKET BOOKING SYSTEM

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import javax.swing.ImageIcon;
import java.awt.Color;

class ticketbooking extends JFrame implements ActionListener
{
	JTextField total_amount,seatno,eid,receipt,r1,r2,r3,r4,r5;
	ImageIcon img;
	Choice type, time;
	JLabel type_label, time_label, seat_label, total_label, image,eid_label, title;
	JButton submit,download,pay;
	JPanel newPanel;
	String selectedtime,tickettype,selectedseat,selectedeid;

	int total_pr = 0;
	int a = 0;
	int price;

	Ticket tickets[] = new Ticket[30];
	
	ticketbooking()
	{
		setSize(535,800);
		setResizable(false);
                setTitle("F1 TICKET BOOKING");
		setLayout(null);
		getContentPane().setBackground(new Color(188, 143, 143));
	
		img = new ImageIcon("f1.gif");
		image = new JLabel(img);
		image.setBounds(10, 10, 500, 190);

		title = new JLabel();
		title.setText("F1 TICKET BOOKING");
		title.setFont(new Font("Times New Roman", Font.BOLD, 30));
		title.setBounds(95, 210, 500, 30);
		
		type_label = new JLabel("Ticket Type: ");
		type_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		type_label.setBounds(10, 260, 120, 30);
		type = new Choice();
		type.add("VIP");
		type.add("Standard");
		type.add("Youth");
		type.setBounds(250, 265, 200, 60);

		time_label = new JLabel("Show Timing: ");
		time_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		time_label.setBounds(10, 290, 150, 30);
		time = new Choice();
		time.add("9:00");
		time.add("12:00");
		time.add("16:00");
		time.add("21:00");
		time.setBounds(250, 290, 200, 30);
		
		seat_label = new JLabel ("Number of Seats: ");
		seat_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		seat_label.setBounds(10, 320, 200, 30);
		seatno = new JTextField(2);
		seatno.setFont(new Font("Times New Roman", Font.BOLD, 20));
		seatno.setBounds(250, 320, 200, 30);

		eid_label = new JLabel ("Emirates ID Number: ");
		eid_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		eid_label.setBounds(10, 360, 200, 30);
		eid = new JTextField(20);
		eid.setFont(new Font("Times New Roman", Font.BOLD, 20));
		eid.setBounds(250, 360, 200, 30);

		total_label = new JLabel ("Total Price: ");
		total_label.setFont(new Font("Times New Roman", Font.BOLD, 20));
		total_label.setBounds(10, 400, 200, 30);
		total_amount = new JTextField(7);
		total_amount.setFont(new Font("Times New Roman", Font.BOLD, 20));
		total_amount.setEditable(false);
		total_amount.setBounds(250, 400, 200, 30);

		submit = new JButton("Submit");
		submit.setBounds(10, 450, 200, 30);
		submit.setBackground(Color.white);

		pay = new JButton("Pay");
		pay.setBounds(250, 450, 200, 30);
		pay.setBackground(Color.white);

		download = new JButton("Download");
		download.setBounds(10, 710, 200, 30);
		download.setBackground(Color.white);
		
		receipt = new JTextField(50);
		receipt.setBounds(10, 510, 500, 30);
		receipt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		receipt.setHorizontalAlignment(receipt.CENTER);
		receipt.setEditable(false);
		
		r1 = new JTextField(1000);
		r1.setBounds(10, 540, 500, 30);
		r1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		r1.setEditable(false);
		
		r2 = new JTextField(1000);
		r2.setBounds(10, 570, 500, 30);
		r2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		r2.setEditable(false);
		
		r3 = new JTextField(1000);
		r3.setBounds(10, 600, 500, 30);
		r3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		r3.setEditable(false);
		
		r4 = new JTextField(1000);
		r4.setBounds(10, 630, 500, 30);
		r4.setFont(new Font("Times New Roman", Font.BOLD, 20));
		r4.setEditable(false);
		
		r5 = new JTextField(1000);
		r5.setBounds(10, 660, 500, 30);
		r5.setFont(new Font("Times New Roman", Font.BOLD, 20));
		r5.setEditable(false);
		
		add(image);	
		add(eid_label);
		add(eid);
		add(type_label);
		add(type);
		add(time_label);
		add(time);
		add(seat_label);
		add(seatno);
		add(submit);
		add(total_label);
		add(total_amount);
		add(pay);
		add(receipt);
		add(r1);	
		add(r2);
		add(r3);
		add(r4);
		add(r5);
		add(download);
		add(title);
		
		setVisible(true);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		submit.addActionListener(this);
		pay.addActionListener(this);
		download.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent eve)
	{
		selectedtime = time.getSelectedItem();
		tickettype = type.getSelectedItem();
		selectedseat = seatno.getText();
		selectedeid = eid.getText();
		long eidnum = Long.parseLong(selectedeid);
		
		if(eve.getSource() == submit)
		{
			tickets[a] = new Ticket(tickettype, selectedtime , selectedseat,eidnum);
			int tempprice = tickets[a].getSeatPrice(); 
			total_pr = tempprice;
			total_amount.setText("AED "+ Integer.toString(total_pr));
			a = a + 1;
		}

		if(eve.getSource() == pay) 
		{
			
				String ticketnum = seatno.getText();
				String ticketprice = total_amount.getText();
				String ticketeid = eid.getText();
				String tickettype = type.getSelectedItem();
				String tickettime = time.getSelectedItem();
			
				receipt.setText("---- Receipt ----");
				r4.setText("Type :   " + tickettype);
				r2.setText("Number of Seats :   " + ticketnum);
				r1.setText("Emirates ID Number :   " + ticketeid);
				r3.setText("Show Timing :   " + tickettime);
				r5.setText("Total Price :   "+ ticketprice); 
			
				JOptionPane.showMessageDialog(null, "Your Ticket has been successfully Booked, to download the ticket click Download ");
	
		}

		if(eve.getSource() == download)
		{
			try{
  				FileWriter stream = new FileWriter("receipt.txt"); 
  				BufferedWriter output = new BufferedWriter(stream);

				for (int i = 0; i < a; i++) 
				{
					int ticketnum = tickets[i].getSeatNum();
					int ticketprice = tickets[i].getSeatPrice();
					long ticketeid = tickets[i].geteidnum();
					String tickettype = tickets[i].getType();
					String tickettime = tickets[i].getTime();
					String newline = System.getProperty("line.separator");

					output.write(newline);
					output.write("                                    TICKET DETAILS ");
					output.write(newline);
					output.write(newline);
					output.write(newline);
					output.write("Emirates ID Number: " + ticketeid);
					output.write(newline);
					output.write(newline);
					output.write("Number of Tickets: " + ticketnum); 
					output.write(newline);
					output.write(newline);
					output.write("Show Timing: " + tickettime);
					output.write(newline);
					output.write(newline);
					output.write("Type: " + tickettype);
					output.write(newline);
					output.write(newline);
					output.write("Total Price: AED " + ticketprice);
					output.write(newline);
				}

				output.close();

			}

			catch (Exception e)
			{
  				System.err.println("Error: " + e.getMessage());
			}

  			JOptionPane.showMessageDialog(null, "Success!! Your Ticket has been downloaded in the file named receipt.txt "); 
		
			for(int i=0; i < tickets.length; i++)
  			{
				tickets[i] = null; 
			}

			total_pr = 0;
			a = 0; 
			total_amount.setText(""); 
			seatno.setText("");
			eid.setText("");
		}			
		
	}

	public static void main(String ar[])
	{
		new ticketbooking();
	}
}

class Ticket
{
	private int price;
	private String ticket_type;
	private int num_of_seats;
	private String ticket_time;
	private long eid;

	public Ticket (String type, String time, String noseats, long eid_num)
	{
		num_of_seats = Integer.parseInt(noseats);
		ticket_type = type; 
		ticket_time = time;
		eid =  eid_num;

		if (type == "VIP")
		{
			price = 5000*num_of_seats; 
		}
			
		if (type == "Standard")
		{
			price = 3500*num_of_seats; 
		}
			
		if (type == "Youth")
		{
			price = 1500*num_of_seats;  
		}
	}

	public int getSeatPrice()
	{
		return price;
	}

	public String getTime()
	{
		return ticket_time;
	}
	
	public String getType()
	{
		return ticket_type;
	}

	public int getSeatNum()
	{
		return num_of_seats;
	}
	
	public long geteidnum()
	{
		return eid;
	}
}


