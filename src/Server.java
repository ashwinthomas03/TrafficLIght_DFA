import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class Server extends JFrame {
    private JButton downloadButton;

    public Server() {
        setTitle("Server");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        downloadButton = new JButton("Download File");
        downloadButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                downloadFile();
            }
        });
        panel.add(downloadButton);
        add(panel);
    }

    private void downloadFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select Download Location");
        int userSelection = fileChooser.showSaveDialog(this);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            try {
                File sourceFile = new File("received_file.jpg"); // assuming received JPG file
                FileInputStream fileInputStream = new FileInputStream(sourceFile);
                FileOutputStream fileOutputStream = new FileOutputStream(selectedFile);

                byte[] buffer = new byte[1024];
                int length;
                while ((length = fileInputStream.read(buffer)) > 0) {
                    fileOutputStream.write(buffer, 0, length);
                }

                fileInputStream.close();
                fileOutputStream.close();
                System.out.println("File downloaded successfully.");
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Server server = new Server();
                server.setVisible(true);
                new Thread(server::startServer).start();
            }
        });
    }

    private void startServer() {
        try {
            ServerSocket serverSocket = new ServerSocket(12345); // Port number
            System.out.println("Server is running...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket);

                // For file transfer
                byte[] buffer = new byte[8192];
                int bytesRead;
                InputStream fileIn = clientSocket.getInputStream();
                FileOutputStream fileOut = new FileOutputStream("received_file.jpg");
                while ((bytesRead = fileIn.read(buffer)) != -1) {
                    fileOut.write(buffer, 0, bytesRead);
                }
                fileOut.close();
                System.out.println("File received successfully.");

                clientSocket.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
