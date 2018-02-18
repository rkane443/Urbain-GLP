package board;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;


public class Gui_test extends JFrame {

	private JTextField actionsField;
	private JButton addaction ;
	private JPanel section1_1, section2, section3, sectionheure;
	
	private JList<String> zoneactions, zoneperso;
	private DefaultListModel<String> listperso, listaction;
	private JScrollPane barresDeDefilement;
	private JOptionPane infosPopUp;
	
	private JMenuBar barreDeMenu;
	private JMenu menu1;
	private JMenuItem ouvrir;
	
	private JFileChooser choisiractions;
	
	
	public Gui_test (String titre) {
	
	this.setTitle(titre);
	
	/*Les options par défaut pour notre fenêtre*/
	this.setVisible(true); 
	this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	this.setLayout(new GridLayout(1, 3));
	section1_1 = new JPanel();
	
	/*On rempli la "section1"*/
	sectionheure = new JPanel();
	sectionheure.setSize(200, 100);
	
	listperso = new DefaultListModel<String>();
    zoneperso = new JList<String>(listperso);
    zoneperso.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    zoneperso.setLayoutOrientation(JList.VERTICAL);
    
    
    section1_1.setSize(200,300);
    section1_1.add(zoneperso);
    
    JSplitPane section1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, sectionheure, section1_1);
    
	
    this.getContentPane().add(section1);
    barresDeDefilement = new JScrollPane(zoneperso);
    this.getContentPane().add(barresDeDefilement);
    
    section1.setSize(200, 400);
    
    section2 = new JPanel();
    section2.add(new JLabel("Map"));
    section2.setSize(600, 400);
    
    this.getContentPane().add(section2);
    
    section3 = new JPanel();
    section3.add(new JLabel("infos perso"));
    section3.setSize(200, 400);
    
    listaction = new DefaultListModel<String>();
    zoneactions = new JList<String>(listperso);
    zoneactions.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    zoneactions.setLayoutOrientation(JList.VERTICAL);
    
    this.getContentPane().add(section3);
    
    this.addWindowListener(new ActionFermer());
    this.setSize(1000, 400);
}
	
	
	class ActionFermer implements WindowListener
	{
		public void windowClosing(WindowEvent e)
		{
			int exit = JOptionPane.showConfirmDialog(null,  "Voulez vous quitter ?", "Quitter ?", JOptionPane.YES_NO_OPTION);
			if(exit == JOptionPane.YES_OPTION)
			{
				System.exit(0);
			}
		}
		//Les propriétés qui suivent sont obligatoires (Interface implémentée) mais nous ne les utiliserons pas
		public void windowActivated(WindowEvent e) 
		{			
		}

		public void windowClosed(WindowEvent e) 
		{			
		}

		public void windowDeactivated(WindowEvent e) 
		{			
		}

		public void windowDeiconified(WindowEvent e) 
		{			
		}

		public void windowIconified(WindowEvent e) 
		{			
		}

		public void windowOpened(WindowEvent e) 
		{			
		}
	}
	
	
	
	public static void main(String[] args) 
	{
		new Gui_test("Moteur de Recherche");
	}
}
