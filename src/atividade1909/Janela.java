package atividade1909;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Janela extends JFrame {
     private static final JLabel lblLatitude = new JLabel("Latitude: ");
     private static final JLabel lblLongitude = new JLabel("Longitude: ");
     private static final JLabel lblDataHora = new JLabel("Data/Hora: ");
     private static final JLabel lblDescricao = new JLabel("Descrição: ");
     
     private final JTextField txtLatitude = new JTextField(30);
     private final JTextField txtLongitude = new JTextField(30);
     private final JTextField txtDataHora = new JTextField(20);
     private final JTextField txtDescricao = new JTextField(200);
     
     private static final JButton btnAdd = new JButton("Adicionar");
     private static final JButton btnDel = new JButton("Remover");
     //private static final JButton btnSave = new JButton("Salvar");
     
     private final JList lstLista = new JList(new DefaultListModel());
     private final DefaultListModel modelo = (DefaultListModel) lstLista.getModel();
     
     public Janela() throws HeadlessException{
        super("");
        
        setLayout(new GridLayout(2,2));
        JPanel pnlEntrada = new JPanel();
        pnlEntrada.setLayout(new GridLayout(6, 3));
        pnlEntrada.add(lblLatitude);
        pnlEntrada.add(txtLatitude); 
        pnlEntrada.add(lblLongitude);  
        pnlEntrada.add(txtLongitude);
        pnlEntrada.add(lblDataHora);
        pnlEntrada.add(txtDataHora);
        pnlEntrada.add(lblDescricao);
        pnlEntrada.add(txtDescricao);
        pnlEntrada.add(btnAdd);
        pnlEntrada.add(btnDel);       
        add(pnlEntrada); 
        add(new JScrollPane(lstLista));
        //add(btnSave);
        
        btnAdd.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e) {
                Ocorrencia valor = new Ocorrencia();
                
                valor.setLatitude(Float.parseFloat(txtLatitude.getText()));
                valor.setLongitude(Float.parseFloat(txtLongitude.getText()));
                valor.setData(txtDataHora.getText());
                valor.setDescricao(txtDescricao.getText());
                
                modelo.addElement(valor);
                
                txtLatitude.setText("");
                txtLongitude.setText("");
                txtDataHora.setText("");
                txtDescricao.setText("");
                txtLatitude.requestFocus();
            }

        });
        
        btnDel.addActionListener(new ActionListener(){
        @Override
            public void actionPerformed(ActionEvent e) {
                List selecionados = lstLista.getSelectedValuesList();
                for (Object selecionado : selecionados) {
                    modelo.removeElement(selecionado);
            }
            }
        });
        
        
    }
    
}
