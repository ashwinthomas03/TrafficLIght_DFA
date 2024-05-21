import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class ClientGUI extends JFrame {
    private Socket socket;
    private PrintWriter out;
    private JButton chooseFileButton;

    public ClientGUI() {
        setTitle("Client");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        chooseFileButton = new JButton("Choose File");
        chooseFileButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chooseFile();
            }
        });
        panel.add(chooseFileButton);
        add(panel);
    }

    private void chooseFile() {
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(this);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            sendFile(selectedFile);
        }
    }

    private void sendFile(File file) {
        try {
            socket = new Socket("localhost", 12345); // Server's IP and port number
            out = new PrintWriter(socket.getOutputStream(), true);
            out.println("FileTransfer"); // Indicate file transfer

            byte[] buffer = new byte[8192];
            FileInputStream fileIn = new FileInputStream(file);
            OutputStream fileOut = socket.getOutputStream();
            int bytesRead;
            while ((bytesRead = fileIn.read(buffer)) != -1) {
                fileOut.write(buffer, 0, bytesRead);
            }
            fileOut.flush();
            System.out.println("File sent successfully.");

            socket.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ClientGUI clientGUI = new ClientGUI();
                clientGUI.setVisible(true);
            }
        });
    }
}
