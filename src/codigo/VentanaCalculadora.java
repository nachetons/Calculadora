/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;


import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;





public class VentanaCalculadora extends javax.swing.JFrame {
    
    /**
	 * 
	 */
	
	
	private static final long serialVersionUID = 1L;
	static String numero1; //Hacemos un string para el primer numero.
    String operacion; //Hacemos un string para la operacion que queramos.
    String operando2; //Hacemos un string para el segundo numero.
    boolean puntoPresente; //Creamos el boolean para que luego digamos que solo ponga una coma.
   
    public VentanaCalculadora() {
    	getContentPane().setForeground(Color.BLACK);
    	getContentPane().setBackground(Color.GRAY);
        initComponents();
        
    }

    private void pintaNumero(String numero){ //Creamos un private para que nos pinte los numeros y los signos en la pantalla de la calculadora.
         String cadena1 = jLabel1.getText();
        if(cadena1.equals("0")){//Estoy en el caso inicial de la calculadora con un 0 en el display
            jLabel1.setText(numero);
        }
        else{
        jLabel1.setText(cadena1 + numero);
        }
    }
    
    private void realizaOperacion(){ //Creamos un private en el que digamos que realice una operacion cualquiera.
        numero1 = jLabel1.getText();
        if(operacion.equals("√")){
            jLabel2.setText(operacion+numero1);
        }
        if(operacion.equals("%")) {
        	jLabel2.setText(numero1+operacion);
        

        }
            
        if(operacion.equals("^2")) {
        	jLabel2.setText(numero1+operacion);
        

        }else{
        jLabel2.setText(numero1 + operacion);
        }
        jLabel1.setText("0");
    }
    public void borraUltimo() {
        //Ver el codigo para que nos elimine el ultimo numero y no todos.
    }
   


    
   
  
    private void initComponents() {
    	
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton1.setForeground(Color.BLACK);
        jButton1.setBackground(Color.WHITE);
        jButton2 = new javax.swing.JButton();
        jButton2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        	}
        });
        jButton2.setForeground(Color.BLACK);
        jButton2.setBackground(Color.WHITE);
        jButton3 = new javax.swing.JButton();
        jButton3.setBackground(Color.WHITE);
        jButton3.setForeground(Color.BLACK);
        jButton4 = new javax.swing.JButton();
        jButton4.setForeground(Color.BLACK);
        jButton4.setBackground(Color.WHITE);
        jButton5 = new javax.swing.JButton();
        jButton5.setBackground(Color.WHITE);
        jButton5.setForeground(Color.BLACK);
        jButton6 = new javax.swing.JButton();
        jButton6.setBackground(Color.WHITE);
        jButton6.setForeground(Color.BLACK);
        jButton7 = new javax.swing.JButton();
        jButton7.setForeground(Color.BLACK);
        jButton7.setBackground(Color.WHITE);
        jButton8 = new javax.swing.JButton();
        jButton8.setForeground(Color.BLACK);
        jButton8.setBackground(Color.WHITE);
        jButton9 = new javax.swing.JButton();
        jButton9.setBackground(Color.WHITE);
        jButton9.setForeground(Color.BLACK);
        jButton10 = new javax.swing.JButton();
        jButton10.setBackground(Color.WHITE);
        jButton10.setForeground(Color.BLACK);
        jButton11 = new javax.swing.JButton();
        jButton11.setMnemonic('-');
        jButton11.setBackground(Color.WHITE);
        jButton11.setForeground(Color.BLACK);
        jButton12 = new javax.swing.JButton();
        jButton12.setBackground(Color.WHITE);
        jButton12.setForeground(Color.BLACK);
        jButton13 = new javax.swing.JButton();
        jButton13.setBackground(Color.WHITE);
        jButton13.setForeground(Color.BLACK);
        jButton14 = new javax.swing.JButton();
        jButton14.setBackground(Color.WHITE);
        jButton14.setForeground(Color.BLACK);
        jButton16 = new javax.swing.JButton();
        jButton16.setBackground(Color.WHITE);
        jButton16.setForeground(Color.BLACK);
        jLabel2 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton15.setForeground(Color.BLACK);
        jButton15.setBackground(Color.WHITE);
        jButton17 = new javax.swing.JButton();
        jButton17.setForeground(Color.BLACK);
        jButton17.setBackground(Color.WHITE);
        jButton18 = new javax.swing.JButton();
        jButton18.setBackground(Color.WHITE);
        jButton18.setForeground(Color.BLACK);
        jButton19 = new javax.swing.JButton();
        jButton19.setForeground(Color.BLACK);
        jButton19.setBackground(Color.WHITE);
        jButton20 = new javax.swing.JButton();
        jButton20.setForeground(Color.BLACK);
        jButton20.setBackground(Color.WHITE);
        jButton21 = new javax.swing.JButton();
        jButton21.setBackground(Color.WHITE);
        jButton21.setForeground(Color.BLACK);
        jButton22 = new javax.swing.JButton();
        jButton22.setBackground(Color.WHITE);
        jButton22.setText("OFF");
        jButton22.setForeground(Color.BLACK);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("OCR A Extended", 0, 36));  
        jLabel1.setForeground(new java.awt.Color(102, 255, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("0");
        jLabel1.setOpaque(true);

        jButton1.setFont(new java.awt.Font("OCR A Extended", 0, 36));  
        jButton1.setText("7");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("OCR A Extended", 0, 36));  
        jButton2.setText("4");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("OCR A Extended", 0, 36));  
        jButton3.setText("1");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("OCR A Extended", 0, 36));  
        jButton4.setText("8");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              
            }
        });

        jButton5.setFont(new java.awt.Font("OCR A Extended", 0, 36));  
        jButton5.setText("5");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            
            }
        });

        jButton6.setFont(new java.awt.Font("OCR A Extended", 0, 36));  
        jButton6.setText("2");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
           
            }
        });

        jButton7.setFont(new java.awt.Font("OCR A Extended", 0, 36));  
        jButton7.setText("9");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton7MousePressed(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              
            }
        });

        jButton8.setFont(new java.awt.Font("OCR A Extended", 0, 36));  
        jButton8.setText("6");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton8MousePressed(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
         
            }
        });

        jButton9.setFont(new java.awt.Font("OCR A Extended", 0, 36));  
        jButton9.setText("3");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton9MousePressed(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
             
            }
        });

        jButton10.setFont(new java.awt.Font("OCR A Extended", 0, 36));  
        jButton10.setText("+");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton10MousePressed(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
    
            }
        });

        jButton11.setFont(new java.awt.Font("OCR A Extended", 0, 36));  
        jButton11.setText("-");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton11MousePressed(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
               
            }
        });

        jButton12.setFont(new java.awt.Font("OCR A Extended", 0, 36));  
        jButton12.setText("*");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton12MousePressed(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
   
            }
        });

        jButton13.setFont(new java.awt.Font("OCR A Extended", 0, 36));  
        jButton13.setText("0");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton13MousePressed(evt);
            }
        });
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              
            }
        });

        jButton14.setFont(new java.awt.Font("OCR A Extended", 0, 36));  
        jButton14.setText("=");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton14MousePressed(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        jButton16.setFont(new java.awt.Font("OCR A Extended", 0, 36));  
        jButton16.setText("/");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton16MousePressed(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("OCR A Extended", 0, 36));  
        jLabel2.setForeground(new java.awt.Color(153, 255, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setOpaque(true);

        jButton15.setFont(new java.awt.Font("OCR A Extended", 0, 18));  
        jButton15.setText("CE");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton15MousePressed(evt);
            }
        });

        jButton17.setFont(new java.awt.Font("OCR A Extended", 0, 24));  
        jButton17.setText("C");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton17MousePressed(evt);
            }
        });

        jButton18.setFont(new java.awt.Font("OCR A Extended", 0, 36));  
        jButton18.setText(",");
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton18MousePressed(evt);
               
            }
        });
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("OCR A Extended", 0, 24));  
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codigo/chevron_left_round-48_45771.png")));  
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton19MousePressed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("OCR A Extended", 0, 36));  
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/codigo/square-root-mathematical-symbol.png")));  
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton20MousePressed(evt);
            }
        });
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        
        jButton21.setFont(new java.awt.Font("OCR A Extended", 0, 36));
        jButton21.setIcon(new ImageIcon(VentanaCalculadora.class.getResource("/codigo/cuadrado.png")));
        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton21MousePressed(evt);

            }
        });
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        
        jButton22.setFont(new Font("Dialog", Font.BOLD, 16));
        jButton22.setText("OFF");
        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton22MousePressed(evt);

            }
        });
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        
        jButton23 = new JButton();
        jButton23.setIcon(new ImageIcon(VentanaCalculadora.class.getResource("/codigo/pi.png")));
        jButton23.setForeground(Color.BLACK);
        jButton23.setFont(new Font("Dialog", Font.PLAIN, 36));
        jButton23.setBackground(Color.WHITE);
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton23MousePressed(evt);

            }
        });
        
        jButton24 = new JButton();
        jButton24.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        jButton24.setText("%");
        jButton24.setForeground(Color.BLACK);
        jButton24.setFont(new Font("Dialog", Font.PLAIN, 36));
        jButton24.setBackground(Color.WHITE);
        jButton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton24MousePressed(evt);

            }
            
        });
       
        
        

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        		.addComponent(jLabel2, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jButton23, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        							.addComponent(jButton13, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jButton9, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jButton18, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jButton16, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(jButton11, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jButton14, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED))))
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createSequentialGroup()
        							.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        								.addComponent(jButton15, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
        							.addGap(18)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(jButton4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jButton17, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
        							.addGap(18)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(jButton7, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addComponent(jButton19, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))
        							.addGap(18)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addComponent(jButton21, 0, 0, Short.MAX_VALUE)
        								.addComponent(jButton20, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        							.addGap(18)
        							.addComponent(jButton12, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)))
        					.addGap(18)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jButton24, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jButton10, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
        						.addComponent(jButton22, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE))))
        			.addContainerGap(21, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 63, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        					.addComponent(jButton20, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        						.addComponent(jButton15, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        						.addGap(2))
        					.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        						.addComponent(jButton17, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        						.addGap(2))
        					.addComponent(jButton19, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
        				.addComponent(jButton22, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jButton21, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(2)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jButton1, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        						.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        							.addComponent(jButton4, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        							.addComponent(jButton7, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))))
        				.addComponent(jButton24, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jButton10, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        				.addComponent(jButton2, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        				.addComponent(jButton5, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        				.addComponent(jButton8, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        				.addComponent(jButton12, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(jButton3, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        					.addComponent(jButton6, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(jButton9, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        					.addComponent(jButton16, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        					.addComponent(jButton11, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        					.addComponent(jButton14, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        					.addComponent(jButton18, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
        					.addComponent(jButton13, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        				.addComponent(jButton23, GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE))
        			.addContainerGap())
        );
        getContentPane().setLayout(layout);

        pack();
    }

   

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {
            pintaNumero("7");
    }

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {
            pintaNumero("8");
    }

    private void jButton7MousePressed(java.awt.event.MouseEvent evt) {
            pintaNumero("9");
    }

    private void jButton10MousePressed(java.awt.event.MouseEvent evt) {
        operacion = "+";
        realizaOperacion();
    }

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {
            pintaNumero("4");
    }

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {
            pintaNumero("5");
    }

    private void jButton8MousePressed(java.awt.event.MouseEvent evt) {
            pintaNumero("6");
    }

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {
            pintaNumero("1");
    }

    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {
            pintaNumero("2");
    }

    private void jButton9MousePressed(java.awt.event.MouseEvent evt) {
            pintaNumero("3");
    }

    private void jButton13MousePressed(java.awt.event.MouseEvent evt) {
            pintaNumero("0");
    }

    private void jButton11MousePressed(java.awt.event.MouseEvent evt) {
            operacion = "-";
        realizaOperacion();
    }

    private void jButton12MousePressed(java.awt.event.MouseEvent evt) {
            operacion = "*";
        realizaOperacion();
    }

    private void jButton16MousePressed(java.awt.event.MouseEvent evt) {
            operacion = "/";
        realizaOperacion();
    }
    private void jButton22MousePressed(java.awt.event.MouseEvent evt) {
    	System.exit(0);
}
    private void jButton23MousePressed(java.awt.event.MouseEvent evt) {
    	pintaNumero("3.14159265359");
}
    
  
    public void jButton14MousePressed(java.awt.event.MouseEvent evt) {
        String numero2 = jLabel1.getText();
        
        double operando2 = Double.valueOf(numero2);
        double operando1 = Double.valueOf(numero1);
        if(operacion.equals("+")){
            operando1 = operando1 + operando2;
        }
         if(operacion.equals("/")){
            operando1 = operando1 / operando2;
        }
         if(operacion.equals("-")){
           operando1 = operando1 - operando2;
        }
         if(operacion.equals("*")){
           operando1 = operando1 * operando2;
        }
         if(operacion.equals("√")){
             operando1 = Math.sqrt(operando1);
         }
         if(operacion.equals("%")){
             operando1 = operando1/100;
         }
         
         if(operacion.equals("^2")){
             operando1 = Math.pow(operando1,2);
         }
         if(operacion.equals("^2")){
        	 jLabel1.setText(String.valueOf(operando1));
        	 jLabel2.setText (numero1+operacion);   
          
         
         }
         
        	
         if(numero1.equals(",")){
        	 jLabel1.setText("");
        	 jLabel2.setText("");
         }
  
         
         if(operacion.equals("%")){
        	 jLabel1.setText(String.valueOf(operando1));
             
             
         }
         if(operacion.equals("√")){
        	 jLabel1.setText(String.valueOf(operando1));
             jLabel2.setText (operacion+numero1);
             
         }else{
        	 jLabel1.setText(String.valueOf(operando1));
             jLabel2.setText(numero1 + operacion + numero2);     
             }
        
        
    }

    private void jButton15MousePressed(java.awt.event.MouseEvent evt) {
        jLabel1.setText("0");
        puntoPresente = false;
    }

    private void jButton17MousePressed(java.awt.event.MouseEvent evt) {
        jLabel1.setText("0");
        jLabel2.setText("");
        puntoPresente = false;
    }

    private void jButton18MousePressed(java.awt.event.MouseEvent evt) {
         if(puntoPresente==false){
            pintaNumero(".");
            puntoPresente = true;
        }
    }

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void jButton19MousePressed(java.awt.event.MouseEvent evt) {
            String cadena;
            cadena=jLabel1.getText();
            if (cadena.length()>0) {
            	cadena=cadena.substring(0,cadena.length()-1);
            	jLabel1.setText(cadena);
            }
    }

    private void jButton20MousePressed(java.awt.event.MouseEvent evt) {
        operacion = "√";
        realizaOperacion();

       
        double operando1 = Double.valueOf(numero1);
        
        	 jLabel1.setText(String.valueOf(Math.sqrt(operando1)));
             jLabel2.setText (operacion+numero1);
    }

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {
    }
    
    private void jButton21MousePressed(MouseEvent evt) {
    	operacion = "^2";
    	realizaOperacion();
    	  double operando1 = Double.valueOf(numero1);
             
             
             
        	 jLabel1.setText(String.valueOf(Math.pow(operando1,2)));
             jLabel2.setText (operando1+operacion);
      
        
        
    }
    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {
    }
    private void jButton24MousePressed(java.awt.event.MouseEvent evt) {
    	operacion = "%";
        realizaOperacion();
        double operando1=Double.valueOf(numero1);
       
        
   	 jLabel1.setText(String.valueOf(operando1/100));

        
}


    public static void main(String args[]) {
    	
    	
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
               
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }


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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private JButton jButton23;
    private JButton jButton24;
}
