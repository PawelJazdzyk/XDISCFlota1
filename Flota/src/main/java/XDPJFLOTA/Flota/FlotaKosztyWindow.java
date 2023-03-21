/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package XDPJFLOTA.Flota;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import com.toedter.calendar.JDateChooser;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Color;

/**
 *
 * @author jazdz
 */
@SuppressWarnings("serial")
public class FlotaKosztyWindow extends javax.swing.JFrame {

	/**
	 * Creates new form FlotaKoszty
	 */
	public FlotaKosztyWindow() {
		setLocation(350, 150);
		setPreferredSize(new Dimension(895, 510));
		initComponents();
	}

	DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE, dd.MM.yyyy");
	static DateTimeFormatter df1 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
	LocalDate data = LocalDate.now();

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel1.setBounds(18, 11, 501, 33);
		jSeparator1 = new javax.swing.JSeparator();
		jSeparator1.setBounds(18, 50, 856, 10);
		jLabel28 = new javax.swing.JLabel();
		jLabel28.setBounds(647, 16, 227, 25);
		jLabel28.setHorizontalAlignment(SwingConstants.RIGHT);
		jLabel28.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		jLabel29 = new javax.swing.JLabel();
		jLabel29.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel29.setBounds(10, 78, 115, 25);
		jLabel30 = new javax.swing.JLabel();
		jLabel30.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel30.setBounds(300, 78, 31, 25);
		jLabel31 = new javax.swing.JLabel();
		jLabel31.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel31.setBounds(139, 150, 115, 25);
		jLabel32 = new javax.swing.JLabel();
		jLabel32.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel32.setBounds(18, 150, 115, 25);
		jLabel33 = new javax.swing.JLabel();
		jLabel33.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel33.setBounds(331, 150, 115, 25);
		jLabel34 = new javax.swing.JLabel();
		jLabel34.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel34.setBounds(18, 181, 115, 25);
		jLabel35 = new javax.swing.JLabel();
		jLabel35.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel35.setBounds(139, 181, 115, 25);
		jLabel36 = new javax.swing.JLabel();
		jLabel36.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel36.setBounds(331, 181, 115, 25);
		jLabel37 = new javax.swing.JLabel();
		jLabel37.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel37.setBounds(18, 212, 115, 25);
		jLabel38 = new javax.swing.JLabel();
		jLabel38.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel38.setBounds(139, 212, 115, 25);
		jLabel39 = new javax.swing.JLabel();
		jLabel39.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel39.setBounds(331, 212, 115, 25);
		jLabel40 = new javax.swing.JLabel();
		jLabel40.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel40.setBounds(331, 243, 115, 25);
		jLabel41 = new javax.swing.JLabel();
		jLabel41.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel41.setBounds(18, 243, 115, 25);
		jLabel42 = new javax.swing.JLabel();
		jLabel42.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel42.setBounds(139, 243, 115, 25);
		jLabel43 = new javax.swing.JLabel();
		jLabel43.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel43.setBounds(331, 274, 115, 25);
		jLabel44 = new javax.swing.JLabel();
		jLabel44.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel44.setBounds(139, 274, 115, 25);
		jLabel45 = new javax.swing.JLabel();
		jLabel45.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel45.setBounds(18, 274, 115, 25);
		jLabel46 = new javax.swing.JLabel();
		jLabel46.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel46.setBounds(331, 305, 115, 25);
		jLabel47 = new javax.swing.JLabel();
		jLabel47.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel47.setBounds(139, 305, 115, 25);
		jLabel48 = new javax.swing.JLabel();
		jLabel48.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel48.setBounds(18, 305, 115, 25);
		jSeparator2 = new javax.swing.JSeparator();
		jSeparator2.setBounds(514, 78, 17, 364);
		jLabel49 = new javax.swing.JLabel();
		jLabel49.setBounds(18, 447, 486, 25);
		jLabel50 = new javax.swing.JLabel();
		jLabel50.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel50.setBounds(535, 212, 115, 25);
		jLabel54 = new javax.swing.JLabel();
		jLabel54.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel54.setBounds(535, 149, 196, 25);
		jLabel55 = new javax.swing.JLabel();
		jLabel55.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel55.setBounds(535, 243, 169, 25);
		jLabel56 = new javax.swing.JLabel();
		jLabel56.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel56.setBounds(535, 181, 169, 25);
		jLabel57 = new javax.swing.JLabel();
		jLabel57.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel57.setBounds(737, 149, 68, 25);
		jLabel58 = new javax.swing.JLabel();
		jLabel58.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel58.setBounds(737, 212, 68, 25);
		jLabel62 = new javax.swing.JLabel();
		jLabel62.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel62.setBounds(737, 243, 68, 25);
		jLabel63 = new javax.swing.JLabel();
		jLabel63.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel63.setBounds(737, 181, 68, 25);
		jButton1 = new javax.swing.JButton();
		jButton1.setBounds(293, 418, 211, 23);
		jLabel64 = new javax.swing.JLabel();
		jLabel64.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel64.setBounds(139, 341, 115, 25);
		jLabel65 = new javax.swing.JLabel();
		jLabel65.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel65.setBounds(456, 150, 48, 25);
		jLabel66 = new javax.swing.JLabel();
		jLabel66.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel66.setBounds(456, 181, 48, 25);
		jLabel67 = new javax.swing.JLabel();
		jLabel67.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel67.setBounds(456, 212, 48, 25);
		jLabel68 = new javax.swing.JLabel();
		jLabel68.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel68.setBounds(456, 243, 48, 25);
		jLabel69 = new javax.swing.JLabel();
		jLabel69.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel69.setBounds(456, 274, 48, 25);
		jLabel70 = new javax.swing.JLabel();
		jLabel70.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		jLabel70.setBounds(456, 305, 48, 25);

		// setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);

		jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(153, 153, 153));
		jLabel1.setText("X DISC FLOTA - Aplkacja do rozliczania kosztów samochodów firmowych");

		jLabel28.setForeground(new java.awt.Color(102, 102, 102));
		jLabel28.setText(data.format(df));

		jLabel29.setForeground(new java.awt.Color(102, 102, 102));
		jLabel29.setText("Zakres raportu - od:");

		jLabel30.setForeground(new java.awt.Color(102, 102, 102));
		jLabel30.setText("do:");

		jLabel31.setForeground(new java.awt.Color(102, 102, 102));

		jLabel32.setForeground(new java.awt.Color(102, 102, 102));
		jLabel32.setText("ODM CD");

		jLabel33.setForeground(new java.awt.Color(102, 102, 102));
		jLabel33.setText("Udzial % w kosztach:");

		jLabel34.setForeground(new java.awt.Color(102, 102, 102));
		jLabel34.setText("ODM Winyl");

		jLabel35.setForeground(new java.awt.Color(102, 102, 102));

		jLabel36.setForeground(new java.awt.Color(102, 102, 102));
		jLabel36.setText("Udzial % w kosztach:");

		jLabel37.setForeground(new java.awt.Color(102, 102, 102));
		jLabel37.setText("X DISC CD");

		jLabel38.setForeground(new java.awt.Color(102, 102, 102));

		jLabel39.setForeground(new java.awt.Color(102, 102, 102));
		jLabel39.setText("Udzial % w kosztach:");

		jLabel40.setForeground(new java.awt.Color(102, 102, 102));
		jLabel40.setText("Udzial % w kosztach:");

		jLabel41.setForeground(new java.awt.Color(102, 102, 102));
		jLabel41.setText("X DISC Winyl");

		jLabel42.setForeground(new java.awt.Color(102, 102, 102));

		jLabel43.setForeground(new java.awt.Color(102, 102, 102));
		jLabel43.setText("Udzial % w kosztach:");

		jLabel44.setForeground(new java.awt.Color(102, 102, 102));

		jLabel45.setForeground(new java.awt.Color(102, 102, 102));
		jLabel45.setText("PVD");

		jLabel46.setForeground(new java.awt.Color(102, 102, 102));
		jLabel46.setText("Udzial % w kosztach:");

		jLabel47.setForeground(new java.awt.Color(102, 102, 102));

		jLabel48.setForeground(new java.awt.Color(102, 102, 102));
		jLabel48.setText("Zarząd");

		jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

		jLabel49.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
		jLabel49.setForeground(new java.awt.Color(153, 153, 153));
		jLabel49.setText(
				"rozliczenie zostanie wysłane na adresy: anita.koltun@x-disc.pl, anna.cudnik@x-disc.pl, karolina.pawlak@x-disc.pl, pawel.jazdzyk@x-disc.pl");

		jLabel50.setForeground(new java.awt.Color(102, 102, 102));
		jLabel50.setText("Najdłuższa podróż:");

		jLabel54.setForeground(new java.awt.Color(102, 102, 102));
		jLabel54.setText("Ilość wyjazdów w zadanym okresie:");

		jLabel55.setForeground(new java.awt.Color(102, 102, 102));
		jLabel55.setText("Średnio km na wyjazd:");

		jLabel56.setForeground(new java.awt.Color(102, 102, 102));
		jLabel56.setText("Łącznie km:");

		jLabel57.setForeground(new java.awt.Color(102, 102, 102));

		jLabel58.setForeground(new java.awt.Color(102, 102, 102));

		jLabel62.setForeground(new java.awt.Color(102, 102, 102));

		jLabel63.setForeground(new java.awt.Color(102, 102, 102));

		jButton1.setBackground(new java.awt.Color(204, 255, 204));
		jButton1.setForeground(new java.awt.Color(0, 153, 51));
		jButton1.setText("Wyślij rozliczenie");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					
					wyslijraport();
					
				} catch (MessagingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		});

		jLabel64.setForeground(Color.GRAY);

		jLabel65.setForeground(new java.awt.Color(102, 102, 102));

		jLabel66.setForeground(new java.awt.Color(102, 102, 102));

		jLabel67.setForeground(new java.awt.Color(102, 102, 102));

		jLabel68.setForeground(new java.awt.Color(102, 102, 102));

		jLabel69.setForeground(new java.awt.Color(102, 102, 102));

		jLabel70.setForeground(new java.awt.Color(102, 102, 102));
		getContentPane().setLayout(null);
		getContentPane().add(jSeparator1);
		getContentPane().add(jLabel1);
		getContentPane().add(jLabel28);
		getContentPane().add(jLabel45);
		getContentPane().add(jLabel44);
		getContentPane().add(jLabel41);
		getContentPane().add(jLabel42);
		getContentPane().add(jLabel37);
		getContentPane().add(jLabel38);
		getContentPane().add(jLabel29);
		getContentPane().add(jLabel30);
		getContentPane().add(jLabel34);
		getContentPane().add(jLabel35);
		getContentPane().add(jLabel32);
		getContentPane().add(jLabel31);
		getContentPane().add(jLabel48);
		getContentPane().add(jLabel64);
		getContentPane().add(jLabel47);
		getContentPane().add(jLabel43);
		getContentPane().add(jLabel69);
		getContentPane().add(jLabel40);
		getContentPane().add(jLabel68);
		getContentPane().add(jLabel39);
		getContentPane().add(jLabel67);
		getContentPane().add(jLabel36);
		getContentPane().add(jLabel33);
		getContentPane().add(jLabel65);
		getContentPane().add(jLabel66);
		getContentPane().add(jLabel46);
		getContentPane().add(jLabel70);
		getContentPane().add(jButton1);
		getContentPane().add(jLabel49);
		getContentPane().add(jSeparator2);
		getContentPane().add(jLabel54);
		getContentPane().add(jLabel50);
		getContentPane().add(jLabel55);
		getContentPane().add(jLabel56);
		getContentPane().add(jLabel63);
		getContentPane().add(jLabel62);
		getContentPane().add(jLabel58);
		getContentPane().add(jLabel57);

		dateChooser = new JDateChooser();
		dateChooser.setBounds(133, 78, 157, 25);
		getContentPane().add(dateChooser);

		dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(331, 78, 154, 25);
		getContentPane().add(dateChooser_1);

		btnPoka = new JButton();
		btnPoka.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		btnPoka.setText("Pokaż");
		btnPoka.setForeground(SystemColor.textHighlight);
		btnPoka.setBackground(SystemColor.activeCaption);
		btnPoka.setBounds(535, 80, 95, 23);
		btnPoka.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				poka();
			}
		});

		getContentPane().add(btnPoka);
		
		lblcznieKm = new JLabel();
		lblcznieKm.setText("Łącznie:");
		lblcznieKm.setForeground(Color.GRAY);
		lblcznieKm.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		lblcznieKm.setBounds(18, 341, 115, 25);
		getContentPane().add(lblcznieKm);
		
		jLabel55_1 = new JLabel();
		jLabel55_1.setForeground(new Color(34, 139, 34));
		jLabel55_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		jLabel55_1.setBounds(524, 418, 347, 25);
		getContentPane().add(jLabel55_1);

		pack();
	}

	public static void poka() {
	
		Date data1 = (Date) dateChooser.getDate();
		Date data2 = (Date) dateChooser_1.getDate();
		LocalDate mojadata1 = data1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate mojadata2 = data2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

		String file = "X:\\sekretariat\\Flota\\XDISCFlota.csv";

		List<FlotaClass> flota = ObslugaCSVFlota.wczytaj(file);
		
		double sumkm = 0;
		int wyjazdy = 0;

		for (FlotaClass emp : flota) {

			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))) {

				sumkm += Double.parseDouble(emp.getKm());
				wyjazdy++;
			}
		}
		jLabel63.setText("" + sumkm);
		jLabel57.setText("" + wyjazdy);
		jLabel62.setText(String.format("%.2f",sumkm/wyjazdy).replace(",", "."));
		
		double max = 0;
		
		for (FlotaClass emp : flota) {
			

			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))) {

				if(Double.parseDouble(emp.getKm()) > max) {
					max = Double.parseDouble(emp.getKm());					
				}			
			}
		}
		jLabel58.setText(String.format("%.2f",max).replace(",", "."));
			
		
		double kosztODMdept1 = 0;
		double kosztODMdept2 = 0;
		double kosztODMdept3 = 0;
		double kosztODMCD1 = 0;
		double kosztODMCD2 = 0;
		double kosztODMCD3 = 0;
		double kosztODMVin1 = 0;
		double kosztODMVin2 = 0;
		double kosztODMVin3 = 0;
		double kosztXDISCdept1 = 0;
		double kosztXDISCdept2 = 0;
		double kosztXDISCdept3 = 0;
		double kosztXDISCCD1 = 0;
		double kosztXDISCCD2 = 0;
		double kosztXDISCCD3 = 0;
		double kosztXDISCVin1 = 0;
		double kosztXDISCVin2 = 0;
		double kosztXDISCVin3 = 0;
		double kosztPVDdept1 = 0;
		double kosztPVDdept2 = 0;
		double kosztPVDdept3 = 0;
		double kosztZdept1 = 0;
		double kosztZdept2 = 0;
		double kosztZdept3 = 0;

		for (FlotaClass emp : flota) {

			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept1().equals("ODM")) {

				kosztODMdept1 += Double.parseDouble(emp.getKmdept1().replace(",", "."));

			}
			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept2().equals("ODM")) {

				kosztODMdept2 += Double.parseDouble(emp.getKmdept2().replace(",", "."));

			}
			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept3().equals("ODM")) {

				kosztODMdept3 += Double.parseDouble(emp.getKmdept3().replace(",", "."));

			}
			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept1().equals("ODM CD")) {

				kosztODMCD1 += Double.parseDouble(emp.getKmdept1().replace(",", "."));

			}
			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept2().equals("ODM CD")) {

				kosztODMCD2 += Double.parseDouble(emp.getKmdept2().replace(",", "."));

			}
			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept3().equals("ODM CD")) {

				kosztODMCD3 += Double.parseDouble(emp.getKmdept3().replace(",", "."));

			}
			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept1().equals("ODM Winyl")) {

				kosztODMVin1 += Double.parseDouble(emp.getKmdept1().replace(",", "."));

			}
			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept2().equals("ODM Winyl")) {

				kosztODMVin2 += Double.parseDouble(emp.getKmdept2().replace(",", "."));

			}
			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept3().equals("ODM Winyl")) {

				kosztODMVin3 += Double.parseDouble(emp.getKmdept3().replace(",", "."));

			}
			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept1().equals("X DISC")) {

				kosztXDISCdept1 += Double.parseDouble(emp.getKmdept1().replace(",", "."));

			}
			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept2().equals("X DISC")) {

				kosztXDISCdept2 += Double.parseDouble(emp.getKmdept2().replace(",", "."));

			}
			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept3().equals("X DISC")) {

				kosztXDISCdept3 += Double.parseDouble(emp.getKmdept3().replace(",", "."));

			}
			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept1().equals("X DISC CD")) {

				kosztXDISCCD1 += Double.parseDouble(emp.getKmdept1().replace(",", "."));

			}
			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept2().equals("X DISC CD")) {

				kosztXDISCCD2 += Double.parseDouble(emp.getKmdept2().replace(",", "."));

			}
			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept3().equals("X DISC CD")) {

				kosztXDISCCD3 += Double.parseDouble(emp.getKmdept3().replace(",", "."));

			}
			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept1().equals("X DISC Winyl")) {

				kosztXDISCVin1 += Double.parseDouble(emp.getKmdept1().replace(",", "."));

			}
			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept2().equals("X DISC Winyl")) {

				kosztXDISCVin2 += Double.parseDouble(emp.getKmdept2().replace(",", "."));

			}
			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept3().equals("X DISC Winyl")) {

				kosztXDISCVin3 += Double.parseDouble(emp.getKmdept3().replace(",", "."));

			}
			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept1().equals("PVD")) {

				kosztPVDdept1 += Double.parseDouble(emp.getKmdept1().replace(",", "."));

			}
			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept2().equals("PVD")) {

				kosztPVDdept2 += Double.parseDouble(emp.getKmdept2().replace(",", "."));

			}
			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept3().equals("PVD")) {

				kosztPVDdept3 += Double.parseDouble(emp.getKmdept3().replace(",", "."));

			}
			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept1().equals("Zarząd")) {

				kosztZdept1 += Double.parseDouble(emp.getKmdept1().replace(",", "."));

			}
			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept2().equals("Zarząd")) {

				kosztZdept2 += Double.parseDouble(emp.getKmdept2().replace(",", "."));

			}
			if (mojadata1.minusDays(1).isBefore(LocalDate.parse(emp.getDatawydania()))
					&& mojadata2.plusDays(1).isAfter(LocalDate.parse(emp.getDatawydania()))
					&& emp.getDept3().equals("Zarząd")) {

				kosztZdept3 += Double.parseDouble(emp.getKmdept3().replace(",", "."));

			}
			double totalkosztODMCD = kosztODMCD1+kosztODMCD2+kosztODMCD3+(kosztODMdept1/2)+
					(kosztODMdept2/2)+(kosztODMdept3/2);
			
			double totalkosztODMVin = kosztODMVin1+kosztODMVin2+kosztODMVin3+(kosztODMdept1/2)+
					(kosztODMdept2/2)+(kosztODMdept3/2);
			
			double totalkosztXDISCCD = kosztXDISCCD1+kosztXDISCCD2+kosztXDISCCD3+(kosztXDISCdept1/2)+
					(kosztXDISCdept2/2)+(kosztXDISCdept3/2);
			
			double totalkosztXDISCVin = kosztXDISCVin1+kosztXDISCVin2+kosztXDISCVin3+(kosztXDISCdept1/2)+
					(kosztXDISCdept2/2)+(kosztXDISCdept3/2);
			
			double totalkosztPVD = kosztPVDdept1+kosztPVDdept2+kosztPVDdept3;
			
			double totalkosztZ = kosztZdept1+kosztZdept2+kosztZdept3;
			
			double total = totalkosztODMCD+totalkosztODMVin+totalkosztXDISCCD+
					+totalkosztXDISCVin+totalkosztPVD+totalkosztZ;
			
			jLabel31.setText(Double.toString(totalkosztODMCD)+" km");
			jLabel35.setText(Double.toString(totalkosztODMVin)+" km");
			jLabel38.setText(Double.toString(totalkosztXDISCCD)+" km");
			jLabel42.setText(Double.toString(totalkosztXDISCVin)+" km");
			jLabel44.setText(Double.toString(totalkosztPVD)+" km");
			jLabel47.setText(Double.toString(totalkosztZ)+" km");
			jLabel64.setText(Double.toString(total)+" km");
			
			double procentODMCD = (totalkosztODMCD/total)*100;
			double procentODMVin = (totalkosztODMVin/total)*100;
			double procentXDISCCD = (totalkosztXDISCCD/total)*100;
			double procentXDISCVin = (totalkosztXDISCVin/total)*100;
			double procentPVD = (totalkosztPVD/total)*100;
			double procentZ = (totalkosztZ/total)*100;
			
			jLabel65.setText(String.format("%.2f",procentODMCD) + " %");
			jLabel66.setText(String.format("%.2f",procentODMVin) + " %");
			jLabel67.setText(String.format("%.2f",procentXDISCCD) + " %");
			jLabel68.setText(String.format("%.2f",procentXDISCVin) + " %");
			jLabel69.setText(String.format("%.2f",procentPVD) + " %");
			jLabel70.setText(String.format("%.2f",procentZ) + " %");
						
		} 
	}
	public void wyslijraport() throws MessagingException {
			  	
    	String username = System.getProperty("user.name");
    	Date data1 = (Date) dateChooser.getDate();
		Date data2 = (Date) dateChooser_1.getDate();
		LocalDate mojadata1 = data1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		LocalDate mojadata2 = data2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		 	
		String adres1 = "anita.koltun@x-disc.pl";
		String adres2 = "pawel.jazdzyk@x-disc.pl";
    	String adres3 = "anna.cudnik@x-disc.pl";
    	String adres4 = "karolina.pawlak@x-disc.pl";
    	   	
    	String head = "Rozliczenie kosztów samochodów firmowych za okres " + mojadata1 + " - " + mojadata2;
    	   	
		String body = "Dzień Dobry, \n \n"
				+ "Poniżej rozlicznie kosztów za użytkowanie samochodów firmowych \n \n"
				+ "Okres rozliczenia: " + mojadata1 + " - "
				+ mojadata2 + "\n\n" +
				"|ODM CD        -   " + jLabel65.getText() +"\n" +
				"|ODM Winyl     -   " + jLabel66.getText() +"\n" +
				"|X DISC CD     -   " + jLabel67.getText() +"\n" +
				"|X DISC Winyl  -   " + jLabel68.getText() +"\n" +
				"|PVD           -   " + jLabel69.getText() +"\n" +
				"|Zarząd        -   " + jLabel70.getText() +"\n\n\n" +
				"Raport przygotował: " + username  +"\n\n\n\n" +
				"Raport wygenerowany automatycznie przez System Raportowania X DISC."
				+ " Prosimy na niego nie odpowiadać.\nWszelkie pytania prosimy kierować "
				+ "na adres pawel.jazdzyk@x-disc.pl";
						
		//System.out.println(body);
    	
    	MimeMessage raport = MailMessagePreparer2.prepareTextMessage(adres1, adres2, adres3, adres4, head, body);
    	Transport.send(raport);
    	
    	//jLabel55_1.setVisible(true);
    	//jLabel55_1.setText("Dziękuję. Raport został wysłany");
        	
    	try {   		
			Thread.sleep(3000);
			setVisible(false);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}    	
    }

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(FlotaKosztyWindow.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FlotaKosztyWindow.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FlotaKosztyWindow.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FlotaKosztyWindow.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FlotaKosztyWindow().setVisible(true);
			}
		});
		
	}

	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton btnPoka;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel28;
	private javax.swing.JLabel jLabel29;
	private javax.swing.JLabel jLabel30;
	private static javax.swing.JLabel jLabel31;
	private javax.swing.JLabel jLabel32;
	private javax.swing.JLabel jLabel33;
	private javax.swing.JLabel jLabel34;
	private static javax.swing.JLabel jLabel35;
	private javax.swing.JLabel jLabel36;
	private javax.swing.JLabel jLabel37;
	private static javax.swing.JLabel jLabel38;
	private javax.swing.JLabel jLabel39;
	private javax.swing.JLabel jLabel40;
	private javax.swing.JLabel jLabel41;
	private static javax.swing.JLabel jLabel42;
	private javax.swing.JLabel jLabel43;
	private static javax.swing.JLabel jLabel44;
	private javax.swing.JLabel jLabel45;
	private javax.swing.JLabel jLabel46;
	private static javax.swing.JLabel jLabel47;
	private javax.swing.JLabel jLabel48;
	private javax.swing.JLabel jLabel49;
	private javax.swing.JLabel jLabel50;
	private javax.swing.JLabel jLabel54;
	private static javax.swing.JLabel jLabel55;
	private javax.swing.JLabel jLabel56;
	private static javax.swing.JLabel jLabel57;
	private static javax.swing.JLabel jLabel58;
	private static javax.swing.JLabel jLabel62;
	private static javax.swing.JLabel jLabel63;
	private static javax.swing.JLabel jLabel64;
	private static javax.swing.JLabel jLabel65;
	private static javax.swing.JLabel jLabel66;
	private static javax.swing.JLabel jLabel67;
	private static javax.swing.JLabel jLabel68;
	private static javax.swing.JLabel jLabel69;
	private static javax.swing.JLabel jLabel70;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JSeparator jSeparator2;
	private static JDateChooser dateChooser;
	private static JDateChooser dateChooser_1;
	private JLabel lblcznieKm;
	public static javax.swing.JLabel jLabel55_1;
}
